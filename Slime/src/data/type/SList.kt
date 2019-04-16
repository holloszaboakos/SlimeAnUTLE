package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

fun <T : SVari> List<T>.toSList(names: List<SText> = listOf(),owner: SVari?=null): SList<T> = SList(this.toMutableList(),names,owner)

@Suppress("UNCHECKED_CAST")
class SList<T : SVari>(
    private val content: MutableList<T> = mutableListOf(),
    names: List<SText> = listOf(),
    private val owner:SVari?=null
) : SVari("List", names), MutableList<T> {

    class SIter<T : SVari>(val owner:SList<T>):SVari("Iter", listOf()){
        override fun listPaths(): SList<SList<SText>> = owner.listPaths()
        override fun copy(names: List<SText>): SVari = owner.copy(names).iter
        override fun expand(): String =owner.expand()
        override fun expand(divider: String): String =owner.expand(divider)
        override fun plus(v: SVari, i: Int): SVari{
            owner.forEach{it.plus(v,i)}
            return owner.owner?:owner
        }
        override fun get(path: SList<SText>): SVari =owner.content.map{it.get(path)}.toSList()
        override fun delete(path: SList<SText>) : Unit = owner.forEach{it.delete(path)}
        override fun visit(v: Visitor, mod: String): SVari = v.accept(this,mod)
    }

    val iter=SIter(this)

    constructor(content: List<T>,owner:SVari?=null) : this(content.toMutableList(),owner = owner)

    override fun listPaths(): SList<SList<SText>> {
        val result = listOf<SList<SText>>().toSList()
        for (vari in content) {
            val variPaths = vari.listPaths().content
            val variName = SText(content.indexOf(vari).toString())

            for (path in variPaths)
                path.add(0, variName)
            result.content += variPaths

            result.content.add(SList(mutableListOf(variName)))

        }
        return result
    }

    override fun plus(v: SVari, i: Int): SVari {
        content.add(v as T)
        return this
    }

    override fun copy(names: List<SText>): SList<T> = content.toList().toSList(names)

    override fun expand(): String {
        var result = ""
        for (c in content)
            result += ('\n'+c.expand() )
        result=result.substring(1)
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (c in content)
            result += (divider+c.expand()  )
        result=result.substring(divider.length)
        return result
    }

    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                when (val next = path[0]()) {
                    "names"-> names
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    "cont" -> content.toSList(owner = this)
                    "iter" -> iter
                    in ctype.attributes.map { it.name } ->
                        content[ctype.attributes.indexOf(ctype.attributes
                            .first { it.name.compareTo(next) == 0 })]
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content[next.toInt()]
                        else throw Exception("Wrong variable name: $next")
                }
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> names.get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "copyN" -> copy(names).get(path)
                    "cont" -> content.toSList(owner = this).get(path)
                    "iter" -> iter.get(path)
                    in ctype.attributes.map { it.name } ->
                        content[ctype.attributes.indexOf(ctype.attributes
                            .first { it.name.compareTo(next) == 0 })].get(path)
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content[next.toInt()].get(path)
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names.getOrNull(0)?:"@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(SList(mutableListOf(SText("@content"))))

            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(path)

            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)


    override fun get(index: Int): T = content[index]
    override val size: Int get()= content.size
    override fun contains(element: T): Boolean = content.contains(element)
    override fun containsAll(elements: Collection<T>): Boolean = content.containsAll(elements)
    override fun indexOf(element: T): Int = content.indexOf(element)
    override fun isEmpty(): Boolean = content.isEmpty()
    override fun iterator(): MutableIterator<T> = content.iterator()
    override fun lastIndexOf(element: T): Int = content.lastIndexOf(element)
    override fun add(element: T): Boolean = content.add(element)
    override fun add(index: Int, element: T): Unit = content.add(index, element)
    override fun addAll(index: Int, elements: Collection<T>): Boolean = content.addAll(index, elements)
    override fun addAll(elements: Collection<T>): Boolean = content.addAll(elements)
    override fun clear() = content.clear()
    override fun listIterator(): MutableListIterator<T> = content.listIterator()
    override fun listIterator(index: Int): MutableListIterator<T> = content.listIterator(index)
    override fun remove(element: T): Boolean = content.remove(element)
    override fun removeAll(elements: Collection<T>): Boolean = content.removeAll(elements)
    override fun removeAt(index: Int): T = content.removeAt(index)
    override fun retainAll(elements: Collection<T>): Boolean = content.retainAll(elements)
    override fun set(index: Int, element: T): T = content.set(index, element)
    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> = content.subList(fromIndex, toIndex)
}
package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

//The class behind the List type
fun <T : SVari> List<T>.toSList(names: List<SName> = listOf(), owner: SVari? = null): SList<T> =
    SList(this.toMutableList(), names, owner)

@Suppress("UNCHECKED_CAST")
class SList<T : SVari>(
    private val content: MutableList<T> = mutableListOf(),
    names: List<SName> = listOf(),
    private val owner: SVari? = null
) : SVari("List", names), MutableList<T> {

    class SIter<T : SVari>(val owner: SList<T>) : SVari("Iter", listOf()) {
        override fun listPaths(): SList<SList<SName>> = owner.listPaths()
        override fun copy(names: List<SName>): SVari = owner.copy(names).iter
        override fun extend(divider: String): String = owner.extend(divider)
        override fun plus(
            v: SVari,
            path: SList<SName>,
            pairs: SList<SList<SName>>
        ): SVari {
            owner.forEach { it.plus(v) }
            return owner.owner ?: owner
        }

        override fun get(path: SList<SName>): SVari =
            if (path.isEmpty()) this
            else owner.content.map { it.get(path) }.toSList()

        override fun delete(path: SList<SName>): Unit = owner.forEach { it.delete(path) }
        override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
    }

    val iter = SIter(this)

    constructor(content: List<T>, owner: SVari? = null) : this(content.toMutableList(), owner = owner)

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> {
        val result = listOf<SList<SName>>().toSList()
        for (vari in content) {
            val variPaths = vari.listPaths().content
            val variName = SName(content.indexOf(vari).toString())

            for (path in variPaths)
                path.add(0, variName)
            result.content += variPaths

            result.content.add(SList(mutableListOf(variName)))

        }
        return result
    }

    //Plusses a new variable to the variable
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {this}
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> {
                        when {
                            v is SList<*> && v.size !=0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SIter<*> && v.owner.size !=0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
        }

    //Makes a copy from the variable
    override fun copy(names: List<SName>): SList<T> = content.toList().toSList(names)

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String {
        var result = ""
        for (c in content)
            result += (divider + c.extend(divider))
        result = result.substring(divider.length)
        return result
    }

    //Returns the variable on the given relative path
    //List is a Cont
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> names.toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
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

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(SList(mutableListOf(SName("@content"))))

            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(path)

            }
        }
    }

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)


    override fun get(index: Int): T = content[index]
    override val size: Int get() = content.size
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
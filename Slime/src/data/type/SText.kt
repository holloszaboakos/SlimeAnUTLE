package data.type

import data.*
import java.lang.Exception

//The class behind the Text type
open class SText(private var content: String = "", names: List<SName> = listOf()) : SVari("Text", names) {

    //for easier reach of the inner text
    operator fun invoke(): String = content
    operator fun invoke(s: String): String {
        content = s;return s
    }

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> = SList()

    //Makes a copy from the variable
    override fun copy(names: List<SName>): SText = SText(content, names.toSList())

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String = content

    //Plusses a new variable to the variable
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {
                when {
                    v is SList<*> && v.size !=0 && v[0] is SText
                    -> v.filter { it is SText }.map { it as SText }.forEach{content+=it.content}
                    v is SList.SIter<*> && v.owner.size !=0 && v.owner[0] is SName
                    -> v.owner.filter { it is SText }.map { it as SText }.forEach{content+=it.content}
                    v is SText -> content+=v.content
                }
                this}
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> {
                        when {
                            v is SList<*> && v.size !=0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SList.SIter<*> && v.owner.size !=0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
        }

    //Returns the variable on the given relative path
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
                    else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0) ?: "@nameless"}")
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) =
        throw Exception("SText dose not contain anything to delete")

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
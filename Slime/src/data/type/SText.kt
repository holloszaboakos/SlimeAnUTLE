package data.type

import data.*
import java.lang.Exception

open class SText(private var content: String = "", names: List<SName> = listOf()) : SVari("Text", names) {

    operator fun invoke(): String = content
    operator fun invoke(s: String): String {
        content = s;return s
    }

    override fun listPaths(): SList<SList<SName>> = SList()

    override fun copy(names: List<SName>): SText = SText(content, names.toSList())

    override fun extend(divider: String): String = content

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

    override fun delete(path: SList<SName>) =
        throw Exception("SText dose not contain anything to delete")

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
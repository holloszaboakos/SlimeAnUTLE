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

    override fun plus(v: SVari, i: Int): SVari = when {
        v is SList<*> && v[0] is SName && i == -1
        -> addNames(v.filter { it is SName }.map { it as SName })
        v is SList.SIter<*> && v.owner[0] is SName && i == -1
        -> addNames(v.owner.filter { it is SName }.map { it as SName })
        v is SName && i == -1
        -> addNames(listOf(v))
        else -> throw Exception("You can not add into a text.")
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
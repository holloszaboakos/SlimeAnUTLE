package data.type

import data.*
import java.lang.Exception

class SSpec(val key: Char, names: List<SName> = listOf()) : SVari("Spec", names) {

    enum class Char(val value: String, val names: MutableList<String>) {
        ENTER("\n", mutableListOf("e", "ent", "enter")),
        RENTER("\r", mutableListOf("r", "ren", "renter")),
        TABULATOR("\t", mutableListOf("t", "tab", "tabulator")),
        SPACE(" ", mutableListOf("s", "spa", "space")),
        PERIOD(".", mutableListOf("pe", "per", "period")),
        QUESTION_MARK("?", mutableListOf("qm", "qum", "question_mark")),
        EXCLAMATION_MARK("!", mutableListOf("em", "exm", "exclamation_mark")),
        COMMA(",", mutableListOf("co", "com", "comma")),
        COLON(":", mutableListOf("cl", "col", "colon")),
        SEMICOLON(";", mutableListOf("sc", "sec", "semicolon"))
    }

    override fun listPaths(): SList<SList<SName>> = SList()

    override fun copy(names: List<SName>): SVari = SSpec(key, names)

    override fun extend(divider: String): String = key.value

    override fun plus(v: SVari, i: Int): SVari = when {
        v is SList<*> && v[0] is SName && i == -1
        -> addNames(v.filter { it is SName }.map { it as SName })
        v is SList.SIter<*> && v.owner[0] is SName && i == -1
        -> addNames(v.owner.filter { it is SName }.map { it as SName })
        v is SName && i == -1
        -> addNames(listOf(v))
        else ->
            throw Exception("You can not add into special character:{${names.getOrNull(0) ?: "@nameless"}")
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
        throw Exception("You cannot delete SVari from SSpec SVari:{${names.getOrNull(0) ?: "@nameless"}")

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
package data.type

import data.*
import java.lang.Exception

class SSpec(val key: Char, names: MutableList<SText>? = null) : SVari(ctype,names) {

    enum class Char(val value: String, val names: MutableList<String>) {
        ENTER("\n", mutableListOf("e", "ent", "enter")),
        RENTER("\r", mutableListOf("r", "ren", "renter")),
        TABULATOR("\t", mutableListOf("t", "tab", "tabulator")),
        SPACE(" ", mutableListOf("sp", "spa", "space")),
        PERIOD(".", mutableListOf("pe", "per", "period")),
        QUESTION_MARK("?", mutableListOf("qu", "qum", "question_mark")),
        EXCLAMATION_MARK("!", mutableListOf("ex", "exm", "exclamation_mark")),
        COMMA(",", mutableListOf("co", "com", "comma")),
        COLON(":", mutableListOf("cl", "col", "colon")),
        SEMICOLON(";", mutableListOf("se", "sem", "semicolon"))
    }

    companion object {
        val ctype=SType["Spec"]
    }

    override fun listPaths(): SList<SList<SText>>? = null

    override fun copy(): SVari = SSpec(key)

    override fun expand(): String = key.value

    override fun expand(divider: String): String = key.value

    override fun add(v: SVari, i: Int): SVari =
        throw Exception("You can not add into special character:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun get(path: SList<SText>): SVari =
        throw Exception("No SVari to get in SSpec SVari:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun delete(path: SList<SText>) =
        throw Exception("You cannot delete SVari from SSpec SVari:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
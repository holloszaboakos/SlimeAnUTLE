package data.type

import data.*
import java.lang.Exception

class Special(val key: Char, names: MutableList<Text>? = null) : Variable(Type.Spec, names) {
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

    override fun copy(): Variable = Special(key)

    override fun expand(): String = key.value

    override fun expand(divider: String): String = key.value

    override fun add(v: Variable, i: Int): Variable =
        throw Exception("You can not add into special character:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun get(path: ListOf<Text>): Variable =
        throw Exception("No Variable to get in Special Variable:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun delete(path: ListOf<Text>) =
        throw Exception("You cannot delete Variable from Special Variable:{${names?.getOrNull(0) ?: "@nameless"}")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
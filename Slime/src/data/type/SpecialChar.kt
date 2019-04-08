package data.type

import data.*
import java.lang.Exception

class SpecialChar private constructor(names: MutableList<Text>, val key: String) : Variable(Type.Spec,names) {


    companion object {
        val values = mapOf(
            Pair("e", "\n"), Pair("ent", "\n"), Pair("enter", "\n"),
            Pair("r", "\r"), Pair("ren", "\r"), Pair("renter", "\r"),
            Pair("t", "\t"), Pair("tab", "\t"), Pair("tabulator", "\t"),
            Pair("sp", " "), Pair("spa", " "), Pair("space", " "),
            Pair("pe", "."), Pair("per", "."), Pair("period", "."),
            Pair("qu", "?"), Pair("que", "?"), Pair("questionmark", "?"),
            Pair("ex", "!"), Pair("exc", "!"), Pair("exclamationmark", "!"),
            Pair("co", ","), Pair("com", ","), Pair("comma", ","),
            Pair("cl", ":"), Pair("col", ":"), Pair("colon", ":"),
            Pair("se", ";"), Pair("sem", ";"), Pair("semicolon", ";")
        )
    }

    init {
        if (!values.containsKey(key))
            throw Exception("Invalid special character code")
    }

    override fun copy(): Variable = SpecialChar(mutableListOf(),key)

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun expand(): String = values[key] ?: throw Exception(
        "Invalid Special Char Code Discovered during expand at Special Char Variable:" +
                "{${names.getOrNull(0) ?: "@nameless"}}"
    )

    override fun expand(divider: String): String = values[key] ?: throw Exception(
        "Invalid Special Char Code Discovered during expand at Special Char Variable:{" +
                "${names.getOrNull(0) ?: "@nameless"}}"
    )

    override fun insert(v: Variable, i: Int): Variable =
        throw Exception("You can not insert into special character:{${names.getOrNull(0) ?: "@nameless"}")

    override fun get(path: MutableList<String>): Variable =
        throw Exception("No Variable to get in Special Variable:{${names.getOrNull(0) ?: "@nameless"}")

    override fun delete(path: MutableList<String>) =
        throw Exception("You cannot delete Variable from Special Variable:{${names.getOrNull(0) ?: "@nameless"}")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
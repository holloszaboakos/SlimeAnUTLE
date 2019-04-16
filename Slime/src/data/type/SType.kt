package data.type

import data.*
import java.lang.Error
import java.lang.Exception

data class SType(val tag: String, val attributes: List<NameType>) : SVari("Type", listOf()) {

    data class NameType(val name: String, val type: List<SText>)

    companion object {
        private var typesReady = false
        private val names = NameType("names", listOf(SText("List"), SText("Text")))
        val types = mutableMapOf(
            Pair(
                "NameValue",
                SType(
                    "NameValue",
                    listOf(
                        NameType("names", listOf(SText("List"), SText("Text"))),
                        NameType("values", listOf(SText("List"), SText("Vari")))
                    )
                )
            ),
            Pair("List", SType("List", listOf(names, NameType("copy", listOf(SText("List")))))),
            Pair("Refe", SType("Refe", listOf(names, NameType("copy", listOf(SText("Refe")))))),
            Pair("Slot", SType("Slot", listOf(names, NameType("copy", listOf(SText("Slot")))))),
            Pair("Spec", SType("Spec", listOf(names, NameType("copy", listOf(SText("Spec")))))),
            Pair("Temp", SType("Temp", listOf(names, NameType("copy", listOf(SText("Temp")))))),
            Pair("Text", SType("Text", listOf(names, NameType("copy", listOf(SText("Text")))))),
            Pair("File", SType("File", listOf(names, NameType("copy", listOf(SText("File")))))),
            Pair("Vari", SType("Vari", listOf(names, NameType("copy", listOf(SText("Vari")))))),
            Pair("Iter", SType("Iter", listOf(names, NameType("copy", listOf(SText("Iter")))))),
            Pair("Type", SType("Type", listOf(names, NameType("copy", listOf(SText("Type"))))))
        )

        operator fun get(name: String): SType =
            types[name] ?: throw Error("No type exists with name $name")
    }

    init {
        if (typesReady && !types.containsKey(tag))
            types[tag] = this
        typesReady = typesReady || (!typesReady && tag.compareTo("Type") == 0)
    }

    override fun listPaths(): SList<SList<SText>> = SList()

    override fun copy(names: List<SText>): SType {
        return this
    }

    override fun expand(): String {
        var result = "struct ${names.getOrNull(0)?:"@nameless"}{\n"
        for (a in attributes)
            result += "\t${a.name}:${a.type}\n"
        result += "}"
        return result
    }

    override fun expand(divider: String): String {
        var result = "struct ${names.getOrNull(0)?:"@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}"
        return result
    }

    override fun plus(v: SVari, i: Int): SVari =
        throw Exception("You can not add into a Structure type SVari")

    override fun get(path: SList<SText>): SVari =
    when {
        path.isEmpty() -> this
        path.size == 1 -> {
            when (path[0]()) {
                "names"-> names
                "self" -> this
                "copy" -> copy()
                "copyN" -> copy(names)
                else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
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
                else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
            }
        }
    }

    override fun delete(path: SList<SText>): Unit =
        throw Exception("You can not delete from a Structure type SVari")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
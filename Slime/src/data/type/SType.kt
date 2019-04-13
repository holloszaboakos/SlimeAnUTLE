package data.type

import data.*
import java.lang.Error
import java.lang.Exception

data class SType(val name: String, val attributes: List<NameType>) : SVari(ctype, mutableListOf(SText(name))) {

    data class NameType(val name: String, val type: List<SText>)

    companion object {
        private val ctype = SType("Type", listOf())
        val types = mutableMapOf(
            Pair("DeclNeck",
            SType("DeclNeck",
                listOf(
                    SType.NameType("names", listOf(SText("List"), SText("Text"))),
                    SType.NameType("type", listOf(SText("List"), SText("Text")))
                )
            )),
            Pair("NameValue",
                SType("NameValue",
                    listOf(
                        SType.NameType("names", listOf(SText("List"), SText("Text"))),
                        SType.NameType("values", listOf(SText("List"), SText("Vari")))
                    )
                )),
            Pair("List", SType("List", listOf())),
            Pair("Refe", SType("Refe", listOf())),
            Pair("Slot", SType("Slot", listOf())),
            Pair("Spec", SType("Spec", listOf())),
            Pair("Temp", SType("Temp", listOf())),
            Pair("Text", SType("Text", listOf())),
            Pair("File", SType("File", listOf())),
            Pair("Vari", SType("Vari", listOf())),
            Pair("Type", ctype)
        )

        operator fun get(name: String): SType =
            types[name] ?: throw Error("No type exists with name $name")
    }

    init {
        if (!types.containsKey(name))
            types[name] = this
    }

    override fun listPaths(): SList<SList<SText>>? = null

    override fun copy(): SType {
        return this
    }

    override fun expand(): String {
        var result = "struct ${names?.getOrNull(0) ?: "@nameless"}{\n"
        for (a in attributes)
            result += "\t${a.name}:${a.type}\n"
        result += "}\n"
        return result
    }

    override fun expand(divider: String): String {
        var result = "struct ${names?.getOrNull(0) ?: "@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}$divider"
        return result
    }

    override fun add(v: SVari, i: Int): SVari =
        throw Exception("You can not add into a Structure type SVari")

    override fun get(path: SList<SText>): SVari =
        throw Exception("You can not get from a Structure type SVari")

    override fun delete(path: SList<SText>): Unit =
        throw Exception("You can not delete from a Structure type SVari")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
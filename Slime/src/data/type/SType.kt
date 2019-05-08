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
            Pair("Name", SType("Name", listOf(names, NameType("copy", listOf(SText("Name")))))),
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

    override fun listPaths(): SList<SList<SName>> = SList()

    override fun copy(names: List<SName>): SType {
        return this
    }

    override fun extend(divider: String): String {
        var result = "struct ${names.getOrNull(0)?:"@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}"
        return result
    }

    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> this
            pairs.isNotEmpty() -> throw Exception("SType plus")
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
                "names"-> names.toSList(owner = this).get(path)
                "self" -> this.get(path)
                "copy" -> copy().get(path)
                else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
            }
        }
    }

    override fun delete(path: SList<SName>): Unit =
        throw Exception("You can not delete from a Structure type SVari")

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
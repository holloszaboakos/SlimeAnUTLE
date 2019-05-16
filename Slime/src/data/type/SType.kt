package data.type

import data.*
import java.lang.Error
import java.lang.Exception

//The class behind the Type type
//It has no names only a tag for taking the first name given
//It is always identified by that only
data class SType(val tag: String, val attributes: List<NameType>) : SVari("Type", listOf()) {

    //Inner class for name-type list pairs
    data class NameType(val name: String, val type: List<SText>)

    //It hes a static map of the existing types
    //It is initialized by th
    companion object {
        private var typesReady = false
        val types = mutableMapOf(
            Pair(
                "NameValue",
                SType(
                    "NameValue",
                    listOf(
                        NameType("names", listOf(SText("List"), SText("Name"))),
                        NameType("values", listOf(SText("List"), SText("Vari")))
                    )
                )
            ),
            Pair("List", SType("List", listOf())),
            Pair("Refe", SType("Refe", listOf())),
            Pair("Slot", SType("Slot", listOf())),
            Pair("Spec", SType("Spec", listOf())),
            Pair("Temp", SType("Temp", listOf())),
            Pair("Text", SType("Text", listOf())),
            Pair("Name", SType("Name", listOf())),
            Pair("File", SType("File", listOf())),
            Pair("Vari", SType("Vari", listOf())),
            Pair("Iter", SType("Iter", listOf())),
            Pair("Type", SType("Type", listOf()))
        )

        operator fun get(name: String): SType =
            types[name] ?: throw Error("No type exists with name $name")
    }

    //Every type registers itself after initialization
    init {
        if (typesReady && !types.containsKey(tag))
            types[tag] = this
        typesReady = typesReady || (!typesReady && tag.compareTo("Type") == 0)
    }

    //There is no reason to gather path-es reachable throw a type variable since it no Type can not be referenced by path
    //It cab be if an Inst has a Type attribute but who would ever do it :,,,,,,,,DDDDD
    //Or throw other variables Type attribute... but who .... yayks
    override fun listPaths(): SList<SList<SName>> = SList()

    //You can not copy a Type variable
    override fun copy(names: List<SName>): SType {
        return this
    }

    //You can not extend it
    override fun extend(divider: String): String {
        var result = "struct ${names[DataContainer.focus ?: throw Exception("No file in focus!")]?.getOrNull(0)
            ?: "@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}"
        return result
    }

    //You can add only names
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
                    "names" -> {
                        when {
                            v is SList<*> && v.size != 0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SList.SIter<*> && v.owner.size != 0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception(
                        "unknown keyword for special char: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //You can reach only the basic attributes except, but names are an exception
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No names in this namespace")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    "tag" -> SText(tag)
                    else -> throw  Exception(
                        "unknown keyword for special char: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //You can not delete from a Type variable
    override fun delete(path: SList<SName>): Unit =
        throw Exception("You can not delete from a Structure type SVari")

    //visitor pattern ...
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
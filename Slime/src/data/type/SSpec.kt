package data.type

import data.*
import java.lang.Exception

//The class behind the Spec type
class SSpec(val key: Char, names: List<SName> = listOf()) : SVari("Spec", names) {

    //It has an inner Enum class to decode th char names
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

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> =
        SList(mutableListOf(
                SList(mutableListOf(SName("names"))),
                SList(mutableListOf(SName("self"))),
                SList(mutableListOf(SName("copy"))),
                SList(mutableListOf(SName("type")))
            ))


    //Makes a copy from the variable
    override fun copy(names: List<SName>): SVari = SSpec(key, names)

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String = key.value

    //Plusses a new variable to the variable
    //You can add only names to a Spec
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {
                this
            }
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

    //Returns the variable on the given relative path
    //Spec has no special attributes
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No Name in this namespace")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    "key" -> SText(key.toString())
                    else -> throw  Exception(
                        "unknown keyword for special char: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) =
        throw Exception(
            "You cannot delete SVari from SSpec SVari:{${names[DataContainer.focus
                ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
        )

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
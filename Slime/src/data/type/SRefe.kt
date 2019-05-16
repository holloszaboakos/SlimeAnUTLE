package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern


//The class behind the Refe type
class SRefe(val pattern: String, val types: MutableList<SText>, names: List<SName> = listOf()) :
    SVari("Refe", names) {

    val owner=DataContainer.focus?:throw Exception("No file in focus!")

    //You can reach no variables throw a Refe variable
    override fun listPaths(): SList<SList<SName>> {
        val result= mutableListOf<SList<SName>>()
        result.addAll(
            SList(mutableListOf(
                SList(mutableListOf(SName("names"))),
                SList(mutableListOf(SName("self"))),
                SList(mutableListOf(SName("copy"))),
                SList(mutableListOf(SName("type")))
            ))
        )
        return result.toSList()
    }

    //It gathers all path matching the RegEx with a variable with the right type on them
    fun listMatchingPaths(): SList<SList<SName>> {
        val preResult = owner.listPaths()
        val result = SList(mutableListOf<SList<SName>>())
        for (path in preResult) {
            var text = ""
            for (t in path)
                text += ('.' + t())
            text = text.substring(1)
            if (Pattern.matches(pattern, text))
                result.add(path)
        }
        return result
    }

    //Makes a copy from the variable
    override fun copy(names: List<SName>): SRefe = SRefe(pattern, types.toMutableList(), names)

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String = pattern

    //Plusses a new variable to the variable
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
    //Refe is not a Cont it just generates one
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No name in this namespace!")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    else -> throw  Exception(
                        "unknown keyword for slot: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) = throw Exception("You can not delete variable form a reference.")

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
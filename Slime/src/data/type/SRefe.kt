package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

class SRefe(val pattern: String, val types: MutableList<SText>, names: List<SText>  = listOf()) :
    SVari("Refe", names) {

    override fun listPaths(): SList<SList<SText>> = SList()

    fun listMatchingPaths(): SList<SList<SText>> {
        val preResult = DataContainer.focus?.listPaths() ?: throw Exception("SFile of reference is not in focus")
        val result = SList(mutableListOf<SList<SText>>())
        for (path in preResult) {
            var text = ""
            for (t in path)
                text += ('.' + t())
            text=text.substring(1)
            if (Pattern.matches(pattern,text))
                result.add(path)
        }
        return result
    }

    override fun copy(names: List<SText>): SRefe = SRefe(pattern, types.toMutableList(),names)

    override fun expand(): String = pattern

    override fun expand(divider: String): String = pattern

    override fun plus(v: SVari, i: Int): SVari = throw Exception("You can not add into a reference.")

    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                when (path[0]()) {
                    "names"-> names
                    "self" -> this
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    else -> throw  Exception("unknown keyword for slot: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> names.get(path)
                    "self" -> this.get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "copyN" -> copy(names).get(path)
                    else -> throw  Exception("unknown keyword for slot: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
        }

    override fun delete(path: SList<SText>) = throw Exception("You can not delete variable form a reference.")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
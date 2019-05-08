package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

class SRefe(val pattern: String, val types: MutableList<SText>, names: List<SName> = listOf()) :
    SVari("Refe", names) {

    override fun listPaths(): SList<SList<SName>> = SList()

    fun listMatchingPaths(): SList<SList<SName>> {
        val preResult = DataContainer.focus?.listPaths() ?: throw Exception("SFile of reference is not in focus")
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

    override fun copy(names: List<SName>): SRefe = SRefe(pattern, types.toMutableList(), names)

    override fun extend(divider: String): String = pattern

    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {this}
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
                    "names" -> names.toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    else -> throw  Exception("unknown keyword for slot: ${names.getOrNull(0) ?: "@nameless"}")
                }
            }
        }

    override fun delete(path: SList<SName>) = throw Exception("You can not delete variable form a reference.")

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
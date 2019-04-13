package data.type

import data.*
import java.lang.Exception

class SRefe(val pattern: String, val types: MutableList<SText>, names: MutableList<SText>? = null) :
    SVari(ctype, names) {

    companion object {
        val ctype = SType["Refe"]
    }

    override fun listPaths(): SList<SList<SText>>? = null

    fun listMatchingPaths(): SList<SList<SText>> {
        val result = DataContainer.focus?.listPaths() ?: throw Exception("SFile of reference is not in focus")
        for (path in result.content) {
            var text = path.content[0].content
            for (tIx in 1 until path.content.size)
                text += ('.' + path.content[tIx].content)
            if (!pattern.toRegex().matches(text))
                result.content.remove(path)
        }
        return result
    }

    override fun copy(): SRefe = SRefe(pattern, types.toMutableList())

    override fun expand(): String = pattern

    override fun expand(divider: String): String = pattern

    override fun add(v: SVari, i: Int): SVari = throw Exception("You can not add into a reference.")

    override fun get(path: SList<SText>): SVari = throw Exception("You can not get variable form a reference.")

    override fun delete(path: SList<SText>) = throw Exception("You can not delete variable form a reference.")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
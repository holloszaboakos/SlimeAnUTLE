package data.type

import data.*
import java.lang.Exception

class SText(var content: String, names: MutableList<SText>?=null) : SVari(ctype,names) {
    companion object {
        val ctype=SType["Text"]
    }
    override fun listPaths(): SList<SList<SText>>? = null

    override fun copy(): SText = SText(content)

    override fun expand(): String = content

    override fun expand(divider: String): String = content

    override fun add(v: SVari, i: Int): SVari = throw Exception("You can not add into a text.")

    override fun get(path: SList<SText>): SVari = throw Exception("SText dose not contain anything to get")

    override fun delete(path: SList<SText>) =
        throw Exception("SText dose not contain anything to delete")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this,mod)
}
package data.type

import data.*
import java.lang.Exception

class SText(private var content: String="", names: List<SText> = listOf()) : SVari("Text",names) {

    operator fun invoke(): String=content
    operator fun invoke(s:String): String{content=s;return s}

    override fun listPaths(): SList<SList<SText>> = SList()

    override fun copy(names: List<SText>): SText = SText(content,names.toSList())

    override fun expand(): String = content

    override fun expand(divider: String): String = content

    override fun plus(v: SVari, i: Int): SVari = throw Exception("You can not add into a text.")

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

    override fun delete(path: SList<SText>) =
        throw Exception("SText dose not contain anything to delete")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this,mod)
}
package data.type

import data.*
import java.lang.Exception


@Suppress("UNCHECKED_CAST")
class SList<T : SVari>(val content: MutableList<T>, names: MutableList<SText>? = null) : SVari(ctype, names) {

    companion object {
        val ctype = SType["List"]
    }

    override fun listPaths(): SList<SList<SText>>? {
        val result = SList<SList<SText>>(mutableListOf())
        for (vari in content) {
            val variPaths = vari.listPaths()?.content
            variPaths?.let {
                for (path in variPaths)
                    path.content.add(0, SText(content.indexOf(vari).toString()))
                result.content += variPaths
            }

        }
        return result
    }

    override fun add(v: SVari, i: Int): SVari {
        content.add(v as T)
        return this
    }

    override fun copy(): SList<T> {
        val result = SList(content.toMutableList())
        for (c in content)
            result.content.add(c)
        return result

    }

    override fun expand(): String {
        var result = ""
        for (c in content)
            result += (c.expand() + '\n')
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (c in content)
            result += (c.expand() + divider)
        return result
    }

    override fun get(path: SList<SText>): SVari =
        when {
            path.content.isEmpty() -> this
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                content[next.toInt()]
            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                content[next.toInt()].get(path)
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                val i = next.toInt()
                content[i].delete(SList(mutableListOf(SText("@content"))))

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                val i = next.toInt()
                content[i].delete(path)

            }
        }
    }


    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
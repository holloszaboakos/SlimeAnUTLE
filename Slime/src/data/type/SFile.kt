package data.type

import data.SVari
import data.Visitor

class SFile(val content: MutableMap<SText, SVari>, names: MutableList<SText>? = null) : SVari(ctype, names) {

    companion object {
        val ctype = SType["File"]
    }

    override fun listPaths(): SList<SList<SText>>? {
        val result = SList<SList<SText>>(mutableListOf())
        for (key in content.keys) {
            val vari = content[key]
            val variPaths = vari?.listPaths()?.content
            variPaths?.let {
                for (path in variPaths)
                    path.add(key)
                result.content += variPaths
            }
        }
        return result
    }

    override fun copy(): SFile {
        val result = SFile(content)
        for (key in content.keys)
            result.content[key] = result.content[key]?.copy() ?: throw Exception("Error during copying")
        return result
    }

    override fun expand(): String {
        var result = ""
        for (c in content.values)
            result += (c.expand() + '\n')
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (c in content.values)
            result += (c.expand() + divider)
        return result
    }

    override fun add(v: SVari, i: Int): SVari =
        throw Exception("You can not add into SFile:${names?.getOrNull(0) ?: "@nameless"}")


    override fun get(path: SList<SText>): SVari =
        when {
            path.content.isEmpty() -> this
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()]
                } catch (e: java.lang.Exception) {
                    content[SText(next)] ?: throw Exception(
                        "Wrong variable name"
                    )
                }
            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()].get(path)
                } catch (e: java.lang.Exception) {
                    content[SText(next)]?.get(path) ?: throw Exception(
                        "Wrong variable name"
                    )
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.content.isEmpty() -> throw java.lang.Exception(
                "path shouldn't be empty when deleting from STemp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(SList(mutableListOf(SText("@content"))))
                } catch (e: java.lang.Exception) {
                    content[SText(next)]?.delete(SList(mutableListOf(SText("@content"))))
                }

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(path)
                } catch (e: java.lang.Exception) {
                    content[SText(next)]?.delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
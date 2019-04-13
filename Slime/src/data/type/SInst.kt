package data.type

import data.*
import java.lang.Exception

class SInst(metaName: String, override val names: MutableList<SText>? = null) : SVari(SType[metaName], names) {

    val content: MutableList<SVari?> = MutableList(type.attributes.size) { null }

    override fun listPaths(): SList<SList<SText>>? {
        val result = SList<SList<SText>>(mutableListOf())
        for (vari in content) {
            vari?.let {
                val variPaths = vari.listPaths()?.content
                variPaths?.let {
                    for (path in variPaths)
                        path.add(SText(type.attributes[content.indexOf(vari)].name))
                    result.content += variPaths
                }
            }
        }
        return result
    }

    override fun copy(): SInst {
        val result = SInst(type.name)
        for (d in content)
            if (d != null) result.content[content.indexOf(d)] = d
        return result
    }

    override fun expand(): String {
        var result = ""
        for (d in content)
            result += (d?.expand() + "\n")
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (d in content)
            result += "d?.expand()+divider"
        return result
    }

    override fun add(v: SVari, i: Int): SVari {
        if (i == -1)
            content[type.attributes.indexOf(type.attributes.first { it.type[0].content == v.type.name })] = v
        else if (type.attributes[i].type[0].content == v.type.name)
            content[i] = v
        else throw Exception("type mismath!!")
        return this
    }

    override fun get(path: SList<SText>): SVari =
        when {
            path.content.isEmpty() -> this
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content[next.toInt()] ?: throw Exception("Wrong index")
                } catch (e: Exception) {
                    content[type.attributes.indexOf(type.attributes.first { it.name == next })]
                        ?: throw Exception("Wrong variable name")
                }
            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content[next.toInt()]?.get(path) ?: throw Exception("Wrong index")
                } catch (e: Exception) {
                    content[type.attributes.indexOf(type.attributes.first { it.name == next })]?.get(path)
                        ?: throw Exception("Wrong variable name")
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path.content shouldn't be empty when deleting from STemp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content[i]?.delete(SList(mutableListOf(SText("@content"))))
                } catch (e: Exception) {
                    content[type.attributes.indexOf(type.attributes.first { it.name == next })]?.delete(
                        SList(mutableListOf(SText("@content")))
                    )
                }

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content[i]?.delete(path)
                } catch (e: Exception) {
                    content[type.attributes.indexOf(type.attributes.first { it.name == next })]?.delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
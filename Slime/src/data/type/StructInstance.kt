package data.type

import data.*
import java.lang.Exception

class StructInstance(override val names: MutableList<Text>?, val meta: StructType) : Variable(Type.SInst, names) {

    val content: MutableList<Variable?> = MutableList(meta.attributes.size) { null }

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List, type), mutableListOf(this))

    override fun copy(): StructInstance {
        val result = StructInstance(names?.toMutableList(), meta)
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

    override fun insert(v: Variable, i: Int): Variable {
        content[meta.attributes.indexOf(meta.attributes.first { it.type == v.type })] = v
        return this
    }

    override fun get(path: ListOf): Variable =
        when {
            path.content.isEmpty() -> this
            path.content.size == 1 -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    content[next.toInt()] ?: throw Exception("Wrong index")
                } catch (e: Exception) {
                    content[meta.attributes.indexOf(meta.attributes.first { it.name == next })]
                        ?: throw Exception("Wrong variable name")
                }
            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    content[next.toInt()]?.get(path) ?: throw Exception("Wrong index")
                } catch (e: Exception) {
                    content[meta.attributes.indexOf(meta.attributes.first { it.name == next })]?.get(path)
                        ?: throw Exception("Wrong variable name")
                }
            }
        }

    override fun delete(path: ListOf) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path.content shouldn't be empty when deleting from Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content[i]?.delete(ListOf(mutableListOf(Type.List, Type.Text), mutableListOf(Text("@content"))))
                } catch (e: Exception) {
                    content[meta.attributes.indexOf(meta.attributes.first { it.name == next })]?.delete(
                        ListOf(
                            mutableListOf(Type.List, Type.Text),
                            mutableListOf(Text("@content"))
                        )
                    )
                }

            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content[i]?.delete(path)
                } catch (e: Exception) {
                    content[meta.attributes.indexOf(meta.attributes.first { it.name == next })]?.delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
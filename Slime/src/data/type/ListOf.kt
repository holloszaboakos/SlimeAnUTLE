package data.type

import data.*
import java.lang.Exception


@Suppress("UNCHECKED_CAST")
class ListOf<T:Variable>(val content: MutableList<T>,names: MutableList<Text>?=null):
    Variable(Type.List, names) {

    override fun add(v: Variable, i: Int): Variable {
        content.add(v as T)
        return this
    }

    override fun copy(): ListOf<T> {
        val result = ListOf(content.toMutableList())
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

    override fun get(path: ListOf<Text>): Variable =
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

    override fun delete(path: ListOf<Text>) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                val i = next.toInt()
                content[i].delete(ListOf(mutableListOf(Text("@content"))))

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                val i = next.toInt()
                content[i].delete(path)

            }
        }
    }


    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
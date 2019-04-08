package data.type

import data.*
import java.lang.Exception

class ListOf(names: MutableList<Text>, val ofType: List<Type>, val content: MutableList<Variable>) :
    Variable(Type.List, names) {
    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List, type), mutableListOf(this))

    override fun copy(): ListOf {
        val result = ListOf(names.toMutableList(), ofType.toList(), content.toMutableList())
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

    override fun insert(v: Variable, i: Int): Variable {
        if (ofType.size == 1) {
            if (v.type == ofType[0])
                if (i > 0) content[i] = v
                else content.add(v)
            else throw Exception("This List can not contain variable of this type: ${v.type}")
        }
        var vari = v
        for (t in 1..(ofType.size - 1)) {
            if (vari.type != ofType[t])
                throw Exception("This List can not contain variable of this type: ${v.type}")
            when (ofType[t]) {
                Type.List -> vari = (vari as ListOf).content[0]
                else -> { println("lol") }
            }
        }
        if(i!=-1)content[i]=v
        else content.add(v)
        return this
    }

    override fun get(path: MutableList<String>): Variable =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                val next = path[0]
                path.removeAt(0)
                content[next.toInt()]
            }
            else -> {
                val next = path[0]
                path.removeAt(0)
                content[next.toInt()].get(path)
            }
        }

    override fun delete(path: MutableList<String>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Template: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(mutableListOf("@content"))

            }
            else -> {
                val next = path[0]
                path.removeAt(0)
                val i = next.toInt()
                content[i].delete(path)

            }
        }
    }


    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
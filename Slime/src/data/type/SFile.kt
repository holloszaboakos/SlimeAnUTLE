package data.type

import data.SVari
import data.Visitor
import java.util.regex.Pattern

class SFile(val content: MutableMap<String, SVari>, names: List<SText> = listOf()) : SVari("File", names) {

    override fun listPaths(): SList<SList<SText>> {
        val result = SList<SList<SText>>(mutableListOf())
        for (key in content.keys) {
            val vari = content[key]
            val variPaths = vari?.listPaths()
            variPaths?.let {
                for (path in variPaths)
                    path.add(0, SText(key))
                result.addAll(variPaths)
            }
            result.add(SList(mutableListOf(SText(key))))

        }
        return result
    }

    override fun copy(names: List<SText>): SFile {
        val result = SFile(content, SList(names as MutableList<SText>))
        for (key in content.keys)
            result.content[key] = result.content[key]?.copy() ?: throw Exception("Error during copying")
        return result
    }

    override fun expand(): String {
        var result = ""
        for (c in content.values)
            result += ('\n'+c.expand())
        result=result.substring(1)
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (c in content.values)
            result += (divider+c.expand())
        result=result.substring(divider.length)
        return result
    }

    override fun plus(v: SVari, i: Int): SVari =
        throw Exception("You can not add into SFile:${names.getOrNull(0) ?: "@nameless"}")


    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                when (val next = path[0]()) {
                    "names" -> names
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    "cont" -> content.values.toList().toSList(owner = this)
                    "iter" -> content.values.toList().toSList(owner = this).iter
                    in content.keys -> content[next]
                        ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content.values.toList()[next.toInt()]
                        else throw Exception("Wrong variable name: $next")
                }
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> names.get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "copyN" -> copy(names).get(path)
                    "cont" -> content.values.toList().toSList(owner = this).get(path)
                    "iter" -> content.values.toList().toSList(owner = this).iter.get(path)
                    in content.keys -> content[next]?.get(path)
                        ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content.values.toList()[next.toInt()].get(path)
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.isEmpty() -> throw java.lang.Exception(
                "path shouldn't be empty when deleting from STemp: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content.remove(content.keys.toList()[i])
                } else
                    content.remove(next)


            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content.values.toList()[i].delete(path)
                } else
                    content[next]?.delete(path)


            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
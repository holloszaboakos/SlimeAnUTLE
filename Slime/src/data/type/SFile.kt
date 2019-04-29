package data.type

import data.SVari
import data.Visitor
import java.util.regex.Pattern

class SFile(val content: MutableMap<String, SVari>, names: List<SName> = listOf(), var output:String="") : SVari("File", names) {

    override fun listPaths(): SList<SList<SName>> {
        val result = SList<SList<SName>>(mutableListOf())
        for (key in content.keys) {
            val vari = content[key]
            val variPaths = vari?.listPaths()
            variPaths?.let {
                for (path in variPaths)
                    path.add(0, SName(key))
                result.addAll(variPaths)
            }
            result.add(SList(mutableListOf(SName(key))))

        }
        return result
    }

    override fun copy(names: List<SName>): SFile {
        val result = SFile(content, SList(names as MutableList<SName>))
        for (key in content.keys)
            result.content[key] = result.content[key]?.copy() ?: throw Exception("Error during copying")
        return result
    }

    override fun extend(divider: String): String {
        var result = ""
        for (c in content.values)
            result += (divider+c.extend())
        result=result.substring(divider.length)
        return result
    }

    override fun plus(v: SVari, i: Int): SVari =
        when {
            v is SList<*> && v[0] is SName && i == -1
            -> addNames(v.filter { it is SName }.map { it as SName })
            v is SList.SIter<*> && v.owner[0] is SName && i == -1
            -> addNames(v.owner.filter { it is SName }.map { it as SName })
            v is SName && i == -1
            -> addNames(listOf(v))
            else -> throw Exception("You can not add into SFile:${names.getOrNull(0) ?: "@nameless"}")
        }

    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> names.toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "cont" -> content.values.toList().toSList(owner = this).get(path)
                    "iter" -> content.values.toList().toSList(owner = this).iter.get(path)
                    "outp" -> SText(output)
                    in content.keys -> content[next]?.get(path)
                        ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content.values.toList()[next.toInt()].get(path)
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    override fun delete(path: SList<SName>) {
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

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
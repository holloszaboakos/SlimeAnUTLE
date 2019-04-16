package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

class SInst(metaName: String, names: List<SText> = SList()) : SVari(metaName, names) {

    private val content: MutableList<SVari?> = MutableList(SType[typeName].attributes.size) { null }

    operator fun invoke(): MutableList<SVari?> = content

    override fun listPaths(): SList<SList<SText>> {
        val result = SList<SList<SText>>(mutableListOf())
        for (vari in content) {
            vari?.let {
                val variPaths = vari.listPaths()
                val variName = SText(SType[typeName].attributes[content.indexOf(vari)].name)

                for (path in variPaths)
                    path.add(1, variName)
                result += variPaths

                result.add(SList(mutableListOf(variName)))
            }
        }
        return result
    }

    override fun copy(names: List<SText>): SInst {
        val result = SInst(typeName, names)

        for (d in content)
            if (d != null) result.content[content.indexOf(d)] = d.copy(d.names)
        return result
    }

    override fun expand(): String {
        var result = ""
        for (d in content)
            result += ("\n"+d?.expand()  )
        result=result.substring(1)
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (d in content)
            result += (divider+d?.expand())
        result=result.substring(divider.length)
        return result
    }

    override fun plus(v: SVari, i: Int): SVari {
        when {
            i == -1 && v is SList.SIter<*>
            -> for (j in 0 until v.owner.size)
                plus(v.owner[j], j)
            i == -1 && ctype.attributes.any { it.type[0]().compareTo(v.typeName) == 0 }
            -> content[ctype.attributes.indexOfFirst { it.type[0]().compareTo(v.ctype.tag) == 0 }] = v
            i != -1 && ctype.attributes[i].type[0]().compareTo(v.typeName) == 0
            -> content[i] = v
            else -> throw Exception("type mismatch!!")
        }
        return this
    }

    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                when (val next = path[0]()) {
                    "names" -> names
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    "cont" -> content.filter { it != null }.map { it as SVari }.toSList(owner = this)
                    "iter" -> content.filter { it != null }.map { it as SVari }.toSList(owner = this).iter
                    in ctype.attributes.map { it.name } ->
                        content[ctype.attributes.indexOf(ctype.attributes
                            .first { it.name.compareTo(next) == 0 })]
                            ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content[next.toInt()]
                                ?: throw Exception("Wrong variable index: $next")
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
                    "cont" -> content.filter { it != null }.map { it as SVari }.toSList(owner = this).get(path)
                    "iter" -> content.filter { it != null }.map { it as SVari }.toSList(owner = this).iter.get(path)
                    in ctype.attributes.map { it.name } ->
                        content[ctype.attributes.indexOf(ctype.attributes
                            .first { it.name.compareTo(next) == 0 })]?.get(path)
                            ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content[next.toInt()]?.get(path)
                                ?: throw Exception("Wrong variable index: $next")
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content[i]?.delete(SList(mutableListOf(SText("@content"))))
                } else
                    content[SType[typeName].attributes.indexOf(SType[typeName].attributes.first { it.name == next })]?.delete(
                        SList(mutableListOf(SText("@content")))
                    )


            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content[i]?.delete(path)
                } else
                    content[SType[typeName].attributes.indexOf(SType[typeName].attributes.first { it.name == next })]?.delete(
                        path
                    )


            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
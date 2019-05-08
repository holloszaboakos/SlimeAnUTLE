package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

class SInst(metaName: String, names: List<SName> = listOf()) : SVari(metaName, names) {

    private val content: MutableList<SVari?> = MutableList(SType[typeName].attributes.size) { null }

    operator fun invoke(): MutableList<SVari?> = content

    override fun listPaths(): SList<SList<SName>> {
        val result = SList<SList<SName>>(mutableListOf())
        for (vari in content) {
            vari?.let {
                val variPaths = vari.listPaths()
                val variName = SName(SType[typeName].attributes[content.indexOf(vari)].name)

                for (path in variPaths)
                    path.add(1, variName)
                result += variPaths

                result.add(SList(mutableListOf(variName)))
            }
        }
        return result
    }

    override fun copy(names: List<SName>): SInst {
        val result = SInst(typeName, names)

        for (d in content)
            if (d != null) result.content[content.indexOf(d)] = d.copy()
        return result
    }

    override fun extend(divider: String): String {
        var result = ""
        for (d in content)
            result += (divider + d?.extend())
        result = result.substring(divider.length)
        return result
    }

    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
    when {
        path.isEmpty() -> {this}
        else -> {
            val next = path[0]()
            path.removeAt(0)
            when (next) {
                "names"-> {
                    when {
                        v is SList<*> && v.size !=0 && v[0] is SName
                        -> addNames(v.filter { it is SName }.map { it as SName })
                        v is SList.SIter<*> && v.owner.size !=0 && v.owner[0] is SName
                        -> addNames(v.owner.filter { it is SName }.map { it as SName })
                        v is SName -> addNames(SList(mutableListOf(v)))
                    }
                    this
                }
                else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
            }
        }
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

    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content[i]?.delete(SList(mutableListOf(SName("@content"))))
                } else
                    content[SType[typeName].attributes.indexOf(SType[typeName].attributes.first { it.name == next })]?.delete(
                        SList(mutableListOf(SName("@content")))
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

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

//The class behind the Inst type
class SInst(metaName: String, names: List<SName> = listOf()) : SVari(metaName, names) {

    //It simply stores the value of the attributes of the list
    private val content: MutableList<SVari?> = MutableList(SType[typeName].attributes.size) { null }

    //For easier reach of the content
    operator fun invoke(): MutableList<SVari?> = content

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
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
        result.addAll(
            SList(
                mutableListOf(
                    SList(mutableListOf(SName("names"))),
                    SList(mutableListOf(SName("self"))),
                    SList(mutableListOf(SName("copy"))),
                    SList(mutableListOf(SName("type")))

                )
            )
        )
        for (i in 0 until content.size) {
            val root = SName(i.toString())
            val pathL = content[i]?.listPaths() ?: mutableListOf<SList<SName>>()
            for (p in pathL) {
                p.add(0, root)
                result.add(p)
            }
        }
        result.addAll(content.filter { it is SVari }.map { it as SVari }
            .toSList().listPaths().map { it.add(0, SName("cont")); it })
        return result
    }

    //Makes a copy from the variable
    override fun copy(names: List<SName>): SInst {
        val result = SInst(typeName, names)

        for (d in content)
            if (d != null) result.content[content.indexOf(d)] = d.copy()
        return result
    }

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String {
        var result = ""
        for (d in content)
            result += (divider + d?.extend())
        result = result.substring(divider.length)
        return result
    }

    //Plusses a new variable to the variable
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {
                this
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> {
                        when {
                            v is SList<*> && v.size != 0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SList.SIter<*> && v.owner.size != 0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception(
                        "unknown keyword for special char: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //Returns the variable on the given relative path
    //Inst is a Cont
    //Its attributes are available by name
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No Name in this namespace!")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
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

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
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

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
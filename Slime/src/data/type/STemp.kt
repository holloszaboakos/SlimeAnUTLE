package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

//The class behind the Temp type
class STemp(
    val content: MutableList<SVari>,
    names: List<SName> = listOf()
) : SVari("Temp", names), Visitor {

    //You can get the slots throw this property
    val slotL: List<SSlot> get() = content.filter { it is SSlot }.map { it as SSlot }

    //register himself as owner of the Slots
    init {
        content.forEach {
            if (!(it is SSlot || it is SText || it is SSpec)) throw Exception("Wrong type variable in template")
        }
        slotL.forEach { it.owner = this }
    }

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> {
        val result = SList<SList<SName>>(mutableListOf())
        for (slot in slotL) {
            val slotPaths = slot.listPaths()
            slotPaths.let {
                for (path in slotPaths) {
                    val p = path.toMutableList()
                    p.add(0, slot.tag)
                    result.plus(SList(p), SList(mutableListOf()), SList(mutableListOf()))
                    result.plus(SList(mutableListOf(slot.tag)), SList(mutableListOf()), SList(mutableListOf()))
                }
            }
        }
        result.addAll(
            SList(mutableListOf(
                SList(mutableListOf(SName("names"))),
                SList(mutableListOf(SName("self"))),
                SList(mutableListOf(SName("copy"))),
                SList(mutableListOf(SName("type")))

            ))
        )
        for (i in 0 until content.size){
            val root=SName(i.toString())
            val pathL=content[i].listPaths()
            for(p in pathL){
                p.add(0,root)
                result.add(p)
            }
        }
        result.addAll(content.toSList().listPaths().map { it.add(0,SName("cont")); it})

        return result
    }

    //Makes a copy from the variable
    override fun copy(names: List<SName>): STemp {
        return STemp(content.map { it.copy() }.toMutableList(), names)
    }

    //It lets you achive slots by tag
    operator fun get(name: String): List<SSlot> {
        return slotL.filter { it.tag().compareTo(name) == 0 }
    }

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String {
        var result = ""
        content.forEach { result += it.extend() }
        return result
    }

    //Plusses a new variable to the variable
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> v.accept(this, "@plus")
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
    //Temp is a Cont
    //Its variables are available grouped by typename
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No Name in this namespace")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    "cont" -> content.toSList(owner = this).get(path)
                    "iter" -> content.toSList(owner = this).iter.get(path)
                    "slots" -> slotL.toSList(owner = this).get(path)
                    "texts" -> content.filter { it is SText }.map { it as SText }.toSList(owner = this).get(path)
                    "specs" -> content.filter { it is SSpec }.map { it as SSpec }.toSList(owner = this).get(path)
                    in slotL.map { it.tag() } -> {
                        val matchingSlots = get(next)
                        if (matchingSlots.size == 1)
                            matchingSlots[0].get(path)
                        else matchingSlots.toSList(owner = this).get(path)
                    }
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content[next.toInt()].get(path)
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)

                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    slotL[i].delete(SList(mutableListOf(SName("@content"))))
                } else
                    this[next].toSList().delete(SList(mutableListOf(SName("@content"))))


            }
            else -> {
                val next = path[0]()
                path.removeAt(0)

                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    slotL[i].delete(path)
                } else
                    this[next].toSList().get(path)


            }
        }
    }

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)

    override fun visit(h: SSlot, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                h.owner = this;content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SSpec, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SType, mode: String)
            : SVari = throw Exception(
        "You can not plus type into Temp: ${names[DataContainer.focus
            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
    )

    override fun visit(h: SInst, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                for (slot in slotL)
                    if (h.ctype.attributes.any { it.name.compareTo(slot.tag()) == 0 }) {
                        val a = h.ctype.attributes.find { it.name.compareTo(slot.tag()) == 0 }
                            ?: throw Exception("attribute disappeared")
                        slot.plus(
                            h()[h.ctype.attributes.indexOf(a)] ?: throw Exception("attribute ${a.name} has no value"),
                            SList(mutableListOf()),
                            SList(mutableListOf())
                        )
                    }
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: STemp, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                content.addAll(h.content)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SText, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                content.add(h)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SName, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                addNames(listOf(h))
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SRefe, mode: String)
            : SVari = throw Exception("TODO")

    override fun <T : SVari> visit(h: SList<T>, mode: String): SList<STemp> =
        when (mode) {
            "@plus" -> {
                if (h[0] is SName) {
                    addNames(h.filter { it is SName }.map { it as SName })
                    SList(listOf(this))
                } else {
                    val result = SList<STemp>()
                    for (item in h) {
                        val v = copy().plus(item, SList(mutableListOf()), SList(mutableListOf()))
                        if (v is STemp)
                            result.add(v)
                        if (v is SList<*>)
                            for (t in v.filter { it is STemp }.map { it as STemp })
                                result.add(t)
                    }
                    result
                }
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun <T : SVari> visit(h: SList.SIter<T>, mode: String): SList<STemp> =
        when (mode) {
            "@plus" -> {
                if (h.owner[0] is SName) {
                    addNames(h.owner.filter { it is SName }.map { it as SName })
                    SList(listOf(this))
                } else {
                    val result = SList<STemp>()
                    for (item in h.owner) {
                        val v = copy().plus(item, SList(mutableListOf()), SList(mutableListOf()))
                        if (v is STemp)
                            result.add(v)
                        if (v is SList<*>)
                            for (t in v.filter { it is STemp }.map { it as STemp })
                                result.add(t)
                    }
                    result
                }
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
        }


    override fun visit(h: SFile, mode: String)
            : SVari = throw Exception(
        "You can not add File Temp:  ${names[DataContainer.focus ?: throw Exception("No file in focus!")]?.getOrNull(0)
            ?: "@nameless"}"
    )

}
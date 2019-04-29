package data.type

import data.*
import java.lang.Exception
import java.util.regex.Pattern

class STemp(
    val content: MutableList<SVari>,
    names: List<SName> = listOf()
) : SVari("Temp", names), Visitor {

    val slotL: List<SSlot> get() = content.filter { it is SSlot }.map { it as SSlot }

    init {
        content.forEach {
            if (!(it is SSlot || it is SText || it is SSpec)) throw Exception("Wrong type variable in template")
        }
        slotL.forEach { it.owner = this }
    }

    override fun listPaths(): SList<SList<SName>> {
        val result = SList<SList<SName>>(mutableListOf())
        for (slot in slotL) {
            val slotPaths = slot.listPaths()
            slotPaths.let {
                for (path in slotPaths) {
                    val p = path.toMutableList()
                    p.add(0, slot.tag)
                    result.plus(SList(p))
                    result.plus(SList(mutableListOf(slot.tag)))
                }
            }

        }
        return result
    }

    override fun copy(names: List<SName>): STemp {
        return STemp(content.map { it.copy() }.toMutableList(), names)
    }

    operator fun get(name: String): List<SSlot> {
        return slotL.filter { it.tag().compareTo(name) == 0 }
    }

    override fun extend(divider: String): String {
        var result = ""
        content.forEach { result += it.extend() }
        return result
    }

    override fun plus(v: SVari, i: Int): SVari = v.accept(this, "@add")

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
                    "slots" -> slotL.toSList(owner = this).get(path)
                    "texts" -> content.filter { it is SText }.map { it as SText }.toSList(owner = this).get(path)
                    "specs" -> content.filter { it is SSpec }.map { it as SSpec }.toSList(owner = this).get(path)
                    "cont" -> content.toSList(owner = this).get(path)
                    "iter" -> content.toSList(owner = this).iter.get(path)
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

    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Temp: ${names.getOrNull(0) ?: "@nameless"}"
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

    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)

    override fun visit(h: SSlot, mode: String): SVari =
        when (mode) {
            "@add" -> {
                h.owner = this;content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SSpec, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SType, mode: String)
            : SVari = throw Exception("You can not plus type into Temp: ${names.getOrNull(0) ?: "@nameless"}")

    override fun visit(h: SInst, mode: String): SVari =
        when (mode) {
            "@add" -> {
                for (slot in slotL)
                    if (h.ctype.attributes.any { it.name.compareTo(slot.tag()) == 0 }) {
                        val a = h.ctype.attributes.find { it.name.compareTo(slot.tag()) == 0 }
                            ?: throw Exception("attribute disappeared")
                        slot.plus(
                            h()[h.ctype.attributes.indexOf(a)] ?: throw Exception("attribute ${a.name} has no value")
                        )
                    }
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: STemp, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.addAll(h.content)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SText, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.add(h)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SName, mode: String): SVari =
        when (mode) {
            "@add" -> {
                addNames(listOf(h))
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun visit(h: SRefe, mode: String)
            : SVari = throw Exception("TODO")

    override fun <T : SVari> visit(h: SList<T>, mode: String): SList<STemp> =
        when (mode) {
            "@add" -> {
                if (h[0] is SName) {
                    addNames(h.filter { it is SName }.map { it as SName })
                    SList(listOf(this))
                } else {
                    val result = SList<STemp>()
                    for (item in h) {
                        val v = copy().plus(item)
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
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun <T : SVari> visit(h: SList.SIter<T>, mode: String): SList<STemp> =
        when (mode) {
            "@add" -> {
                if (h.owner[0] is SName) {
                    addNames(h.owner.filter { it is SName }.map { it as SName })
                    SList(listOf(this))
                } else {
                    val result = SList<STemp>()
                    for (item in h.owner) {
                        val v = copy().plus(item)
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
                "wrong variable or in wrong mode visiting Temp: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }


    override fun visit(h: SFile, mode: String)
            : SVari = throw Exception("You can not add File Temp:  ${names.getOrNull(0) ?: "@nameless"}")

}
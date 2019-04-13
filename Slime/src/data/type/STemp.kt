package data.type

import data.*
import java.lang.Exception

class STemp(
    val content: MutableList<SVari>,
    names: MutableList<SText>? = null
) : SVari(ctype, names), Visitor {
    companion object {
        val ctype = SType["Temp"]
    }

    val slotL: List<SSlot> get() = content.filter { it is SSlot }.map { it as SSlot }
    val specL: List<SSpec> get() = content.filter { it is SSpec }.map { it as SSpec }
    val textL: List<SText> get() = content.filter { it is SText }.map { it as SText }

    init {
        content.forEach {
            if (!(it is SSlot || it is SText || it is SSpec)) throw Exception("Wrong type variable in template")
        }
        slotL.forEach { it.owner = this }
    }

    override fun listPaths(): SList<SList<SText>>? {
        val result = SList<SList<SText>>(mutableListOf())
        for (slot in slotL) {
            val slotPaths = slot.listPaths()?.content
            slotPaths?.let {
                for (path in slotPaths)
                    slot.names?.let {
                        for (n in slot.names) {
                            val p = path.content.toMutableList()
                            p.add(0, n)
                            result.add(SList<SText>(p))
                        }
                    }
            }

        }
        return result
    }

    override fun copy(): STemp {
        return STemp(content.map { it.copy() }.toMutableList())
    }

    fun getSlotByName(name: String): SSlot {
        return slotL.firstOrNull { it.names?.any { t -> t.content == name } ?: false }
            ?: throw Exception("there is no Slot called $name in Templlate: ${names?.getOrNull(0) ?: "@nameless"} ")
    }

    override fun expand(): String {
        var result = ""
        content.forEach { result += it.expand() }
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        content.forEach { result += it.expand(divider) }
        return result
    }

    override fun add(v: SVari, i: Int): SVari = v.visit(this, "@add")

    override fun get(path: SList<SText>): SVari =
        when {
            path.content.isEmpty() -> this
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    slotL[next.toInt()]
                } catch (e: Exception) {
                    getSlotByName(next)
                }
            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    slotL[next.toInt()].get(path)
                } catch (e: Exception) {
                    getSlotByName(next).get(path)
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    slotL[i].delete(SList(mutableListOf(SText("@content"))))
                } catch (e: Exception) {
                    getSlotByName(next).delete(SList(mutableListOf(SText("@content"))))
                }

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    slotL[i].delete(path)
                } catch (e: Exception) {
                    getSlotByName(next).delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)

    override fun accept(h: SSlot, mode: String): SVari =
        when (mode) {
            "@add" -> {
                h.owner = this;content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SSpec, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.add(h); this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SType, mode: String)
            : SVari = throw Exception("TODO")

    override fun accept(h: SInst, mode: String)
            : SVari = throw Exception("TODO")

    override fun accept(h: STemp, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.addAll(h.content)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SText, mode: String): SVari =
        when (mode) {
            "@add" -> {
                content.add(h)
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SRefe, mode: String)
            : SVari = throw Exception("TODO")

    override fun <T : SVari> accept(h: SList<T>, mode: String) =
        when (mode) {
            "@add" -> {
                h.content.forEach { add(it) }
                this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Temp: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SFile, mode: String)
            : SVari = throw Exception("You can not add File Temp:  ${names?.getOrNull(0) ?: "@nameless"}")

}
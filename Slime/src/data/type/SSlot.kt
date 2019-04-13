package data.type

import data.*
import java.lang.Exception

class SSlot(names: MutableList<SText>? = null) : SVari(ctype, names), Visitor {

    companion object {
        val ctype = SType["Refe"]
    }

    var content: STemp? = null
    var owner: STemp?=null

    override fun listPaths(): SList<SList<SText>>? = content?.listPaths()

    override fun copy(): SSlot {
        val result = SSlot(names?.toMutableList())
        if (content != null)
            result.content = content?.copy()
        return result
    }

    override fun expand(): String = content?.expand() ?: "{$ ${names?.getOrNull(0) ?: "@nameless"} $}"

    override fun expand(divider: String): String = content?.expand() ?: "{$ ${names?.getOrNull(0) ?: "@nameless"} $}"

    override fun add(v: SVari, i: Int): SVari = v.visit(this, "@add")


    override fun get(path: SList<SText>): SVari =
            when {
                path.content.isEmpty() -> this
                path.content.size == 1 && path.content[0].content == "@content" -> {
                    content ?: throw Exception("No variable in Slot: ${names?.getOrNull(0) ?: "@nameless"}")
                }
                else -> {
                    content?.get(path) ?: throw Exception("Wrong variable name")
                }
            }

    override fun delete(path: SList<SText>) {
        when {
            path.content.isEmpty() -> throw Exception(
                    "path shouldn't be empty when deleting from Slot: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 && path.content[0].content == "@content" -> {
                content = null
            }
            else -> {
                content?.delete(path) ?: throw Exception("Wrong variable name")
            }
        }
    }


    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)

    override fun accept(h: SSlot, mode: String): SVari =
            when (mode) {
                "@add" -> {
                    this.content = STemp(mutableListOf(h)); this
                }
                else -> throw Exception(
                        "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
                )
            }

    override fun accept(h: SSpec, mode: String): SVari = when (mode) {
        "@add" -> {
            this.content = STemp(mutableListOf(h)); this
        }
        else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: SType, mode: String): SVari =
            throw Exception("You can not add a Structure type into Slot ${names?.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: SInst, mode: String): SVari =
            throw Exception("You can not add a Structure Instance into Slot ${names?.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: STemp, mode: String): SVari =
            when (mode) {
                "@add" -> {
                    this.content = h; this
                }
                else -> throw Exception(
                        "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
                )
            }

    override fun accept(h: SText, mode: String): SVari = when (mode) {
        "@add" -> {
            this.content = STemp(mutableListOf(h)); this
        }
        else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: SRefe, mode: String): SVari = throw Exception("TODO")

    override fun <T:SVari>accept(h: SList<T>, mode: String): SVari =
        when (mode) {
            "@add" -> {
                SList(h.content.map { owner?.copy()?.add(it) ?: copy().add(it) }.toMutableList())
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: SFile, mode: String): SVari = throw Exception("You can not insert File int Slot: ${names?.getOrNull(0) ?: "@nameless"}")
}
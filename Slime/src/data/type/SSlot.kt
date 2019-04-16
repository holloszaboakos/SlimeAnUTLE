package data.type

import data.*
import java.lang.Exception

class SSlot(val tag:SText,names: List<SText> = listOf()) : SVari("Slot", names), Visitor {

    var content: STemp? = null
    var owner: STemp? = null

    override fun listPaths(): SList<SList<SText>> = content?.listPaths() ?: SList()

    override fun copy(names: List<SText>): SSlot {
        val result = SSlot(tag,names)
        if (content != null)
            result.content = content?.copy()
        return result
    }

    override fun expand(): String = content?.expand() ?: "{$ ${tag()} $}"

    override fun expand(divider: String): String = content?.expand() ?: "{$ ${tag()} $}"

    override fun plus(v: SVari, i: Int): SVari = v.visit(this, "@add")


    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> content ?: this
            path.size == 1 -> {
                when (path[0]()) {
                    "names"-> names
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    "cont" -> content ?: throw Exception("no Template in slot: ${names.getOrNull(0)?:"@nameless"}")
                    else -> throw  Exception("unknown keyword for slot: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> names.get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "copyN" -> copy(names).get(path)
                    "cont" -> content?.get(path) ?: throw Exception("no Template in slot: ${names.getOrNull(0)?:"@nameless"}")
                    else -> throw  Exception("unknown keyword for slot: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
        }

    override fun delete(path: SList<SText>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Slot: ${names.getOrNull(0)?:"@nameless"}"
            )
            path.size == 1 && path[0]() == "@content" -> {
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
                this.content = STemp(mutableListOf(h)); owner?:this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
            )
        }

    override fun accept(h: SSpec, mode: String): SVari = when (mode) {
        "@add" -> {
            this.content = STemp(mutableListOf(h)); owner?:this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
        )
    }

    override fun accept(h: SType, mode: String): SVari =
        throw Exception("You can not add a Structure type into Slot ${names.getOrNull(0)?:"@nameless"}")

    override fun accept(h: SInst, mode: String): SVari =
        throw Exception("You can not add a Structure Instance into Slot ${names.getOrNull(0)?:"@nameless"}")

    override fun accept(h: STemp, mode: String): SVari =
        when (mode) {
            "@add" -> {
                this.content = h; owner?:this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
            )
        }

    override fun accept(h: SText, mode: String): SVari = when (mode) {
        "@add" -> {
            this.content = STemp(mutableListOf(h)); owner?:this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
        )
    }

    override fun accept(h: SRefe, mode: String): SVari = throw Exception("TODO")

    override fun <T : SVari> accept(h: SList<T>, mode: String): SVari =
        when (mode) {
            "@add" -> {
                SList(h.map { owner?.copy()?.plus(it) ?: copy().plus(it) }.toMutableList())
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
            )
        }

    override fun <T : SVari> accept(h: SList.SIter<T>, mode: String): SVari =
        when (mode) {
            "@add" -> {
                SList(h.owner.map { owner?.copy()?.plus(it) ?: copy().plus(it) }.toMutableList()).iter
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0)?:"@nameless"}"
            )
        }

    override fun accept(h: SFile, mode: String): SVari =
        throw Exception("You can not insert File int Slot: ${names.getOrNull(0)?:"@nameless"}")
}
package data.type

import data.*
import java.lang.Exception

class SSlot(val tag: SName, names: List<SName> = listOf()) : SVari("Slot", names), Visitor {

    var content: STemp? = null
    var owner: STemp? = null

    override fun listPaths(): SList<SList<SName>> = content?.listPaths() ?: SList()

    override fun copy(names: List<SName>): SSlot {
        val result = SSlot(tag, names)
        if (content != null)
            result.content = content?.copy()
        return result
    }

    override fun extend(divider: String): String = content?.extend() ?: "{$ ${tag()} $}"

    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> v.accept(this,"@plus")
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
                    else -> throw  Exception("unknown keyword for special char: ${tag()}")
                }
            }
        }


    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> content ?: this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> names.toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "cont" -> content?.get(path) ?: throw Exception(
                        "no Template in slot: ${tag()}"
                    )
                    else -> throw  Exception("unknown keyword for slot: ${tag()}")
                }
            }
        }

    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Slot: ${tag()}"
            )
            path.size == 1 && path[0]() == "@content" -> {
                content = null
            }
            else -> {
                content?.delete(path) ?: throw Exception("Wrong variable name")
            }
        }
    }


    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)

    override fun visit(h: SSlot, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                this.content = STemp(mutableListOf(h)); owner ?: this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun visit(h: SSpec, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(h)); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    override fun visit(h: SType, mode: String): SVari =
        throw Exception("You can not add a Structure type into Slot ${tag()}")

    override fun visit(h: SInst, mode: String): SVari =
        content?.plus(h,SList()) ?: throw Exception("You can not add a Structure Instance into Slot ${tag()}")

    override fun visit(h: STemp, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                this.content = h; owner ?: this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun visit(h: SText, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(h)); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    override fun visit(h: SName, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(h)); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    override fun visit(h: SRefe, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                val varis=h.listMatchingPaths().map{DataContainer.focus?.get(it)}
                if (varis[0] is SName) {
                    addNames(varis.filter { it is SName }.map { it as SName })
                    this
                } else
                    SList(varis.filter { it is SVari }.map{it as SVari}.map {
                        owner?.copy()?.plus(it, SList(mutableListOf()), SList(mutableListOf())) ?: copy().plus(
                        it,
                        SList(mutableListOf()),
                        SList(mutableListOf())
                    ) }.toMutableList())
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun <T : SVari> visit(h: SList<T>, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                if (h[0] is SName) {
                    addNames(h.filter { it is SName }.map { it as SName })
                    this
                } else
                    SList(h.map { owner?.copy()?.slotL?.first {s -> s.tag().compareTo(tag())==0 }?.plus(it) ?:
                    copy().plus(
                        it,
                        SList(mutableListOf()),
                        SList(mutableListOf())
                    ) }.toMutableList())
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun <T : SVari> visit(h: SList.SIter<T>, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                if (h.owner[0] is SName) {
                    addNames(h.owner.filter { it is SName }.map { it as SName })
                    this
                } else
                    SList(h.owner.map { owner?.copy()?.plus(it, SList(mutableListOf()), SList(mutableListOf())) ?: copy().plus(
                        it,
                        SList(mutableListOf()),
                        SList(mutableListOf())
                    ) }.toMutableList()).iter
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun visit(h: SFile, mode: String): SVari =
        throw Exception("You can not insert File int Slot: ${tag()}")
}
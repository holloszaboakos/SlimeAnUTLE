package data.type

import data.*
import java.lang.Exception

class Template(
    names: MutableList<Text>?,
    val slots: MutableMap<Int, Slot>,
    val specials: MutableMap<Int, SpecialChar>,
    val texts: MutableMap<Int, Text>
) : Variable(Type.Temp,names), Visitor {

    val all:List<Variable>
    init {
        val tmp= mutableListOf<Variable>()
        for(i in 0..(slots.size+specials.size+texts.size))
            tmp.add(
                when (i) {
                    in slots.keys -> slots[i]?:throw Exception("Magic happened!")
                    in specials.keys -> specials[i]?:throw Exception("Magic happened!")
                    in texts.keys -> texts[i]?:throw Exception("Magic happened!")
                    else -> throw Exception("Magic happened!")
                }
            )
        all=tmp.toList()
    }

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun copy(): Template {
        val slotCopy = mutableMapOf<Int, Slot>()
        for (k in slots.keys)
            slotCopy[k] = (slots[k]?.copy() ?: throw Exception(""))
        return Template(
            names?.toMutableList(),
            slotCopy,
            specials.toMutableMap(),
            texts.toMutableMap()
        )
    }

    fun getSlotsByName(name: String): Slot {
        return slots.values.firstOrNull { it.names?.any {t-> t.content==name }?:false }
            ?: throw Exception("there is no Slot called $name in Templlate: ${names?.getOrNull(0) ?: "@nameless"} ")
    }

    override fun expand(): String {
        var result = ""
        for (i in 0..(slots.size + specials.size + texts.size - 1)) {
            result += slots[i]?.expand() ?: specials[i]?.expand() ?: texts[i] ?: ""
        }
        return result
    }

    override fun expand(divider: String): String {
        var result = ""
        for (i in 0..(slots.size + specials.size + texts.size - 1)) {
            result += slots[i]?.expand() ?: specials[i]?.expand() ?: texts[i] ?: ""
        }
        return result
    }

    override fun insert(v: Variable, i: Int): Variable = v.visit(this, "@insert")

    override fun get(path: ListOf): Variable =
        when {
            path.content.isEmpty() -> this
            path.content.size==1 -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    slots[next.toInt()]?:throw Exception("Wrong index")
                } catch (e: Exception) {
                    getSlotsByName(next)
                }
            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    slots[next.toInt()]?.get(path)?:throw Exception("Wrong index")
                } catch (e: Exception) {
                    getSlotsByName(next).get(path)
                }
            }
        }

    override fun delete(path: ListOf) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    slots[i]?.delete(ListOf(mutableListOf(Type.List,Type.Text),mutableListOf(Text("@content"))))
                } catch (e: Exception) {
                    getSlotsByName(next).delete(ListOf(mutableListOf(Type.List,Type.Text),mutableListOf(Text("@content"))))
                }

            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    slots[i]?.delete(path)
                } catch (e: Exception) {
                    getSlotsByName(next).delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)

    override fun accept(h: Slot, mode: String): Variable {
        var result: Template = this
        when (mode) {
            "@insert" -> {
                result = copy();result.slots[slots.size + specials.size + texts.size] = h
            }
        }
        return result
    }

    override fun accept(h: SpecialChar, mode: String): Variable =
        when (mode) {
            "@insert" -> {
                val result = copy()
                result.specials[slots.size + specials.size + texts.size] = h
                result
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: StructType, mode: String)
            : Variable = throw Exception("TODO")

    override fun accept(h: StructInstance, mode: String)
            : Variable = throw Exception("TODO")

    override fun accept(h: Template, mode: String): Variable {
        val size = slots.size + specials.size + texts.size
        val result: Template = when (mode) {
            "@insert" -> copy()
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }
        for (i in h.slots.keys)
            result.slots[i + size] =
                h.slots[i] ?: throw Error("Wrong slot index at Template: ${names?.getOrNull(0) ?: "@nameless"}")
        for (i in h.specials.keys)
            result.specials[i + size] =
                h.specials[i] ?: throw Error("Wrong special index at Template: ${names?.getOrNull(0) ?: "@nameless"}")
        for (i in h.texts.keys)
            result.texts[i + size] =
                h.texts[i] ?: throw Error("Wrong text index at Template: ${names?.getOrNull(0) ?: "@nameless"}")
        return result
    }

    override fun accept(h: Text, mode: String): Variable =
        when (mode) {
            "@insert" -> {
                val result = copy();result.texts[slots.size + specials.size + texts.size] = h;result
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }

    override fun accept(h: ReferenceTo, mode: String)
            : Variable = throw Exception("TODO")

    override fun accept(h: ListOf, mode: String)
            : Variable = throw Exception("TODO")

    override fun accept(h: File, mode: String)
            : Variable = throw Exception("TODO")

}
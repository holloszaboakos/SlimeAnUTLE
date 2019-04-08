package data.type

import data.*
import java.lang.Exception

class Slot(names: MutableList<Text>) : Variable(Type.Slot,names), Visitor {

    var content: Template? = null

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun copy(): Slot {
        val result = Slot(MutableList(names.size) { i -> names[i] })
        if (content != null)
            result.content = content?.copy()
        return result
    }

    override fun expand(): String = content?.expand() ?: "{$ ${names.getOrNull(0) ?: "@nameless"} $}"

    override fun expand(divider: String): String = content?.expand() ?: "{$ ${names.getOrNull(0) ?: "@nameless"} $}"

    override fun insert(v: Variable, i: Int): Variable = v.visit(this, "@insert")


    override fun get(path: MutableList<String>): Variable =
        when {
            path.isEmpty() -> this
            path.size==1 && path[0]=="@content"-> {
                content?:throw Exception("No variable in Slot: ${names.getOrNull(0) ?: "@nameless"}")
            }
            else -> {
                content?.get(path)?:throw Exception("Wrong variable name")
            }
        }

    override fun delete(path: MutableList<String>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Slot: ${names.getOrNull(0) ?: "@nameless"}"
            )
            path.size==1 && path[0]=="@content"-> {
                content=null
            }
            else -> {
                content?.delete(path)?:throw Exception("Wrong variable name")
            }
        }
    }


    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)

    override fun accept(h: Slot, mode: String): Variable = when (mode) {
        "@insert" -> {
            val result = copy();result.content =
                Template(mutableListOf(), mutableMapOf(Pair(0, h)), mutableMapOf(), mutableMapOf()); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: SpecialChar, mode: String): Variable = when (mode) {
        "@insert" -> {
            val result = copy();result.content =
                Template(mutableListOf(), mutableMapOf(), mutableMapOf(Pair(0, h)), mutableMapOf()); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: StructType, mode: String): Variable =
        throw Exception("You can not insert a Structure Type into Slot ${names.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: StructInstance, mode: String): Variable =
        throw Exception("You can not insert a Structure Instance into Slot ${names.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: Template, mode: String): Variable {
        val result = copy()
        result.content = when (mode) {
            "@insert" -> h
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0) ?: "@nameless"}"
            )
        }
        return result
    }

    override fun accept(h: Text, mode: String): Variable = when (mode) {
        "@insert" -> {
            val result = copy();result.content =
                Template(mutableListOf(), mutableMapOf(), mutableMapOf(), mutableMapOf(Pair(0, h))); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: ReferenceTo, mode: String): Variable = throw Exception("TODO")

    override fun accept(h: ListOf, mode: String): Variable = throw Exception("TODO")

    override fun accept(h: File, mode: String): Variable = throw Exception("TODO")
}
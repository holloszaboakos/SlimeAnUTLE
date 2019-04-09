package data.type

import data.*
import java.lang.Exception

class Slot(names: MutableList<Text>?=null) : Variable(Type.Slot,names), Visitor {

    var content: Template? = null

    override fun copy(): Slot {
        val result = Slot(names?.toMutableList())
        if (content != null)
            result.content = content?.copy()
        return result
    }

    override fun expand(): String = content?.expand() ?: "{$ ${names?.getOrNull(0) ?: "@nameless"} $}"

    override fun expand(divider: String): String = content?.expand() ?: "{$ ${names?.getOrNull(0) ?: "@nameless"} $}"

    override fun add(v: Variable, i: Int): Variable = v.visit(this, "@add")


    override fun get(path: ListOf<Text>): Variable =
        when {
            path.content.isEmpty() -> this
            path.content.size==1 && path.content[0].content=="@content"-> {
                content?:throw Exception("No variable in Slot: ${names?.getOrNull(0) ?: "@nameless"}")
            }
            else -> {
                content?.get(path)?:throw Exception("Wrong variable name")
            }
        }

    override fun delete(path: ListOf<Text>) {
        when {
            path.content.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Slot: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size==1 && path.content[0].content=="@content"-> {
                content=null
            }
            else -> {
                content?.delete(path)?:throw Exception("Wrong variable name")
            }
        }
    }


    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)

    override fun accept(h: Slot, mode: String): Variable = when (mode) {
        "@add" -> {
            val result = copy();result.content =
                Template(mutableMapOf(Pair(0, h)), mutableMapOf(), mutableMapOf()); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: Special, mode: String): Variable = when (mode) {
        "@add" -> {
            val result = copy();result.content =
                Template(mutableMapOf(), mutableMapOf(Pair(0, h)), mutableMapOf()); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: StructType, mode: String): Variable =
        throw Exception("You can not add a Structure SType into Slot ${names?.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: StructInstance, mode: String): Variable =
        throw Exception("You can not add a Structure Instance into Slot ${names?.getOrNull(0) ?: "@nameless"}")

    override fun accept(h: Template, mode: String): Variable {
        val result = copy()
        result.content = when (mode) {
            "@add" -> h
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
            )
        }
        return result
    }

    override fun accept(h: Text, mode: String): Variable = when (mode) {
        "@add" -> {
            val result = copy();result.content =
                Template(mutableMapOf(), mutableMapOf(), mutableMapOf(Pair(0, h))); result
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${names?.getOrNull(0) ?: "@nameless"}"
        )
    }

    override fun accept(h: ReferenceTo, mode: String): Variable = throw Exception("TODO")

    override fun accept(h: ListOf<*>, mode: String): Variable = throw Exception("TODO")

    override fun accept(h: File, mode: String): Variable = throw Exception("TODO")
}
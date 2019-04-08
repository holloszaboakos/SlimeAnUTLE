package data.type

import data.*
import java.lang.Exception

data class StructType(override val names: MutableList<Text>, val attributes: List<NameType>) : Variable(Type.Type,names){

    data class NameType(val name: String, val type: List<Type>)

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun copy(): StructType {
        val attributesCopy= mutableListOf<NameType>()
        for (a in attributes)
            attributesCopy.add(NameType(a.name,a.type.toList()))
        return StructType(mutableListOf(),attributesCopy)
    }

    override fun expand(): String {
        var result = "struct ${names.getOrNull(0) ?: "@nameless"}{\n"
        for (a in attributes)
            result += "\t${a.name}:${a.type}\n"
        result += "}\n"
        return result
    }

    override fun expand(divider: String): String {
        var result = "struct ${names.getOrNull(0) ?: "@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}$divider"
        return result
    }

    override fun insert(v: Variable, i: Int): Variable =
        throw Exception("You can not insert into a Structure Type Variable")

    override fun get(path: MutableList<String>): Variable =
        throw Exception("You can not get from a Structure Type Variable")

    override fun delete(path: MutableList<String>) : Unit =
        throw Exception("You can not delete from a Structure Type Variable")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
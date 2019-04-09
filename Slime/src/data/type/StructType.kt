package data.type

import data.*
import java.lang.Exception

data class StructType( val attributes: List<NameType>,override val names: MutableList<Text>?=null) : Variable(Type.SType,names){

    data class NameType(val name: String, val type: List<Type>)

    override fun copy(): StructType {
        val attributesCopy= mutableListOf<NameType>()
        for (a in attributes)
            attributesCopy.add(NameType(a.name,a.type.toList()))
        return StructType(attributesCopy)
    }

    override fun expand(): String {
        var result = "struct ${names?.getOrNull(0) ?: "@nameless"}{\n"
        for (a in attributes)
            result += "\t${a.name}:${a.type}\n"
        result += "}\n"
        return result
    }

    override fun expand(divider: String): String {
        var result = "struct ${names?.getOrNull(0) ?: "@nameless"}{$divider"
        for (a in attributes)
            result += "\t${a.name}:${a.type}$divider"
        result += "}$divider"
        return result
    }

    override fun add(v: Variable, i: Int): Variable =
        throw Exception("You can not add into a Structure SType Variable")

    override fun get(path: ListOf<Text>): Variable =
        throw Exception("You can not get from a Structure SType Variable")

    override fun delete(path: ListOf<Text>) : Unit =
        throw Exception("You can not delete from a Structure SType Variable")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
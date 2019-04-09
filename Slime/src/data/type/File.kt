package data.type

import data.Type
import data.Variable
import data.Visitor

class File(val content:MutableMap<Text,Variable>,names:MutableList<Text>?=null) :Variable(Type.File,names){

    override fun copy(): File {
        val result=File(content)
        for(key in content.keys)
            result.content[key]=result.content[key]?.copy() ?: throw Exception("Error during copying")
        return result
    }

    override fun expand(): String {
        var result=""
        for(c in content.values)
            result+=(c.expand()+'\n')
        return result
    }

    override fun expand(divider: String): String {
        var result=""
        for(c in content.values)
            result+=(c.expand()+divider)
        return result
    }

    override fun add(v: Variable, i: Int): Variable =throw Exception("You can not add into File:${names?.getOrNull(0)?:"@nameless"}")


    override fun get(path: ListOf<Text>): Variable =
        when {
            path.content.isEmpty() -> this
            path.content.size==1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()]
                } catch (e: java.lang.Exception) {
                    content[Text(next)]?:throw Exception(
                        "Wrong variable name"
                    )
                }
            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()].get(path)
                } catch (e: java.lang.Exception) {
                    content[Text(next)]?.get(path)?:throw Exception(
                        "Wrong variable name"
                    )
                }
            }
        }

    override fun delete(path: ListOf<Text>) {
        when {
            path.content.isEmpty() -> throw java.lang.Exception(
                "path shouldn't be empty when deleting from Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(ListOf(mutableListOf(Text("@content"))))
                } catch (e: java.lang.Exception) {
                    content[Text(next)]?.delete(ListOf(mutableListOf(Text("@content"))))
                }

            }
            else -> {
                val next = path.content[0].content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(path)
                } catch (e: java.lang.Exception) {
                    content[Text(next)]?.delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
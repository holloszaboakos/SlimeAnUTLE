package data.type

import data.Type
import data.Variable
import data.Visitor

class File(names:MutableList<Text>?,val content:MutableMap<Text,Variable>) :Variable(Type.File,names){
    override fun toListOf(): ListOf =ListOf(mutableListOf(), listOf(Type.List,Type.Unknown),content.values.toMutableList())

    override fun copy(): File {
        val result=File(names,content)
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

    override fun insert(v: Variable, i: Int): Variable =throw Exception("You can not insert into File:${names?.getOrNull(0)?:"@nameless"}")


    override fun get(path: ListOf): Variable =
        when {
            path.content.isEmpty() -> this
            path.content.size==1 -> {
                val next = (path.content[0]as Text).content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()]
                } catch (e: java.lang.Exception) {
                    content[Text(mutableListOf(),next)]?:throw Exception(
                        "Wrong variable name"
                    )
                }
            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    content.values.toList()[next.toInt()].get(path)
                } catch (e: java.lang.Exception) {
                    content[Text(mutableListOf(),next)]?.get(path)?:throw Exception(
                        "Wrong variable name"
                    )
                }
            }
        }

    override fun delete(path: ListOf) {
        when {
            path.content.isEmpty() -> throw java.lang.Exception(
                "path shouldn't be empty when deleting from Template: ${names?.getOrNull(0) ?: "@nameless"}"
            )
            path.content.size == 1 -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(ListOf(mutableListOf(Type.List,Type.Text),mutableListOf(Text("@content"))))
                } catch (e: java.lang.Exception) {
                    content[Text(mutableListOf(),next)]?.delete(ListOf(mutableListOf(Type.List,Type.Text),mutableListOf(Text("@content"))))
                }

            }
            else -> {
                val next = (path.content[0] as Text).content
                path.content.removeAt(0)
                try {
                    val i = next.toInt()
                    content.values.toList()[i].delete(path)
                } catch (e: java.lang.Exception) {
                    content[Text(mutableListOf(),next)]?.delete(path)
                }

            }
        }
    }

    override fun visit(v: Visitor, mod: String): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
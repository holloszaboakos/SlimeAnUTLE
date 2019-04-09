package data.type

import data.*
import java.lang.Exception

class Text( var content: String,names: MutableList<Text>?=null) : Variable(Type.Text,names) {

    override fun copy(): Text = Text(content)

    override fun expand(): String = content

    override fun expand(divider: String): String = content

    override fun add(v: Variable, i: Int): Variable = throw Exception("You can not add into a text.")

    override fun get(path: ListOf<Text>): Variable = throw Exception("Text dose not contain anything to get")

    override fun delete(path: ListOf<Text>) =
        throw Exception("Text dose not contain anything to delete")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this,mod)
}
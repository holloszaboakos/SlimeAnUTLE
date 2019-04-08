package data.type

import data.*
import java.lang.Exception

class Text(names: MutableList<Text>?, val content: String) : Variable(Type.Text,names) {
    constructor(content:String):this(null,content)
    override fun copy(): Text = Text(mutableListOf(), content)

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun expand(): String = content

    override fun expand(divider: String): String = content

    override fun insert(v: Variable, i: Int): Variable = throw Exception("You can not insert into a text.")

    override fun get(path: ListOf): Variable = throw Exception("Text dose not contain anything to get")

    override fun delete(path: ListOf) =
        throw Exception("Text dose not contain anything to delete")

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this,mod)
}
package data.type

import data.*

class ReferenceTo(names:MutableList<Text>): Variable(Type.Refe,names) {

    override fun copy(): ReferenceTo = ReferenceTo(mutableListOf())

    override fun toListOf(): ListOf = ListOf(mutableListOf(), listOf(Type.List,type), mutableListOf(this))

    override fun expand(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun expand(divider: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insert(v: Variable, i: Int): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(path: MutableList<String>): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun delete(path: MutableList<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
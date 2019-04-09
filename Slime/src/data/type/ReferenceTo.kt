package data.type

import data.*

class ReferenceTo(names:MutableList<Text>?=null): Variable(Type.Refe,names) {

    override fun copy(): ReferenceTo = ReferenceTo()

    override fun expand(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun expand(divider: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(v: Variable, i: Int): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(path: ListOf<Text>): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun delete(path: ListOf<Text>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(v: Visitor, mod: String): Variable = v.accept(this, mod)
}
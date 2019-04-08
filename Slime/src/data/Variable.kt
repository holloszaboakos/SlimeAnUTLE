package data

import data.type.*

abstract class Variable(val type:Type,open val names: MutableList<Text>?) {
    abstract fun toListOf():ListOf
    abstract fun copy():Variable
    abstract fun expand():String
    abstract fun expand(divider: String):String
    abstract fun insert(v: Variable, i: Int=-1): Variable
    abstract fun get(path: ListOf): Variable
    abstract fun delete(path: ListOf)
    abstract fun visit(v: Visitor, mod: String): Variable

}
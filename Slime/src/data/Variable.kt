package data
import data.type.*

abstract class Variable(val type:Type,open val names: MutableList<Text>?) {
    abstract fun copy():Variable
    abstract fun expand():String
    abstract fun expand(divider: String):String
    abstract fun add(v: Variable, i: Int=-1): Variable
    abstract fun get(path: ListOf<Text>): Variable
    abstract fun delete(path: ListOf<Text>)
    abstract fun visit(v: Visitor, mod: String): Variable

}
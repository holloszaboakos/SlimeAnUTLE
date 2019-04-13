package data
import data.type.*

abstract class SVari(val type:SType, open val names: MutableList<SText>?) {
    abstract fun listPaths():SList<SList<SText>>?
    abstract fun copy():SVari
    abstract fun expand():String
    abstract fun expand(divider: String):String
    abstract fun add(v: SVari, i: Int=-1): SVari
    abstract fun get(path: SList<SText>): SVari
    abstract fun delete(path: SList<SText>)
    abstract fun visit(v: Visitor, mod: String): SVari

}
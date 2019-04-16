package data

import data.type.*

abstract class SVari(val typeName: String, _names: List<SText>) {
    init {
            for (n in _names)
                DataContainer.focus?.content?.set(n(), this)
    }

    val ctype get() = SType[typeName]
    private var pnames:MutableList<SText> = _names.toMutableList()
    var names:SList<SText>
    get() =pnames.toSList()
    set(value){pnames=value.toMutableList()}

    abstract fun listPaths(): SList<SList<SText>>
    abstract fun copy(names: List<SText> = listOf()): SVari
    abstract fun expand(): String
    abstract fun expand(divider: String): String
    abstract fun plus(v: SVari, i: Int = -1): SVari
    abstract fun get(path: SList<SText>): SVari
    abstract fun delete(path: SList<SText>)
    abstract fun visit(v: Visitor, mod: String): SVari

}
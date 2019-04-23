package data

import data.type.*

abstract class SVari(val typeName: String, _names: List<SName>) {

    val ctype get() = SType[typeName]

    protected val names:MutableList<SName> = mutableListOf()

    init {
        addNames(_names)
    }
    fun addNames(_names: List<SName>): SVari {
        if (_names.isNotEmpty()) {
            names.addAll(_names)
            for (n in _names)
                DataContainer.focus?.content?.set(n(), this)
        }
        return this
    }

    abstract fun listPaths(): SList<SList<SName>>
    abstract fun copy(names: List<SName> = listOf()): SVari
    abstract fun extend(): String
    abstract fun extend(divider: String): String
    abstract fun plus(v: SVari, i: Int = -1): SVari
    abstract fun get(path: SList<SName>): SVari
    abstract fun delete(path: SList<SName>)
    abstract fun visit(v: Visitor, mod: String): SVari

}
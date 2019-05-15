package data

import data.type.*

//The class behind the Vari type
//Its constructor asks only for the type and the names of the variable
abstract class SVari(val typeName: String, _names: List<SName>) {
    //property to reach the type from the name
    val ctype get() = SType[typeName]
    //property to reach the names of the variable
    protected val names:MutableList<SName> = mutableListOf()
    //after initialization we register the names
    init {
        addNames(_names)
    }
    //the only way to add new names so they will be registered
    fun addNames(_names: List<SName>): SVari {
        if (_names.isNotEmpty()) {
            names.addAll(_names)
            for (n in _names)
                DataContainer.focus?.content?.set(n(), this)
        }
        return this
    }

    //abstract functions for the base operations
    abstract fun listPaths(): SList<SList<SName>>
    abstract fun copy(names: List<SName> = listOf()): SVari
    abstract fun extend(divider: String=""): String
    abstract fun plus(
        v: SVari,
        path: SList<SName> = SList(mutableListOf()),
        pairs: SList<SList<SName>> = SList(mutableListOf())
    ): SVari
    abstract fun get(path: SList<SName>): SVari
    abstract fun delete(path: SList<SName>)
    abstract fun accept(v: Visitor, mod: String): SVari

}
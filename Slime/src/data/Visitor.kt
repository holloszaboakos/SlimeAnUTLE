package data

import data.type.*

interface Visitor {
    fun visit(h: SFile, mode: String = ""): SVari
    fun visit(h: SSlot, mode: String = ""): SVari
    fun visit(h: SSpec, mode: String = ""): SVari
    fun visit(h: SType, mode: String = ""): SVari
    fun visit(h: SInst, mode: String = ""): SVari
    fun visit(h: STemp, mode: String = ""): SVari
    fun visit(h: SRefe, mode: String = ""): SVari
    fun <T:SVari> visit(h: SList<T>, mode: String = ""): SVari
    fun <T:SVari> visit(h: SList.SIter<T>, mode: String = ""): SVari
    fun visit(h: SText, mode: String = ""): SVari
    fun visit(h: SName, mode: String = ""): SVari
}
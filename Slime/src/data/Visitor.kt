package data

import data.type.*

interface Visitor {
    fun accept(h: SFile, mode: String = ""): SVari
    fun accept(h: SSlot, mode: String = ""): SVari
    fun accept(h: SSpec, mode: String = ""): SVari
    fun accept(h: SType, mode: String = ""): SVari
    fun accept(h: SInst, mode: String = ""): SVari
    fun accept(h: STemp, mode: String = ""): SVari
    fun accept(h: SRefe, mode: String = ""): SVari
    fun <T:SVari>accept(h: SList<T>, mode: String = ""): SVari
    fun accept(h: SText, mode: String = ""): SVari
}
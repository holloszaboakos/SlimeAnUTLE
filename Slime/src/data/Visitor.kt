package data

import data.type.*

interface Visitor {
    fun accept(h: File, mode: String = ""): Variable
    fun accept(h: Slot, mode: String = ""): Variable
    fun accept(h: Special, mode: String = ""): Variable
    fun accept(h: StructType, mode: String = ""): Variable
    fun accept(h: StructInstance, mode: String = ""): Variable
    fun accept(h: Template, mode: String = ""): Variable
    fun accept(h: ReferenceTo, mode: String = ""): Variable
    fun accept(h: ListOf<*>, mode: String = ""): Variable
    fun accept(h: Text, mode: String = ""): Variable
}
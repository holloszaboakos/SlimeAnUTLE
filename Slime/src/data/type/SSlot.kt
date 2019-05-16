package data.type

import data.*
import java.lang.Exception

//The class behind the Slot type
class SSlot(val tag: SName, names: List<SName> = listOf()) : SVari("Slot", names), Visitor {

    var content: STemp? = null
    var owner: STemp? = null

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> {
        val result = content?.listPaths() ?: SList()
        result.addAll(
            SList(
                mutableListOf(
                    SList(mutableListOf(SName("names"))),
                    SList(mutableListOf(SName("self"))),
                    SList(mutableListOf(SName("copy"))),
                    SList(mutableListOf(SName("type")))
                )
            )
        )
        return result
    }

    //Makes a copy from the variable
    override fun copy(names: List<SName>): SSlot {
        val result = SSlot(tag, names)
        if (content != null)
            result.content = content?.copy()
        return result
    }

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String = content?.extend() ?: "{$ ${tag()} $}"

    //Plusses a new variable to the variable
    // If the given variables aren't new names in the form of a Name or list of Names or iterator of list of names,
    // SSlot used a visitor pattern to identify their type
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> v.accept(this, "@plus")
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> {
                        when {
                            v is SList<*> && v.size != 0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SList.SIter<*> && v.owner.size != 0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception("unknown keyword for special char: ${tag()}")
                }
            }
        }


    //Returns the variable on the given relative path
    //Slots has a cont attribute possibly containing the Temp
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> content ?: this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No Name in this namespace!")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    "cont" -> content?.get(path) ?: throw Exception(
                        "no Template in slot: ${tag()}"
                    )
                    else -> throw  Exception("unknown keyword for slot: ${tag()}")
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from Slot: ${tag()}"
            )
            path.size == 1 && path[0]() == "@content" -> {
                content = null
            }
            else -> {
                content?.delete(path) ?: throw Exception("Wrong variable name")
            }
        }
    }


    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)

    //Slot, Spec and Text variables are converted to Temp before they are added
    override fun visit(h: SSlot, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                this.content = STemp(mutableListOf(h)); owner ?: this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    override fun visit(h: SSpec, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(h)); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    override fun visit(h: SText, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(h)); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    //You can not plus Type variables to Slot variables
    override fun visit(h: SType, mode: String): SVari =
        throw Exception("You can not add a Structure type into Slot ${tag()}")

    //Inst variables are added the Temp contained by this Slot
    override fun visit(h: SInst, mode: String): SVari =
        content?.plus(h, SList())
            ?: throw Exception("You can not add a Structure Instance into Slot ${tag()}")

    //Temp is becoming the cont attribute of the Slot
    override fun visit(h: STemp, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                this.content = h; owner ?: this
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    //Name is converted to Text and then Temp
    override fun visit(h: SName, mode: String): SVari = when (mode) {
        "@plus" -> {
            this.content = STemp(mutableListOf(SText(h()))); owner ?: this
        }
        else -> throw Exception(
            "wrong variable or in wrong mode visiting Slot: ${tag()}"
        )
    }

    //We generate a list of variables from the Refe and handle it as an SList
    override fun visit(h: SRefe, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                val list = h.listMatchingPaths().map { DataContainer.focus?.get(it) }
                    .filter { it is SVari }.map { it as SVari }.toSList()
                visit(list, mode)
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    //We add the elements of the list as names or List depending on the embedded type
    override fun <T : SVari> visit(h: SList<T>, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                if (h[0] is SName) {
                    addNames(h.filter { it is SName }.map { it as SName })
                    this
                } else
                    SList(h.map {
                        owner?.copy()?.slotL?.first { s -> s.tag().compareTo(tag()) == 0 }?.plus(it) ?: copy().plus(
                            it,
                            SList(mutableListOf()),
                            SList(mutableListOf())
                        )
                    }.toMutableList())
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    //We plus the elements of the list of the iterator to new copies of the Slots owner
    override fun <T : SVari> visit(h: SList.SIter<T>, mode: String): SVari =
        when (mode) {
            "@plus" -> {
                if (h.owner[0] is SName) {
                    addNames(h.owner.filter { it is SName }.map { it as SName })
                    this
                } else
                    SList(h.owner.map {
                        owner?.copy()?.plus(it, SList(mutableListOf()), SList(mutableListOf())) ?: copy().plus(
                            it,
                            SList(mutableListOf()),
                            SList(mutableListOf())
                        )
                    }.toMutableList()).iter
            }
            else -> throw Exception(
                "wrong variable or in wrong mode visiting Slot: ${tag()}"
            )
        }

    //You can not add file to a slot
    override fun visit(h: SFile, mode: String): SVari =
        throw Exception("You can not insert File int Slot: ${tag()}")
}
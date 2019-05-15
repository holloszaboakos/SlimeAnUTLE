package data

import data.type.*
import java.lang.Error
import java.lang.Exception

//A class to generate an empty variable with the type defined by a Text list of typed lists
object VariableFactory : Visitor {

    //list of names to a types
    fun NameL2TypeL(names: List<SText>): List<SType> {
        val types = mutableListOf<SType>()
        for (n in names)
            types.add(SType[n()])
        return types
    }

    //types to names
    fun TypeL2NameL(types: List<SType>): List<SText> {
        val names = mutableListOf<SText>()
        for (t in types)
            names.add(SText(t.tag))
        return names
    }

    //a variable with the type from the type list
    fun getEmptyVariableByTypeList(types: List<SType>): SVari {
        //crating a variable with the most inner type
        var tmp: SVari = when (types.last()) {
            SType["List"] -> throw Error("Last element of type list can not be a List")
            SType["Type"] -> SType["Vari"]
            SType["Iter"] -> throw Error("Last element of type list can not be a List")
            SType["Slot"] -> SSlot(SName())
            SType["Refe"] -> SRefe("", mutableListOf())
            SType["Text"] -> SText("")
            SType["Name"] -> SName("")
            SType["Spec"] -> SSpec(SSpec.Char.COLON)
            SType["File"] -> SFile(mutableMapOf())
            SType["Temp"] -> STemp(mutableListOf())
            else -> SInst(types.last().tag)
        }
        //checking if the first variable is an Iter
        val typescopy = types.toMutableList()
        val iter = typescopy[0] == SType["Iter"]
        if (iter)
            typescopy.removeAt(0)
        //checking if there is an other rype in the list and if the most of the types are lists
        //We generat the type using a visitor pattern for list generation
        if (typescopy.size > 1) {
            for (i in (typescopy.size - 2)..0)
                if (typescopy[i] != SType["List"]) throw Exception("Inconsistent type.type List")
            for (i in (typescopy.size - 2)..0)
                tmp = tmp.accept(this, "@BildIntoList")
        }
        //in case of Iter we return theiter of the list
        return if (iter)
            if (tmp is SList<*>)
                tmp.iter
            else
                (tmp.accept(this,"@BildIntoList") as SList<*>).iter
        //otherwise we just return the variable
        else
            tmp
    }

    //a visitor pattern for generating a list with the right type
    override fun visit(h: SFile, mode: String): SList<SFile> = SList(mutableListOf())
    override fun visit(h: SSlot, mode: String): SList<SSlot> = SList(mutableListOf())
    override fun visit(h: SSpec, mode: String): SList<SSpec> = SList(mutableListOf())
    override fun visit(h: SType, mode: String): SList<SFile> = SList(mutableListOf())
    override fun visit(h: SInst, mode: String): SList<SInst> = SList(mutableListOf())
    override fun visit(h: STemp, mode: String): SList<STemp> = SList(mutableListOf())
    override fun visit(h: SRefe, mode: String): SList<SRefe> = SList(mutableListOf())
    override fun <T : SVari> visit(h: SList<T>, mode: String): SList<SList<T>> = SList(mutableListOf())
    override fun <T : SVari> visit(h: SList.SIter<T>, mode: String): SList<SList<T>> = SList(mutableListOf())
    override fun visit(h: SText, mode: String): SList<SText> = SList(mutableListOf())
    override fun visit(h: SName, mode: String): SList<SName> = SList(mutableListOf())
}
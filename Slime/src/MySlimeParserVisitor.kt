import data.*
import data.type.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.*
import org.stringtemplate.v4.ST
import parser.SlimeParser
import parser.SlimeParserBaseVisitor
import java.lang.Error
import java.lang.Exception

//My implementation ov the visitor, the heart of the compiler
class MySlimeParserVisitor : SlimeParserBaseVisitor<SVari>() {

    //In case of error. We do not handle errors yet
    override fun visitErrorNode(p0: ErrorNode?): SVari = SText("Error in Syntax")

    //In case of a usual node
    override fun visit(p0: ParseTree?): SVari? = p0?.accept(this)

    //In case of a terminal
    override fun visitTerminal(p0: TerminalNode?): SText? = SText(p0?.text ?: "")

    //visit all children of a node
    override fun visitChildren(p0: RuleNode?): SList<SVari> {
        val result = SList(mutableListOf())
        for (cIx in 0 until (p0?.childCount ?: 0))
            if (p0?.getChild(cIx)?.accept(this) != null)
                result.add(p0.getChild(cIx).accept(this))
        return result
    }

    //In case of the root rule
    override fun visitFile(ctx: SlimeParser.FileContext): SText {
        val file = SFile(mutableMapOf())
        if (DataContainer.root == null) DataContainer.root = file
        val grandParentFocus = DataContainer.parentFocus
        DataContainer.parentFocus = DataContainer.focus
        DataContainer.focus = file
        DataContainer.childFocus = null
        val result = SText()
        for (c in ctx.children)
            when (c) {
                is SlimeParser.TextOutorContext -> result(result() + visitTextOutor(c)())
                is SlimeParser.ExteContext ->
                    for (t in visitExte(c))
                        result(result() + t())
                is SlimeParser.TextContext -> result(result() + visitText(c)())
                is SlimeParser.SpecContext -> result(result() + visitSpec(c).extend(""))
                else -> c.accept(this)
            }
        DataContainer.childFocus = DataContainer.focus
        DataContainer.focus = DataContainer.parentFocus
        DataContainer.parentFocus = grandParentFocus
        return result
    }

    //In case of TEXT
    override fun visitText(ctx: SlimeParser.TextContext): SText = visitTextBody(ctx.textBody())

    //We ignore open brackets
    override fun visitTextHead(ctx: SlimeParser.TextHeadContext): SVari? = null

    //In case of TEXT body
    override fun visitTextBody(ctx: SlimeParser.TextBodyContext): SText = ctx.getChild(0).accept(this) as SText

    //We ignore close tokens
    override fun visitTextTail(ctx: SlimeParser.TextTailContext): SVari? = null

    //In case of REFE
    override fun visitRefe(ctx: SlimeParser.RefeContext): SRefe = visitRefeBody(ctx.refeBody())

    //We ignore open brackets
    override fun visitRefeHead(ctx: SlimeParser.RefeHeadContext): SVari? = null

    //In case of REFE body
    override fun visitRefeBody(ctx: SlimeParser.RefeBodyContext): SRefe =
        SRefe(ctx.children[2].text, visitTypeName(ctx.typeName()))

    //We ignore close tokens
    override fun visitRefeTail(ctx: SlimeParser.RefeTailContext): SVari? = null

    //In case of SLOT
    override fun visitSlot(ctx: SlimeParser.SlotContext): SList<SSlot> =
        SList(visitSpslBody(ctx.spslBody()).filter { it is SSlot }.map { it as SSlot }.toMutableList())

    //We ignore open brackets
    override fun visitSlotHead(ctx: SlimeParser.SlotHeadContext): SVari? = null

    //We ignore close tokens
    override fun visitSlotTail(ctx: SlimeParser.SlotTailContext): SVari? = null

    //In case of SPEC
    override fun visitSpec(ctx: SlimeParser.SpecContext): SList<SSpec> =
        SList(visitSpslBody(ctx.spslBody()).filter { it is SSpec }.map { it as SSpec }.toMutableList())

    //We ignore open brackets
    override fun visitSpecHead(ctx: SlimeParser.SpecHeadContext): SVari? = null

    //We ignore close tokens
    override fun visitSpecTail(ctx: SlimeParser.SpecTailContext): SVari? = null

    //In case of SLOT and SPEC body we check if the parent node is slot or spec
    override fun visitSpslBody(ctx: SlimeParser.SpslBodyContext): SList<*> =
        if (ctx.parent.ruleIndex == SlimeParser.RULE_spec)
        //In case of SPEC parent we remove semicolons and transform the names to SSpec instances
            SList(visitChildren(ctx).map { (it as SText) }.filter { it() != ";" }
                .map {
                    SSpec(SSpec.Char.values().first { it2 -> it2.names.any { it3 -> it3.compareTo(it()) == 0 } })
                }.toMutableList())
        else
        //In case of SPEC parent we remove semicolons and transform the names to SSlot instances
            SList(visitChildren(ctx).map { (it as SText) }.filter { it() != ";" }
                .map { SSlot(SName(it)) }.toMutableList())

    //In case of TEMP
    override fun visitTemp(ctx: SlimeParser.TempContext): SList<STemp> = visitTempBody(ctx.tempBody())

    //We ignore open brackets
    override fun visitTempHead(ctx: SlimeParser.TempHeadContext): SVari? = null

    //In case of TEMP body we simply gather the return values of the body parts.
    override fun visitTempBody(ctx: SlimeParser.TempBodyContext): SList<STemp> =
        SList(ctx.tempBodyPart().map { visitTempBodyPart(it) }.toMutableList())

    override fun visitTempBodyPart(ctx: SlimeParser.TempBodyPartContext): STemp {
        //We visit children and gather the output into a list
        val children2 = mutableListOf<SVari>()
        visitChildren(ctx).forEach { if (it is SList<*>) children2.addAll(it) else children2.add(it) }
        //We inicialize a Temp with the list and return it
        return STemp(children2)
    }

    //We ignore close tokens
    override fun visitTempTail(ctx: SlimeParser.TempTailContext): SVari? = null

    //In case of temp text, we gather the SText from the terminal nodes into a list
    override fun visitTempText(ctx: SlimeParser.TempTextContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.toMutableList())

    //In case of EXTE
    override fun visitExte(ctx: SlimeParser.ExteContext): SList<SText> = visitExteBody(ctx.exteBody())

    //We ignore open brackets
    override fun visitExteHead(ctx: SlimeParser.ExteHeadContext): SVari? = null

    //In case of EXTE body we simply gather the return values of the body parts.
    override fun visitExteBody(ctx: SlimeParser.ExteBodyContext): SList<SText> =
        SList(ctx.exteBodyPart().map { visitExteBodyPart(it) }.toMutableList())

    //In case of EXTE body part we transfer the variable into an SText
    override fun visitExteBodyPart(ctx: SlimeParser.ExteBodyPartContext): SText =
        if (ctx.childCount == 1) {
            SText(visitVari(ctx.vari()).extend())
        } else {
            var separator = ""
            if (ctx.children[2] is SlimeParser.SpecContext)
                visitSpec(ctx.children[2] as SlimeParser.SpecContext).forEach { separator += it.extend() }
            else
                visitTemp(ctx.children[2] as SlimeParser.TempContext).forEach { separator += it.extend() }
            SText(visitVari(ctx.vari()).extend(separator))
        }

    //We ignore close tokens
    override fun visitExteTail(ctx: SlimeParser.ExteTailContext): SVari? = null

    //In case of PLUS
    override fun visitPlus(ctx: SlimeParser.PlusContext): SVari = visitPlusBody(ctx.plusBody())

    //We ignore open brackets
    override fun visitPlusHead(ctx: SlimeParser.PlusHeadContext): SVari? = null

    //In case of PLUS body we simply gather the return values of the body parts.
    override fun visitPlusBody(ctx: SlimeParser.PlusBodyContext): SList<SVari> =
        SList(ctx.plusBodyPart().map { visitPlusBodyPart(it) })

    //In case of PLUS body part we inicialize the left and right variables and plus the right to the left returning the return value
    override fun visitPlusBodyPart(ctx: SlimeParser.PlusBodyPartContext): SVari {
        val variLeft = visitVari(ctx.vari(0))[0]
        val variRight = visitVari(ctx.vari(1))[0]
        return if (ctx.childCount == 3) {
            variLeft.plus(variRight, SList(mutableListOf()), SList(mutableListOf()))
        } else {
            //In some cases PLUS has pair list to define
            // witch attribute of the left attribute add to
            // witch attribute of the right variable.
            //We have to make the Plus for every pair.
            ctx.plusElement().map { visitPlusElement(it) }
                .forEach {
                    variLeft.get(it[0].map { it2 -> SName(it2) }.toSList())
                        .plus(
                            variRight.get(it[1].map { it2 -> SName(it2) }.toSList())
                        )
                }
            variLeft
        }
    }

    //In case of PLUS element we gather the attribute name pairs into a list
    override fun visitPlusElement(ctx: SlimeParser.PlusElementContext): SList<SList<SText>> =
        SList(ctx.variPath().map { visitVariPath(it) }.toMutableList())

    //We ignore close tokens
    override fun visitPlusTail(ctx: SlimeParser.PlusTailContext): SVari? = null

    //In case of SPEC
    override fun visitDele(ctx: SlimeParser.DeleContext): SVari? {
        visitDeleBody(ctx.deleBody())
        return null
    }

    //We ignore open brackets
    override fun visitDeleHead(ctx: SlimeParser.DeleHeadContext): SVari? = null

    //In case of DELE body we have to delete the variables on the given paths and the variables with paths matching the Regex-s
    override fun visitDeleBody(ctx: SlimeParser.DeleBodyContext): SVari? {
        for (vp in ctx.variPath())
            DataContainer.focus?.delete(visitVariPath(vp).map { it2 -> SName(it2) }.toSList())
        for (r in ctx.refe())
            for (vp in visitRefe(r).listMatchingPaths())
                DataContainer.focus?.delete(vp)
        return null
    }

    //We ignore close tokens
    override fun visitDeleTail(ctx: SlimeParser.DeleTailContext): SVari? = null

    //In case of DECL
    override fun visitDecl(ctx: SlimeParser.DeclContext): SVari = visitDeclBody(ctx.declBody())

    //We ignore open brackets
    override fun visitDeclHead(ctx: SlimeParser.DeclHeadContext): SVari? = null

    //In case of DECL neck we gather the names and Type names into two lists
    override fun visitDeclNeck(ctx: SlimeParser.DeclNeckContext): SList<SList<SText>> =
        if (ctx.childCount == 4)
            SList(mutableListOf(visitTypeName(ctx.typeName()), visitListName(ctx.listName())))
        else
            SList(mutableListOf(visitTypeName(ctx.typeName())))

    //In case of DECL body we simply gather the return values of the body parts.
    override fun visitDeclBody(ctx: SlimeParser.DeclBodyContext): SList<SVari> =
        SList(ctx.declBodyPart().map { visitDeclBodyPart(it) }.toMutableList())

    //In case of DECL body part we gather the meta data and the value and declare a variable with the given name type and values
    override fun visitDeclBodyPart(ctx: SlimeParser.DeclBodyPartContext): SVari {
        //We gather meta data into two lists of SText
        val meta = visitDeclNeck(ctx.declNeck())
        //Then we gather the names
        val names: List<SName> =
            if (meta.size == 2) meta[1].toList().map { it2 -> SName(it2) }
            else listOf()
        //Then we create the variable with the right type, adding the names and return it
        when (val typeIndicator =
            VariableFactory.getEmptyVariableByTypeList(VariableFactory.NameL2TypeL(meta[0]))) {
            is SText -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize text by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize text by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize text by list of name-value pairs.")
                    //The only way to define the value of a Text is using an other Text variable
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for text initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SText)
                            return (vari[0].addNames(names) as SText)
                    }
                }
            }
            is SSpec -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize special char by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize special char by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize special char by list of name-value pairs.")
                    //The only way to define the value of a Spec is using an other Spec variable
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for special char initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SSpec)
                            return (vari[0].addNames(names) as SSpec)
                    }
                }
            }
            is SSlot -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize slot by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize slot by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize slot by list of name-value pairs.")
                    //The only way to define the value of a Slot is using an other Slot variable
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for slot initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SSlot)
                            return (vari[0].addNames(names) as SSlot)
                    }
                }
            }
            is STemp -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize slot by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize slot by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize slot by list of name-value pairs.")
                    //There are two ways to declare a Temp variable
                    //You can define the value by an other Temp variable
                    //Or you can use a list of Text Spec and Slot variables
                    is SlimeParser.ListVariContext -> {
                        val varis = ctx.children.filter { it is SlimeParser.ListVariContext }
                            .map { visitListVari(it as SlimeParser.ListVariContext) }
                        if (varis.size == 1 && varis[0][0] is STemp)
                            return (varis[0][0].addNames(names) as STemp)
                        val content = mutableListOf<SVari>()
                        varis.forEach { content += it.toMutableList() }
                        return STemp(
                            content.filter { it is SText || it is SSlot || it is SSpec }.toMutableList(),
                            names
                        )
                    }
                }
            }
            is SType -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize type by list of names.")
                    //You can define a new type with a list of name and type list pairs
                    is SlimeParser.NameTypeContext -> {
                        val datas = ctx.nameType().map { visitNameType(it) }
                        val nameValues = mutableListOf<SType.NameType>()
                        datas.forEach {
                            for (name in it[0])
                                nameValues.add(SType.NameType(name(), it[1]))
                        }
                        return SType(
                            (names)[0](),
                            nameValues
                        )
                    }
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize type by list of name-value pairs.")
                    //Or you can define the value with an other Type
                    //Or with two lists made out of other variables
                    is SlimeParser.ListVariContext -> {
                        val vari = visitListVari(ctx.listVari())
                        if (ctx.childCount > 2 && vari.size == 2 && vari[0] is SList<*> && vari[1] is SList<*>) {
                            val list1 = (vari[0] as SList<*>).filter { it is SText }.map { it as SText }.toSList()
                            val list2 = (vari[0] as SList<*>).filter { it is SList<*> }.map {
                                (it as SList<*>).filter { it2 -> it2 is SType }
                                    .map { it2 -> SText((it2 as SType).tag) }
                            }
                            if (list1.size == list2.size && list1.size != 0 && list2.all { it.size >= 0 }) {
                                val attributes = mutableListOf<SType.NameType>()
                                for (i in 0 until list1.size)
                                    attributes.add(SType.NameType(list1[i](), list2[i]))
                                return SType(
                                    (names)[0](),
                                    attributes
                                )
                            }
                        }
                        if (vari.size != 0 && vari.all { it is SList<*> }) {
                            val list = vari.map { it as SList<*> }
                            if (list.all { it.size == 2 && it[0] is SText && it[1] is SList<*> && (it[1] as SList<*>).all { it2 -> it2 is SType } }) {
                                return SType(
                                    (names)[0](),
                                    list.map {
                                        SType.NameType(
                                            (it[0] as SText)(),
                                            (it[1] as SList<*>).map { it2 -> SText((it2 as SType).tag) })
                                    }
                                )
                            }

                        }
                        if (vari.size == 1 && vari[0] is SType)
                            return (vari[0].addNames(names) as SType)
                    }
                }
            }
            is SInst -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize inst by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize inst by list of types.")
                    //You can inicialize an Inst with a list of name-value pairs,
                    //where the names are the names of the attributes of the Inst.
                    //Order those not matter and you are allowed to  have not initialized attributes
                    is SlimeParser.NameValueContext -> {
                        val inst = SInst(typeIndicator.typeName, names)
                        val datas = ctx.nameValue().map { visitNameValue(it) }
                        datas.forEach {
                            for (name in (it()[0] as SList<*>))
                                for (vari in (it()[1] as SList<*>)) {
                                    val meta = inst.ctype.attributes.first { it.name.compareTo((name as SText)()) == 0 }
                                    val leftIx = inst.ctype.attributes.indexOf(meta)
                                    inst()[leftIx] = vari
                                }
                        }
                        return inst
                    }
                    //You can also use another Inst or a list of values to define the value
                    //In the last case the values will be loaded into the attributes with the same index
                    is SlimeParser.ListVariContext -> {
                        val varis = ctx.children.filter { it is SlimeParser.ListVariContext }
                            .map { visitListVari(it as SlimeParser.ListVariContext) }[0]
                        if (varis.size == 1 && varis[0] is SInst)
                            return (varis[0].addNames(names) as SInst)
                        val inst = SInst((typeIndicator).typeName, names)
                        for (i in 0 until varis.size)
                            inst()[i] = varis[i]
                        return inst
                    }
                }
            }
            is SRefe -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize reference by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize reference by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize reference by list of name-value pairs.")
                    //The only way to define the value of a Refe is using an other Refe variable
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for reference initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SRefe)
                            return (vari[0].addNames(names) as SRefe)
                    }
                }
            }
            is SFile -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize file by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize file by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize file by list of name-value pairs.")
                    //You can define the value of a File with an other File or with a Text of the path to the slime file
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount > 2) throw Error("Too many arguments for declaring a File variable!")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SFile)
                            return (vari[0] as SFile).copy(names)
                        if (vari.size == 1 && vari[0] is SText) {
                            return DataContainer.loadFile((vari[0] as SText)(), names)

                        }
                    }
                }
            }
            is SList<*> -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> return SList(visitListName(ctx.listName()), names)
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize list by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize list by list of name-value pairs.")
                    //You can define the value of a List with an other List or with a list of values with the right type
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) {
                            return visitListVari(ctx.listVari()).addNames(names)
                        }
                        val vari = visitListVari(ctx.listVari())
                        return if (vari.size == 1 && vari[0] is SList<*>)
                            (vari[0] as SList<*>).copy(names)
                        else
                            (vari as SList<*>).copy(names)
                    }
                }
            }
            is SList.SIter<*> -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> return SList(visitListName(ctx.listName()), names).iter
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize list by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize list by list of name-value pairs.")
                    //You can define the value of a Iter with an other Iter or with a List or with a list of values with the right type
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) {
                            return (visitListVari(ctx.listVari()).addNames(names) as SList<*>).iter
                        }
                        val vari = visitListVari(ctx.listVari())
                        return if (vari.size == 1 && vari[0] is SList.SIter<*>)
                            (vari[0] as SList.SIter<*>)
                        else
                            vari.iter
                    }
                }
            }
        }
        //If non of the scenarios occur, There was a mistake made by the programmer... or me..
        throw Exception("An variable supposed to be created")

    }

    //We ignore close tokens
    override fun visitDeclTail(ctx: SlimeParser.DeclTailContext): SVari? = null

    //In case of name value pairs we gather the names and the values into SInst variables with NameValue type
    override fun visitNameValue(ctx: SlimeParser.NameValueContext): SInst {
        val result = SInst("NameValue")
        result()[0] = visitListName(ctx.listName())
        result()[1] = visitListVari(ctx.listVari())
        return result
    }

    //In case of name type pairs we gather the names and the typenames into two separate lists
    override fun visitNameType(ctx: SlimeParser.NameTypeContext): SList<SList<SText>> =
        SList(mutableListOf(visitListName(ctx.listName()), visitTypeName(ctx.typeName())))

    //In case of vari we visit the children and return it or a list including it
    override fun visitVari(ctx: SlimeParser.VariContext): SList<SVari> =
        when (val prc = (ctx.getChild(0) as ParserRuleContext)) {
            //In case of a path we get the variable on the given path in a list
            is SlimeParser.VariPathContext -> {
                SList(
                    mutableListOf(
                        DataContainer.focus?.get(visitVariPath(prc).map { it2 -> SName(it2) }.toSList())
                            ?: throw Exception(
                                "Can not reach variable at Path ${(visitVariPath(prc)).extend(
                                    "/"
                                )}"
                            )
                    )
                )
            }
            //In case of a REFE we get the variables matching the Refe
            is SlimeParser.RefeContext -> {
                val refe = visitRefe(prc)
                SList(
                    refe.listMatchingPaths().map {
                        refe.owner.get(it)
                    }.toMutableList()
                )
            }
            //In every other case we just gather the variable
            else -> {
                val vari = prc.accept(this)
                //If it is a list we convert it to a typed list
                if (vari is SList<*>)
                    if (vari.size == 1)
                        SList(mutableListOf(vari[0]))
                    else
                        vari.map { it }.toSList()
                //If it is not we return it in a list
                else SList(mutableListOf(vari))
            }
        }

    //In case of list of varis we visit all the vari nodes and return them in a list
    override fun visitListVari(ctx: SlimeParser.ListVariContext): SList<SVari> {
        val result = SList(mutableListOf())
        ctx.vari().forEach { result.addAll(visitVari(it)) }
        return result
    }

    //In case of list of Names we ignore commas and return names as a list of SText
    override fun visitListName(ctx: SlimeParser.ListNameContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo(",") != 0 }.toMutableList())

    //In case of list of Names we ignore periods and return names as a list of SText
    override fun visitVariPath(ctx: SlimeParser.VariPathContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo(".") != 0 }.toMutableList())

    //In case of list of Names we ignore colons and return names as a list of SText
    override fun visitTypeName(ctx: SlimeParser.TypeNameContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo("<") != 0 }.toMutableList())

    //In case of outer text we simply visit it end return the value as SText.
    override fun visitTextOutor(ctx: SlimeParser.TextOutorContext): SText = ctx.TEXT_OUTOR().accept(this) as SText

}
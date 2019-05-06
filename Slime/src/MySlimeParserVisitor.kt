import data.*
import data.type.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.*
import parser.SlimeParser
import parser.SlimeParserBaseVisitor
import java.lang.Error
import java.lang.Exception

class MySlimeParserVisitor : SlimeParserBaseVisitor<SVari>() {
    override fun visitErrorNode(p0: ErrorNode?): SVari = SText("Error in Syntax")

    override fun visit(p0: ParseTree?): SVari? = p0?.accept(this)

    override fun visitTerminal(p0: TerminalNode?): SText? = SText(p0?.text ?: "")

    override fun visitChildren(p0: RuleNode?): SList<SVari> {
        val result = SList(mutableListOf())
        for (cIx in 0 until (p0?.childCount ?: 0))
            if (p0?.getChild(cIx)?.accept(this) != null)
                result.add(p0.getChild(cIx).accept(this))
        return result
    }

    override fun visitFile(ctx: SlimeParser.FileContext): SText {
        val grandParentFocus = DataContainer.parentFocus
        DataContainer.parentFocus = DataContainer.focus
        DataContainer.focus = SFile(mutableMapOf())
        DataContainer.childFocus = null
        if (DataContainer.root == null) DataContainer.root = DataContainer.focus
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

    override fun visitText(ctx: SlimeParser.TextContext): SText = visitTextBody(ctx.textBody())

    override fun visitTextHead(ctx: SlimeParser.TextHeadContext): SVari? = null

    override fun visitTextBody(ctx: SlimeParser.TextBodyContext): SText = ctx.getChild(0).accept(this) as SText

    override fun visitTextTail(ctx: SlimeParser.TextTailContext): SVari? = null

    override fun visitRefe(ctx: SlimeParser.RefeContext): SRefe = visitRefeBody(ctx.refeBody())

    override fun visitRefeHead(ctx: SlimeParser.RefeHeadContext): SVari? = null

    override fun visitRefeBody(ctx: SlimeParser.RefeBodyContext): SRefe =
        SRefe(ctx.children[2].text, visitTypeName(ctx.typeName()))


    override fun visitRefeTail(ctx: SlimeParser.RefeTailContext): SVari? = null

    override fun visitSlot(ctx: SlimeParser.SlotContext): SList<SSlot> =
        SList(visitSpslBody(ctx.spslBody()).filter { it is SSlot }.map { it as SSlot }.toMutableList())

    override fun visitSlotHead(ctx: SlimeParser.SlotHeadContext): SVari? = null

    override fun visitSlotTail(ctx: SlimeParser.SlotTailContext): SVari? = null

    override fun visitSpec(ctx: SlimeParser.SpecContext): SList<SSpec> =
        SList(visitSpslBody(ctx.spslBody()).filter { it is SSpec }.map { it as SSpec }.toMutableList())

    override fun visitSpecHead(ctx: SlimeParser.SpecHeadContext): SVari? = null

    override fun visitSpecTail(ctx: SlimeParser.SpecTailContext): SVari? = null

    override fun visitSpslBody(ctx: SlimeParser.SpslBodyContext): SList<*> =
        if (ctx.parent.ruleIndex == SlimeParser.RULE_spec)
            SList(visitChildren(ctx).map { (it as SText) }.filter { it() != ";" }
                .map {
                    SSpec(SSpec.Char.values().first { it2 -> it2.names.any { it3 -> it3.compareTo(it()) == 0 } })
                }.toMutableList())
        else
            SList(visitChildren(ctx).map { (it as SText) }.filter { it() != ";" }
                .map { SSlot(SName(it)) }.toMutableList())

    override fun visitTemp(ctx: SlimeParser.TempContext): SList<STemp> = visitTempBody(ctx.tempBody())

    override fun visitTempHead(ctx: SlimeParser.TempHeadContext): SVari? = null

    override fun visitTempBody(ctx: SlimeParser.TempBodyContext): SList<STemp> =
        SList(ctx.tempBodyPart().map { visitTempBodyPart(it) }.toMutableList())


    override fun visitTempBodyPart(ctx: SlimeParser.TempBodyPartContext): STemp {
        val children2 = mutableListOf<SVari>()
        visitChildren(ctx).forEach { if (it is SList<*>) children2.addAll(it) else children2.add(it) }
        return STemp(children2)
    }

    override fun visitTempTail(ctx: SlimeParser.TempTailContext): SVari? = null

    override fun visitTempText(ctx: SlimeParser.TempTextContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.toMutableList())

    override fun visitExte(ctx: SlimeParser.ExteContext): SList<SText> = visitExteBody(ctx.exteBody())

    override fun visitExteHead(ctx: SlimeParser.ExteHeadContext): SVari? = null

    override fun visitExteBody(ctx: SlimeParser.ExteBodyContext): SList<SText> =
        SList(ctx.exteBodyPart().map { visitExteBodyPart(it) }.toMutableList())

    override fun visitExteBodyPart(ctx: SlimeParser.ExteBodyPartContext): SText =
        if (ctx.childCount == 1) {
            SText(visitVari(ctx.vari()).extend())
        } else {
            var seperater = ""
            if (ctx.children[2] is SlimeParser.SpecContext)
                visitSpec(ctx.children[2] as SlimeParser.SpecContext).forEach { seperater += it.extend() }
            else
                visitTemp(ctx.children[2] as SlimeParser.TempContext).forEach { seperater += it.extend() }
            SText(visitVari(ctx.vari()).extend(seperater))
        }

    override fun visitExteTail(ctx: SlimeParser.ExteTailContext): SVari? = null

    override fun visitPlus(ctx: SlimeParser.PlusContext): SVari = visitPlusBody(ctx.plusBody())

    override fun visitPlusHead(ctx: SlimeParser.PlusHeadContext): SVari? = null

    override fun visitPlusBody(ctx: SlimeParser.PlusBodyContext): SList<SVari> =
        SList(ctx.plusBodyPart().map { visitPlusBodyPart(it) })

    override fun visitPlusBodyPart(ctx: SlimeParser.PlusBodyPartContext): SVari {
        val vari1 = visitVari(ctx.vari(0))[0]
        val vari2 = visitVari(ctx.vari(1))[0]
        return if (ctx.childCount == 3) {
            vari1.plus(vari2, SList(mutableListOf()), SList(mutableListOf()))
        } else {
            ctx.plusElement().map { visitPlusElement(it) }
                .forEach {
                    vari1.get(it[0].map { it2 -> SName(it2) }.toSList())
                        .plus(
                            vari2.get(it[1].map { it2 -> SName(it2) }.toSList()),
                            SList(mutableListOf()),
                            SList(mutableListOf())
                        )
                }
            vari1
        }
    }

    override fun visitPlusElement(ctx: SlimeParser.PlusElementContext): SList<SList<SText>> =
        SList(ctx.variPath().map { visitVariPath(it) }.toMutableList())

    override fun visitPlusTail(ctx: SlimeParser.PlusTailContext): SVari? = null

    override fun visitDele(ctx: SlimeParser.DeleContext): SVari? {
        visitDeleBody(ctx.deleBody())
        return null
    }

    override fun visitDeleHead(ctx: SlimeParser.DeleHeadContext): SVari? = null

    override fun visitDeleBody(ctx: SlimeParser.DeleBodyContext): SVari? {
        for (vp in ctx.variPath())
            DataContainer.focus?.delete(visitVariPath(vp).map { it2 -> SName(it2) }.toSList())
        for (r in ctx.refe())
            for (vp in visitRefe(r).listMatchingPaths())
                DataContainer.focus?.delete(vp)
        return null
    }

    override fun visitDeleTail(ctx: SlimeParser.DeleTailContext): SVari? = null

    override fun visitDecl(ctx: SlimeParser.DeclContext): SVari = visitDeclBody(ctx.declBody())

    override fun visitDeclHead(ctx: SlimeParser.DeclHeadContext): SVari? = null

    override fun visitDeclNeck(ctx: SlimeParser.DeclNeckContext): SList<SList<SText>> =
        if (ctx.childCount == 4)
            SList(mutableListOf(visitTypeName(ctx.typeName()), visitListName(ctx.listName())))
        else
            SList(mutableListOf(visitTypeName(ctx.typeName())))

    override fun visitDeclBody(ctx: SlimeParser.DeclBodyContext): SList<SVari> =
        SList(ctx.declBodyPart().map { visitDeclBodyPart(it) }.toMutableList())

    override fun visitDeclBodyPart(ctx: SlimeParser.DeclBodyPartContext): SVari {
        val neck = visitDeclNeck(ctx.declNeck())
        val names: List<SName> =
            if (neck.size == 2) neck[1].toList().map { it2 -> SName(it2) }
            else listOf()
        when (val typeIndicator =
            VariableFactory.getEmptyVariableByTypeList(VariableFactory.NameL2TypeL(neck[0]))) {
            is SText -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize text by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize text by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize text by list of name-value pairs.")
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
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for type initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SType)
                            return (vari[0].addNames(names) as SType)
                    }
                }
            }
            is SInst -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> throw Error("Can not initialize inst by list of names.")
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize inst by list of types.")
                    is SlimeParser.NameValueContext -> {
                        val inst = SInst(typeIndicator.typeName, names)
                        val datas = ctx.nameValue().map { visitNameValue(it) }
                        datas.forEach {
                            for (name in (it()[0] as SList<*>?
                                ?: throw Exception(
                                    "You have to add the name of the variables," +
                                            " when declaring an instance by name value pairs"
                                )))
                                for (vari in (it()[1] as SList<*>?
                                    ?: throw Exception(
                                        "You have to add the value of the variables," +
                                                " when declaring an instance by name value pairs"
                                    ))) {
                                    val meta =
                                        inst.ctype.attributes.first { it.name.compareTo((name as SText)()) == 0 }
                                    val leftIx = inst.ctype.attributes.indexOf(meta)
                                    inst()[leftIx] = vari
                                }
                        }
                        return inst
                    }
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
                    is SlimeParser.ListVariContext -> {
                        if (ctx.childCount != 2) throw Error("two many arguments for file initialization.")
                        val vari = visitListVari(ctx.listVari())
                        if (vari.size == 1 && vari[0] is SFile)
                            return (vari[0] as SFile).copy(names)
                        if (vari.size == 1 && vari[0] is SText) {
                            DataContainer.loadFile((vari[0] as SText)(), names)
                        }
                    }
                }
            }
            is SList<*> -> {
                when (ctx.children[1]) {
                    is SlimeParser.ListNameContext -> return SList(visitListName(ctx.listName()), names)
                    is SlimeParser.NameTypeContext -> throw Error("Can not initialize list by list of types.")
                    is SlimeParser.NameValueContext -> throw Error("Can not initialize list by list of name-value pairs.")
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
        throw Exception("An variable supposed to be created")

    }

    override fun visitDeclTail(ctx: SlimeParser.DeclTailContext): SVari? = null

    override fun visitNameValue(ctx: SlimeParser.NameValueContext): SInst {
        val result = SInst("NameValue")
        result()[0] = visitListName(ctx.listName())
        result()[1] = visitListVari(ctx.listVari())
        return result
    }

    override fun visitNameType(ctx: SlimeParser.NameTypeContext): SList<SList<SText>> =
        SList(mutableListOf(visitListName(ctx.listName()), visitTypeName(ctx.typeName())))


    override fun visitVari(ctx: SlimeParser.VariContext): SList<SVari> =
        when (val prc = (ctx.getChild(0) as ParserRuleContext)) {
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
            is SlimeParser.RefeContext -> {
                SList(visitRefe(prc).listMatchingPaths().map {
                    DataContainer.focus?.get(it)
                        ?: throw Exception(
                            "Can not reach variable at Path ${(visitRefe(prc)).extend(
                                "/"
                            )}"
                        )
                }.toMutableList())
            }
            else -> {
                val vari = prc.accept(this)
                if (vari is SList<*>)
                    if (vari.size == 1)
                        SList(mutableListOf(vari[0]))
                    else
                        vari.map { it }.toSList()
                else SList(mutableListOf(vari))
            }
        }

    override fun visitListVari(ctx: SlimeParser.ListVariContext): SList<SVari> {
        val result = SList(mutableListOf())
        ctx.vari().forEach { result.addAll(visitVari(it)) }
        return result
    }

    override fun visitListName(ctx: SlimeParser.ListNameContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo(",") != 0 }.toMutableList())

    override fun visitVariPath(ctx: SlimeParser.VariPathContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo(".") != 0 }.toMutableList())

    override fun visitTypeName(ctx: SlimeParser.TypeNameContext): SList<SText> =
        SList(visitChildren(ctx).map { it as SText }.filter { it().compareTo(":") != 0 }.toMutableList())

    override fun visitTextOutor(ctx: SlimeParser.TextOutorContext): SText = ctx.TEXT_OUTOR().accept(this) as SText

}
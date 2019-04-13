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
                result.content.add(p0.getChild(cIx).accept(this))
        return result
    }

    override fun visitFile(ctx: SlimeParser.FileContext): SVari {
        DataContainer.focus = SFile(mutableMapOf())
        if (DataContainer.root == null) DataContainer.root = DataContainer.focus
        val result = SText("")
        for (c in ctx.children) {
            val r = c.accept(this)
            if (r != null && r.type == SType["Text"])
                result.content += (c.accept(this) as SText)
        }
        return result
    }

    override fun visitText(ctx: SlimeParser.TextContext): SText = visitTextBody(ctx.textBody())

    override fun visitTextHead(ctx: SlimeParser.TextHeadContext): SVari? = null

    override fun visitTextBody(ctx: SlimeParser.TextBodyContext): SText = ctx.getChild(0).accept(this) as SText

    override fun visitTextTail(ctx: SlimeParser.TextTailContext): SVari? = null

    override fun visitRefe(ctx: SlimeParser.RefeContext): SRefe = visitRefeBody(ctx.refeBody())

    override fun visitRefeHead(ctx: SlimeParser.RefeHeadContext): SVari? = null

    override fun visitRefeBody(ctx: SlimeParser.RefeBodyContext): SRefe =
        SRefe(ctx.getChild(3).text.substring(1), visitTypeName(ctx.typeName()).content)


    override fun visitRefeTail(ctx: SlimeParser.RefeTailContext): SVari? = null

    override fun visitSlot(ctx: SlimeParser.SlotContext): SVari = visitSpslBody(ctx.spslBody())

    override fun visitSlotHead(ctx: SlimeParser.SlotHeadContext): SVari? = null

    override fun visitSlotTail(ctx: SlimeParser.SlotTailContext): SVari? = null

    override fun visitSpec(ctx: SlimeParser.SpecContext): SVari = visitSpslBody(ctx.spslBody())

    override fun visitSpecHead(ctx: SlimeParser.SpecHeadContext): SVari? = null

    override fun visitSpecTail(ctx: SlimeParser.SpecTailContext): SVari? = null

    override fun visitSpslBody(ctx: SlimeParser.SpslBodyContext): SList<*> =
        if (ctx.parent.ruleIndex == SlimeParser.RULE_spec)
            SList(visitChildren(ctx).content.map { (it as SText).content }.filter { it != ";" }.map {
                SSpec(SSpec.Char.valueOf(it))
            }.toMutableList())
        else
            SList(visitChildren(ctx).content.map { (it as SText) }.filter { it.content != ";" }.map {
                SSlot(mutableListOf(it))
            }.toMutableList())

    override fun visitTemp(ctx: SlimeParser.TempContext): SVari = visitTempBody(ctx.tempBody())

    override fun visitTempHead(ctx: SlimeParser.TempHeadContext): SVari? = null

    override fun visitTempBody(ctx: SlimeParser.TempBodyContext): SList<STemp> =
        SList(ctx.tempBodyPart().map { visitTempBodyPart(it) }.toMutableList())


    override fun visitTempBodyPart(ctx: SlimeParser.TempBodyPartContext): STemp {
        val children = visitChildren(ctx).content
        children.forEach { if (it is SList<*>) children.addAll(it.content) }
        children.removeAll { it is SList<*> }
        return STemp(children)
    }

    override fun visitTempTail(ctx: SlimeParser.TempTailContext): SVari? = null

    override fun visitTempText(ctx: SlimeParser.TempTextContext): SList<SText> =
        SList(visitChildren(ctx).content.map { it as SText }.toMutableList())

    override fun visitExpa(ctx: SlimeParser.ExpaContext): SVari = visitExpaBody(ctx.expaBody())

    override fun visitExpaHead(ctx: SlimeParser.ExpaHeadContext): SVari? = null

    override fun visitExpaBody(ctx: SlimeParser.ExpaBodyContext): SList<SVari> =
        SList(ctx.expaBodyPart().map { visitExpaBodyPart(it) }.toMutableList())

    override fun visitExpaBodyPart(ctx: SlimeParser.ExpaBodyPartContext): SVari {
        TODO("convert all variable to text")
    }

    override fun visitExpaTail(ctx: SlimeParser.ExpaTailContext): SVari? = null

    override fun visitPlus(ctx: SlimeParser.PlusContext): SVari = visitPlusBody(ctx.plusBody())

    override fun visitPlusHead(ctx: SlimeParser.PlusHeadContext): SVari? = null

    override fun visitPlusBody(ctx: SlimeParser.PlusBodyContext): SList<SVari> =
        SList(ctx.plusBodyPart().map { visitPlusBodyPart(it) }.toMutableList())

    override fun visitPlusBodyPart(ctx: SlimeParser.PlusBodyPartContext): SVari {
        TODO("Make plusrts according to visited add elements and return variable")
    }

    override fun visitPlusElement(ctx: SlimeParser.PlusElementContext): SVari =
        SFile(mutableMapOf())

    override fun visitPlusTail(ctx: SlimeParser.PlusTailContext): SVari? = null

    override fun visitDele(ctx: SlimeParser.DeleContext): SVari? {
        visitDeleBody(ctx.deleBody())
        return null
    }

    override fun visitDeleHead(ctx: SlimeParser.DeleHeadContext): SVari? = null

    override fun visitDeleBody(ctx: SlimeParser.DeleBodyContext): SVari? {
        for (vp in ctx.variPath())
            DataContainer.focus?.delete(visitVariPath(vp))
        for (r in ctx.refe())
            for (vp in visitRefe(r).listMatchingPaths().content)
                DataContainer.focus?.delete(vp)
        return null
    }

    override fun visitDeleTail(ctx: SlimeParser.DeleTailContext): SVari? = null

    override fun visitDecl(ctx: SlimeParser.DeclContext): SVari = visitDeclBody(ctx.declBody())

    override fun visitDeclHead(ctx: SlimeParser.DeclHeadContext): SVari? = null

    override fun visitDeclNeck(ctx: SlimeParser.DeclNeckContext): SInst {
        val si = SInst("DeclNeck")
        try {
            si.content[0] = visitListName(ctx.listName())
        } catch (E: Exception) {
            print(E.stackTrace)
        }
        si.content[1] = visitTypeName(ctx.typeName())
        return si
    }

    override fun visitDeclBody(ctx: SlimeParser.DeclBodyContext): SList<SVari> =
        SList(ctx.declBodyPart().map { visitDeclBodyPart(it) }.toMutableList())

    override fun visitDeclBodyPart(ctx: SlimeParser.DeclBodyPartContext): SVari {
        TODO("")
        val neck = visitDeclNeck(ctx.declNeck())
        //if(neck.content[1] as SList<SText>)
        return SText("not working yet")
    }

    override fun visitDeclTail(ctx: SlimeParser.DeclTailContext): SVari? = null

    override fun visitNameValue(ctx: SlimeParser.NameValueContext): SVari {
        val result = SInst("NameValue")
        result.content.add(visitListName(ctx.listName()))
        result.content.add(visitVari(ctx.vari()))
        return result
    }

    override fun visitNameType(ctx: SlimeParser.NameTypeContext): SVari =
        SList(mutableListOf(SList(mutableListOf(visitListName(ctx.listName()), visitTypeName(ctx.typeName())))))

    override fun visitVari(ctx: SlimeParser.VariContext): SList<SVari> {
        val prc = (ctx.getChild(0) as ParserRuleContext)
        return when (prc.ruleIndex) {
            SlimeParser.RULE_variPath -> {
                SList(
                    mutableListOf(
                        DataContainer.focus?.get(visitVariPath(prc as SlimeParser.VariPathContext))
                            ?: throw Exception(
                                "Can not rech variable at Path ${(visitVariPath(prc as SlimeParser.VariPathContext)).expand(
                                    "/"
                                )}"
                            )
                    )
                )
            }
            SlimeParser.RULE_refe -> {
                SList(visitRefe(prc as SlimeParser.RefeContext).listMatchingPaths().content.map {
                    DataContainer.focus?.get(it)
                        ?: throw Exception(
                            "Can not rech variable at Path ${(visitVariPath(prc as SlimeParser.VariPathContext)).expand(
                                "/"
                            )}"
                        )
                }.toMutableList())
            }
            else -> SList(mutableListOf(prc.accept(this)))
        }
    }

    override fun visitListName(ctx: SlimeParser.ListNameContext): SList<SText> =
        SList(visitChildren(ctx).content.map { it as SText }.filter { it.content != "," }.toMutableList())

    override fun visitVariPath(ctx: SlimeParser.VariPathContext): SList<SText> =
        SList(visitChildren(ctx).content.map { it as SText }.filter { it.content != "." }.toMutableList())

    override fun visitTypeName(ctx: SlimeParser.TypeNameContext): SList<SText> =
        SList(visitChildren(ctx).content.map { it as SText }.filter { it.content != ":" }.toMutableList())

    override fun visitTextOutor(ctx: SlimeParser.TextOutorContext): SVari = ctx.TEXT_OUTOR().accept(this)

}
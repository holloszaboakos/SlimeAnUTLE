import data.*
import data.type.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.*
import parser.SlimeParser
import parser.SlimeParserBaseVisitor
import java.lang.Error
import java.lang.Exception

class MySlimeParserVisitor : SlimeParserBaseVisitor<Variable>() {
    override fun visitErrorNode(p0: ErrorNode?): Variable = Text("Error in Syntax")

    override fun visit(p0: ParseTree?): Variable? = p0?.accept(this)

    override fun visitTerminal(p0: TerminalNode?): Text? = Text(p0?.text ?: "")

    override fun visitChildren(p0: RuleNode?): ListOf<*> {
        val result = ListOf(mutableListOf())
        for (cIx in 0 until (p0?.childCount ?: 0))
            if (p0?.getChild(cIx)?.accept(this) != null)
                result.content.add(p0.getChild(cIx).accept(this))
        return result
    }

    override fun visitFile(ctx: SlimeParser.FileContext): Variable {
        DataContainer.focus = File(mutableMapOf())
        if (DataContainer.root == null) DataContainer.root = DataContainer.focus
        val result = Text("")
        for (c in ctx.children) {
            val r = c.accept(this)
            if (r != null && r.type == Type.Text)
                result.content += (c.accept(this) as Text)
        }
        return result
    }

    override fun visitText(ctx: SlimeParser.TextContext): Variable = visitTextBody(ctx.textBody())

    override fun visitTextHead(ctx: SlimeParser.TextHeadContext): Variable? = null

    override fun visitTextBody(ctx: SlimeParser.TextBodyContext): Text = ctx.getChild(0).accept(this) as Text

    override fun visitTextTail(ctx: SlimeParser.TextTailContext): Variable? = null

    override fun visitRefe(ctx: SlimeParser.RefeContext): ListOf<ListOf<Text>> = visitRefeBody(ctx.refeBody())

    override fun visitRefeHead(ctx: SlimeParser.RefeHeadContext): Variable? = null

    override fun visitRefeBody(ctx: SlimeParser.RefeBodyContext): ListOf<ListOf<Text>> {
        TODO("Gather characters with a matching name")
    }

    override fun visitRefeTail(ctx: SlimeParser.RefeTailContext): Variable? = null

    override fun visitSlot(ctx: SlimeParser.SlotContext): Variable = visitSpslBody(ctx.spslBody())

    override fun visitSlotHead(ctx: SlimeParser.SlotHeadContext): Variable? = null

    override fun visitSlotTail(ctx: SlimeParser.SlotTailContext): Variable? = null

    override fun visitSpec(ctx: SlimeParser.SpecContext): Variable = visitSpslBody(ctx.spslBody())

    override fun visitSpecHead(ctx: SlimeParser.SpecHeadContext): Variable? = null

    override fun visitSpecTail(ctx: SlimeParser.SpecTailContext): Variable? = null

    override fun visitSpslBody(ctx: SlimeParser.SpslBodyContext): ListOf<*> =
        if (ctx.parent.ruleIndex == SlimeParser.RULE_spec) {
            val result = ListOf<Special>(mutableListOf())
            for (c in visitChildren(ctx).content)
                if ((c as Text).content != ";")
                    result.add(Special(Special.Char.valueOf(c.content)))
            result
        } else {
            val result = ListOf<Slot>(mutableListOf())
            for (c in visitChildren(ctx).content)
                if ((c as Text).content != ";")
                    result.add(Slot(mutableListOf(c)))
            result
        }

    override fun visitTemp(ctx: SlimeParser.TempContext): Variable = visitTempBody(ctx.tempBody())

    override fun visitTempHead(ctx: SlimeParser.TempHeadContext): Variable? = null

    override fun visitTempBody(ctx: SlimeParser.TempBodyContext): Variable {
        val result = ListOf(mutableListOf())
        for (p in ctx.tempBodyPart())
            result.content.add(visitTempBodyPart(p))
        return result
    }

    override fun visitTempBodyPart(ctx: SlimeParser.TempBodyPartContext): Template {
        val children = visitChildren(ctx).content
        val texts = mutableMapOf<Int, Text>()
        val slots = mutableMapOf<Int, Slot>()
        val specials = mutableMapOf<Int, Special>()
        for (c in children)
            when (c.type) {
                Type.Text -> texts[children.indexOf(c)] = c as Text
                Type.Slot -> slots[children.indexOf(c)] = c as Slot
                Type.Spec -> specials[children.indexOf(c)] = c as Special
                else -> throw Error("Not expected type in template")
            }
        return Template(slots,specials,texts)
    }

    override fun visitTempTail(ctx: SlimeParser.TempTailContext): Variable? = null

    override fun visitTempText(ctx: SlimeParser.TempTextContext): ListOf<Text> {
        val result = ListOf<Text>(mutableListOf())
        for (t in visitChildren(ctx).content)
            result.content.add(t as Text)
        return result
    }

    override fun visitExpa(ctx: SlimeParser.ExpaContext): Variable = visitExpaBody(ctx.expaBody())

    override fun visitExpaHead(ctx: SlimeParser.ExpaHeadContext): Variable? = null

    override fun visitExpaBody(ctx: SlimeParser.ExpaBodyContext): Variable {
        val result = ListOf(mutableListOf())
        for (p in ctx.expaBodyPart())
            result.content.add(visitExpaBodyPart(p))
        return result
    }

    override fun visitExpaBodyPart(ctx: SlimeParser.ExpaBodyPartContext): Variable {
        TODO("convert all variable to text")
    }

    override fun visitExpaTail(ctx: SlimeParser.ExpaTailContext): Variable? = null

    override fun visitPlus(ctx: SlimeParser.PlusContext): Variable = visitPlusBody(ctx.plusBody())

    override fun visitPlusHead(ctx: SlimeParser.PlusHeadContext): Variable? = null

    override fun visitPlusBody(ctx: SlimeParser.PlusBodyContext): Variable {
        val result = ListOf(mutableListOf())
        for (p in ctx.plusBodyPart())
            result.content.add(visitPlusBodyPart(p))
        return result
    }

    override fun visitPlusBodyPart(ctx: SlimeParser.PlusBodyPartContext): Variable {
        TODO("Make plusrts according to visited add elements and return variable")
    }

    override fun visitPlusElement(ctx: SlimeParser.PlusElementContext): Variable =
        File(mutableMapOf())

    override fun visitPlusTail(ctx: SlimeParser.PlusTailContext): Variable? = null

    override fun visitDele(ctx: SlimeParser.DeleContext): Variable? {
        visitDeleBody(ctx.deleBody())
        return null
    }

    override fun visitDeleHead(ctx: SlimeParser.DeleHeadContext): Variable? = null

    override fun visitDeleBody(ctx: SlimeParser.DeleBodyContext): Variable? {
        for (vp in ctx.variPath())
            DataContainer.focus?.delete(visitVariPath(vp))
        for (r in ctx.refe())
            for (vp in visitRefe(r).content)
                DataContainer.focus?.delete(vp)
        return null
    }

    override fun visitDeleTail(ctx: SlimeParser.DeleTailContext): Variable? = null

    override fun visitDecl(ctx: SlimeParser.DeclContext): Variable = visitDeclBody(ctx.declBody())

    override fun visitDeclHead(ctx: SlimeParser.DeclHeadContext): Variable? = null

    override fun visitDeclNeck(ctx: SlimeParser.DeclNeckContext): StructInstance {
        val si = StructInstance(
            StructType(
                listOf(
                    StructType.NameType("names", listOf(Type.List, Type.Text)),
                    StructType.NameType("type", listOf(Type.List, Type.Text))
                )
            )
        )
        si.content.add(visitListName(ctx.listName()))
        si.content.add(visitTypeName(ctx.typeName()))
        return si
    }

    override fun visitDeclBody(ctx: SlimeParser.DeclBodyContext): Variable {
        val result = ListOf(mutableListOf())
        for (p in ctx.declBodyPart())
            result.content.add(visitDeclBodyPart(p))
        return result
    }

    override fun visitDeclBodyPart(ctx: SlimeParser.DeclBodyPartContext): Variable {
        TODO("declare variable according to the type")
    }

    override fun visitDeclTail(ctx: SlimeParser.DeclTailContext): Variable? = null

    override fun visitNameValue(ctx: SlimeParser.NameValueContext): Variable {
        val result = StructInstance(
            StructType(
                listOf(
                    StructType.NameType("names", listOf(Type.List, Type.Text)),
                    StructType.NameType("names", listOf(Type.Unknown))
                )
            )
        )
        result.content.add(visitListName(ctx.listName()))
        result.content.add(visitVari(ctx.vari()))
        return result
    }

    override fun visitNameType(ctx: SlimeParser.NameTypeContext): Variable =
        ListOf(mutableListOf(ListOf(mutableListOf(visitListName(ctx.listName()), visitTypeName(ctx.typeName())))))

    override fun visitVari(ctx: SlimeParser.VariContext): Variable {
        val prc = (ctx.getChild(0) as ParserRuleContext)
        return when (prc.ruleIndex) {
            SlimeParser.RULE_variPath -> {
                DataContainer.focus?.get(visitVariPath(prc as SlimeParser.VariPathContext))
                    ?: throw Exception(
                        "Can not rech variable at Path ${(visitVariPath(prc as SlimeParser.VariPathContext)).expand("/")}"
                    )
            }
            else -> prc.accept(this)
        }
    }

    override fun visitListName(ctx: SlimeParser.ListNameContext): ListOf<Text> {
        val result = ListOf<Text>(mutableListOf())
        for (t in visitChildren(ctx).content)
            if ((t as Text).content != ",")
                result.content.add(t)
        return result
    }

    override fun visitVariPath(ctx: SlimeParser.VariPathContext): ListOf<Text> {
        val result = ListOf<Text>(mutableListOf())
        for (t in visitChildren(ctx).content)
            if ((t as Text).content != ",")
                result.content.add(t)
        return result
    }

    override fun visitTypeName(ctx: SlimeParser.TypeNameContext): ListOf<Text> {
        val result = ListOf<Text>(mutableListOf())
        for (t in visitChildren(ctx).content)
            if ((t as Text).content != ",")
                result.content.add(t)
        return result
    }

    override fun visitTextOutor(ctx: SlimeParser.TextOutorContext): Variable = ctx.TEXT_OUTOR().accept(this)

}
import data.*
import data.type.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.*
import parser.SlimeParser
import parser.SlimeParserVisitor
import java.lang.Exception

class MyVisitor : SlimeParserVisitor<Variable> {
    override fun visitErrorNode(p0: ErrorNode?): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(p0: ParseTree?): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitTerminal(p0: TerminalNode?): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitChildren(p0: RuleNode?): Variable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visitFile(ctx: SlimeParser.FileContext): Variable {
        return File(mutableListOf(), mutableMapOf())
    }

    override fun visitText(ctx: SlimeParser.TextContext): Variable {
        return File(mutableListOf(), mutableMapOf())
    }

    override fun visitText_head(ctx: SlimeParser.Text_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitText_body(ctx: SlimeParser.Text_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitText_tail(ctx: SlimeParser.Text_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitRefe(ctx: SlimeParser.RefeContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitRefe_head(ctx: SlimeParser.Refe_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitRefe_body(ctx: SlimeParser.Refe_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitRefe_tail(ctx: SlimeParser.Refe_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSlot(ctx: SlimeParser.SlotContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSlot_head(ctx: SlimeParser.Slot_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSlot_tail(ctx: SlimeParser.Slot_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSpec(ctx: SlimeParser.SpecContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSpec_head(ctx: SlimeParser.Spec_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSpec_tail(ctx: SlimeParser.Spec_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitSpsl_body(ctx: SlimeParser.Spsl_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp(ctx: SlimeParser.TempContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp_head(ctx: SlimeParser.Temp_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp_body(ctx: SlimeParser.Temp_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp_tail(ctx: SlimeParser.Temp_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp_line(ctx: SlimeParser.Temp_lineContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitTemp_text(ctx: SlimeParser.Temp_textContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitExpa(ctx: SlimeParser.ExpaContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitExpa_head(ctx: SlimeParser.Expa_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitExpa_body(ctx: SlimeParser.Expa_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitExpa_body_part(ctx: SlimeParser.Expa_body_partContext): Variable =
        File(mutableListOf(), mutableMapOf())

    override fun visitExpa_tail(ctx: SlimeParser.Expa_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitInse(ctx: SlimeParser.InseContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitInse_head(ctx: SlimeParser.Inse_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitInse_body(ctx: SlimeParser.Inse_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitInse_body_part(ctx: SlimeParser.Inse_body_partContext): Variable =
        File(mutableListOf(), mutableMapOf())

    override fun visitInse_element(ctx: SlimeParser.Inse_elementContext): Variable =
        File(mutableListOf(), mutableMapOf())

    override fun visitInse_tail(ctx: SlimeParser.Inse_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDele(ctx: SlimeParser.DeleContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDele_head(ctx: SlimeParser.Dele_headContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDele_body(ctx: SlimeParser.Dele_bodyContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDele_tail(ctx: SlimeParser.Dele_tailContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDecl(ctx: SlimeParser.DeclContext): Variable = File(mutableListOf(), mutableMapOf())

    override fun visitDecl_head(ctx: SlimeParser.Decl_headContext): Variable? = null

    override fun visitDecl_neck(ctx: SlimeParser.Decl_neckContext): Variable {
        TODO("gether the metadata of the neck into a struct instance")
    }

    override fun visitDecl_body(ctx: SlimeParser.Decl_bodyContext): Variable {
        TODO("visit all the declaration and return them in a struct instance")
    }

    override fun visitDecl_body_part(ctx: SlimeParser.Decl_body_partContext): Variable {
        TODO("declare variable according to the type")
    }

    override fun visitDecl_tail(ctx: SlimeParser.Decl_tailContext): Variable? = null

    override fun visitNameValue(ctx: SlimeParser.NameValueContext): Variable {
        val result = StructInstance(
            null,
            StructType(
                null,
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
        ListOf(
            mutableListOf(Type.List, Type.List, Type.Text), mutableListOf(
                ListOf(
                    mutableListOf(Type.List, Type.Text),
                    mutableListOf(visitListName(ctx.listName()), visitTypeName(ctx.typeName()))
                )
            )
        )

    override fun visitVari(ctx: SlimeParser.VariContext): Variable {
        val prc = (ctx.getChild(0) as ParserRuleContext)
        when (prc.ruleIndex) {
            SlimeParser.RULE_variPath -> {
                return DataContainer.f?.get(visitVariPath(prc as SlimeParser.VariPathContext) as ListOf)
                    ?: throw Exception(
                        "Can not rech variable at Path ${(visitVariPath(prc as SlimeParser.VariPathContext) as ListOf).expand(
                            "/"
                        )}"
                    )
            }
            SlimeParser.RULE_decl -> return visitDecl(ctx.decl())
            SlimeParser.RULE_slot -> return visitSlot(ctx.slot())
            SlimeParser.RULE_spec -> return visitSpec(ctx.spec())
            SlimeParser.RULE_temp -> return visitTemp(ctx.temp())
            SlimeParser.RULE_text -> return visitText(ctx.text())
            SlimeParser.RULE_inse -> return visitInse(ctx.inse())
            else -> throw Exception("Unexpected type in variable place")
        }
    }

    override fun visitListName(ctx: SlimeParser.ListNameContext): Variable {
        val terms = ctx.children
        for (i in 1..(ctx.childCount / 2 + 1))
            terms.removeAt(i)
        val typeList = ListOf(mutableListOf(Type.List, Type.Text), mutableListOf())
        for (t in terms)
            typeList.content.add(Text((t as TerminalNode).text))
        return typeList
    }

    override fun visitVariPath(ctx: SlimeParser.VariPathContext): Variable {
        val terms = ctx.children
        for (i in 1..(ctx.childCount / 2 + 1))
            terms.removeAt(i)
        val typeList = ListOf(mutableListOf(Type.List, Type.Text), mutableListOf())
        for (t in terms)
            typeList.content.add(Text((t as TerminalNode).text))
        return typeList
    }

    override fun visitTypeName(ctx: SlimeParser.TypeNameContext): Variable {
        val terminals = ctx.children
        for (i in 1..(ctx.childCount / 2 + 1))
            terminals.removeAt(i)
        val result = ListOf(listOf(Type.List, Type.Text), mutableListOf())
        for (t in terminals)
            result.content.add(Text(t.text))
        return result
    }

    override fun visitText_outor(ctx: SlimeParser.Text_outorContext): Variable = Text(ctx.TEXT_OUTOR().text)

}
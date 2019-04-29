// Generated from /home/boss/Documents/Git/SlimeAnUTLE/Slime/src/SlimeParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlimeParser}.
 */
public interface SlimeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlimeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SlimeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SlimeParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(SlimeParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(SlimeParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#textHead}.
	 * @param ctx the parse tree
	 */
	void enterTextHead(SlimeParser.TextHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#textHead}.
	 * @param ctx the parse tree
	 */
	void exitTextHead(SlimeParser.TextHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#textBody}.
	 * @param ctx the parse tree
	 */
	void enterTextBody(SlimeParser.TextBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#textBody}.
	 * @param ctx the parse tree
	 */
	void exitTextBody(SlimeParser.TextBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#textTail}.
	 * @param ctx the parse tree
	 */
	void enterTextTail(SlimeParser.TextTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#textTail}.
	 * @param ctx the parse tree
	 */
	void exitTextTail(SlimeParser.TextTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refe}.
	 * @param ctx the parse tree
	 */
	void enterRefe(SlimeParser.RefeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refe}.
	 * @param ctx the parse tree
	 */
	void exitRefe(SlimeParser.RefeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refeHead}.
	 * @param ctx the parse tree
	 */
	void enterRefeHead(SlimeParser.RefeHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refeHead}.
	 * @param ctx the parse tree
	 */
	void exitRefeHead(SlimeParser.RefeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refeBody}.
	 * @param ctx the parse tree
	 */
	void enterRefeBody(SlimeParser.RefeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refeBody}.
	 * @param ctx the parse tree
	 */
	void exitRefeBody(SlimeParser.RefeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refeTail}.
	 * @param ctx the parse tree
	 */
	void enterRefeTail(SlimeParser.RefeTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refeTail}.
	 * @param ctx the parse tree
	 */
	void exitRefeTail(SlimeParser.RefeTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#slot}.
	 * @param ctx the parse tree
	 */
	void enterSlot(SlimeParser.SlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#slot}.
	 * @param ctx the parse tree
	 */
	void exitSlot(SlimeParser.SlotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#slotHead}.
	 * @param ctx the parse tree
	 */
	void enterSlotHead(SlimeParser.SlotHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#slotHead}.
	 * @param ctx the parse tree
	 */
	void exitSlotHead(SlimeParser.SlotHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#slotTail}.
	 * @param ctx the parse tree
	 */
	void enterSlotTail(SlimeParser.SlotTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#slotTail}.
	 * @param ctx the parse tree
	 */
	void exitSlotTail(SlimeParser.SlotTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(SlimeParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(SlimeParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#specHead}.
	 * @param ctx the parse tree
	 */
	void enterSpecHead(SlimeParser.SpecHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#specHead}.
	 * @param ctx the parse tree
	 */
	void exitSpecHead(SlimeParser.SpecHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#specTail}.
	 * @param ctx the parse tree
	 */
	void enterSpecTail(SlimeParser.SpecTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#specTail}.
	 * @param ctx the parse tree
	 */
	void exitSpecTail(SlimeParser.SpecTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#spslBody}.
	 * @param ctx the parse tree
	 */
	void enterSpslBody(SlimeParser.SpslBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#spslBody}.
	 * @param ctx the parse tree
	 */
	void exitSpslBody(SlimeParser.SpslBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#temp}.
	 * @param ctx the parse tree
	 */
	void enterTemp(SlimeParser.TempContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp}.
	 * @param ctx the parse tree
	 */
	void exitTemp(SlimeParser.TempContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#tempHead}.
	 * @param ctx the parse tree
	 */
	void enterTempHead(SlimeParser.TempHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#tempHead}.
	 * @param ctx the parse tree
	 */
	void exitTempHead(SlimeParser.TempHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#tempBody}.
	 * @param ctx the parse tree
	 */
	void enterTempBody(SlimeParser.TempBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#tempBody}.
	 * @param ctx the parse tree
	 */
	void exitTempBody(SlimeParser.TempBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#tempBodyPart}.
	 * @param ctx the parse tree
	 */
	void enterTempBodyPart(SlimeParser.TempBodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#tempBodyPart}.
	 * @param ctx the parse tree
	 */
	void exitTempBodyPart(SlimeParser.TempBodyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#tempTail}.
	 * @param ctx the parse tree
	 */
	void enterTempTail(SlimeParser.TempTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#tempTail}.
	 * @param ctx the parse tree
	 */
	void exitTempTail(SlimeParser.TempTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#tempText}.
	 * @param ctx the parse tree
	 */
	void enterTempText(SlimeParser.TempTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#tempText}.
	 * @param ctx the parse tree
	 */
	void exitTempText(SlimeParser.TempTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#exte}.
	 * @param ctx the parse tree
	 */
	void enterExte(SlimeParser.ExteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#exte}.
	 * @param ctx the parse tree
	 */
	void exitExte(SlimeParser.ExteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#exteHead}.
	 * @param ctx the parse tree
	 */
	void enterExteHead(SlimeParser.ExteHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#exteHead}.
	 * @param ctx the parse tree
	 */
	void exitExteHead(SlimeParser.ExteHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#exteBody}.
	 * @param ctx the parse tree
	 */
	void enterExteBody(SlimeParser.ExteBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#exteBody}.
	 * @param ctx the parse tree
	 */
	void exitExteBody(SlimeParser.ExteBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#exteBodyPart}.
	 * @param ctx the parse tree
	 */
	void enterExteBodyPart(SlimeParser.ExteBodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#exteBodyPart}.
	 * @param ctx the parse tree
	 */
	void exitExteBodyPart(SlimeParser.ExteBodyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#exteTail}.
	 * @param ctx the parse tree
	 */
	void enterExteTail(SlimeParser.ExteTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#exteTail}.
	 * @param ctx the parse tree
	 */
	void exitExteTail(SlimeParser.ExteTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(SlimeParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(SlimeParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plusHead}.
	 * @param ctx the parse tree
	 */
	void enterPlusHead(SlimeParser.PlusHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plusHead}.
	 * @param ctx the parse tree
	 */
	void exitPlusHead(SlimeParser.PlusHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plusBody}.
	 * @param ctx the parse tree
	 */
	void enterPlusBody(SlimeParser.PlusBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plusBody}.
	 * @param ctx the parse tree
	 */
	void exitPlusBody(SlimeParser.PlusBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plusBodyPart}.
	 * @param ctx the parse tree
	 */
	void enterPlusBodyPart(SlimeParser.PlusBodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plusBodyPart}.
	 * @param ctx the parse tree
	 */
	void exitPlusBodyPart(SlimeParser.PlusBodyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plusElement}.
	 * @param ctx the parse tree
	 */
	void enterPlusElement(SlimeParser.PlusElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plusElement}.
	 * @param ctx the parse tree
	 */
	void exitPlusElement(SlimeParser.PlusElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#plusTail}.
	 * @param ctx the parse tree
	 */
	void enterPlusTail(SlimeParser.PlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#plusTail}.
	 * @param ctx the parse tree
	 */
	void exitPlusTail(SlimeParser.PlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#dele}.
	 * @param ctx the parse tree
	 */
	void enterDele(SlimeParser.DeleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#dele}.
	 * @param ctx the parse tree
	 */
	void exitDele(SlimeParser.DeleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#deleHead}.
	 * @param ctx the parse tree
	 */
	void enterDeleHead(SlimeParser.DeleHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#deleHead}.
	 * @param ctx the parse tree
	 */
	void exitDeleHead(SlimeParser.DeleHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#deleBody}.
	 * @param ctx the parse tree
	 */
	void enterDeleBody(SlimeParser.DeleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#deleBody}.
	 * @param ctx the parse tree
	 */
	void exitDeleBody(SlimeParser.DeleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#deleTail}.
	 * @param ctx the parse tree
	 */
	void enterDeleTail(SlimeParser.DeleTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#deleTail}.
	 * @param ctx the parse tree
	 */
	void exitDeleTail(SlimeParser.DeleTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SlimeParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SlimeParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#declHead}.
	 * @param ctx the parse tree
	 */
	void enterDeclHead(SlimeParser.DeclHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#declHead}.
	 * @param ctx the parse tree
	 */
	void exitDeclHead(SlimeParser.DeclHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#declNeck}.
	 * @param ctx the parse tree
	 */
	void enterDeclNeck(SlimeParser.DeclNeckContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#declNeck}.
	 * @param ctx the parse tree
	 */
	void exitDeclNeck(SlimeParser.DeclNeckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#declBody}.
	 * @param ctx the parse tree
	 */
	void enterDeclBody(SlimeParser.DeclBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#declBody}.
	 * @param ctx the parse tree
	 */
	void exitDeclBody(SlimeParser.DeclBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#declBodyPart}.
	 * @param ctx the parse tree
	 */
	void enterDeclBodyPart(SlimeParser.DeclBodyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#declBodyPart}.
	 * @param ctx the parse tree
	 */
	void exitDeclBodyPart(SlimeParser.DeclBodyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#declTail}.
	 * @param ctx the parse tree
	 */
	void enterDeclTail(SlimeParser.DeclTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#declTail}.
	 * @param ctx the parse tree
	 */
	void exitDeclTail(SlimeParser.DeclTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(SlimeParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(SlimeParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#nameType}.
	 * @param ctx the parse tree
	 */
	void enterNameType(SlimeParser.NameTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#nameType}.
	 * @param ctx the parse tree
	 */
	void exitNameType(SlimeParser.NameTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#listVari}.
	 * @param ctx the parse tree
	 */
	void enterListVari(SlimeParser.ListVariContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#listVari}.
	 * @param ctx the parse tree
	 */
	void exitListVari(SlimeParser.ListVariContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#vari}.
	 * @param ctx the parse tree
	 */
	void enterVari(SlimeParser.VariContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#vari}.
	 * @param ctx the parse tree
	 */
	void exitVari(SlimeParser.VariContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#variPath}.
	 * @param ctx the parse tree
	 */
	void enterVariPath(SlimeParser.VariPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#variPath}.
	 * @param ctx the parse tree
	 */
	void exitVariPath(SlimeParser.VariPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#listName}.
	 * @param ctx the parse tree
	 */
	void enterListName(SlimeParser.ListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#listName}.
	 * @param ctx the parse tree
	 */
	void exitListName(SlimeParser.ListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SlimeParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SlimeParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#textOutor}.
	 * @param ctx the parse tree
	 */
	void enterTextOutor(SlimeParser.TextOutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#textOutor}.
	 * @param ctx the parse tree
	 */
	void exitTextOutor(SlimeParser.TextOutorContext ctx);
}
// Generated from /home/boss/Documents/Git/SlimeAnUTLE/Slime/src/SlimeParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlimeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlimeParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SlimeParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(SlimeParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#textHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextHead(SlimeParser.TextHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#textBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextBody(SlimeParser.TextBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#textTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTail(SlimeParser.TextTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefe(SlimeParser.RefeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refeHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefeHead(SlimeParser.RefeHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefeBody(SlimeParser.RefeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refeTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefeTail(SlimeParser.RefeTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot(SlimeParser.SlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slotHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotHead(SlimeParser.SlotHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slotTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotTail(SlimeParser.SlotTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(SlimeParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#specHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecHead(SlimeParser.SpecHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#specTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecTail(SlimeParser.SpecTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spslBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpslBody(SlimeParser.SpslBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp(SlimeParser.TempContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#tempHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempHead(SlimeParser.TempHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#tempBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempBody(SlimeParser.TempBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#tempBodyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempBodyPart(SlimeParser.TempBodyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#tempTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempTail(SlimeParser.TempTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#tempText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempText(SlimeParser.TempTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa(SlimeParser.ExpaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expaHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpaHead(SlimeParser.ExpaHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpaBody(SlimeParser.ExpaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expaBodyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpaBodyPart(SlimeParser.ExpaBodyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expaTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpaTail(SlimeParser.ExpaTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(SlimeParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plusHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusHead(SlimeParser.PlusHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plusBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusBody(SlimeParser.PlusBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plusBodyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusBodyPart(SlimeParser.PlusBodyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plusElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusElement(SlimeParser.PlusElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#plusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusTail(SlimeParser.PlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#dele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDele(SlimeParser.DeleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#deleHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleHead(SlimeParser.DeleHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#deleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleBody(SlimeParser.DeleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#deleTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleTail(SlimeParser.DeleTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SlimeParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#declHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclHead(SlimeParser.DeclHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#declNeck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclNeck(SlimeParser.DeclNeckContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#declBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclBody(SlimeParser.DeclBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#declBodyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclBodyPart(SlimeParser.DeclBodyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#declTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTail(SlimeParser.DeclTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(SlimeParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#nameType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameType(SlimeParser.NameTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#listVari}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVari(SlimeParser.ListVariContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#vari}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVari(SlimeParser.VariContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#listName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListName(SlimeParser.ListNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#variPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariPath(SlimeParser.VariPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SlimeParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#textOutor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOutor(SlimeParser.TextOutorContext ctx);
}
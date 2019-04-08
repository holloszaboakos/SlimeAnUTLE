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
	 * Visit a parse tree produced by {@link SlimeParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(SlimeParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(SlimeParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_head(SlimeParser.Text_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_body(SlimeParser.Text_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_tail(SlimeParser.Text_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefe(SlimeParser.RefeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refe_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefe_head(SlimeParser.Refe_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refe_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefe_body(SlimeParser.Refe_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#refe_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefe_tail(SlimeParser.Refe_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot(SlimeParser.SlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slot_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot_head(SlimeParser.Slot_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#slot_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlot_tail(SlimeParser.Slot_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(SlimeParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spec_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_head(SlimeParser.Spec_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spec_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_tail(SlimeParser.Spec_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#spsl_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpsl_body(SlimeParser.Spsl_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp(SlimeParser.TempContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_head(SlimeParser.Temp_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_body(SlimeParser.Temp_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_tail(SlimeParser.Temp_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_line(SlimeParser.Temp_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#temp_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_text(SlimeParser.Temp_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa(SlimeParser.ExpaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa_head(SlimeParser.Expa_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa_body(SlimeParser.Expa_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa_body_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa_body_part(SlimeParser.Expa_body_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#expa_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpa_tail(SlimeParser.Expa_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse(SlimeParser.InseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse_head(SlimeParser.Inse_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse_body(SlimeParser.Inse_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse_body_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse_body_part(SlimeParser.Inse_body_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse_element(SlimeParser.Inse_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#inse_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInse_tail(SlimeParser.Inse_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#dele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDele(SlimeParser.DeleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#dele_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDele_head(SlimeParser.Dele_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#dele_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDele_body(SlimeParser.Dele_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#dele_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDele_tail(SlimeParser.Dele_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SlimeParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_head(SlimeParser.Decl_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl_neck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_neck(SlimeParser.Decl_neckContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_body(SlimeParser.Decl_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl_body_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_body_part(SlimeParser.Decl_body_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_tail(SlimeParser.Decl_tailContext ctx);
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
	 * Visit a parse tree produced by {@link SlimeParser#variName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariName(SlimeParser.VariNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#variNameIndx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariNameIndx(SlimeParser.VariNameIndxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SlimeParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlimeParser#text_outor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_outor(SlimeParser.Text_outorContext ctx);
}
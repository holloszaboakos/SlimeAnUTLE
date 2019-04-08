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
	 * Enter a parse tree produced by {@link SlimeParser#text_head}.
	 * @param ctx the parse tree
	 */
	void enterText_head(SlimeParser.Text_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#text_head}.
	 * @param ctx the parse tree
	 */
	void exitText_head(SlimeParser.Text_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#text_body}.
	 * @param ctx the parse tree
	 */
	void enterText_body(SlimeParser.Text_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#text_body}.
	 * @param ctx the parse tree
	 */
	void exitText_body(SlimeParser.Text_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#text_tail}.
	 * @param ctx the parse tree
	 */
	void enterText_tail(SlimeParser.Text_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#text_tail}.
	 * @param ctx the parse tree
	 */
	void exitText_tail(SlimeParser.Text_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#refe_head}.
	 * @param ctx the parse tree
	 */
	void enterRefe_head(SlimeParser.Refe_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refe_head}.
	 * @param ctx the parse tree
	 */
	void exitRefe_head(SlimeParser.Refe_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refe_body}.
	 * @param ctx the parse tree
	 */
	void enterRefe_body(SlimeParser.Refe_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refe_body}.
	 * @param ctx the parse tree
	 */
	void exitRefe_body(SlimeParser.Refe_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#refe_tail}.
	 * @param ctx the parse tree
	 */
	void enterRefe_tail(SlimeParser.Refe_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#refe_tail}.
	 * @param ctx the parse tree
	 */
	void exitRefe_tail(SlimeParser.Refe_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#slot_head}.
	 * @param ctx the parse tree
	 */
	void enterSlot_head(SlimeParser.Slot_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#slot_head}.
	 * @param ctx the parse tree
	 */
	void exitSlot_head(SlimeParser.Slot_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#slot_tail}.
	 * @param ctx the parse tree
	 */
	void enterSlot_tail(SlimeParser.Slot_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#slot_tail}.
	 * @param ctx the parse tree
	 */
	void exitSlot_tail(SlimeParser.Slot_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#spec_head}.
	 * @param ctx the parse tree
	 */
	void enterSpec_head(SlimeParser.Spec_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#spec_head}.
	 * @param ctx the parse tree
	 */
	void exitSpec_head(SlimeParser.Spec_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#spec_tail}.
	 * @param ctx the parse tree
	 */
	void enterSpec_tail(SlimeParser.Spec_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#spec_tail}.
	 * @param ctx the parse tree
	 */
	void exitSpec_tail(SlimeParser.Spec_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#spsl_body}.
	 * @param ctx the parse tree
	 */
	void enterSpsl_body(SlimeParser.Spsl_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#spsl_body}.
	 * @param ctx the parse tree
	 */
	void exitSpsl_body(SlimeParser.Spsl_bodyContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#temp_head}.
	 * @param ctx the parse tree
	 */
	void enterTemp_head(SlimeParser.Temp_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp_head}.
	 * @param ctx the parse tree
	 */
	void exitTemp_head(SlimeParser.Temp_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#temp_body}.
	 * @param ctx the parse tree
	 */
	void enterTemp_body(SlimeParser.Temp_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp_body}.
	 * @param ctx the parse tree
	 */
	void exitTemp_body(SlimeParser.Temp_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#temp_tail}.
	 * @param ctx the parse tree
	 */
	void enterTemp_tail(SlimeParser.Temp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp_tail}.
	 * @param ctx the parse tree
	 */
	void exitTemp_tail(SlimeParser.Temp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#temp_line}.
	 * @param ctx the parse tree
	 */
	void enterTemp_line(SlimeParser.Temp_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp_line}.
	 * @param ctx the parse tree
	 */
	void exitTemp_line(SlimeParser.Temp_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#temp_text}.
	 * @param ctx the parse tree
	 */
	void enterTemp_text(SlimeParser.Temp_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#temp_text}.
	 * @param ctx the parse tree
	 */
	void exitTemp_text(SlimeParser.Temp_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#expa}.
	 * @param ctx the parse tree
	 */
	void enterExpa(SlimeParser.ExpaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#expa}.
	 * @param ctx the parse tree
	 */
	void exitExpa(SlimeParser.ExpaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#expa_head}.
	 * @param ctx the parse tree
	 */
	void enterExpa_head(SlimeParser.Expa_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#expa_head}.
	 * @param ctx the parse tree
	 */
	void exitExpa_head(SlimeParser.Expa_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#expa_body}.
	 * @param ctx the parse tree
	 */
	void enterExpa_body(SlimeParser.Expa_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#expa_body}.
	 * @param ctx the parse tree
	 */
	void exitExpa_body(SlimeParser.Expa_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#expa_body_part}.
	 * @param ctx the parse tree
	 */
	void enterExpa_body_part(SlimeParser.Expa_body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#expa_body_part}.
	 * @param ctx the parse tree
	 */
	void exitExpa_body_part(SlimeParser.Expa_body_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#expa_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpa_tail(SlimeParser.Expa_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#expa_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpa_tail(SlimeParser.Expa_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse}.
	 * @param ctx the parse tree
	 */
	void enterInse(SlimeParser.InseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse}.
	 * @param ctx the parse tree
	 */
	void exitInse(SlimeParser.InseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse_head}.
	 * @param ctx the parse tree
	 */
	void enterInse_head(SlimeParser.Inse_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse_head}.
	 * @param ctx the parse tree
	 */
	void exitInse_head(SlimeParser.Inse_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse_body}.
	 * @param ctx the parse tree
	 */
	void enterInse_body(SlimeParser.Inse_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse_body}.
	 * @param ctx the parse tree
	 */
	void exitInse_body(SlimeParser.Inse_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse_body_part}.
	 * @param ctx the parse tree
	 */
	void enterInse_body_part(SlimeParser.Inse_body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse_body_part}.
	 * @param ctx the parse tree
	 */
	void exitInse_body_part(SlimeParser.Inse_body_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse_element}.
	 * @param ctx the parse tree
	 */
	void enterInse_element(SlimeParser.Inse_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse_element}.
	 * @param ctx the parse tree
	 */
	void exitInse_element(SlimeParser.Inse_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#inse_tail}.
	 * @param ctx the parse tree
	 */
	void enterInse_tail(SlimeParser.Inse_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#inse_tail}.
	 * @param ctx the parse tree
	 */
	void exitInse_tail(SlimeParser.Inse_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#dele_head}.
	 * @param ctx the parse tree
	 */
	void enterDele_head(SlimeParser.Dele_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#dele_head}.
	 * @param ctx the parse tree
	 */
	void exitDele_head(SlimeParser.Dele_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#dele_body}.
	 * @param ctx the parse tree
	 */
	void enterDele_body(SlimeParser.Dele_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#dele_body}.
	 * @param ctx the parse tree
	 */
	void exitDele_body(SlimeParser.Dele_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#dele_tail}.
	 * @param ctx the parse tree
	 */
	void enterDele_tail(SlimeParser.Dele_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#dele_tail}.
	 * @param ctx the parse tree
	 */
	void exitDele_tail(SlimeParser.Dele_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#decl_head}.
	 * @param ctx the parse tree
	 */
	void enterDecl_head(SlimeParser.Decl_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl_head}.
	 * @param ctx the parse tree
	 */
	void exitDecl_head(SlimeParser.Decl_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#decl_neck}.
	 * @param ctx the parse tree
	 */
	void enterDecl_neck(SlimeParser.Decl_neckContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl_neck}.
	 * @param ctx the parse tree
	 */
	void exitDecl_neck(SlimeParser.Decl_neckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#decl_body}.
	 * @param ctx the parse tree
	 */
	void enterDecl_body(SlimeParser.Decl_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl_body}.
	 * @param ctx the parse tree
	 */
	void exitDecl_body(SlimeParser.Decl_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#decl_body_part}.
	 * @param ctx the parse tree
	 */
	void enterDecl_body_part(SlimeParser.Decl_body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl_body_part}.
	 * @param ctx the parse tree
	 */
	void exitDecl_body_part(SlimeParser.Decl_body_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlimeParser#decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterDecl_tail(SlimeParser.Decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitDecl_tail(SlimeParser.Decl_tailContext ctx);
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
	 * Enter a parse tree produced by {@link SlimeParser#text_outor}.
	 * @param ctx the parse tree
	 */
	void enterText_outor(SlimeParser.Text_outorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlimeParser#text_outor}.
	 * @param ctx the parse tree
	 */
	void exitText_outor(SlimeParser.Text_outorContext ctx);
}
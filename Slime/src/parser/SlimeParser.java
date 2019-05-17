// Generated from /home/boss/Documents/Git/SlimeAnUTLE/Slime/src/SlimeParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RULE_DIV=1, COMM_OUTER=2, BOB_SLOT=3, BOB_SPEC=4, BOB_REFE=5, BOB_EXTE=6, 
		BOB_PLUS=7, BOB_DECL=8, BOB_DELE=9, BOB_TEXT=10, BOB_TEMP=11, OLB_SLOT=12, 
		OLB_SPEC=13, OLB_REFE=14, OLB_EXTE=15, OLB_PLUS=16, OLB_DECL=17, OLB_DELE=18, 
		OLB_TEXT=19, OLB_TEMP=20, COB_SLOT=21, COB_SPEC=22, COB_REFE=23, COB_EXTE=24, 
		COB_PLUS=25, COB_DECL=26, COB_DELE=27, COB_TEXT=28, COB_TEMP=29, TEXT_OUTOR=30, 
		COMM_B_S=31, WS_B_S=32, BCB_SLOT=33, BCB_SPEC=34, COMM_O_S=35, WS_O_S=36, 
		NL_SLSP=37, COMM_C_S=38, NW_SLSP=39, COMM_REFE=40, WS_B_R=41, BCB_REFE=42, 
		REOP=43, REGEX=44, COMM_O_R=45, WS_O_R=46, NL_REFE=47, COMM_C_R=48, NW_REFE=49, 
		COMM_B_O=50, WS_B_O=51, BCB_EXTE=52, BCB_PLUS=53, BCB_DECL=54, BCB_DELE=55, 
		EQOP=56, PLOP=57, PE=58, CO=59, CL=60, LS=61, SC=62, NAME=63, INTE=64, 
		COMM_O_O=65, WS_O_O=66, NL_OPER=67, COMM_C_O=68, NW_OPER=69, BCB_TEXT=70, 
		IN_B_T=71, NL_TEXT=72, NW_TEXT=73, BCB_TEMP=74, LINE_DIVIDER=75, TEXT_LINE=76, 
		NL_TEMP=77, NW_TEMP=78, SC_B_S=79, LS_B_R=80;
	public static final int
		RULE_file = 0, RULE_text = 1, RULE_textHead = 2, RULE_textBody = 3, RULE_textTail = 4, 
		RULE_refe = 5, RULE_refeHead = 6, RULE_refeBody = 7, RULE_refeTail = 8, 
		RULE_slot = 9, RULE_slotHead = 10, RULE_slotTail = 11, RULE_spec = 12, 
		RULE_specHead = 13, RULE_specTail = 14, RULE_spslBody = 15, RULE_temp = 16, 
		RULE_tempHead = 17, RULE_tempBody = 18, RULE_tempBodyPart = 19, RULE_tempTail = 20, 
		RULE_tempText = 21, RULE_exte = 22, RULE_exteHead = 23, RULE_exteBody = 24, 
		RULE_exteBodyPart = 25, RULE_exteTail = 26, RULE_plus = 27, RULE_plusHead = 28, 
		RULE_plusBody = 29, RULE_plusBodyPart = 30, RULE_plusElement = 31, RULE_plusTail = 32, 
		RULE_dele = 33, RULE_deleHead = 34, RULE_deleBody = 35, RULE_deleTail = 36, 
		RULE_decl = 37, RULE_declHead = 38, RULE_declNeck = 39, RULE_declBody = 40, 
		RULE_declBodyPart = 41, RULE_declTail = 42, RULE_nameValue = 43, RULE_nameType = 44, 
		RULE_listVari = 45, RULE_vari = 46, RULE_variPath = 47, RULE_listName = 48, 
		RULE_typeName = 49, RULE_textOutor = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "text", "textHead", "textBody", "textTail", "refe", "refeHead", 
			"refeBody", "refeTail", "slot", "slotHead", "slotTail", "spec", "specHead", 
			"specTail", "spslBody", "temp", "tempHead", "tempBody", "tempBodyPart", 
			"tempTail", "tempText", "exte", "exteHead", "exteBody", "exteBodyPart", 
			"exteTail", "plus", "plusHead", "plusBody", "plusBodyPart", "plusElement", 
			"plusTail", "dele", "deleHead", "deleBody", "deleTail", "decl", "declHead", 
			"declNeck", "declBody", "declBodyPart", "declTail", "nameValue", "nameType", 
			"listVari", "vari", "variPath", "listName", "typeName", "textOutor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{$'", "'{@'", "'{&'", "'{*'", "'{+'", "'{='", null, 
			"'{\"'", "'{|'", "'[$'", "'[@'", "'[&'", "'[*'", "'[+'", "'[='", null, 
			"'[\"'", "'[|'", "'<$'", "'<@'", "'<&'", "'<*'", "'<+'", "'<='", null, 
			"'<\"'", "'<|'", null, null, null, "'$}'", "'@}'", null, null, null, 
			null, null, null, null, "'&}'", null, null, null, null, null, null, null, 
			null, null, "'*}'", "'+}'", "'=}'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'\"}'", null, 
			null, null, "'|}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RULE_DIV", "COMM_OUTER", "BOB_SLOT", "BOB_SPEC", "BOB_REFE", "BOB_EXTE", 
			"BOB_PLUS", "BOB_DECL", "BOB_DELE", "BOB_TEXT", "BOB_TEMP", "OLB_SLOT", 
			"OLB_SPEC", "OLB_REFE", "OLB_EXTE", "OLB_PLUS", "OLB_DECL", "OLB_DELE", 
			"OLB_TEXT", "OLB_TEMP", "COB_SLOT", "COB_SPEC", "COB_REFE", "COB_EXTE", 
			"COB_PLUS", "COB_DECL", "COB_DELE", "COB_TEXT", "COB_TEMP", "TEXT_OUTOR", 
			"COMM_B_S", "WS_B_S", "BCB_SLOT", "BCB_SPEC", "COMM_O_S", "WS_O_S", "NL_SLSP", 
			"COMM_C_S", "NW_SLSP", "COMM_REFE", "WS_B_R", "BCB_REFE", "REOP", "REGEX", 
			"COMM_O_R", "WS_O_R", "NL_REFE", "COMM_C_R", "NW_REFE", "COMM_B_O", "WS_B_O", 
			"BCB_EXTE", "BCB_PLUS", "BCB_DECL", "BCB_DELE", "EQOP", "PLOP", "PE", 
			"CO", "CL", "LS", "SC", "NAME", "INTE", "COMM_O_O", "WS_O_O", "NL_OPER", 
			"COMM_C_O", "NW_OPER", "BCB_TEXT", "IN_B_T", "NL_TEXT", "NW_TEXT", "BCB_TEMP", 
			"LINE_DIVIDER", "TEXT_LINE", "NL_TEMP", "NW_TEMP", "SC_B_S", "LS_B_R"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SlimeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<RefeContext> refe() {
			return getRuleContexts(RefeContext.class);
		}
		public RefeContext refe(int i) {
			return getRuleContext(RefeContext.class,i);
		}
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public List<TempContext> temp() {
			return getRuleContexts(TempContext.class);
		}
		public TempContext temp(int i) {
			return getRuleContext(TempContext.class,i);
		}
		public List<DeleContext> dele() {
			return getRuleContexts(DeleContext.class);
		}
		public DeleContext dele(int i) {
			return getRuleContext(DeleContext.class,i);
		}
		public List<ExteContext> exte() {
			return getRuleContexts(ExteContext.class);
		}
		public ExteContext exte(int i) {
			return getRuleContext(ExteContext.class,i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TextOutorContext> textOutor() {
			return getRuleContexts(TextOutorContext.class);
		}
		public TextOutorContext textOutor(int i) {
			return getRuleContext(TextOutorContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_SLOT) | (1L << BOB_SPEC) | (1L << BOB_REFE) | (1L << BOB_EXTE) | (1L << BOB_PLUS) | (1L << BOB_DECL) | (1L << BOB_DELE) | (1L << BOB_TEXT) | (1L << BOB_TEMP) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_REFE) | (1L << OLB_EXTE) | (1L << OLB_PLUS) | (1L << OLB_DECL) | (1L << OLB_DELE) | (1L << OLB_TEXT) | (1L << OLB_TEMP) | (1L << COB_SLOT) | (1L << COB_SPEC) | (1L << COB_REFE) | (1L << COB_EXTE) | (1L << COB_PLUS) | (1L << COB_DECL) | (1L << COB_DELE) | (1L << COB_TEXT) | (1L << COB_TEMP) | (1L << TEXT_OUTOR))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(102);
					text();
					}
					break;
				case 2:
					{
					setState(103);
					refe();
					}
					break;
				case 3:
					{
					setState(104);
					slot();
					}
					break;
				case 4:
					{
					setState(105);
					spec();
					}
					break;
				case 5:
					{
					setState(106);
					temp();
					}
					break;
				case 6:
					{
					setState(107);
					dele();
					}
					break;
				case 7:
					{
					setState(108);
					exte();
					}
					break;
				case 8:
					{
					setState(109);
					plus();
					}
					break;
				case 9:
					{
					setState(110);
					decl();
					}
					break;
				case 10:
					{
					setState(111);
					dele();
					}
					break;
				case 11:
					{
					setState(112);
					refe();
					}
					break;
				case 12:
					{
					setState(113);
					textOutor();
					}
					break;
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TextHeadContext textHead() {
			return getRuleContext(TextHeadContext.class,0);
		}
		public TextBodyContext textBody() {
			return getRuleContext(TextBodyContext.class,0);
		}
		public TextTailContext textTail() {
			return getRuleContext(TextTailContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			textHead();
			setState(120);
			textBody();
			setState(121);
			textTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextHeadContext extends ParserRuleContext {
		public TerminalNode BOB_TEXT() { return getToken(SlimeParser.BOB_TEXT, 0); }
		public TerminalNode OLB_TEXT() { return getToken(SlimeParser.OLB_TEXT, 0); }
		public TerminalNode COB_TEXT() { return getToken(SlimeParser.COB_TEXT, 0); }
		public TextHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextHeadContext textHead() throws RecognitionException {
		TextHeadContext _localctx = new TextHeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_TEXT) | (1L << OLB_TEXT) | (1L << COB_TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextBodyContext extends ParserRuleContext {
		public TerminalNode IN_B_T() { return getToken(SlimeParser.IN_B_T, 0); }
		public TextBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextBodyContext textBody() throws RecognitionException {
		TextBodyContext _localctx = new TextBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IN_B_T);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextTailContext extends ParserRuleContext {
		public TerminalNode BCB_TEXT() { return getToken(SlimeParser.BCB_TEXT, 0); }
		public TerminalNode NL_TEXT() { return getToken(SlimeParser.NL_TEXT, 0); }
		public TerminalNode NW_TEXT() { return getToken(SlimeParser.NW_TEXT, 0); }
		public TextTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextTailContext textTail() throws RecognitionException {
		TextTailContext _localctx = new TextTailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BCB_TEXT - 70)) | (1L << (NL_TEXT - 70)) | (1L << (NW_TEXT - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefeContext extends ParserRuleContext {
		public RefeHeadContext refeHead() {
			return getRuleContext(RefeHeadContext.class,0);
		}
		public RefeBodyContext refeBody() {
			return getRuleContext(RefeBodyContext.class,0);
		}
		public RefeTailContext refeTail() {
			return getRuleContext(RefeTailContext.class,0);
		}
		public RefeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeContext refe() throws RecognitionException {
		RefeContext _localctx = new RefeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_refe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			refeHead();
			setState(130);
			refeBody();
			setState(131);
			refeTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefeHeadContext extends ParserRuleContext {
		public TerminalNode BOB_REFE() { return getToken(SlimeParser.BOB_REFE, 0); }
		public TerminalNode OLB_REFE() { return getToken(SlimeParser.OLB_REFE, 0); }
		public TerminalNode COB_REFE() { return getToken(SlimeParser.COB_REFE, 0); }
		public RefeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeHeadContext refeHead() throws RecognitionException {
		RefeHeadContext _localctx = new RefeHeadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_refeHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_REFE) | (1L << OLB_REFE) | (1L << COB_REFE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefeBodyContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode REOP() { return getToken(SlimeParser.REOP, 0); }
		public TerminalNode REGEX() { return getToken(SlimeParser.REGEX, 0); }
		public RefeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeBodyContext refeBody() throws RecognitionException {
		RefeBodyContext _localctx = new RefeBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_refeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			typeName();
			setState(136);
			match(REOP);
			setState(137);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefeTailContext extends ParserRuleContext {
		public TerminalNode BCB_REFE() { return getToken(SlimeParser.BCB_REFE, 0); }
		public TerminalNode NL_REFE() { return getToken(SlimeParser.NL_REFE, 0); }
		public TerminalNode NW_REFE() { return getToken(SlimeParser.NW_REFE, 0); }
		public RefeTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefeTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefeTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefeTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeTailContext refeTail() throws RecognitionException {
		RefeTailContext _localctx = new RefeTailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_refeTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BCB_REFE) | (1L << NL_REFE) | (1L << NW_REFE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotContext extends ParserRuleContext {
		public SlotHeadContext slotHead() {
			return getRuleContext(SlotHeadContext.class,0);
		}
		public SpslBodyContext spslBody() {
			return getRuleContext(SpslBodyContext.class,0);
		}
		public SlotTailContext slotTail() {
			return getRuleContext(SlotTailContext.class,0);
		}
		public SlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotContext slot() throws RecognitionException {
		SlotContext _localctx = new SlotContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_slot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			slotHead();
			setState(142);
			spslBody();
			setState(143);
			slotTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotHeadContext extends ParserRuleContext {
		public TerminalNode BOB_SLOT() { return getToken(SlimeParser.BOB_SLOT, 0); }
		public TerminalNode OLB_SLOT() { return getToken(SlimeParser.OLB_SLOT, 0); }
		public TerminalNode COB_SLOT() { return getToken(SlimeParser.COB_SLOT, 0); }
		public SlotHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlotHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlotHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlotHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotHeadContext slotHead() throws RecognitionException {
		SlotHeadContext _localctx = new SlotHeadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_slotHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_SLOT) | (1L << OLB_SLOT) | (1L << COB_SLOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlotTailContext extends ParserRuleContext {
		public TerminalNode BCB_SLOT() { return getToken(SlimeParser.BCB_SLOT, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public SlotTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slotTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlotTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlotTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlotTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlotTailContext slotTail() throws RecognitionException {
		SlotTailContext _localctx = new SlotTailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_slotTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BCB_SLOT) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecContext extends ParserRuleContext {
		public SpecHeadContext specHead() {
			return getRuleContext(SpecHeadContext.class,0);
		}
		public SpslBodyContext spslBody() {
			return getRuleContext(SpslBodyContext.class,0);
		}
		public SpecTailContext specTail() {
			return getRuleContext(SpecTailContext.class,0);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			specHead();
			setState(150);
			spslBody();
			setState(151);
			specTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecHeadContext extends ParserRuleContext {
		public TerminalNode BOB_SPEC() { return getToken(SlimeParser.BOB_SPEC, 0); }
		public TerminalNode OLB_SPEC() { return getToken(SlimeParser.OLB_SPEC, 0); }
		public TerminalNode COB_SPEC() { return getToken(SlimeParser.COB_SPEC, 0); }
		public SpecHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpecHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpecHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpecHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecHeadContext specHead() throws RecognitionException {
		SpecHeadContext _localctx = new SpecHeadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_specHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_SPEC) | (1L << OLB_SPEC) | (1L << COB_SPEC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecTailContext extends ParserRuleContext {
		public TerminalNode BCB_SPEC() { return getToken(SlimeParser.BCB_SPEC, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public SpecTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpecTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpecTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpecTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecTailContext specTail() throws RecognitionException {
		SpecTailContext _localctx = new SpecTailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BCB_SPEC) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpslBodyContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SlimeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SlimeParser.NAME, i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public SpslBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spslBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpslBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpslBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpslBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpslBodyContext spslBody() throws RecognitionException {
		SpslBodyContext _localctx = new SpslBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_spslBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NAME);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SC) {
				{
				{
				setState(158);
				match(SC);
				setState(159);
				match(NAME);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempContext extends ParserRuleContext {
		public TempHeadContext tempHead() {
			return getRuleContext(TempHeadContext.class,0);
		}
		public TempBodyContext tempBody() {
			return getRuleContext(TempBodyContext.class,0);
		}
		public TempTailContext tempTail() {
			return getRuleContext(TempTailContext.class,0);
		}
		public TempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempContext temp() throws RecognitionException {
		TempContext _localctx = new TempContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_temp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			tempHead();
			setState(166);
			tempBody();
			setState(167);
			tempTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempHeadContext extends ParserRuleContext {
		public TerminalNode BOB_TEMP() { return getToken(SlimeParser.BOB_TEMP, 0); }
		public TerminalNode OLB_TEMP() { return getToken(SlimeParser.OLB_TEMP, 0); }
		public TerminalNode COB_TEMP() { return getToken(SlimeParser.COB_TEMP, 0); }
		public TempHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempHeadContext tempHead() throws RecognitionException {
		TempHeadContext _localctx = new TempHeadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tempHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_TEMP) | (1L << OLB_TEMP) | (1L << COB_TEMP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempBodyContext extends ParserRuleContext {
		public List<TempBodyPartContext> tempBodyPart() {
			return getRuleContexts(TempBodyPartContext.class);
		}
		public TempBodyPartContext tempBodyPart(int i) {
			return getRuleContext(TempBodyPartContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public TempBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempBodyContext tempBody() throws RecognitionException {
		TempBodyContext _localctx = new TempBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tempBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					tempBodyPart();
					setState(172);
					match(SC);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(179);
			tempBodyPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempBodyPartContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<SlotContext> slot() {
			return getRuleContexts(SlotContext.class);
		}
		public SlotContext slot(int i) {
			return getRuleContext(SlotContext.class,i);
		}
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public List<TempTextContext> tempText() {
			return getRuleContexts(TempTextContext.class);
		}
		public TempTextContext tempText(int i) {
			return getRuleContext(TempTextContext.class,i);
		}
		public TempBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempBodyPartContext tempBodyPart() throws RecognitionException {
		TempBodyPartContext _localctx = new TempBodyPartContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tempBodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_SLOT) | (1L << BOB_SPEC) | (1L << BOB_TEXT) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_TEXT) | (1L << COB_SLOT) | (1L << COB_SPEC) | (1L << COB_TEXT))) != 0) || _la==TEXT_LINE) {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOB_TEXT:
				case OLB_TEXT:
				case COB_TEXT:
					{
					setState(181);
					text();
					}
					break;
				case BOB_SLOT:
				case OLB_SLOT:
				case COB_SLOT:
					{
					setState(182);
					slot();
					}
					break;
				case BOB_SPEC:
				case OLB_SPEC:
				case COB_SPEC:
					{
					setState(183);
					spec();
					}
					break;
				case TEXT_LINE:
					{
					setState(184);
					tempText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempTailContext extends ParserRuleContext {
		public TerminalNode BCB_TEMP() { return getToken(SlimeParser.BCB_TEMP, 0); }
		public TerminalNode NL_TEMP() { return getToken(SlimeParser.NL_TEMP, 0); }
		public TerminalNode NW_TEMP() { return getToken(SlimeParser.NW_TEMP, 0); }
		public TempTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempTailContext tempTail() throws RecognitionException {
		TempTailContext _localctx = new TempTailContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tempTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BCB_TEMP - 74)) | (1L << (NL_TEMP - 74)) | (1L << (NW_TEMP - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_LINE() { return getTokens(SlimeParser.TEXT_LINE); }
		public TerminalNode TEXT_LINE(int i) {
			return getToken(SlimeParser.TEXT_LINE, i);
		}
		public TempTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTempText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTempText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTempText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempTextContext tempText() throws RecognitionException {
		TempTextContext _localctx = new TempTextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tempText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192);
					match(TEXT_LINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExteContext extends ParserRuleContext {
		public ExteHeadContext exteHead() {
			return getRuleContext(ExteHeadContext.class,0);
		}
		public ExteBodyContext exteBody() {
			return getRuleContext(ExteBodyContext.class,0);
		}
		public ExteTailContext exteTail() {
			return getRuleContext(ExteTailContext.class,0);
		}
		public ExteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExteContext exte() throws RecognitionException {
		ExteContext _localctx = new ExteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			exteHead();
			setState(198);
			exteBody();
			setState(199);
			exteTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExteHeadContext extends ParserRuleContext {
		public TerminalNode BOB_EXTE() { return getToken(SlimeParser.BOB_EXTE, 0); }
		public TerminalNode OLB_EXTE() { return getToken(SlimeParser.OLB_EXTE, 0); }
		public TerminalNode COB_EXTE() { return getToken(SlimeParser.COB_EXTE, 0); }
		public ExteHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exteHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExteHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExteHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExteHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExteHeadContext exteHead() throws RecognitionException {
		ExteHeadContext _localctx = new ExteHeadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exteHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_EXTE) | (1L << OLB_EXTE) | (1L << COB_EXTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExteBodyContext extends ParserRuleContext {
		public List<ExteBodyPartContext> exteBodyPart() {
			return getRuleContexts(ExteBodyPartContext.class);
		}
		public ExteBodyPartContext exteBodyPart(int i) {
			return getRuleContext(ExteBodyPartContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public ExteBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exteBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExteBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExteBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExteBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExteBodyContext exteBody() throws RecognitionException {
		ExteBodyContext _localctx = new ExteBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exteBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					exteBodyPart();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SC) {
						{
						setState(204);
						match(SC);
						}
					}

					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(212);
			exteBodyPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExteBodyPartContext extends ParserRuleContext {
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public TerminalNode CL() { return getToken(SlimeParser.CL, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public ExteBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exteBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExteBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExteBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExteBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExteBodyPartContext exteBodyPart() throws RecognitionException {
		ExteBodyPartContext _localctx = new ExteBodyPartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exteBodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			vari();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL) {
				{
				setState(215);
				match(CL);
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOB_TEMP:
				case OLB_TEMP:
				case COB_TEMP:
					{
					setState(216);
					temp();
					}
					break;
				case BOB_SPEC:
				case OLB_SPEC:
				case COB_SPEC:
					{
					setState(217);
					spec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExteTailContext extends ParserRuleContext {
		public TerminalNode BCB_EXTE() { return getToken(SlimeParser.BCB_EXTE, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public ExteTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exteTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExteTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExteTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExteTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExteTailContext exteTail() throws RecognitionException {
		ExteTailContext _localctx = new ExteTailContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exteTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (BCB_EXTE - 52)) | (1L << (NL_OPER - 52)) | (1L << (NW_OPER - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public PlusHeadContext plusHead() {
			return getRuleContext(PlusHeadContext.class,0);
		}
		public PlusBodyContext plusBody() {
			return getRuleContext(PlusBodyContext.class,0);
		}
		public PlusTailContext plusTail() {
			return getRuleContext(PlusTailContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			plusHead();
			setState(225);
			plusBody();
			setState(226);
			plusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusHeadContext extends ParserRuleContext {
		public TerminalNode BOB_PLUS() { return getToken(SlimeParser.BOB_PLUS, 0); }
		public TerminalNode OLB_PLUS() { return getToken(SlimeParser.OLB_PLUS, 0); }
		public TerminalNode COB_PLUS() { return getToken(SlimeParser.COB_PLUS, 0); }
		public PlusHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusHeadContext plusHead() throws RecognitionException {
		PlusHeadContext _localctx = new PlusHeadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_plusHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_PLUS) | (1L << OLB_PLUS) | (1L << COB_PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusBodyContext extends ParserRuleContext {
		public List<PlusBodyPartContext> plusBodyPart() {
			return getRuleContexts(PlusBodyPartContext.class);
		}
		public PlusBodyPartContext plusBodyPart(int i) {
			return getRuleContext(PlusBodyPartContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public PlusBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusBodyContext plusBody() throws RecognitionException {
		PlusBodyContext _localctx = new PlusBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_plusBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					plusBodyPart();
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SC) {
						{
						setState(231);
						match(SC);
						}
					}

					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(239);
			plusBodyPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusBodyPartContext extends ParserRuleContext {
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
		}
		public TerminalNode PLOP() { return getToken(SlimeParser.PLOP, 0); }
		public TerminalNode CL() { return getToken(SlimeParser.CL, 0); }
		public List<PlusElementContext> plusElement() {
			return getRuleContexts(PlusElementContext.class);
		}
		public PlusElementContext plusElement(int i) {
			return getRuleContext(PlusElementContext.class,i);
		}
		public List<TerminalNode> CO() { return getTokens(SlimeParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(SlimeParser.CO, i);
		}
		public PlusBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusBodyPartContext plusBodyPart() throws RecognitionException {
		PlusBodyPartContext _localctx = new PlusBodyPartContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_plusBodyPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			vari();
			setState(242);
			match(PLOP);
			setState(243);
			vari();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CL) {
				{
				setState(244);
				match(CL);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						plusElement();
						setState(246);
						match(CO);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(253);
				plusElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusElementContext extends ParserRuleContext {
		public List<VariPathContext> variPath() {
			return getRuleContexts(VariPathContext.class);
		}
		public VariPathContext variPath(int i) {
			return getRuleContext(VariPathContext.class,i);
		}
		public TerminalNode PLOP() { return getToken(SlimeParser.PLOP, 0); }
		public PlusElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusElementContext plusElement() throws RecognitionException {
		PlusElementContext _localctx = new PlusElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_plusElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			variPath();
			setState(257);
			match(PLOP);
			setState(258);
			variPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusTailContext extends ParserRuleContext {
		public TerminalNode BCB_PLUS() { return getToken(SlimeParser.BCB_PLUS, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public PlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusTailContext plusTail() throws RecognitionException {
		PlusTailContext _localctx = new PlusTailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_plusTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (BCB_PLUS - 53)) | (1L << (NL_OPER - 53)) | (1L << (NW_OPER - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleContext extends ParserRuleContext {
		public DeleHeadContext deleHead() {
			return getRuleContext(DeleHeadContext.class,0);
		}
		public DeleBodyContext deleBody() {
			return getRuleContext(DeleBodyContext.class,0);
		}
		public DeleTailContext deleTail() {
			return getRuleContext(DeleTailContext.class,0);
		}
		public DeleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dele; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDele(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDele(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDele(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleContext dele() throws RecognitionException {
		DeleContext _localctx = new DeleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dele);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			deleHead();
			setState(263);
			deleBody();
			setState(264);
			deleTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleHeadContext extends ParserRuleContext {
		public TerminalNode BOB_DELE() { return getToken(SlimeParser.BOB_DELE, 0); }
		public TerminalNode OLB_DELE() { return getToken(SlimeParser.OLB_DELE, 0); }
		public TerminalNode COB_DELE() { return getToken(SlimeParser.COB_DELE, 0); }
		public DeleHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleHeadContext deleHead() throws RecognitionException {
		DeleHeadContext _localctx = new DeleHeadContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_deleHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_DELE) | (1L << OLB_DELE) | (1L << COB_DELE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleBodyContext extends ParserRuleContext {
		public List<VariPathContext> variPath() {
			return getRuleContexts(VariPathContext.class);
		}
		public VariPathContext variPath(int i) {
			return getRuleContext(VariPathContext.class,i);
		}
		public List<RefeContext> refe() {
			return getRuleContexts(RefeContext.class);
		}
		public RefeContext refe(int i) {
			return getRuleContext(RefeContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public DeleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleBodyContext deleBody() throws RecognitionException {
		DeleBodyContext _localctx = new DeleBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_deleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME:
					case INTE:
						{
						setState(268);
						variPath();
						}
						break;
					case BOB_REFE:
					case OLB_REFE:
					case COB_REFE:
						{
						setState(269);
						refe();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SC) {
						{
						setState(272);
						match(SC);
						}
					}

					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case INTE:
				{
				setState(280);
				variPath();
				}
				break;
			case BOB_REFE:
			case OLB_REFE:
			case COB_REFE:
				{
				setState(281);
				refe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleTailContext extends ParserRuleContext {
		public TerminalNode BCB_DELE() { return getToken(SlimeParser.BCB_DELE, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public DeleTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeleTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeleTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeleTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleTailContext deleTail() throws RecognitionException {
		DeleTailContext _localctx = new DeleTailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deleTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (BCB_DELE - 55)) | (1L << (NL_OPER - 55)) | (1L << (NW_OPER - 55)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclHeadContext declHead() {
			return getRuleContext(DeclHeadContext.class,0);
		}
		public DeclBodyContext declBody() {
			return getRuleContext(DeclBodyContext.class,0);
		}
		public DeclTailContext declTail() {
			return getRuleContext(DeclTailContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			declHead();
			setState(287);
			declBody();
			setState(288);
			declTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclHeadContext extends ParserRuleContext {
		public TerminalNode BOB_DECL() { return getToken(SlimeParser.BOB_DECL, 0); }
		public TerminalNode OLB_DECL() { return getToken(SlimeParser.OLB_DECL, 0); }
		public TerminalNode COB_DECL() { return getToken(SlimeParser.COB_DECL, 0); }
		public DeclHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclHeadContext declHead() throws RecognitionException {
		DeclHeadContext _localctx = new DeclHeadContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOB_DECL) | (1L << OLB_DECL) | (1L << COB_DECL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclNeckContext extends ParserRuleContext {
		public TerminalNode CL() { return getToken(SlimeParser.CL, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode EQOP() { return getToken(SlimeParser.EQOP, 0); }
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public DeclNeckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declNeck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclNeck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclNeck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclNeck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclNeckContext declNeck() throws RecognitionException {
		DeclNeckContext _localctx = new DeclNeckContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declNeck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(292);
				listName();
				}
			}

			setState(295);
			match(CL);
			setState(296);
			typeName();
			setState(297);
			match(EQOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclBodyContext extends ParserRuleContext {
		public List<DeclBodyPartContext> declBodyPart() {
			return getRuleContexts(DeclBodyPartContext.class);
		}
		public DeclBodyPartContext declBodyPart(int i) {
			return getRuleContext(DeclBodyPartContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(SlimeParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(SlimeParser.SC, i);
		}
		public DeclBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclBodyContext declBody() throws RecognitionException {
		DeclBodyContext _localctx = new DeclBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					declBodyPart();
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SC) {
						{
						setState(300);
						match(SC);
						}
					}

					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(308);
			declBodyPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclBodyPartContext extends ParserRuleContext {
		public DeclNeckContext declNeck() {
			return getRuleContext(DeclNeckContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public ListVariContext listVari() {
			return getRuleContext(ListVariContext.class,0);
		}
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public List<TerminalNode> CO() { return getTokens(SlimeParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(SlimeParser.CO, i);
		}
		public DeclBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclBodyPartContext declBodyPart() throws RecognitionException {
		DeclBodyPartContext _localctx = new DeclBodyPartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declBodyPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			declNeck();
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(311);
				listName();
				}
				break;
			case 2:
				{
				setState(312);
				listVari();
				}
				break;
			case 3:
				{
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						nameType();
						setState(314);
						match(CO);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(321);
				nameType();
				}
				break;
			case 4:
				{
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						nameValue();
						setState(323);
						match(CO);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(330);
				nameValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTailContext extends ParserRuleContext {
		public TerminalNode BCB_DECL() { return getToken(SlimeParser.BCB_DECL, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public DeclTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDeclTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDeclTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDeclTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTailContext declTail() throws RecognitionException {
		DeclTailContext _localctx = new DeclTailContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (BCB_DECL - 54)) | (1L << (NL_OPER - 54)) | (1L << (NW_OPER - 54)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public TerminalNode EQOP() { return getToken(SlimeParser.EQOP, 0); }
		public ListVariContext listVari() {
			return getRuleContext(ListVariContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			listName();
			setState(336);
			match(EQOP);
			setState(337);
			listVari();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameTypeContext extends ParserRuleContext {
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public TerminalNode CL() { return getToken(SlimeParser.CL, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterNameType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitNameType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitNameType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTypeContext nameType() throws RecognitionException {
		NameTypeContext _localctx = new NameTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nameType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(339);
			listName();
			setState(340);
			match(CL);
			setState(341);
			typeName();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListVariContext extends ParserRuleContext {
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
		}
		public List<TerminalNode> CO() { return getTokens(SlimeParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(SlimeParser.CO, i);
		}
		public ListVariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterListVari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitListVari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitListVari(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVariContext listVari() throws RecognitionException {
		ListVariContext _localctx = new ListVariContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_listVari);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					vari();
					setState(344);
					match(CO);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(351);
			vari();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariContext extends ParserRuleContext {
		public VariPathContext variPath() {
			return getRuleContext(VariPathContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public SlotContext slot() {
			return getRuleContext(SlotContext.class,0);
		}
		public RefeContext refe() {
			return getRuleContext(RefeContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ExteContext exte() {
			return getRuleContext(ExteContext.class,0);
		}
		public VariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVari(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariContext vari() throws RecognitionException {
		VariContext _localctx = new VariContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vari);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case INTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				variPath();
				}
				break;
			case BOB_DECL:
			case OLB_DECL:
			case COB_DECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				decl();
				}
				break;
			case BOB_TEMP:
			case OLB_TEMP:
			case COB_TEMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				temp();
				}
				break;
			case BOB_SPEC:
			case OLB_SPEC:
			case COB_SPEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				spec();
				}
				break;
			case BOB_SLOT:
			case OLB_SLOT:
			case COB_SLOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				slot();
				}
				break;
			case BOB_REFE:
			case OLB_REFE:
			case COB_REFE:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				refe();
				}
				break;
			case BOB_PLUS:
			case OLB_PLUS:
			case COB_PLUS:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
				plus();
				}
				break;
			case BOB_TEXT:
			case OLB_TEXT:
			case COB_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				text();
				}
				break;
			case BOB_EXTE:
			case OLB_EXTE:
			case COB_EXTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(361);
				exte();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariPathContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SlimeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SlimeParser.NAME, i);
		}
		public List<TerminalNode> INTE() { return getTokens(SlimeParser.INTE); }
		public TerminalNode INTE(int i) {
			return getToken(SlimeParser.INTE, i);
		}
		public List<TerminalNode> PE() { return getTokens(SlimeParser.PE); }
		public TerminalNode PE(int i) {
			return getToken(SlimeParser.PE, i);
		}
		public VariPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVariPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVariPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVariPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariPathContext variPath() throws RecognitionException {
		VariPathContext _localctx = new VariPathContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variPath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					_la = _input.LA(1);
					if ( !(_la==NAME || _la==INTE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(365);
					match(PE);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==INTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SlimeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SlimeParser.NAME, i);
		}
		public List<TerminalNode> CO() { return getTokens(SlimeParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(SlimeParser.CO, i);
		}
		public ListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitListName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitListName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListNameContext listName() throws RecognitionException {
		ListNameContext _localctx = new ListNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_listName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					match(NAME);
					setState(374);
					match(CO);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(380);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SlimeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SlimeParser.NAME, i);
		}
		public List<TerminalNode> LS() { return getTokens(SlimeParser.LS); }
		public TerminalNode LS(int i) {
			return getToken(SlimeParser.LS, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					match(NAME);
					setState(383);
					match(LS);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(389);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextOutorContext extends ParserRuleContext {
		public TerminalNode TEXT_OUTOR() { return getToken(SlimeParser.TEXT_OUTOR, 0); }
		public TextOutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textOutor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTextOutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTextOutor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTextOutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextOutorContext textOutor() throws RecognitionException {
		TextOutorContext _localctx = new TextOutorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_textOutor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(TEXT_OUTOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2u\n\2\f\2\16\2"+
		"x\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u00a3\n\21\f\21\16"+
		"\21\u00a6\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00b1"+
		"\n\24\f\24\16\24\u00b4\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00bc"+
		"\n\25\f\25\16\25\u00bf\13\25\3\26\3\26\3\27\6\27\u00c4\n\27\r\27\16\27"+
		"\u00c5\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00d0\n\32\7\32\u00d2"+
		"\n\32\f\32\16\32\u00d5\13\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00dd"+
		"\n\33\5\33\u00df\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\5\37\u00eb\n\37\7\37\u00ed\n\37\f\37\16\37\u00f0\13\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \7 \u00fb\n \f \16 \u00fe\13 \3 \5 \u0101\n \3!\3!\3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\5%\u0111\n%\3%\5%\u0114\n%\7%\u0116"+
		"\n%\f%\16%\u0119\13%\3%\3%\5%\u011d\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)"+
		"\5)\u0128\n)\3)\3)\3)\3)\3*\3*\5*\u0130\n*\7*\u0132\n*\f*\16*\u0135\13"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u013f\n+\f+\16+\u0142\13+\3+\3+\3+\3+\7+"+
		"\u0148\n+\f+\16+\u014b\13+\3+\5+\u014e\n+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\7/\u015d\n/\f/\16/\u0160\13/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u016d\n\60\3\61\3\61\7\61\u0171\n\61\f\61\16"+
		"\61\u0174\13\61\3\61\3\61\3\62\3\62\7\62\u017a\n\62\f\62\16\62\u017d\13"+
		"\62\3\62\3\62\3\63\3\63\7\63\u0183\n\63\f\63\16\63\u0186\13\63\3\63\3"+
		"\63\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\25\5\2\f\f\25\25\36\36\4\2"+
		"HHJK\5\2\7\7\20\20\31\31\5\2,,\61\61\63\63\5\2\5\5\16\16\27\27\5\2##\'"+
		"\'))\5\2\6\6\17\17\30\30\5\2$$\'\'))\5\2\r\r\26\26\37\37\4\2LLOP\5\2\b"+
		"\b\21\21\32\32\5\2\66\66EEGG\5\2\t\t\22\22\33\33\5\2\67\67EEGG\5\2\13"+
		"\13\24\24\35\35\5\299EEGG\5\2\n\n\23\23\34\34\5\288EEGG\3\2AB\2\u018b"+
		"\2v\3\2\2\2\4y\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3"+
		"\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u009b\3\2"+
		"\2\2\36\u009d\3\2\2\2 \u009f\3\2\2\2\"\u00a7\3\2\2\2$\u00ab\3\2\2\2&\u00b2"+
		"\3\2\2\2(\u00bd\3\2\2\2*\u00c0\3\2\2\2,\u00c3\3\2\2\2.\u00c7\3\2\2\2\60"+
		"\u00cb\3\2\2\2\62\u00d3\3\2\2\2\64\u00d8\3\2\2\2\66\u00e0\3\2\2\28\u00e2"+
		"\3\2\2\2:\u00e6\3\2\2\2<\u00ee\3\2\2\2>\u00f3\3\2\2\2@\u0102\3\2\2\2B"+
		"\u0106\3\2\2\2D\u0108\3\2\2\2F\u010c\3\2\2\2H\u0117\3\2\2\2J\u011e\3\2"+
		"\2\2L\u0120\3\2\2\2N\u0124\3\2\2\2P\u0127\3\2\2\2R\u0133\3\2\2\2T\u0138"+
		"\3\2\2\2V\u014f\3\2\2\2X\u0151\3\2\2\2Z\u0155\3\2\2\2\\\u015e\3\2\2\2"+
		"^\u016c\3\2\2\2`\u0172\3\2\2\2b\u017b\3\2\2\2d\u0184\3\2\2\2f\u0189\3"+
		"\2\2\2hu\5\4\3\2iu\5\f\7\2ju\5\24\13\2ku\5\32\16\2lu\5\"\22\2mu\5D#\2"+
		"nu\5.\30\2ou\58\35\2pu\5L\'\2qu\5D#\2ru\5\f\7\2su\5f\64\2th\3\2\2\2ti"+
		"\3\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2t"+
		"p\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\3\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\5\b\5\2{|\5\n\6\2|\5\3\2\2\2}~\t\2\2"+
		"\2~\7\3\2\2\2\177\u0080\7I\2\2\u0080\t\3\2\2\2\u0081\u0082\t\3\2\2\u0082"+
		"\13\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085\5\20\t\2\u0085\u0086\5\22"+
		"\n\2\u0086\r\3\2\2\2\u0087\u0088\t\4\2\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\5d\63\2\u008a\u008b\7-\2\2\u008b\u008c\7.\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\t\5\2\2\u008e\23\3\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\5 \21"+
		"\2\u0091\u0092\5\30\r\2\u0092\25\3\2\2\2\u0093\u0094\t\6\2\2\u0094\27"+
		"\3\2\2\2\u0095\u0096\t\7\2\2\u0096\31\3\2\2\2\u0097\u0098\5\34\17\2\u0098"+
		"\u0099\5 \21\2\u0099\u009a\5\36\20\2\u009a\33\3\2\2\2\u009b\u009c\t\b"+
		"\2\2\u009c\35\3\2\2\2\u009d\u009e\t\t\2\2\u009e\37\3\2\2\2\u009f\u00a4"+
		"\7A\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a3\7A\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5!\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\5&\24\2\u00a9\u00aa"+
		"\5*\26\2\u00aa#\3\2\2\2\u00ab\u00ac\t\n\2\2\u00ac%\3\2\2\2\u00ad\u00ae"+
		"\5(\25\2\u00ae\u00af\7@\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5(\25\2\u00b6\'\3\2\2\2\u00b7\u00bc"+
		"\5\4\3\2\u00b8\u00bc\5\24\13\2\u00b9\u00bc\5\32\16\2\u00ba\u00bc\5,\27"+
		"\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		")\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\t\13\2\2\u00c1+\3\2\2\2\u00c2"+
		"\u00c4\7N\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6-\3\2\2\2\u00c7\u00c8\5\60\31\2\u00c8\u00c9"+
		"\5\62\32\2\u00c9\u00ca\5\66\34\2\u00ca/\3\2\2\2\u00cb\u00cc\t\f\2\2\u00cc"+
		"\61\3\2\2\2\u00cd\u00cf\5\64\33\2\u00ce\u00d0\7@\2\2\u00cf\u00ce\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\5\64\33\2\u00d7\63\3\2\2\2\u00d8\u00de\5^\60"+
		"\2\u00d9\u00dc\7>\2\2\u00da\u00dd\5\"\22\2\u00db\u00dd\5\32\16\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d9\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\65\3\2\2\2\u00e0\u00e1\t\r\2\2\u00e1\67"+
		"\3\2\2\2\u00e2\u00e3\5:\36\2\u00e3\u00e4\5<\37\2\u00e4\u00e5\5B\"\2\u00e5"+
		"9\3\2\2\2\u00e6\u00e7\t\16\2\2\u00e7;\3\2\2\2\u00e8\u00ea\5> \2\u00e9"+
		"\u00eb\7@\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5>"+
		" \2\u00f2=\3\2\2\2\u00f3\u00f4\5^\60\2\u00f4\u00f5\7;\2\2\u00f5\u0100"+
		"\5^\60\2\u00f6\u00fc\7>\2\2\u00f7\u00f8\5@!\2\u00f8\u00f9\7=\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0101\5@!\2\u0100\u00f6\3\2\2\2\u0100\u0101\3\2\2\2\u0101?\3\2\2\2\u0102"+
		"\u0103\5`\61\2\u0103\u0104\7;\2\2\u0104\u0105\5`\61\2\u0105A\3\2\2\2\u0106"+
		"\u0107\t\17\2\2\u0107C\3\2\2\2\u0108\u0109\5F$\2\u0109\u010a\5H%\2\u010a"+
		"\u010b\5J&\2\u010bE\3\2\2\2\u010c\u010d\t\20\2\2\u010dG\3\2\2\2\u010e"+
		"\u0111\5`\61\2\u010f\u0111\5\f\7\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0114\7@\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0116\u0119\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\5`\61\2\u011b\u011d\5\f\7\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011dI\3\2\2\2\u011e\u011f\t\21\2\2\u011fK\3"+
		"\2\2\2\u0120\u0121\5N(\2\u0121\u0122\5R*\2\u0122\u0123\5V,\2\u0123M\3"+
		"\2\2\2\u0124\u0125\t\22\2\2\u0125O\3\2\2\2\u0126\u0128\5b\62\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7>\2\2\u012a"+
		"\u012b\5d\63\2\u012b\u012c\7:\2\2\u012cQ\3\2\2\2\u012d\u012f\5T+\2\u012e"+
		"\u0130\7@\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5T"+
		"+\2\u0137S\3\2\2\2\u0138\u014d\5P)\2\u0139\u014e\5b\62\2\u013a\u014e\5"+
		"\\/\2\u013b\u013c\5Z.\2\u013c\u013d\7=\2\2\u013d\u013f\3\2\2\2\u013e\u013b"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u014e\5Z.\2\u0144\u0145\5X-\2"+
		"\u0145\u0146\7=\2\2\u0146\u0148\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014e\5X-\2\u014d\u0139\3\2\2\2\u014d\u013a\3\2\2"+
		"\2\u014d\u0140\3\2\2\2\u014d\u0149\3\2\2\2\u014eU\3\2\2\2\u014f\u0150"+
		"\t\23\2\2\u0150W\3\2\2\2\u0151\u0152\5b\62\2\u0152\u0153\7:\2\2\u0153"+
		"\u0154\5\\/\2\u0154Y\3\2\2\2\u0155\u0156\5b\62\2\u0156\u0157\7>\2\2\u0157"+
		"\u0158\5d\63\2\u0158[\3\2\2\2\u0159\u015a\5^\60\2\u015a\u015b\7=\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\5^\60\2\u0162]\3\2\2\2\u0163\u016d\5`\61\2\u0164\u016d\5L\'\2\u0165"+
		"\u016d\5\"\22\2\u0166\u016d\5\32\16\2\u0167\u016d\5\24\13\2\u0168\u016d"+
		"\5\f\7\2\u0169\u016d\58\35\2\u016a\u016d\5\4\3\2\u016b\u016d\5.\30\2\u016c"+
		"\u0163\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u0166\3\2"+
		"\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d_\3\2\2\2\u016e\u016f\t\24\2\2"+
		"\u016f\u0171\7<\2\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\t\24\2\2\u0176a\3\2\2\2\u0177\u0178\7A\2\2\u0178\u017a\7=\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7A\2\2\u017f"+
		"c\3\2\2\2\u0180\u0181\7A\2\2\u0181\u0183\7?\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7A\2\2\u0188e\3\2\2\2\u0189\u018a"+
		"\7 \2\2\u018ag\3\2\2\2 tv\u00a4\u00b2\u00bb\u00bd\u00c5\u00cf\u00d3\u00dc"+
		"\u00de\u00ea\u00ee\u00fc\u0100\u0110\u0113\u0117\u011c\u0127\u012f\u0133"+
		"\u0140\u0149\u014d\u015e\u016c\u0172\u017b\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
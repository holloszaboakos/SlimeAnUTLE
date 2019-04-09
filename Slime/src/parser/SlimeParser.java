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
		RULE_DIV=1, COMM_OUTER=2, OB_SLOT=3, OB_SPEC=4, OB_REFE=5, OB_EXPA=6, 
		OB_PLUS=7, OB_DECL=8, OB_DELE=9, OB_TEXT=10, OB_TEMP=11, OLB_SLOT=12, 
		OLB_SPEC=13, OLB_REFE=14, OLB_EXPA=15, OLB_PLUS=16, OLB_DECL=17, OLB_DELE=18, 
		OLB_TEXT=19, OLB_TEMP=20, LB_SLOT=21, LB_SPEC=22, LB_REFE=23, LB_EXPA=24, 
		LB_PLUS=25, LB_DECL=26, LB_DELE=27, LB_TEXT=28, LB_TEMP=29, TEXT_OUTOR=30, 
		COMM_B_S=31, WS_B_S=32, CB_SLOT=33, CB_SPEC=34, NAME_B_S=35, SC_B_S=36, 
		COMM_O_S=37, WS_O_S=38, NL_SLSP=39, NAME_O_S=40, SC_O_S=41, COMM_L_S=42, 
		NW_SLSP=43, NAME_L_S=44, SC_L_S=45, COMM_REFE=46, WS_B_R=47, CB_REFE=48, 
		CL_B_R=49, NAME_B_R=50, IN_B_R=51, COMM_O_R=52, WS_O_R=53, NL_REFE=54, 
		CL_O_R=55, NAME_O_R=56, IN_O_R=57, COMM_L_R=58, WS_L_R=59, NW_REFE=60, 
		CL_L_R=61, NAME_L_R=62, IN_L_R=63, COMM_B_O=64, WS_B_O=65, CB_EXPA=66, 
		CB_PLUS=67, CB_DECL=68, CB_DELE=69, OB_SLOT_B_O=70, OB_SPEC_B_O=71, OB_REFE_B_O=72, 
		OB_EXPA_B_O=73, OB_PLUS_B_O=74, OB_DECL_B_O=75, OB_DELE_B_O=76, OB_TEXT_B_O=77, 
		OB_TEMP_B_O=78, OLB_SLOT_B_O=79, OLB_SPEC_B_O=80, OLB_REFE_B_O=81, OLB_EXPA_B_O=82, 
		OLB_PLUS_B_O=83, OLB_DECL_B_O=84, OLB_DELE_B_O=85, OLB_TEXT_B_O=86, OLB_TEMP_B_O=87, 
		LB_SLOT_B_O=88, LB_SPEC_B_O=89, LB_REFE_B_O=90, LB_EXPA_B_O=91, LB_PLUS_B_O=92, 
		LB_DECL_B_O=93, LB_DELE_B_O=94, LB_TEXT_B_O=95, LB_TEMP_B_O=96, OB_IMPORT=97, 
		EQOP_B_O=98, PLOP_B_O=99, PE_B_O=100, CL_B_O=101, CO_B_O=102, SC_B_O=103, 
		NAME_B_O=104, INTE_B_O=105, COMM_O_O=106, WS_O_O=107, NL_OPER=108, OB_SLOT_O_O=109, 
		OB_SPEC_O_O=110, OB_REFE_O_O=111, OB_EXPA_O_O=112, OB_PLUS_O_O=113, OB_DECL_O_O=114, 
		OB_DELE_O_O=115, OB_TEXT_O_O=116, OB_TEMP_O_O=117, OLB_SLOT_O_O=118, OLB_SPEC_O_O=119, 
		OLB_REFE_O_O=120, OLB_EXPA_O_O=121, OLB_PLUS_O_O=122, OLB_DECL_O_O=123, 
		OLB_DELE_O_O=124, OLB_TEXT_O_O=125, OLB_TEMP_O_O=126, LB_SLOT_O_O=127, 
		LB_SPEC_O_O=128, LB_REFE_O_O=129, LB_EXPA_O_O=130, LB_PLUS_O_O=131, LB_DECL_O_O=132, 
		LB_DELE_O_O=133, LB_TEXT_O_O=134, LB_TEMP_O_O=135, OL_IMPORT=136, EQOP_O_O=137, 
		PLOP_O_O=138, PE_O_O=139, CL_O_O=140, CO_O_O=141, SC_O_O=142, NAME_O_O=143, 
		INTE_O_O=144, COMM_L_O=145, WS_L_O=146, NW_OPER=147, OB_SLOT_L_O=148, 
		OB_SPEC_L_O=149, OB_REFE_L_O=150, OB_EXPA_L_O=151, OB_PLUS_L_O=152, OB_DECL_L_O=153, 
		OB_DELE_L_O=154, OB_TEXT_L_O=155, OB_TEMP_L_O=156, OLB_SLOT_L_O=157, OLB_SPEC_L_O=158, 
		OLB_REFE_L_O=159, OLB_EXPA_L_O=160, OLB_PLUS_L_O=161, OLB_DECL_L_O=162, 
		OLB_DELE_L_O=163, OLB_TEXT_L_O=164, OLB_TEMP_L_O=165, LB_SLOT_L_O=166, 
		LB_SPEC_L_O=167, LB_REFE_L_O=168, LB_EXPA_L_O=169, LB_PLUS_L_O=170, LB_DECL_L_O=171, 
		LB_DELE_L_O=172, LB_TEXT_L_O=173, LB_TEMP_L_O=174, L_IMPORT=175, EQOP_L_O=176, 
		PLOP_L_O=177, PE_L_O=178, CL_L_O=179, CO_L_O=180, SC_L_O=181, NAME_L_O=182, 
		INTE_L_O=183, CB_TEXT=184, IN_TEXT=185, NL_TEXT=186, IN_OL_TEXT=187, NW_TEXT=188, 
		IN_L_TEXT=189, CB_TEMP=190, TEXT_LINE=191, LINE_DIVIDER=192, OB_SLOT_B_T=193, 
		OB_SPEC_B_T=194, OB_TEXT_B_T=195, OLB_SLOT_B_T=196, OLB_SPEC_B_T=197, 
		OLB_TEXT_B_T=198, LB_SLOT_B_T=199, LB_SPEC_B_T=200, LB_TEXT_B_T=201, SC_B_T=202, 
		NL_TEMP=203, OL_TEXT_LINE=204, OB_SLOT_O_T=205, OB_SPEC_O_T=206, OB_TEXT_O_T=207, 
		OLB_SLOT_O_T=208, OLB_SPEC_O_T=209, OLB_TEXT_O_T=210, LB_SLOT_O_T=211, 
		LB_SPEC_O_T=212, LB_TEXT_O_T=213, SC_O_T=214, NW_TEMP=215, L_TEXT_LINE=216, 
		OB_SLOT_L_T=217, OB_SPEC_L_T=218, OB_TEXT_L_T=219, OLB_SLOT_L_T=220, OLB_SPEC_L_T=221, 
		OLB_TEXT_L_T=222, LB_SLOT_L_T=223, LB_SPEC_L_T=224, LB_TEXT_L_T=225, SC_L_T=226;
	public static final int
		RULE_file = 0, RULE_text = 1, RULE_textHead = 2, RULE_textBody = 3, RULE_textTail = 4, 
		RULE_refe = 5, RULE_refeHead = 6, RULE_refeBody = 7, RULE_refeTail = 8, 
		RULE_slot = 9, RULE_slotHead = 10, RULE_slotTail = 11, RULE_spec = 12, 
		RULE_specHead = 13, RULE_specTail = 14, RULE_spslBody = 15, RULE_temp = 16, 
		RULE_tempHead = 17, RULE_tempBody = 18, RULE_tempBodyPart = 19, RULE_tempTail = 20, 
		RULE_tempText = 21, RULE_expa = 22, RULE_expaHead = 23, RULE_expaBody = 24, 
		RULE_expaBodyPart = 25, RULE_expaTail = 26, RULE_plus = 27, RULE_plusHead = 28, 
		RULE_plusBody = 29, RULE_plusBodyPart = 30, RULE_plusElement = 31, RULE_plusTail = 32, 
		RULE_dele = 33, RULE_deleHead = 34, RULE_deleBody = 35, RULE_deleTail = 36, 
		RULE_decl = 37, RULE_declHead = 38, RULE_declNeck = 39, RULE_declBody = 40, 
		RULE_declBodyPart = 41, RULE_declTail = 42, RULE_nameValue = 43, RULE_nameType = 44, 
		RULE_vari = 45, RULE_listName = 46, RULE_variPath = 47, RULE_typeName = 48, 
		RULE_textOutor = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "text", "textHead", "textBody", "textTail", "refe", "refeHead", 
			"refeBody", "refeTail", "slot", "slotHead", "slotTail", "spec", "specHead", 
			"specTail", "spslBody", "temp", "tempHead", "tempBody", "tempBodyPart", 
			"tempTail", "tempText", "expa", "expaHead", "expaBody", "expaBodyPart", 
			"expaTail", "plus", "plusHead", "plusBody", "plusBodyPart", "plusElement", 
			"plusTail", "dele", "deleHead", "deleBody", "deleTail", "decl", "declHead", 
			"declNeck", "declBody", "declBodyPart", "declTail", "nameValue", "nameType", 
			"vari", "listName", "variPath", "typeName", "textOutor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'$}'", "'@}'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'&}'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*}'", "'+}'", "'=}'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'\"}'", null, null, null, null, 
			null, "'|}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RULE_DIV", "COMM_OUTER", "OB_SLOT", "OB_SPEC", "OB_REFE", "OB_EXPA", 
			"OB_PLUS", "OB_DECL", "OB_DELE", "OB_TEXT", "OB_TEMP", "OLB_SLOT", "OLB_SPEC", 
			"OLB_REFE", "OLB_EXPA", "OLB_PLUS", "OLB_DECL", "OLB_DELE", "OLB_TEXT", 
			"OLB_TEMP", "LB_SLOT", "LB_SPEC", "LB_REFE", "LB_EXPA", "LB_PLUS", "LB_DECL", 
			"LB_DELE", "LB_TEXT", "LB_TEMP", "TEXT_OUTOR", "COMM_B_S", "WS_B_S", 
			"CB_SLOT", "CB_SPEC", "NAME_B_S", "SC_B_S", "COMM_O_S", "WS_O_S", "NL_SLSP", 
			"NAME_O_S", "SC_O_S", "COMM_L_S", "NW_SLSP", "NAME_L_S", "SC_L_S", "COMM_REFE", 
			"WS_B_R", "CB_REFE", "CL_B_R", "NAME_B_R", "IN_B_R", "COMM_O_R", "WS_O_R", 
			"NL_REFE", "CL_O_R", "NAME_O_R", "IN_O_R", "COMM_L_R", "WS_L_R", "NW_REFE", 
			"CL_L_R", "NAME_L_R", "IN_L_R", "COMM_B_O", "WS_B_O", "CB_EXPA", "CB_PLUS", 
			"CB_DECL", "CB_DELE", "OB_SLOT_B_O", "OB_SPEC_B_O", "OB_REFE_B_O", "OB_EXPA_B_O", 
			"OB_PLUS_B_O", "OB_DECL_B_O", "OB_DELE_B_O", "OB_TEXT_B_O", "OB_TEMP_B_O", 
			"OLB_SLOT_B_O", "OLB_SPEC_B_O", "OLB_REFE_B_O", "OLB_EXPA_B_O", "OLB_PLUS_B_O", 
			"OLB_DECL_B_O", "OLB_DELE_B_O", "OLB_TEXT_B_O", "OLB_TEMP_B_O", "LB_SLOT_B_O", 
			"LB_SPEC_B_O", "LB_REFE_B_O", "LB_EXPA_B_O", "LB_PLUS_B_O", "LB_DECL_B_O", 
			"LB_DELE_B_O", "LB_TEXT_B_O", "LB_TEMP_B_O", "OB_IMPORT", "EQOP_B_O", 
			"PLOP_B_O", "PE_B_O", "CL_B_O", "CO_B_O", "SC_B_O", "NAME_B_O", "INTE_B_O", 
			"COMM_O_O", "WS_O_O", "NL_OPER", "OB_SLOT_O_O", "OB_SPEC_O_O", "OB_REFE_O_O", 
			"OB_EXPA_O_O", "OB_PLUS_O_O", "OB_DECL_O_O", "OB_DELE_O_O", "OB_TEXT_O_O", 
			"OB_TEMP_O_O", "OLB_SLOT_O_O", "OLB_SPEC_O_O", "OLB_REFE_O_O", "OLB_EXPA_O_O", 
			"OLB_PLUS_O_O", "OLB_DECL_O_O", "OLB_DELE_O_O", "OLB_TEXT_O_O", "OLB_TEMP_O_O", 
			"LB_SLOT_O_O", "LB_SPEC_O_O", "LB_REFE_O_O", "LB_EXPA_O_O", "LB_PLUS_O_O", 
			"LB_DECL_O_O", "LB_DELE_O_O", "LB_TEXT_O_O", "LB_TEMP_O_O", "OL_IMPORT", 
			"EQOP_O_O", "PLOP_O_O", "PE_O_O", "CL_O_O", "CO_O_O", "SC_O_O", "NAME_O_O", 
			"INTE_O_O", "COMM_L_O", "WS_L_O", "NW_OPER", "OB_SLOT_L_O", "OB_SPEC_L_O", 
			"OB_REFE_L_O", "OB_EXPA_L_O", "OB_PLUS_L_O", "OB_DECL_L_O", "OB_DELE_L_O", 
			"OB_TEXT_L_O", "OB_TEMP_L_O", "OLB_SLOT_L_O", "OLB_SPEC_L_O", "OLB_REFE_L_O", 
			"OLB_EXPA_L_O", "OLB_PLUS_L_O", "OLB_DECL_L_O", "OLB_DELE_L_O", "OLB_TEXT_L_O", 
			"OLB_TEMP_L_O", "LB_SLOT_L_O", "LB_SPEC_L_O", "LB_REFE_L_O", "LB_EXPA_L_O", 
			"LB_PLUS_L_O", "LB_DECL_L_O", "LB_DELE_L_O", "LB_TEXT_L_O", "LB_TEMP_L_O", 
			"L_IMPORT", "EQOP_L_O", "PLOP_L_O", "PE_L_O", "CL_L_O", "CO_L_O", "SC_L_O", 
			"NAME_L_O", "INTE_L_O", "CB_TEXT", "IN_TEXT", "NL_TEXT", "IN_OL_TEXT", 
			"NW_TEXT", "IN_L_TEXT", "CB_TEMP", "TEXT_LINE", "LINE_DIVIDER", "OB_SLOT_B_T", 
			"OB_SPEC_B_T", "OB_TEXT_B_T", "OLB_SLOT_B_T", "OLB_SPEC_B_T", "OLB_TEXT_B_T", 
			"LB_SLOT_B_T", "LB_SPEC_B_T", "LB_TEXT_B_T", "SC_B_T", "NL_TEMP", "OL_TEXT_LINE", 
			"OB_SLOT_O_T", "OB_SPEC_O_T", "OB_TEXT_O_T", "OLB_SLOT_O_T", "OLB_SPEC_O_T", 
			"OLB_TEXT_O_T", "LB_SLOT_O_T", "LB_SPEC_O_T", "LB_TEXT_O_T", "SC_O_T", 
			"NW_TEMP", "L_TEXT_LINE", "OB_SLOT_L_T", "OB_SPEC_L_T", "OB_TEXT_L_T", 
			"OLB_SLOT_L_T", "OLB_SPEC_L_T", "OLB_TEXT_L_T", "LB_SLOT_L_T", "LB_SPEC_L_T", 
			"LB_TEXT_L_T", "SC_L_T"
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
		public List<ExpaContext> expa() {
			return getRuleContexts(ExpaContext.class);
		}
		public ExpaContext expa(int i) {
			return getRuleContext(ExpaContext.class,i);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OB_SPEC) | (1L << OB_REFE) | (1L << OB_EXPA) | (1L << OB_PLUS) | (1L << OB_DECL) | (1L << OB_DELE) | (1L << OB_TEXT) | (1L << OB_TEMP) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_REFE) | (1L << OLB_EXPA) | (1L << OLB_PLUS) | (1L << OLB_DECL) | (1L << OLB_DELE) | (1L << OLB_TEXT) | (1L << OLB_TEMP) | (1L << LB_SLOT) | (1L << LB_SPEC) | (1L << LB_REFE) | (1L << LB_EXPA) | (1L << LB_PLUS) | (1L << LB_DECL) | (1L << LB_DELE) | (1L << LB_TEXT) | (1L << LB_TEMP) | (1L << TEXT_OUTOR))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OB_SPEC_B_O - 70)) | (1L << (OB_REFE_B_O - 70)) | (1L << (OB_EXPA_B_O - 70)) | (1L << (OB_PLUS_B_O - 70)) | (1L << (OB_DECL_B_O - 70)) | (1L << (OB_DELE_B_O - 70)) | (1L << (OB_TEXT_B_O - 70)) | (1L << (OB_TEMP_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (OLB_SPEC_B_O - 70)) | (1L << (OLB_REFE_B_O - 70)) | (1L << (OLB_EXPA_B_O - 70)) | (1L << (OLB_PLUS_B_O - 70)) | (1L << (OLB_DECL_B_O - 70)) | (1L << (OLB_DELE_B_O - 70)) | (1L << (OLB_TEXT_B_O - 70)) | (1L << (OLB_TEMP_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (LB_SPEC_B_O - 70)) | (1L << (LB_REFE_B_O - 70)) | (1L << (LB_EXPA_B_O - 70)) | (1L << (LB_PLUS_B_O - 70)) | (1L << (LB_DECL_B_O - 70)) | (1L << (LB_DELE_B_O - 70)) | (1L << (LB_TEXT_B_O - 70)) | (1L << (LB_TEMP_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OB_SPEC_O_O - 70)) | (1L << (OB_REFE_O_O - 70)) | (1L << (OB_EXPA_O_O - 70)) | (1L << (OB_PLUS_O_O - 70)) | (1L << (OB_DECL_O_O - 70)) | (1L << (OB_DELE_O_O - 70)) | (1L << (OB_TEXT_O_O - 70)) | (1L << (OB_TEMP_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (OLB_SPEC_O_O - 70)) | (1L << (OLB_REFE_O_O - 70)) | (1L << (OLB_EXPA_O_O - 70)) | (1L << (OLB_PLUS_O_O - 70)) | (1L << (OLB_DECL_O_O - 70)) | (1L << (OLB_DELE_O_O - 70)) | (1L << (OLB_TEXT_O_O - 70)) | (1L << (OLB_TEMP_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)) | (1L << (LB_SPEC_O_O - 70)) | (1L << (LB_REFE_O_O - 70)) | (1L << (LB_EXPA_O_O - 70)) | (1L << (LB_PLUS_O_O - 70)) | (1L << (LB_DECL_O_O - 70)) | (1L << (LB_DELE_O_O - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LB_TEXT_O_O - 134)) | (1L << (LB_TEMP_O_O - 134)) | (1L << (OB_SLOT_L_O - 134)) | (1L << (OB_SPEC_L_O - 134)) | (1L << (OB_REFE_L_O - 134)) | (1L << (OB_EXPA_L_O - 134)) | (1L << (OB_PLUS_L_O - 134)) | (1L << (OB_DECL_L_O - 134)) | (1L << (OB_DELE_L_O - 134)) | (1L << (OB_TEXT_L_O - 134)) | (1L << (OB_TEMP_L_O - 134)) | (1L << (OLB_SLOT_L_O - 134)) | (1L << (OLB_SPEC_L_O - 134)) | (1L << (OLB_REFE_L_O - 134)) | (1L << (OLB_EXPA_L_O - 134)) | (1L << (OLB_PLUS_L_O - 134)) | (1L << (OLB_DECL_L_O - 134)) | (1L << (OLB_DELE_L_O - 134)) | (1L << (OLB_TEXT_L_O - 134)) | (1L << (OLB_TEMP_L_O - 134)) | (1L << (LB_SLOT_L_O - 134)) | (1L << (LB_SPEC_L_O - 134)) | (1L << (LB_REFE_L_O - 134)) | (1L << (LB_EXPA_L_O - 134)) | (1L << (LB_PLUS_L_O - 134)) | (1L << (LB_DECL_L_O - 134)) | (1L << (LB_DELE_L_O - 134)) | (1L << (LB_TEXT_L_O - 134)) | (1L << (LB_TEMP_L_O - 134)) | (1L << (OB_SLOT_B_T - 134)) | (1L << (OB_SPEC_B_T - 134)) | (1L << (OB_TEXT_B_T - 134)) | (1L << (OLB_SLOT_B_T - 134)) | (1L << (OLB_SPEC_B_T - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (OLB_TEXT_B_T - 198)) | (1L << (LB_SLOT_B_T - 198)) | (1L << (LB_SPEC_B_T - 198)) | (1L << (LB_TEXT_B_T - 198)) | (1L << (OB_SLOT_O_T - 198)) | (1L << (OB_SPEC_O_T - 198)) | (1L << (OB_TEXT_O_T - 198)) | (1L << (OLB_SLOT_O_T - 198)) | (1L << (OLB_SPEC_O_T - 198)) | (1L << (OLB_TEXT_O_T - 198)) | (1L << (LB_SLOT_O_T - 198)) | (1L << (LB_SPEC_O_T - 198)) | (1L << (LB_TEXT_O_T - 198)) | (1L << (OB_SLOT_L_T - 198)) | (1L << (OB_SPEC_L_T - 198)) | (1L << (OB_TEXT_L_T - 198)) | (1L << (OLB_SLOT_L_T - 198)) | (1L << (OLB_SPEC_L_T - 198)) | (1L << (OLB_TEXT_L_T - 198)) | (1L << (LB_SLOT_L_T - 198)) | (1L << (LB_SPEC_L_T - 198)) | (1L << (LB_TEXT_L_T - 198)))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(100);
					text();
					}
					break;
				case 2:
					{
					setState(101);
					refe();
					}
					break;
				case 3:
					{
					setState(102);
					slot();
					}
					break;
				case 4:
					{
					setState(103);
					spec();
					}
					break;
				case 5:
					{
					setState(104);
					temp();
					}
					break;
				case 6:
					{
					setState(105);
					dele();
					}
					break;
				case 7:
					{
					setState(106);
					expa();
					}
					break;
				case 8:
					{
					setState(107);
					plus();
					}
					break;
				case 9:
					{
					setState(108);
					decl();
					}
					break;
				case 10:
					{
					setState(109);
					dele();
					}
					break;
				case 11:
					{
					setState(110);
					refe();
					}
					break;
				case 12:
					{
					setState(111);
					textOutor();
					}
					break;
				}
				}
				setState(116);
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
			setState(117);
			textHead();
			setState(118);
			textBody();
			setState(119);
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
		public TerminalNode OB_TEXT() { return getToken(SlimeParser.OB_TEXT, 0); }
		public TerminalNode OLB_TEXT() { return getToken(SlimeParser.OLB_TEXT, 0); }
		public TerminalNode LB_TEXT() { return getToken(SlimeParser.LB_TEXT, 0); }
		public TerminalNode OB_TEXT_B_O() { return getToken(SlimeParser.OB_TEXT_B_O, 0); }
		public TerminalNode OLB_TEXT_B_O() { return getToken(SlimeParser.OLB_TEXT_B_O, 0); }
		public TerminalNode LB_TEXT_B_O() { return getToken(SlimeParser.LB_TEXT_B_O, 0); }
		public TerminalNode OB_TEXT_O_O() { return getToken(SlimeParser.OB_TEXT_O_O, 0); }
		public TerminalNode OLB_TEXT_O_O() { return getToken(SlimeParser.OLB_TEXT_O_O, 0); }
		public TerminalNode LB_TEXT_O_O() { return getToken(SlimeParser.LB_TEXT_O_O, 0); }
		public TerminalNode OB_TEXT_L_O() { return getToken(SlimeParser.OB_TEXT_L_O, 0); }
		public TerminalNode OLB_TEXT_L_O() { return getToken(SlimeParser.OLB_TEXT_L_O, 0); }
		public TerminalNode LB_TEXT_L_O() { return getToken(SlimeParser.LB_TEXT_L_O, 0); }
		public TerminalNode OB_TEXT_B_T() { return getToken(SlimeParser.OB_TEXT_B_T, 0); }
		public TerminalNode OLB_TEXT_B_T() { return getToken(SlimeParser.OLB_TEXT_B_T, 0); }
		public TerminalNode LB_TEXT_B_T() { return getToken(SlimeParser.LB_TEXT_B_T, 0); }
		public TerminalNode OB_TEXT_O_T() { return getToken(SlimeParser.OB_TEXT_O_T, 0); }
		public TerminalNode OLB_TEXT_O_T() { return getToken(SlimeParser.OLB_TEXT_O_T, 0); }
		public TerminalNode LB_TEXT_O_T() { return getToken(SlimeParser.LB_TEXT_O_T, 0); }
		public TerminalNode OB_TEXT_L_T() { return getToken(SlimeParser.OB_TEXT_L_T, 0); }
		public TerminalNode OLB_TEXT_L_T() { return getToken(SlimeParser.OLB_TEXT_L_T, 0); }
		public TerminalNode LB_TEXT_L_T() { return getToken(SlimeParser.LB_TEXT_L_T, 0); }
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
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_TEXT) | (1L << OLB_TEXT) | (1L << LB_TEXT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (OB_TEXT_B_O - 77)) | (1L << (OLB_TEXT_B_O - 77)) | (1L << (LB_TEXT_B_O - 77)) | (1L << (OB_TEXT_O_O - 77)) | (1L << (OLB_TEXT_O_O - 77)) | (1L << (LB_TEXT_O_O - 77)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (OB_TEXT_L_O - 155)) | (1L << (OLB_TEXT_L_O - 155)) | (1L << (LB_TEXT_L_O - 155)) | (1L << (OB_TEXT_B_T - 155)) | (1L << (OLB_TEXT_B_T - 155)) | (1L << (LB_TEXT_B_T - 155)) | (1L << (OB_TEXT_O_T - 155)) | (1L << (OLB_TEXT_O_T - 155)) | (1L << (LB_TEXT_O_T - 155)))) != 0) || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (OB_TEXT_L_T - 219)) | (1L << (OLB_TEXT_L_T - 219)) | (1L << (LB_TEXT_L_T - 219)))) != 0)) ) {
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
		public TerminalNode IN_TEXT() { return getToken(SlimeParser.IN_TEXT, 0); }
		public TerminalNode IN_OL_TEXT() { return getToken(SlimeParser.IN_OL_TEXT, 0); }
		public TerminalNode IN_L_TEXT() { return getToken(SlimeParser.IN_L_TEXT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (IN_TEXT - 185)) | (1L << (IN_OL_TEXT - 185)) | (1L << (IN_L_TEXT - 185)))) != 0)) ) {
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

	public static class TextTailContext extends ParserRuleContext {
		public TerminalNode CB_TEXT() { return getToken(SlimeParser.CB_TEXT, 0); }
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
			setState(125);
			_la = _input.LA(1);
			if ( !(((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (CB_TEXT - 184)) | (1L << (NL_TEXT - 184)) | (1L << (NW_TEXT - 184)))) != 0)) ) {
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
			setState(127);
			refeHead();
			setState(128);
			refeBody();
			setState(129);
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
		public TerminalNode OB_REFE() { return getToken(SlimeParser.OB_REFE, 0); }
		public TerminalNode OLB_REFE() { return getToken(SlimeParser.OLB_REFE, 0); }
		public TerminalNode LB_REFE() { return getToken(SlimeParser.LB_REFE, 0); }
		public TerminalNode OB_REFE_B_O() { return getToken(SlimeParser.OB_REFE_B_O, 0); }
		public TerminalNode OLB_REFE_B_O() { return getToken(SlimeParser.OLB_REFE_B_O, 0); }
		public TerminalNode LB_REFE_B_O() { return getToken(SlimeParser.LB_REFE_B_O, 0); }
		public TerminalNode OB_REFE_O_O() { return getToken(SlimeParser.OB_REFE_O_O, 0); }
		public TerminalNode OLB_REFE_O_O() { return getToken(SlimeParser.OLB_REFE_O_O, 0); }
		public TerminalNode LB_REFE_O_O() { return getToken(SlimeParser.LB_REFE_O_O, 0); }
		public TerminalNode OB_REFE_L_O() { return getToken(SlimeParser.OB_REFE_L_O, 0); }
		public TerminalNode OLB_REFE_L_O() { return getToken(SlimeParser.OLB_REFE_L_O, 0); }
		public TerminalNode LB_REFE_L_O() { return getToken(SlimeParser.LB_REFE_L_O, 0); }
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
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_REFE) | (1L << OLB_REFE) | (1L << LB_REFE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (OB_REFE_B_O - 72)) | (1L << (OLB_REFE_B_O - 72)) | (1L << (LB_REFE_B_O - 72)) | (1L << (OB_REFE_O_O - 72)) | (1L << (OLB_REFE_O_O - 72)) | (1L << (LB_REFE_O_O - 72)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (OB_REFE_L_O - 150)) | (1L << (OLB_REFE_L_O - 150)) | (1L << (LB_REFE_L_O - 150)))) != 0)) ) {
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
		public TerminalNode IN_B_R() { return getToken(SlimeParser.IN_B_R, 0); }
		public TerminalNode IN_O_R() { return getToken(SlimeParser.IN_O_R, 0); }
		public TerminalNode IN_L_R() { return getToken(SlimeParser.IN_L_R, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			typeName();
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN_B_R) | (1L << IN_O_R) | (1L << IN_L_R))) != 0)) ) {
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

	public static class RefeTailContext extends ParserRuleContext {
		public TerminalNode CB_REFE() { return getToken(SlimeParser.CB_REFE, 0); }
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
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_REFE) | (1L << NL_REFE) | (1L << NW_REFE))) != 0)) ) {
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
			setState(138);
			slotHead();
			setState(139);
			spslBody();
			setState(140);
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
		public TerminalNode OB_SLOT() { return getToken(SlimeParser.OB_SLOT, 0); }
		public TerminalNode OLB_SLOT() { return getToken(SlimeParser.OLB_SLOT, 0); }
		public TerminalNode LB_SLOT() { return getToken(SlimeParser.LB_SLOT, 0); }
		public TerminalNode OB_SLOT_B_O() { return getToken(SlimeParser.OB_SLOT_B_O, 0); }
		public TerminalNode OLB_SLOT_B_O() { return getToken(SlimeParser.OLB_SLOT_B_O, 0); }
		public TerminalNode LB_SLOT_B_O() { return getToken(SlimeParser.LB_SLOT_B_O, 0); }
		public TerminalNode OB_SLOT_O_O() { return getToken(SlimeParser.OB_SLOT_O_O, 0); }
		public TerminalNode OLB_SLOT_O_O() { return getToken(SlimeParser.OLB_SLOT_O_O, 0); }
		public TerminalNode LB_SLOT_O_O() { return getToken(SlimeParser.LB_SLOT_O_O, 0); }
		public TerminalNode OB_SLOT_L_O() { return getToken(SlimeParser.OB_SLOT_L_O, 0); }
		public TerminalNode OLB_SLOT_L_O() { return getToken(SlimeParser.OLB_SLOT_L_O, 0); }
		public TerminalNode LB_SLOT_L_O() { return getToken(SlimeParser.LB_SLOT_L_O, 0); }
		public TerminalNode OB_SLOT_B_T() { return getToken(SlimeParser.OB_SLOT_B_T, 0); }
		public TerminalNode OLB_SLOT_B_T() { return getToken(SlimeParser.OLB_SLOT_B_T, 0); }
		public TerminalNode LB_SLOT_B_T() { return getToken(SlimeParser.LB_SLOT_B_T, 0); }
		public TerminalNode OB_SLOT_O_T() { return getToken(SlimeParser.OB_SLOT_O_T, 0); }
		public TerminalNode OLB_SLOT_O_T() { return getToken(SlimeParser.OLB_SLOT_O_T, 0); }
		public TerminalNode LB_SLOT_O_T() { return getToken(SlimeParser.LB_SLOT_O_T, 0); }
		public TerminalNode OB_SLOT_L_T() { return getToken(SlimeParser.OB_SLOT_L_T, 0); }
		public TerminalNode OLB_SLOT_L_T() { return getToken(SlimeParser.OLB_SLOT_L_T, 0); }
		public TerminalNode LB_SLOT_L_T() { return getToken(SlimeParser.LB_SLOT_L_T, 0); }
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
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OLB_SLOT) | (1L << LB_SLOT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (OB_SLOT_L_O - 148)) | (1L << (OLB_SLOT_L_O - 148)) | (1L << (LB_SLOT_L_O - 148)) | (1L << (OB_SLOT_B_T - 148)) | (1L << (OLB_SLOT_B_T - 148)) | (1L << (LB_SLOT_B_T - 148)) | (1L << (OB_SLOT_O_T - 148)) | (1L << (OLB_SLOT_O_T - 148)) | (1L << (LB_SLOT_O_T - 148)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (OB_SLOT_L_T - 217)) | (1L << (OLB_SLOT_L_T - 217)) | (1L << (LB_SLOT_L_T - 217)))) != 0)) ) {
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
		public TerminalNode CB_SLOT() { return getToken(SlimeParser.CB_SLOT, 0); }
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
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_SLOT) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
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
			setState(146);
			specHead();
			setState(147);
			spslBody();
			setState(148);
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
		public TerminalNode OB_SPEC() { return getToken(SlimeParser.OB_SPEC, 0); }
		public TerminalNode OLB_SPEC() { return getToken(SlimeParser.OLB_SPEC, 0); }
		public TerminalNode LB_SPEC() { return getToken(SlimeParser.LB_SPEC, 0); }
		public TerminalNode OB_SPEC_B_O() { return getToken(SlimeParser.OB_SPEC_B_O, 0); }
		public TerminalNode OLB_SPEC_B_O() { return getToken(SlimeParser.OLB_SPEC_B_O, 0); }
		public TerminalNode LB_SPEC_B_O() { return getToken(SlimeParser.LB_SPEC_B_O, 0); }
		public TerminalNode OB_SPEC_O_O() { return getToken(SlimeParser.OB_SPEC_O_O, 0); }
		public TerminalNode OLB_SPEC_O_O() { return getToken(SlimeParser.OLB_SPEC_O_O, 0); }
		public TerminalNode LB_SPEC_O_O() { return getToken(SlimeParser.LB_SPEC_O_O, 0); }
		public TerminalNode OB_SPEC_L_O() { return getToken(SlimeParser.OB_SPEC_L_O, 0); }
		public TerminalNode OLB_SPEC_L_O() { return getToken(SlimeParser.OLB_SPEC_L_O, 0); }
		public TerminalNode LB_SPEC_L_O() { return getToken(SlimeParser.LB_SPEC_L_O, 0); }
		public TerminalNode OB_SPEC_B_T() { return getToken(SlimeParser.OB_SPEC_B_T, 0); }
		public TerminalNode OLB_SPEC_B_T() { return getToken(SlimeParser.OLB_SPEC_B_T, 0); }
		public TerminalNode LB_SPEC_B_T() { return getToken(SlimeParser.LB_SPEC_B_T, 0); }
		public TerminalNode OB_SPEC_O_T() { return getToken(SlimeParser.OB_SPEC_O_T, 0); }
		public TerminalNode OLB_SPEC_O_T() { return getToken(SlimeParser.OLB_SPEC_O_T, 0); }
		public TerminalNode LB_SPEC_O_T() { return getToken(SlimeParser.LB_SPEC_O_T, 0); }
		public TerminalNode OB_SPEC_L_T() { return getToken(SlimeParser.OB_SPEC_L_T, 0); }
		public TerminalNode OLB_SPEC_L_T() { return getToken(SlimeParser.OLB_SPEC_L_T, 0); }
		public TerminalNode LB_SPEC_L_T() { return getToken(SlimeParser.LB_SPEC_L_T, 0); }
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
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SPEC) | (1L << OLB_SPEC) | (1L << LB_SPEC))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OB_SPEC_B_O - 71)) | (1L << (OLB_SPEC_B_O - 71)) | (1L << (LB_SPEC_B_O - 71)) | (1L << (OB_SPEC_O_O - 71)) | (1L << (OLB_SPEC_O_O - 71)) | (1L << (LB_SPEC_O_O - 71)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (OB_SPEC_L_O - 149)) | (1L << (OLB_SPEC_L_O - 149)) | (1L << (LB_SPEC_L_O - 149)) | (1L << (OB_SPEC_B_T - 149)) | (1L << (OLB_SPEC_B_T - 149)) | (1L << (LB_SPEC_B_T - 149)) | (1L << (OB_SPEC_O_T - 149)) | (1L << (OLB_SPEC_O_T - 149)) | (1L << (LB_SPEC_O_T - 149)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (OB_SPEC_L_T - 218)) | (1L << (OLB_SPEC_L_T - 218)) | (1L << (LB_SPEC_L_T - 218)))) != 0)) ) {
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
		public TerminalNode CB_SPEC() { return getToken(SlimeParser.CB_SPEC, 0); }
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
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CB_SPEC) | (1L << NL_SLSP) | (1L << NW_SLSP))) != 0)) ) {
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
		public List<TerminalNode> NAME_B_S() { return getTokens(SlimeParser.NAME_B_S); }
		public TerminalNode NAME_B_S(int i) {
			return getToken(SlimeParser.NAME_B_S, i);
		}
		public List<TerminalNode> NAME_O_S() { return getTokens(SlimeParser.NAME_O_S); }
		public TerminalNode NAME_O_S(int i) {
			return getToken(SlimeParser.NAME_O_S, i);
		}
		public List<TerminalNode> NAME_L_S() { return getTokens(SlimeParser.NAME_L_S); }
		public TerminalNode NAME_L_S(int i) {
			return getToken(SlimeParser.NAME_L_S, i);
		}
		public List<TerminalNode> SC_B_S() { return getTokens(SlimeParser.SC_B_S); }
		public TerminalNode SC_B_S(int i) {
			return getToken(SlimeParser.SC_B_S, i);
		}
		public List<TerminalNode> SC_O_S() { return getTokens(SlimeParser.SC_O_S); }
		public TerminalNode SC_O_S(int i) {
			return getToken(SlimeParser.SC_O_S, i);
		}
		public List<TerminalNode> SC_L_S() { return getTokens(SlimeParser.SC_L_S); }
		public TerminalNode SC_L_S(int i) {
			return getToken(SlimeParser.SC_L_S, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(160);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_S:
						{
						setState(154);
						match(NAME_B_S);
						setState(155);
						match(SC_B_S);
						}
						break;
					case NAME_O_S:
						{
						setState(156);
						match(NAME_O_S);
						setState(157);
						match(SC_O_S);
						}
						break;
					case NAME_L_S:
						{
						setState(158);
						match(NAME_L_S);
						setState(159);
						match(SC_L_S);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME_B_S) | (1L << NAME_O_S) | (1L << NAME_L_S))) != 0)) ) {
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
			setState(167);
			tempHead();
			setState(168);
			tempBody();
			setState(169);
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
		public TerminalNode OB_TEMP() { return getToken(SlimeParser.OB_TEMP, 0); }
		public TerminalNode OLB_TEMP() { return getToken(SlimeParser.OLB_TEMP, 0); }
		public TerminalNode LB_TEMP() { return getToken(SlimeParser.LB_TEMP, 0); }
		public TerminalNode OB_TEMP_B_O() { return getToken(SlimeParser.OB_TEMP_B_O, 0); }
		public TerminalNode OLB_TEMP_B_O() { return getToken(SlimeParser.OLB_TEMP_B_O, 0); }
		public TerminalNode LB_TEMP_B_O() { return getToken(SlimeParser.LB_TEMP_B_O, 0); }
		public TerminalNode OB_TEMP_O_O() { return getToken(SlimeParser.OB_TEMP_O_O, 0); }
		public TerminalNode OLB_TEMP_O_O() { return getToken(SlimeParser.OLB_TEMP_O_O, 0); }
		public TerminalNode LB_TEMP_O_O() { return getToken(SlimeParser.LB_TEMP_O_O, 0); }
		public TerminalNode OB_TEMP_L_O() { return getToken(SlimeParser.OB_TEMP_L_O, 0); }
		public TerminalNode OLB_TEMP_L_O() { return getToken(SlimeParser.OLB_TEMP_L_O, 0); }
		public TerminalNode LB_TEMP_L_O() { return getToken(SlimeParser.LB_TEMP_L_O, 0); }
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
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_TEMP) | (1L << OLB_TEMP) | (1L << LB_TEMP))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (OB_TEMP_B_O - 78)) | (1L << (OLB_TEMP_B_O - 78)) | (1L << (LB_TEMP_B_O - 78)) | (1L << (OB_TEMP_O_O - 78)) | (1L << (OLB_TEMP_O_O - 78)) | (1L << (LB_TEMP_O_O - 78)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (OB_TEMP_L_O - 156)) | (1L << (OLB_TEMP_L_O - 156)) | (1L << (LB_TEMP_L_O - 156)))) != 0)) ) {
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
		public List<TerminalNode> SC_B_T() { return getTokens(SlimeParser.SC_B_T); }
		public TerminalNode SC_B_T(int i) {
			return getToken(SlimeParser.SC_B_T, i);
		}
		public List<TerminalNode> SC_L_T() { return getTokens(SlimeParser.SC_L_T); }
		public TerminalNode SC_L_T(int i) {
			return getToken(SlimeParser.SC_L_T, i);
		}
		public List<TerminalNode> SC_O_T() { return getTokens(SlimeParser.SC_O_T); }
		public TerminalNode SC_O_T(int i) {
			return getToken(SlimeParser.SC_O_T, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					tempBodyPart();
					setState(174);
					_la = _input.LA(1);
					if ( !(((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (SC_B_T - 202)) | (1L << (SC_O_T - 202)) | (1L << (SC_L_T - 202)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(181);
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
		public List<TerminalNode> LINE_DIVIDER() { return getTokens(SlimeParser.LINE_DIVIDER); }
		public TerminalNode LINE_DIVIDER(int i) {
			return getToken(SlimeParser.LINE_DIVIDER, i);
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
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OB_TEXT:
				case OLB_TEXT:
				case LB_TEXT:
				case OB_TEXT_B_O:
				case OLB_TEXT_B_O:
				case LB_TEXT_B_O:
				case OB_TEXT_O_O:
				case OLB_TEXT_O_O:
				case LB_TEXT_O_O:
				case OB_TEXT_L_O:
				case OLB_TEXT_L_O:
				case LB_TEXT_L_O:
				case OB_TEXT_B_T:
				case OLB_TEXT_B_T:
				case LB_TEXT_B_T:
				case OB_TEXT_O_T:
				case OLB_TEXT_O_T:
				case LB_TEXT_O_T:
				case OB_TEXT_L_T:
				case OLB_TEXT_L_T:
				case LB_TEXT_L_T:
					{
					setState(183);
					text();
					}
					break;
				case OB_SLOT:
				case OLB_SLOT:
				case LB_SLOT:
				case OB_SLOT_B_O:
				case OLB_SLOT_B_O:
				case LB_SLOT_B_O:
				case OB_SLOT_O_O:
				case OLB_SLOT_O_O:
				case LB_SLOT_O_O:
				case OB_SLOT_L_O:
				case OLB_SLOT_L_O:
				case LB_SLOT_L_O:
				case OB_SLOT_B_T:
				case OLB_SLOT_B_T:
				case LB_SLOT_B_T:
				case OB_SLOT_O_T:
				case OLB_SLOT_O_T:
				case LB_SLOT_O_T:
				case OB_SLOT_L_T:
				case OLB_SLOT_L_T:
				case LB_SLOT_L_T:
					{
					setState(184);
					slot();
					}
					break;
				case OB_SPEC:
				case OLB_SPEC:
				case LB_SPEC:
				case OB_SPEC_B_O:
				case OLB_SPEC_B_O:
				case LB_SPEC_B_O:
				case OB_SPEC_O_O:
				case OLB_SPEC_O_O:
				case LB_SPEC_O_O:
				case OB_SPEC_L_O:
				case OLB_SPEC_L_O:
				case LB_SPEC_L_O:
				case OB_SPEC_B_T:
				case OLB_SPEC_B_T:
				case LB_SPEC_B_T:
				case OB_SPEC_O_T:
				case OLB_SPEC_O_T:
				case LB_SPEC_O_T:
				case OB_SPEC_L_T:
				case OLB_SPEC_L_T:
				case LB_SPEC_L_T:
					{
					setState(185);
					spec();
					}
					break;
				case TEXT_LINE:
				case OL_TEXT_LINE:
				case L_TEXT_LINE:
					{
					setState(186);
					tempText();
					}
					break;
				case LINE_DIVIDER:
					{
					setState(187);
					match(LINE_DIVIDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OB_SPEC) | (1L << OB_TEXT) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_TEXT) | (1L << LB_SLOT) | (1L << LB_SPEC) | (1L << LB_TEXT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OB_SPEC_B_O - 70)) | (1L << (OB_TEXT_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (OLB_SPEC_B_O - 70)) | (1L << (OLB_TEXT_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (LB_SPEC_B_O - 70)) | (1L << (LB_TEXT_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OB_SPEC_O_O - 70)) | (1L << (OB_TEXT_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (OLB_SPEC_O_O - 70)) | (1L << (OLB_TEXT_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)) | (1L << (LB_SPEC_O_O - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LB_TEXT_O_O - 134)) | (1L << (OB_SLOT_L_O - 134)) | (1L << (OB_SPEC_L_O - 134)) | (1L << (OB_TEXT_L_O - 134)) | (1L << (OLB_SLOT_L_O - 134)) | (1L << (OLB_SPEC_L_O - 134)) | (1L << (OLB_TEXT_L_O - 134)) | (1L << (LB_SLOT_L_O - 134)) | (1L << (LB_SPEC_L_O - 134)) | (1L << (LB_TEXT_L_O - 134)) | (1L << (TEXT_LINE - 134)) | (1L << (LINE_DIVIDER - 134)) | (1L << (OB_SLOT_B_T - 134)) | (1L << (OB_SPEC_B_T - 134)) | (1L << (OB_TEXT_B_T - 134)) | (1L << (OLB_SLOT_B_T - 134)) | (1L << (OLB_SPEC_B_T - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (OLB_TEXT_B_T - 198)) | (1L << (LB_SLOT_B_T - 198)) | (1L << (LB_SPEC_B_T - 198)) | (1L << (LB_TEXT_B_T - 198)) | (1L << (OL_TEXT_LINE - 198)) | (1L << (OB_SLOT_O_T - 198)) | (1L << (OB_SPEC_O_T - 198)) | (1L << (OB_TEXT_O_T - 198)) | (1L << (OLB_SLOT_O_T - 198)) | (1L << (OLB_SPEC_O_T - 198)) | (1L << (OLB_TEXT_O_T - 198)) | (1L << (LB_SLOT_O_T - 198)) | (1L << (LB_SPEC_O_T - 198)) | (1L << (LB_TEXT_O_T - 198)) | (1L << (L_TEXT_LINE - 198)) | (1L << (OB_SLOT_L_T - 198)) | (1L << (OB_SPEC_L_T - 198)) | (1L << (OB_TEXT_L_T - 198)) | (1L << (OLB_SLOT_L_T - 198)) | (1L << (OLB_SPEC_L_T - 198)) | (1L << (OLB_TEXT_L_T - 198)) | (1L << (LB_SLOT_L_T - 198)) | (1L << (LB_SPEC_L_T - 198)) | (1L << (LB_TEXT_L_T - 198)))) != 0) );
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
		public TerminalNode CB_TEMP() { return getToken(SlimeParser.CB_TEMP, 0); }
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
			setState(192);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (CB_TEMP - 190)) | (1L << (NL_TEMP - 190)) | (1L << (NW_TEMP - 190)))) != 0)) ) {
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
		public List<TerminalNode> LINE_DIVIDER() { return getTokens(SlimeParser.LINE_DIVIDER); }
		public TerminalNode LINE_DIVIDER(int i) {
			return getToken(SlimeParser.LINE_DIVIDER, i);
		}
		public TerminalNode OL_TEXT_LINE() { return getToken(SlimeParser.OL_TEXT_LINE, 0); }
		public TerminalNode L_TEXT_LINE() { return getToken(SlimeParser.L_TEXT_LINE, 0); }
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
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						match(TEXT_LINE);
						setState(195);
						match(LINE_DIVIDER);
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(201);
				match(TEXT_LINE);
				}
				break;
			case OL_TEXT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(OL_TEXT_LINE);
				}
				break;
			case L_TEXT_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(L_TEXT_LINE);
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

	public static class ExpaContext extends ParserRuleContext {
		public ExpaHeadContext expaHead() {
			return getRuleContext(ExpaHeadContext.class,0);
		}
		public ExpaBodyContext expaBody() {
			return getRuleContext(ExpaBodyContext.class,0);
		}
		public ExpaTailContext expaTail() {
			return getRuleContext(ExpaTailContext.class,0);
		}
		public ExpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaContext expa() throws RecognitionException {
		ExpaContext _localctx = new ExpaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expaHead();
			setState(207);
			expaBody();
			setState(208);
			expaTail();
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

	public static class ExpaHeadContext extends ParserRuleContext {
		public TerminalNode OB_EXPA() { return getToken(SlimeParser.OB_EXPA, 0); }
		public TerminalNode OLB_EXPA() { return getToken(SlimeParser.OLB_EXPA, 0); }
		public TerminalNode LB_EXPA() { return getToken(SlimeParser.LB_EXPA, 0); }
		public TerminalNode OB_EXPA_B_O() { return getToken(SlimeParser.OB_EXPA_B_O, 0); }
		public TerminalNode OLB_EXPA_B_O() { return getToken(SlimeParser.OLB_EXPA_B_O, 0); }
		public TerminalNode LB_EXPA_B_O() { return getToken(SlimeParser.LB_EXPA_B_O, 0); }
		public TerminalNode OB_EXPA_O_O() { return getToken(SlimeParser.OB_EXPA_O_O, 0); }
		public TerminalNode OLB_EXPA_O_O() { return getToken(SlimeParser.OLB_EXPA_O_O, 0); }
		public TerminalNode LB_EXPA_O_O() { return getToken(SlimeParser.LB_EXPA_O_O, 0); }
		public TerminalNode OB_EXPA_L_O() { return getToken(SlimeParser.OB_EXPA_L_O, 0); }
		public TerminalNode OLB_EXPA_L_O() { return getToken(SlimeParser.OLB_EXPA_L_O, 0); }
		public TerminalNode LB_EXPA_L_O() { return getToken(SlimeParser.LB_EXPA_L_O, 0); }
		public ExpaHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaHeadContext expaHead() throws RecognitionException {
		ExpaHeadContext _localctx = new ExpaHeadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expaHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_EXPA) | (1L << OLB_EXPA) | (1L << LB_EXPA))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (OB_EXPA_B_O - 73)) | (1L << (OLB_EXPA_B_O - 73)) | (1L << (LB_EXPA_B_O - 73)) | (1L << (OB_EXPA_O_O - 73)) | (1L << (OLB_EXPA_O_O - 73)) | (1L << (LB_EXPA_O_O - 73)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (OB_EXPA_L_O - 151)) | (1L << (OLB_EXPA_L_O - 151)) | (1L << (LB_EXPA_L_O - 151)))) != 0)) ) {
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

	public static class ExpaBodyContext extends ParserRuleContext {
		public List<ExpaBodyPartContext> expaBodyPart() {
			return getRuleContexts(ExpaBodyPartContext.class);
		}
		public ExpaBodyPartContext expaBodyPart(int i) {
			return getRuleContext(ExpaBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
		}
		public ExpaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaBodyContext expaBody() throws RecognitionException {
		ExpaBodyContext _localctx = new ExpaBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expaBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					expaBodyPart();
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(220);
			expaBodyPart();
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

	public static class ExpaBodyPartContext extends ParserRuleContext {
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public VariPathContext variPath() {
			return getRuleContext(VariPathContext.class,0);
		}
		public TerminalNode OB_IMPORT() { return getToken(SlimeParser.OB_IMPORT, 0); }
		public TerminalNode OL_IMPORT() { return getToken(SlimeParser.OL_IMPORT, 0); }
		public TerminalNode L_IMPORT() { return getToken(SlimeParser.L_IMPORT, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public ExpaBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaBodyPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaBodyPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaBodyPartContext expaBodyPart() throws RecognitionException {
		ExpaBodyPartContext _localctx = new ExpaBodyPartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expaBodyPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OB_SLOT:
			case OB_SPEC:
			case OB_REFE:
			case OB_PLUS:
			case OB_DECL:
			case OB_TEXT:
			case OB_TEMP:
			case OLB_SLOT:
			case OLB_SPEC:
			case OLB_REFE:
			case OLB_PLUS:
			case OLB_DECL:
			case OLB_TEXT:
			case OLB_TEMP:
			case LB_SLOT:
			case LB_SPEC:
			case LB_REFE:
			case LB_PLUS:
			case LB_DECL:
			case LB_TEXT:
			case LB_TEMP:
			case OB_SLOT_B_O:
			case OB_SPEC_B_O:
			case OB_REFE_B_O:
			case OB_PLUS_B_O:
			case OB_DECL_B_O:
			case OB_TEXT_B_O:
			case OB_TEMP_B_O:
			case OLB_SLOT_B_O:
			case OLB_SPEC_B_O:
			case OLB_REFE_B_O:
			case OLB_PLUS_B_O:
			case OLB_DECL_B_O:
			case OLB_TEXT_B_O:
			case OLB_TEMP_B_O:
			case LB_SLOT_B_O:
			case LB_SPEC_B_O:
			case LB_REFE_B_O:
			case LB_PLUS_B_O:
			case LB_DECL_B_O:
			case LB_TEXT_B_O:
			case LB_TEMP_B_O:
			case NAME_B_O:
			case INTE_B_O:
			case OB_SLOT_O_O:
			case OB_SPEC_O_O:
			case OB_REFE_O_O:
			case OB_PLUS_O_O:
			case OB_DECL_O_O:
			case OB_TEXT_O_O:
			case OB_TEMP_O_O:
			case OLB_SLOT_O_O:
			case OLB_SPEC_O_O:
			case OLB_REFE_O_O:
			case OLB_PLUS_O_O:
			case OLB_DECL_O_O:
			case OLB_TEXT_O_O:
			case OLB_TEMP_O_O:
			case LB_SLOT_O_O:
			case LB_SPEC_O_O:
			case LB_REFE_O_O:
			case LB_PLUS_O_O:
			case LB_DECL_O_O:
			case LB_TEXT_O_O:
			case LB_TEMP_O_O:
			case NAME_O_O:
			case INTE_O_O:
			case OB_SLOT_L_O:
			case OB_SPEC_L_O:
			case OB_REFE_L_O:
			case OB_PLUS_L_O:
			case OB_DECL_L_O:
			case OB_TEXT_L_O:
			case OB_TEMP_L_O:
			case OLB_SLOT_L_O:
			case OLB_SPEC_L_O:
			case OLB_REFE_L_O:
			case OLB_PLUS_L_O:
			case OLB_DECL_L_O:
			case OLB_TEXT_L_O:
			case OLB_TEMP_L_O:
			case LB_SLOT_L_O:
			case LB_SPEC_L_O:
			case LB_REFE_L_O:
			case LB_PLUS_L_O:
			case LB_DECL_L_O:
			case LB_TEXT_L_O:
			case LB_TEMP_L_O:
			case NAME_L_O:
			case INTE_L_O:
			case OB_SLOT_B_T:
			case OB_SPEC_B_T:
			case OB_TEXT_B_T:
			case OLB_SLOT_B_T:
			case OLB_SPEC_B_T:
			case OLB_TEXT_B_T:
			case LB_SLOT_B_T:
			case LB_SPEC_B_T:
			case LB_TEXT_B_T:
			case OB_SLOT_O_T:
			case OB_SPEC_O_T:
			case OB_TEXT_O_T:
			case OLB_SLOT_O_T:
			case OLB_SPEC_O_T:
			case OLB_TEXT_O_T:
			case LB_SLOT_O_T:
			case LB_SPEC_O_T:
			case LB_TEXT_O_T:
			case OB_SLOT_L_T:
			case OB_SPEC_L_T:
			case OB_TEXT_L_T:
			case OLB_SLOT_L_T:
			case OLB_SPEC_L_T:
			case OLB_TEXT_L_T:
			case LB_SLOT_L_T:
			case LB_SPEC_L_T:
			case LB_TEXT_L_T:
				{
				setState(222);
				vari();
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(224);
					temp();
					}
					break;
				case 2:
					{
					setState(225);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(226);
					spec();
					}
					break;
				}
				}
				break;
			case OB_IMPORT:
			case OL_IMPORT:
			case L_IMPORT:
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==OB_IMPORT || _la==OL_IMPORT || _la==L_IMPORT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				variPath();
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

	public static class ExpaTailContext extends ParserRuleContext {
		public TerminalNode CB_EXPA() { return getToken(SlimeParser.CB_EXPA, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public ExpaTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpaTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpaTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpaTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaTailContext expaTail() throws RecognitionException {
		ExpaTailContext _localctx = new ExpaTailContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expaTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==CB_EXPA || _la==NL_OPER || _la==NW_OPER) ) {
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
			setState(235);
			plusHead();
			setState(236);
			plusBody();
			setState(237);
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
		public TerminalNode OB_PLUS() { return getToken(SlimeParser.OB_PLUS, 0); }
		public TerminalNode OLB_PLUS() { return getToken(SlimeParser.OLB_PLUS, 0); }
		public TerminalNode LB_PLUS() { return getToken(SlimeParser.LB_PLUS, 0); }
		public TerminalNode OB_PLUS_B_O() { return getToken(SlimeParser.OB_PLUS_B_O, 0); }
		public TerminalNode OLB_PLUS_B_O() { return getToken(SlimeParser.OLB_PLUS_B_O, 0); }
		public TerminalNode LB_PLUS_B_O() { return getToken(SlimeParser.LB_PLUS_B_O, 0); }
		public TerminalNode OB_PLUS_O_O() { return getToken(SlimeParser.OB_PLUS_O_O, 0); }
		public TerminalNode OLB_PLUS_O_O() { return getToken(SlimeParser.OLB_PLUS_O_O, 0); }
		public TerminalNode LB_PLUS_O_O() { return getToken(SlimeParser.LB_PLUS_O_O, 0); }
		public TerminalNode OB_PLUS_L_O() { return getToken(SlimeParser.OB_PLUS_L_O, 0); }
		public TerminalNode OLB_PLUS_L_O() { return getToken(SlimeParser.OLB_PLUS_L_O, 0); }
		public TerminalNode LB_PLUS_L_O() { return getToken(SlimeParser.LB_PLUS_L_O, 0); }
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
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_PLUS) | (1L << OLB_PLUS) | (1L << LB_PLUS))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (OB_PLUS_B_O - 74)) | (1L << (OLB_PLUS_B_O - 74)) | (1L << (LB_PLUS_B_O - 74)) | (1L << (OB_PLUS_O_O - 74)) | (1L << (OLB_PLUS_O_O - 74)) | (1L << (LB_PLUS_O_O - 74)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (OB_PLUS_L_O - 152)) | (1L << (OLB_PLUS_L_O - 152)) | (1L << (LB_PLUS_L_O - 152)))) != 0)) ) {
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
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
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
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					plusBodyPart();
					setState(242);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(249);
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
		public TerminalNode PLOP_B_O() { return getToken(SlimeParser.PLOP_B_O, 0); }
		public TerminalNode PLOP_O_O() { return getToken(SlimeParser.PLOP_O_O, 0); }
		public TerminalNode PLOP_L_O() { return getToken(SlimeParser.PLOP_L_O, 0); }
		public List<PlusElementContext> plusElement() {
			return getRuleContexts(PlusElementContext.class);
		}
		public PlusElementContext plusElement(int i) {
			return getRuleContext(PlusElementContext.class,i);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
		}
		public VariPathContext variPath() {
			return getRuleContext(VariPathContext.class,0);
		}
		public TerminalNode OB_IMPORT() { return getToken(SlimeParser.OB_IMPORT, 0); }
		public TerminalNode OL_IMPORT() { return getToken(SlimeParser.OL_IMPORT, 0); }
		public TerminalNode L_IMPORT() { return getToken(SlimeParser.L_IMPORT, 0); }
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OB_SLOT:
			case OB_SPEC:
			case OB_REFE:
			case OB_PLUS:
			case OB_DECL:
			case OB_TEXT:
			case OB_TEMP:
			case OLB_SLOT:
			case OLB_SPEC:
			case OLB_REFE:
			case OLB_PLUS:
			case OLB_DECL:
			case OLB_TEXT:
			case OLB_TEMP:
			case LB_SLOT:
			case LB_SPEC:
			case LB_REFE:
			case LB_PLUS:
			case LB_DECL:
			case LB_TEXT:
			case LB_TEMP:
			case OB_SLOT_B_O:
			case OB_SPEC_B_O:
			case OB_REFE_B_O:
			case OB_PLUS_B_O:
			case OB_DECL_B_O:
			case OB_TEXT_B_O:
			case OB_TEMP_B_O:
			case OLB_SLOT_B_O:
			case OLB_SPEC_B_O:
			case OLB_REFE_B_O:
			case OLB_PLUS_B_O:
			case OLB_DECL_B_O:
			case OLB_TEXT_B_O:
			case OLB_TEMP_B_O:
			case LB_SLOT_B_O:
			case LB_SPEC_B_O:
			case LB_REFE_B_O:
			case LB_PLUS_B_O:
			case LB_DECL_B_O:
			case LB_TEXT_B_O:
			case LB_TEMP_B_O:
			case NAME_B_O:
			case INTE_B_O:
			case OB_SLOT_O_O:
			case OB_SPEC_O_O:
			case OB_REFE_O_O:
			case OB_PLUS_O_O:
			case OB_DECL_O_O:
			case OB_TEXT_O_O:
			case OB_TEMP_O_O:
			case OLB_SLOT_O_O:
			case OLB_SPEC_O_O:
			case OLB_REFE_O_O:
			case OLB_PLUS_O_O:
			case OLB_DECL_O_O:
			case OLB_TEXT_O_O:
			case OLB_TEMP_O_O:
			case LB_SLOT_O_O:
			case LB_SPEC_O_O:
			case LB_REFE_O_O:
			case LB_PLUS_O_O:
			case LB_DECL_O_O:
			case LB_TEXT_O_O:
			case LB_TEMP_O_O:
			case NAME_O_O:
			case INTE_O_O:
			case OB_SLOT_L_O:
			case OB_SPEC_L_O:
			case OB_REFE_L_O:
			case OB_PLUS_L_O:
			case OB_DECL_L_O:
			case OB_TEXT_L_O:
			case OB_TEMP_L_O:
			case OLB_SLOT_L_O:
			case OLB_SPEC_L_O:
			case OLB_REFE_L_O:
			case OLB_PLUS_L_O:
			case OLB_DECL_L_O:
			case OLB_TEXT_L_O:
			case OLB_TEMP_L_O:
			case LB_SLOT_L_O:
			case LB_SPEC_L_O:
			case LB_REFE_L_O:
			case LB_PLUS_L_O:
			case LB_DECL_L_O:
			case LB_TEXT_L_O:
			case LB_TEMP_L_O:
			case NAME_L_O:
			case INTE_L_O:
			case OB_SLOT_B_T:
			case OB_SPEC_B_T:
			case OB_TEXT_B_T:
			case OLB_SLOT_B_T:
			case OLB_SPEC_B_T:
			case OLB_TEXT_B_T:
			case LB_SLOT_B_T:
			case LB_SPEC_B_T:
			case LB_TEXT_B_T:
			case OB_SLOT_O_T:
			case OB_SPEC_O_T:
			case OB_TEXT_O_T:
			case OLB_SLOT_O_T:
			case OLB_SPEC_O_T:
			case OLB_TEXT_O_T:
			case LB_SLOT_O_T:
			case LB_SPEC_O_T:
			case LB_TEXT_O_T:
			case OB_SLOT_L_T:
			case OB_SPEC_L_T:
			case OB_TEXT_L_T:
			case OLB_SLOT_L_T:
			case OLB_SPEC_L_T:
			case OLB_TEXT_L_T:
			case LB_SLOT_L_T:
			case LB_SPEC_L_T:
			case LB_TEXT_L_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				vari();
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==PLOP_B_O || _la==PLOP_O_O || _la==PLOP_L_O) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				vari();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) {
					{
					setState(254);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(255);
					plusElement();
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) {
						{
						{
						setState(256);
						_la = _input.LA(1);
						if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						plusElement();
						}
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case OB_IMPORT:
			case OL_IMPORT:
			case L_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==OB_IMPORT || _la==OL_IMPORT || _la==L_IMPORT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				variPath();
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

	public static class PlusElementContext extends ParserRuleContext {
		public List<VariPathContext> variPath() {
			return getRuleContexts(VariPathContext.class);
		}
		public VariPathContext variPath(int i) {
			return getRuleContext(VariPathContext.class,i);
		}
		public TerminalNode PLOP_B_O() { return getToken(SlimeParser.PLOP_B_O, 0); }
		public TerminalNode PLOP_O_O() { return getToken(SlimeParser.PLOP_O_O, 0); }
		public TerminalNode PLOP_L_O() { return getToken(SlimeParser.PLOP_L_O, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			variPath();
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==PLOP_B_O || _la==PLOP_O_O || _la==PLOP_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
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
		public TerminalNode CB_PLUS() { return getToken(SlimeParser.CB_PLUS, 0); }
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
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==CB_PLUS || _la==NL_OPER || _la==NW_OPER) ) {
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
			setState(275);
			deleHead();
			setState(276);
			deleBody();
			setState(277);
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
		public TerminalNode OB_DELE() { return getToken(SlimeParser.OB_DELE, 0); }
		public TerminalNode OLB_DELE() { return getToken(SlimeParser.OLB_DELE, 0); }
		public TerminalNode LB_DELE() { return getToken(SlimeParser.LB_DELE, 0); }
		public TerminalNode OB_DELE_B_O() { return getToken(SlimeParser.OB_DELE_B_O, 0); }
		public TerminalNode OLB_DELE_B_O() { return getToken(SlimeParser.OLB_DELE_B_O, 0); }
		public TerminalNode LB_DELE_B_O() { return getToken(SlimeParser.LB_DELE_B_O, 0); }
		public TerminalNode OB_DELE_O_O() { return getToken(SlimeParser.OB_DELE_O_O, 0); }
		public TerminalNode OLB_DELE_O_O() { return getToken(SlimeParser.OLB_DELE_O_O, 0); }
		public TerminalNode LB_DELE_O_O() { return getToken(SlimeParser.LB_DELE_O_O, 0); }
		public TerminalNode OB_DELE_L_O() { return getToken(SlimeParser.OB_DELE_L_O, 0); }
		public TerminalNode OLB_DELE_L_O() { return getToken(SlimeParser.OLB_DELE_L_O, 0); }
		public TerminalNode LB_DELE_L_O() { return getToken(SlimeParser.LB_DELE_L_O, 0); }
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
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_DELE) | (1L << OLB_DELE) | (1L << LB_DELE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (OB_DELE_B_O - 76)) | (1L << (OLB_DELE_B_O - 76)) | (1L << (LB_DELE_B_O - 76)) | (1L << (OB_DELE_O_O - 76)) | (1L << (OLB_DELE_O_O - 76)) | (1L << (LB_DELE_O_O - 76)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (OB_DELE_L_O - 154)) | (1L << (OLB_DELE_L_O - 154)) | (1L << (LB_DELE_L_O - 154)))) != 0)) ) {
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
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
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
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
					case INTE_B_O:
					case NAME_O_O:
					case INTE_O_O:
					case NAME_L_O:
					case INTE_L_O:
						{
						setState(281);
						variPath();
						}
						break;
					case OB_REFE:
					case OLB_REFE:
					case LB_REFE:
					case OB_REFE_B_O:
					case OLB_REFE_B_O:
					case LB_REFE_B_O:
					case OB_REFE_O_O:
					case OLB_REFE_O_O:
					case LB_REFE_O_O:
					case OB_REFE_L_O:
					case OLB_REFE_L_O:
					case LB_REFE_L_O:
						{
						setState(282);
						refe();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(285);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_B_O:
			case INTE_B_O:
			case NAME_O_O:
			case INTE_O_O:
			case NAME_L_O:
			case INTE_L_O:
				{
				setState(292);
				variPath();
				}
				break;
			case OB_REFE:
			case OLB_REFE:
			case LB_REFE:
			case OB_REFE_B_O:
			case OLB_REFE_B_O:
			case LB_REFE_B_O:
			case OB_REFE_O_O:
			case OLB_REFE_O_O:
			case LB_REFE_O_O:
			case OB_REFE_L_O:
			case OLB_REFE_L_O:
			case LB_REFE_L_O:
				{
				setState(293);
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
		public TerminalNode CB_DELE() { return getToken(SlimeParser.CB_DELE, 0); }
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
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==CB_DELE || _la==NL_OPER || _la==NW_OPER) ) {
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
			setState(298);
			declHead();
			setState(299);
			declBody();
			setState(300);
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
		public TerminalNode OB_DECL() { return getToken(SlimeParser.OB_DECL, 0); }
		public TerminalNode OLB_DECL() { return getToken(SlimeParser.OLB_DECL, 0); }
		public TerminalNode LB_DECL() { return getToken(SlimeParser.LB_DECL, 0); }
		public TerminalNode OB_DECL_B_O() { return getToken(SlimeParser.OB_DECL_B_O, 0); }
		public TerminalNode OLB_DECL_B_O() { return getToken(SlimeParser.OLB_DECL_B_O, 0); }
		public TerminalNode LB_DECL_B_O() { return getToken(SlimeParser.LB_DECL_B_O, 0); }
		public TerminalNode OB_DECL_O_O() { return getToken(SlimeParser.OB_DECL_O_O, 0); }
		public TerminalNode OLB_DECL_O_O() { return getToken(SlimeParser.OLB_DECL_O_O, 0); }
		public TerminalNode LB_DECL_O_O() { return getToken(SlimeParser.LB_DECL_O_O, 0); }
		public TerminalNode OB_DECL_L_O() { return getToken(SlimeParser.OB_DECL_L_O, 0); }
		public TerminalNode OLB_DECL_L_O() { return getToken(SlimeParser.OLB_DECL_L_O, 0); }
		public TerminalNode LB_DECL_L_O() { return getToken(SlimeParser.LB_DECL_L_O, 0); }
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
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_DECL) | (1L << OLB_DECL) | (1L << LB_DECL))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (OB_DECL_B_O - 75)) | (1L << (OLB_DECL_B_O - 75)) | (1L << (LB_DECL_B_O - 75)) | (1L << (OB_DECL_O_O - 75)) | (1L << (OLB_DECL_O_O - 75)) | (1L << (LB_DECL_O_O - 75)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (OB_DECL_L_O - 153)) | (1L << (OLB_DECL_L_O - 153)) | (1L << (LB_DECL_L_O - 153)))) != 0)) ) {
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public TerminalNode EQOP_B_O() { return getToken(SlimeParser.EQOP_B_O, 0); }
		public TerminalNode EQOP_O_O() { return getToken(SlimeParser.EQOP_O_O, 0); }
		public TerminalNode EQOP_L_O() { return getToken(SlimeParser.EQOP_L_O, 0); }
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME_B_O || _la==NAME_O_O || _la==NAME_L_O) {
				{
				setState(304);
				listName();
				}
			}

			setState(307);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			typeName();
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==EQOP_B_O || _la==EQOP_O_O || _la==EQOP_L_O) ) {
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

	public static class DeclBodyContext extends ParserRuleContext {
		public List<DeclBodyPartContext> declBodyPart() {
			return getRuleContexts(DeclBodyPartContext.class);
		}
		public DeclBodyPartContext declBodyPart(int i) {
			return getRuleContext(DeclBodyPartContext.class,i);
		}
		public List<TerminalNode> SC_B_O() { return getTokens(SlimeParser.SC_B_O); }
		public TerminalNode SC_B_O(int i) {
			return getToken(SlimeParser.SC_B_O, i);
		}
		public List<TerminalNode> SC_O_O() { return getTokens(SlimeParser.SC_O_O); }
		public TerminalNode SC_O_O(int i) {
			return getToken(SlimeParser.SC_O_O, i);
		}
		public List<TerminalNode> SC_L_O() { return getTokens(SlimeParser.SC_L_O); }
		public TerminalNode SC_L_O(int i) {
			return getToken(SlimeParser.SC_L_O, i);
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
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					declBodyPart();
					setState(312);
					_la = _input.LA(1);
					if ( !(_la==SC_B_O || _la==SC_O_O || _la==SC_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(319);
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
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
		}
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
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
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				declNeck();
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					{
					setState(322);
					listName();
					}
					}
					break;
				case 2:
					{
					{
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(323);
							nameType();
							setState(324);
							_la = _input.LA(1);
							if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(330);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(331);
					nameType();
					}
					}
					break;
				case 3:
					{
					{
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(332);
							nameValue();
							setState(333);
							_la = _input.LA(1);
							if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(339);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					setState(340);
					nameValue();
					}
					}
					break;
				case 4:
					{
					{
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(341);
							vari();
							setState(342);
							_la = _input.LA(1);
							if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(348);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(349);
					vari();
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				vari();
				}
				break;
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
		public TerminalNode CB_DECL() { return getToken(SlimeParser.CB_DECL, 0); }
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
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==CB_DECL || _la==NL_OPER || _la==NW_OPER) ) {
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
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(357);
			listName();
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			vari();
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PE_B_O() { return getToken(SlimeParser.PE_B_O, 0); }
		public TerminalNode PE_O_O() { return getToken(SlimeParser.PE_O_O, 0); }
		public TerminalNode PE_L_O() { return getToken(SlimeParser.PE_L_O, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(361);
			listName();
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==PE_B_O || _la==PE_O_O || _la==PE_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(363);
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
		enterRule(_localctx, 90, RULE_vari);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_B_O:
			case INTE_B_O:
			case NAME_O_O:
			case INTE_O_O:
			case NAME_L_O:
			case INTE_L_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				variPath();
				}
				break;
			case OB_DECL:
			case OLB_DECL:
			case LB_DECL:
			case OB_DECL_B_O:
			case OLB_DECL_B_O:
			case LB_DECL_B_O:
			case OB_DECL_O_O:
			case OLB_DECL_O_O:
			case LB_DECL_O_O:
			case OB_DECL_L_O:
			case OLB_DECL_L_O:
			case LB_DECL_L_O:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				decl();
				}
				break;
			case OB_TEMP:
			case OLB_TEMP:
			case LB_TEMP:
			case OB_TEMP_B_O:
			case OLB_TEMP_B_O:
			case LB_TEMP_B_O:
			case OB_TEMP_O_O:
			case OLB_TEMP_O_O:
			case LB_TEMP_O_O:
			case OB_TEMP_L_O:
			case OLB_TEMP_L_O:
			case LB_TEMP_L_O:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				temp();
				}
				break;
			case OB_SPEC:
			case OLB_SPEC:
			case LB_SPEC:
			case OB_SPEC_B_O:
			case OLB_SPEC_B_O:
			case LB_SPEC_B_O:
			case OB_SPEC_O_O:
			case OLB_SPEC_O_O:
			case LB_SPEC_O_O:
			case OB_SPEC_L_O:
			case OLB_SPEC_L_O:
			case LB_SPEC_L_O:
			case OB_SPEC_B_T:
			case OLB_SPEC_B_T:
			case LB_SPEC_B_T:
			case OB_SPEC_O_T:
			case OLB_SPEC_O_T:
			case LB_SPEC_O_T:
			case OB_SPEC_L_T:
			case OLB_SPEC_L_T:
			case LB_SPEC_L_T:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				spec();
				}
				break;
			case OB_SLOT:
			case OLB_SLOT:
			case LB_SLOT:
			case OB_SLOT_B_O:
			case OLB_SLOT_B_O:
			case LB_SLOT_B_O:
			case OB_SLOT_O_O:
			case OLB_SLOT_O_O:
			case LB_SLOT_O_O:
			case OB_SLOT_L_O:
			case OLB_SLOT_L_O:
			case LB_SLOT_L_O:
			case OB_SLOT_B_T:
			case OLB_SLOT_B_T:
			case LB_SLOT_B_T:
			case OB_SLOT_O_T:
			case OLB_SLOT_O_T:
			case LB_SLOT_O_T:
			case OB_SLOT_L_T:
			case OLB_SLOT_L_T:
			case LB_SLOT_L_T:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				slot();
				}
				break;
			case OB_REFE:
			case OLB_REFE:
			case LB_REFE:
			case OB_REFE_B_O:
			case OLB_REFE_B_O:
			case LB_REFE_B_O:
			case OB_REFE_O_O:
			case OLB_REFE_O_O:
			case LB_REFE_O_O:
			case OB_REFE_L_O:
			case OLB_REFE_L_O:
			case LB_REFE_L_O:
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				refe();
				}
				break;
			case OB_PLUS:
			case OLB_PLUS:
			case LB_PLUS:
			case OB_PLUS_B_O:
			case OLB_PLUS_B_O:
			case LB_PLUS_B_O:
			case OB_PLUS_O_O:
			case OLB_PLUS_O_O:
			case LB_PLUS_O_O:
			case OB_PLUS_L_O:
			case OLB_PLUS_L_O:
			case LB_PLUS_L_O:
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				plus();
				}
				break;
			case OB_TEXT:
			case OLB_TEXT:
			case LB_TEXT:
			case OB_TEXT_B_O:
			case OLB_TEXT_B_O:
			case LB_TEXT_B_O:
			case OB_TEXT_O_O:
			case OLB_TEXT_O_O:
			case LB_TEXT_O_O:
			case OB_TEXT_L_O:
			case OLB_TEXT_L_O:
			case LB_TEXT_L_O:
			case OB_TEXT_B_T:
			case OLB_TEXT_B_T:
			case LB_TEXT_B_T:
			case OB_TEXT_O_T:
			case OLB_TEXT_O_T:
			case LB_TEXT_O_T:
			case OB_TEXT_L_T:
			case OLB_TEXT_L_T:
			case LB_TEXT_L_T:
				enterOuterAlt(_localctx, 8);
				{
				setState(372);
				text();
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

	public static class ListNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> CO_B_O() { return getTokens(SlimeParser.CO_B_O); }
		public TerminalNode CO_B_O(int i) {
			return getToken(SlimeParser.CO_B_O, i);
		}
		public List<TerminalNode> CO_O_O() { return getTokens(SlimeParser.CO_O_O); }
		public TerminalNode CO_O_O(int i) {
			return getToken(SlimeParser.CO_O_O, i);
		}
		public List<TerminalNode> CO_L_O() { return getTokens(SlimeParser.CO_L_O); }
		public TerminalNode CO_L_O(int i) {
			return getToken(SlimeParser.CO_L_O, i);
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
		enterRule(_localctx, 92, RULE_listName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(381);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(375);
						match(NAME_B_O);
						setState(376);
						match(CO_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(377);
						match(NAME_O_O);
						setState(378);
						match(CO_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(379);
						match(NAME_L_O);
						setState(380);
						match(CO_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==NAME_B_O || _la==NAME_O_O || _la==NAME_L_O) ) {
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

	public static class VariPathContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> INTE_B_O() { return getTokens(SlimeParser.INTE_B_O); }
		public TerminalNode INTE_B_O(int i) {
			return getToken(SlimeParser.INTE_B_O, i);
		}
		public List<TerminalNode> INTE_O_O() { return getTokens(SlimeParser.INTE_O_O); }
		public TerminalNode INTE_O_O(int i) {
			return getToken(SlimeParser.INTE_O_O, i);
		}
		public List<TerminalNode> INTE_L_O() { return getTokens(SlimeParser.INTE_L_O); }
		public TerminalNode INTE_L_O(int i) {
			return getToken(SlimeParser.INTE_L_O, i);
		}
		public List<TerminalNode> PE_B_O() { return getTokens(SlimeParser.PE_B_O); }
		public TerminalNode PE_B_O(int i) {
			return getToken(SlimeParser.PE_B_O, i);
		}
		public List<TerminalNode> PE_O_O() { return getTokens(SlimeParser.PE_O_O); }
		public TerminalNode PE_O_O(int i) {
			return getToken(SlimeParser.PE_O_O, i);
		}
		public List<TerminalNode> PE_L_O() { return getTokens(SlimeParser.PE_L_O); }
		public TerminalNode PE_L_O(int i) {
			return getToken(SlimeParser.PE_L_O, i);
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
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(400);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(388);
						match(NAME_B_O);
						setState(389);
						match(PE_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(390);
						match(NAME_O_O);
						setState(391);
						match(PE_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(392);
						match(NAME_L_O);
						setState(393);
						match(PE_L_O);
						}
						break;
					case INTE_B_O:
						{
						setState(394);
						match(INTE_B_O);
						setState(395);
						match(PE_B_O);
						}
						break;
					case INTE_O_O:
						{
						setState(396);
						match(INTE_O_O);
						setState(397);
						match(PE_O_O);
						}
						break;
					case INTE_L_O:
						{
						setState(398);
						match(INTE_L_O);
						setState(399);
						match(PE_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(405);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NAME_B_O - 104)) | (1L << (INTE_B_O - 104)) | (1L << (NAME_O_O - 104)) | (1L << (INTE_O_O - 104)))) != 0) || _la==NAME_L_O || _la==INTE_L_O) ) {
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

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> NAME_B_O() { return getTokens(SlimeParser.NAME_B_O); }
		public TerminalNode NAME_B_O(int i) {
			return getToken(SlimeParser.NAME_B_O, i);
		}
		public List<TerminalNode> NAME_O_O() { return getTokens(SlimeParser.NAME_O_O); }
		public TerminalNode NAME_O_O(int i) {
			return getToken(SlimeParser.NAME_O_O, i);
		}
		public List<TerminalNode> NAME_L_O() { return getTokens(SlimeParser.NAME_L_O); }
		public TerminalNode NAME_L_O(int i) {
			return getToken(SlimeParser.NAME_L_O, i);
		}
		public List<TerminalNode> NAME_B_R() { return getTokens(SlimeParser.NAME_B_R); }
		public TerminalNode NAME_B_R(int i) {
			return getToken(SlimeParser.NAME_B_R, i);
		}
		public List<TerminalNode> NAME_O_R() { return getTokens(SlimeParser.NAME_O_R); }
		public TerminalNode NAME_O_R(int i) {
			return getToken(SlimeParser.NAME_O_R, i);
		}
		public List<TerminalNode> NAME_L_R() { return getTokens(SlimeParser.NAME_L_R); }
		public TerminalNode NAME_L_R(int i) {
			return getToken(SlimeParser.NAME_L_R, i);
		}
		public List<TerminalNode> CL_B_O() { return getTokens(SlimeParser.CL_B_O); }
		public TerminalNode CL_B_O(int i) {
			return getToken(SlimeParser.CL_B_O, i);
		}
		public List<TerminalNode> CL_O_O() { return getTokens(SlimeParser.CL_O_O); }
		public TerminalNode CL_O_O(int i) {
			return getToken(SlimeParser.CL_O_O, i);
		}
		public List<TerminalNode> CL_L_O() { return getTokens(SlimeParser.CL_L_O); }
		public TerminalNode CL_L_O(int i) {
			return getToken(SlimeParser.CL_L_O, i);
		}
		public List<TerminalNode> CL_L_R() { return getTokens(SlimeParser.CL_L_R); }
		public TerminalNode CL_L_R(int i) {
			return getToken(SlimeParser.CL_L_R, i);
		}
		public List<TerminalNode> CL_O_R() { return getTokens(SlimeParser.CL_O_R); }
		public TerminalNode CL_O_R(int i) {
			return getToken(SlimeParser.CL_O_R, i);
		}
		public List<TerminalNode> CL_B_R() { return getTokens(SlimeParser.CL_B_R); }
		public TerminalNode CL_B_R(int i) {
			return getToken(SlimeParser.CL_B_R, i);
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
		enterRule(_localctx, 96, RULE_typeName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(419);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(407);
						match(NAME_B_O);
						setState(408);
						match(CL_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(409);
						match(NAME_O_O);
						setState(410);
						match(CL_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(411);
						match(NAME_L_O);
						setState(412);
						match(CL_L_O);
						}
						break;
					case NAME_L_R:
						{
						setState(413);
						match(NAME_L_R);
						setState(414);
						match(CL_L_R);
						}
						break;
					case NAME_O_R:
						{
						setState(415);
						match(NAME_O_R);
						setState(416);
						match(CL_O_R);
						}
						break;
					case NAME_B_R:
						{
						setState(417);
						match(NAME_B_R);
						setState(418);
						match(CL_B_R);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(424);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (NAME_B_R - 50)) | (1L << (NAME_O_R - 50)) | (1L << (NAME_L_R - 50)) | (1L << (NAME_B_O - 50)))) != 0) || _la==NAME_O_O || _la==NAME_L_O) ) {
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
		enterRule(_localctx, 98, RULE_textOutor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e4\u01af\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a3\n\21\f\21\16"+
		"\21\u00a6\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\6\25\u00bf\n\25\r\25\16\25\u00c0\3\26\3\26\3\27\3\27\7\27\u00c7"+
		"\n\27\f\27\16\27\u00ca\13\27\3\27\3\27\3\27\5\27\u00cf\n\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u00da\n\32\f\32\16\32\u00dd\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00e6\n\33\3\33\3\33\5\33"+
		"\u00ea\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u00f7\n\37\f\37\16\37\u00fa\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7 \u0105"+
		"\n \f \16 \u0108\13 \5 \u010a\n \3 \3 \5 \u010e\n \3!\3!\3!\3!\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3%\3%\5%\u011e\n%\3%\3%\7%\u0122\n%\f%\16%\u0125\13"+
		"%\3%\3%\5%\u0129\n%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\5)\u0134\n)\3)\3)\3"+
		")\3)\3*\3*\3*\7*\u013d\n*\f*\16*\u0140\13*\3*\3*\3+\3+\3+\3+\3+\7+\u0149"+
		"\n+\f+\16+\u014c\13+\3+\3+\3+\3+\7+\u0152\n+\f+\16+\u0155\13+\3+\3+\3"+
		"+\3+\7+\u015b\n+\f+\16+\u015e\13+\3+\5+\u0161\n+\3+\5+\u0164\n+\3,\3,"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0178\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u0180\n\60\f\60\16\60\u0183\13\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0193"+
		"\n\61\f\61\16\61\u0196\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\7\62\u01a6\n\62\f\62\16\62\u01a9\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\"\27\2\f\f\25\25\36\36"+
		"OOXXaavv\177\177\u0088\u0088\u009d\u009d\u00a6\u00a6\u00af\u00af\u00c5"+
		"\u00c5\u00c8\u00c8\u00cb\u00cb\u00d1\u00d1\u00d4\u00d4\u00d7\u00d7\u00dd"+
		"\u00dd\u00e0\u00e0\u00e3\u00e3\5\2\u00bb\u00bb\u00bd\u00bd\u00bf\u00bf"+
		"\5\2\u00ba\u00ba\u00bc\u00bc\u00be\u00be\16\2\7\7\20\20\31\31JJSS\\\\"+
		"qqzz\u0083\u0083\u0098\u0098\u00a1\u00a1\u00aa\u00aa\5\2\65\65;;AA\5\2"+
		"\62\6288>>\27\2\5\5\16\16\27\27HHQQZZooxx\u0081\u0081\u0096\u0096\u009f"+
		"\u009f\u00a8\u00a8\u00c3\u00c3\u00c6\u00c6\u00c9\u00c9\u00cf\u00cf\u00d2"+
		"\u00d2\u00d5\u00d5\u00db\u00db\u00de\u00de\u00e1\u00e1\5\2##))--\27\2"+
		"\6\6\17\17\30\30IIRR[[ppyy\u0082\u0082\u0097\u0097\u00a0\u00a0\u00a9\u00a9"+
		"\u00c4\u00c4\u00c7\u00c7\u00ca\u00ca\u00d0\u00d0\u00d3\u00d3\u00d6\u00d6"+
		"\u00dc\u00dc\u00df\u00df\u00e2\u00e2\5\2$$))--\5\2%%**..\16\2\r\r\26\26"+
		"\37\37PPYYbbww\u0080\u0080\u0089\u0089\u009e\u009e\u00a7\u00a7\u00b0\u00b0"+
		"\5\2\u00cc\u00cc\u00d8\u00d8\u00e4\u00e4\5\2\u00c0\u00c0\u00cd\u00cd\u00d9"+
		"\u00d9\16\2\b\b\21\21\32\32KKTT]]rr{{\u0084\u0084\u0099\u0099\u00a2\u00a2"+
		"\u00ab\u00ab\5\2ii\u0090\u0090\u00b7\u00b7\5\2gg\u008e\u008e\u00b5\u00b5"+
		"\5\2cc\u008a\u008a\u00b1\u00b1\5\2DDnn\u0095\u0095\16\2\t\t\22\22\33\33"+
		"LLUU^^ss||\u0085\u0085\u009a\u009a\u00a3\u00a3\u00ac\u00ac\5\2ee\u008c"+
		"\u008c\u00b3\u00b3\5\2hh\u008f\u008f\u00b6\u00b6\5\2EEnn\u0095\u0095\16"+
		"\2\13\13\24\24\35\35NNWW``uu~~\u0087\u0087\u009c\u009c\u00a5\u00a5\u00ae"+
		"\u00ae\5\2GGnn\u0095\u0095\16\2\n\n\23\23\34\34MMVV__tt}}\u0086\u0086"+
		"\u009b\u009b\u00a4\u00a4\u00ad\u00ad\5\2dd\u008b\u008b\u00b2\u00b2\5\2"+
		"FFnn\u0095\u0095\5\2ff\u008d\u008d\u00b4\u00b4\5\2jj\u0091\u0091\u00b8"+
		"\u00b8\5\2jk\u0091\u0092\u00b8\u00b9\b\2\64\64::@@jj\u0091\u0091\u00b8"+
		"\u00b8\2\u01be\2t\3\2\2\2\4w\3\2\2\2\6{\3\2\2\2\b}\3\2\2\2\n\177\3\2\2"+
		"\2\f\u0081\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22\u008a\3\2\2\2"+
		"\24\u008c\3\2\2\2\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34"+
		"\u0098\3\2\2\2\36\u009a\3\2\2\2 \u00a4\3\2\2\2\"\u00a9\3\2\2\2$\u00ad"+
		"\3\2\2\2&\u00b4\3\2\2\2(\u00be\3\2\2\2*\u00c2\3\2\2\2,\u00ce\3\2\2\2."+
		"\u00d0\3\2\2\2\60\u00d4\3\2\2\2\62\u00db\3\2\2\2\64\u00e9\3\2\2\2\66\u00eb"+
		"\3\2\2\28\u00ed\3\2\2\2:\u00f1\3\2\2\2<\u00f8\3\2\2\2>\u010d\3\2\2\2@"+
		"\u010f\3\2\2\2B\u0113\3\2\2\2D\u0115\3\2\2\2F\u0119\3\2\2\2H\u0123\3\2"+
		"\2\2J\u012a\3\2\2\2L\u012c\3\2\2\2N\u0130\3\2\2\2P\u0133\3\2\2\2R\u013e"+
		"\3\2\2\2T\u0163\3\2\2\2V\u0165\3\2\2\2X\u0167\3\2\2\2Z\u016b\3\2\2\2\\"+
		"\u0177\3\2\2\2^\u0181\3\2\2\2`\u0194\3\2\2\2b\u01a7\3\2\2\2d\u01ac\3\2"+
		"\2\2fs\5\4\3\2gs\5\f\7\2hs\5\24\13\2is\5\32\16\2js\5\"\22\2ks\5D#\2ls"+
		"\5.\30\2ms\58\35\2ns\5L\'\2os\5D#\2ps\5\f\7\2qs\5d\63\2rf\3\2\2\2rg\3"+
		"\2\2\2rh\3\2\2\2ri\3\2\2\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3"+
		"\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\3"+
		"\3\2\2\2vt\3\2\2\2wx\5\6\4\2xy\5\b\5\2yz\5\n\6\2z\5\3\2\2\2{|\t\2\2\2"+
		"|\7\3\2\2\2}~\t\3\2\2~\t\3\2\2\2\177\u0080\t\4\2\2\u0080\13\3\2\2\2\u0081"+
		"\u0082\5\16\b\2\u0082\u0083\5\20\t\2\u0083\u0084\5\22\n\2\u0084\r\3\2"+
		"\2\2\u0085\u0086\t\5\2\2\u0086\17\3\2\2\2\u0087\u0088\5b\62\2\u0088\u0089"+
		"\t\6\2\2\u0089\21\3\2\2\2\u008a\u008b\t\7\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\5\26\f\2\u008d\u008e\5 \21\2\u008e\u008f\5\30\r\2\u008f\25\3\2\2\2\u0090"+
		"\u0091\t\b\2\2\u0091\27\3\2\2\2\u0092\u0093\t\t\2\2\u0093\31\3\2\2\2\u0094"+
		"\u0095\5\34\17\2\u0095\u0096\5 \21\2\u0096\u0097\5\36\20\2\u0097\33\3"+
		"\2\2\2\u0098\u0099\t\n\2\2\u0099\35\3\2\2\2\u009a\u009b\t\13\2\2\u009b"+
		"\37\3\2\2\2\u009c\u009d\7%\2\2\u009d\u00a3\7&\2\2\u009e\u009f\7*\2\2\u009f"+
		"\u00a3\7+\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a3\7/\2\2\u00a2\u009c\3\2\2"+
		"\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\t\f\2\2\u00a8!\3\2\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5&\24\2"+
		"\u00ab\u00ac\5*\26\2\u00ac#\3\2\2\2\u00ad\u00ae\t\r\2\2\u00ae%\3\2\2\2"+
		"\u00af\u00b0\5(\25\2\u00b0\u00b1\t\16\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5(\25\2\u00b8\'\3\2\2\2"+
		"\u00b9\u00bf\5\4\3\2\u00ba\u00bf\5\24\13\2\u00bb\u00bf\5\32\16\2\u00bc"+
		"\u00bf\5,\27\2\u00bd\u00bf\7\u00c2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba"+
		"\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1)\3\2\2\2"+
		"\u00c2\u00c3\t\17\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7\u00c1\2\2\u00c5\u00c7"+
		"\7\u00c2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf"+
		"\7\u00c1\2\2\u00cc\u00cf\7\u00ce\2\2\u00cd\u00cf\7\u00da\2\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf-\3\2\2\2\u00d0"+
		"\u00d1\5\60\31\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\5\66\34\2\u00d3/\3"+
		"\2\2\2\u00d4\u00d5\t\20\2\2\u00d5\61\3\2\2\2\u00d6\u00d7\5\64\33\2\u00d7"+
		"\u00d8\t\21\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\5\64\33\2\u00df\63\3\2\2\2\u00e0\u00e5\5\\"+
		"/\2\u00e1\u00e2\t\22\2\2\u00e2\u00e6\5\"\22\2\u00e3\u00e4\t\22\2\2\u00e4"+
		"\u00e6\5\32\16\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e8\t\23\2\2\u00e8\u00ea\5`\61\2\u00e9"+
		"\u00e0\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\65\3\2\2\2\u00eb\u00ec\t\24\2"+
		"\2\u00ec\67\3\2\2\2\u00ed\u00ee\5:\36\2\u00ee\u00ef\5<\37\2\u00ef\u00f0"+
		"\5B\"\2\u00f09\3\2\2\2\u00f1\u00f2\t\25\2\2\u00f2;\3\2\2\2\u00f3\u00f4"+
		"\5> \2\u00f4\u00f5\t\21\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5> \2\u00fc=\3\2\2\2\u00fd\u00fe"+
		"\5\\/\2\u00fe\u00ff\t\26\2\2\u00ff\u0109\5\\/\2\u0100\u0101\t\22\2\2\u0101"+
		"\u0106\5@!\2\u0102\u0103\t\27\2\2\u0103\u0105\5@!\2\u0104\u0102\3\2\2"+
		"\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010e\3\2\2\2\u010b\u010c\t\23\2\2\u010c\u010e\5`\61\2\u010d\u00fd\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010e?\3\2\2\2\u010f\u0110\5`\61\2\u0110\u0111"+
		"\t\26\2\2\u0111\u0112\5`\61\2\u0112A\3\2\2\2\u0113\u0114\t\30\2\2\u0114"+
		"C\3\2\2\2\u0115\u0116\5F$\2\u0116\u0117\5H%\2\u0117\u0118\5J&\2\u0118"+
		"E\3\2\2\2\u0119\u011a\t\31\2\2\u011aG\3\2\2\2\u011b\u011e\5`\61\2\u011c"+
		"\u011e\5\f\7\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\t\21\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0129\5`\61\2\u0127\u0129\5\f\7\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129I\3\2\2\2\u012a\u012b\t\32\2\2"+
		"\u012bK\3\2\2\2\u012c\u012d\5N(\2\u012d\u012e\5R*\2\u012e\u012f\5V,\2"+
		"\u012fM\3\2\2\2\u0130\u0131\t\33\2\2\u0131O\3\2\2\2\u0132\u0134\5^\60"+
		"\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\t\22\2\2\u0136\u0137\5b\62\2\u0137\u0138\t\34\2\2\u0138Q\3\2\2\2\u0139"+
		"\u013a\5T+\2\u013a\u013b\t\21\2\2\u013b\u013d\3\2\2\2\u013c\u0139\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\5T+\2\u0142S\3\2\2\2\u0143"+
		"\u0160\5P)\2\u0144\u0161\5^\60\2\u0145\u0146\5Z.\2\u0146\u0147\t\27\2"+
		"\2\u0147\u0149\3\2\2\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u0161\5Z.\2\u014e\u014f\5X-\2\u014f\u0150\t\27\2\2\u0150\u0152\3\2\2"+
		"\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0161\5X-\2\u0157"+
		"\u0158\5\\/\2\u0158\u0159\t\27\2\2\u0159\u015b\3\2\2\2\u015a\u0157\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\5\\/\2\u0160\u0144\3\2"+
		"\2\2\u0160\u014a\3\2\2\2\u0160\u0153\3\2\2\2\u0160\u015c\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0164\5\\/\2\u0163\u0143\3\2\2\2\u0163\u0162\3\2"+
		"\2\2\u0164U\3\2\2\2\u0165\u0166\t\35\2\2\u0166W\3\2\2\2\u0167\u0168\5"+
		"^\60\2\u0168\u0169\t\22\2\2\u0169\u016a\5\\/\2\u016aY\3\2\2\2\u016b\u016c"+
		"\5^\60\2\u016c\u016d\t\36\2\2\u016d\u016e\5b\62\2\u016e[\3\2\2\2\u016f"+
		"\u0178\5`\61\2\u0170\u0178\5L\'\2\u0171\u0178\5\"\22\2\u0172\u0178\5\32"+
		"\16\2\u0173\u0178\5\24\13\2\u0174\u0178\5\f\7\2\u0175\u0178\58\35\2\u0176"+
		"\u0178\5\4\3\2\u0177\u016f\3\2\2\2\u0177\u0170\3\2\2\2\u0177\u0171\3\2"+
		"\2\2\u0177\u0172\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178]\3\2\2\2\u0179\u017a\7j\2\2\u017a"+
		"\u0180\7h\2\2\u017b\u017c\7\u0091\2\2\u017c\u0180\7\u008f\2\2\u017d\u017e"+
		"\7\u00b8\2\2\u017e\u0180\7\u00b6\2\2\u017f\u0179\3\2\2\2\u017f\u017b\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\t\37"+
		"\2\2\u0185_\3\2\2\2\u0186\u0187\7j\2\2\u0187\u0193\7f\2\2\u0188\u0189"+
		"\7\u0091\2\2\u0189\u0193\7\u008d\2\2\u018a\u018b\7\u00b8\2\2\u018b\u0193"+
		"\7\u00b4\2\2\u018c\u018d\7k\2\2\u018d\u0193\7f\2\2\u018e\u018f\7\u0092"+
		"\2\2\u018f\u0193\7\u008d\2\2\u0190\u0191\7\u00b9\2\2\u0191\u0193\7\u00b4"+
		"\2\2\u0192\u0186\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u018a\3\2\2\2\u0192"+
		"\u018c\3\2\2\2\u0192\u018e\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\t \2\2\u0198a\3\2\2\2\u0199\u019a\7j\2\2\u019a"+
		"\u01a6\7g\2\2\u019b\u019c\7\u0091\2\2\u019c\u01a6\7\u008e\2\2\u019d\u019e"+
		"\7\u00b8\2\2\u019e\u01a6\7\u00b5\2\2\u019f\u01a0\7@\2\2\u01a0\u01a6\7"+
		"?\2\2\u01a1\u01a2\7:\2\2\u01a2\u01a6\79\2\2\u01a3\u01a4\7\64\2\2\u01a4"+
		"\u01a6\7\63\2\2\u01a5\u0199\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u019d\3"+
		"\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\t!\2\2\u01abc\3\2\2\2\u01ac\u01ad"+
		"\7 \2\2\u01ade\3\2\2\2#rt\u00a2\u00a4\u00b4\u00be\u00c0\u00c8\u00ce\u00db"+
		"\u00e5\u00e9\u00f8\u0106\u0109\u010d\u011d\u0123\u0128\u0133\u013e\u014a"+
		"\u0153\u015c\u0160\u0163\u0177\u017f\u0181\u0192\u0194\u01a5\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
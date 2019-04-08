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
		OB_INSE=7, OB_DECL=8, OB_DELE=9, OB_TEXT=10, OB_TEMP=11, OLB_SLOT=12, 
		OLB_SPEC=13, OLB_REFE=14, OLB_EXPA=15, OLB_INSE=16, OLB_DECL=17, OLB_DELE=18, 
		OLB_TEXT=19, OLB_TEMP=20, LB_SLOT=21, LB_SPEC=22, LB_REFE=23, LB_EXPA=24, 
		LB_INSE=25, LB_DECL=26, LB_DELE=27, LB_TEXT=28, LB_TEMP=29, TEXT_OUTOR=30, 
		COMM_B_S=31, WS_B_S=32, CB_SLOT=33, CB_SPEC=34, NAME_B_S=35, SC_B_S=36, 
		COMM_O_S=37, WS_O_S=38, NL_SLSP=39, NAME_O_S=40, SC_O_S=41, COMM_L_S=42, 
		NW_SLSP=43, NAME_L_S=44, SC_L_S=45, COMM_REFE=46, WS_B_R=47, CB_REFE=48, 
		CL_B_R=49, NAME_B_R=50, IN_B_R=51, COMM_O_R=52, WS_O_R=53, NL_REFE=54, 
		CL_O_R=55, NAME_O_R=56, IN_O_R=57, COMM_L_R=58, WS_L_R=59, NW_REFE=60, 
		CL_L_R=61, NAME_L_R=62, IN_L_R=63, COMM_B_O=64, WS_B_O=65, CB_EXPA=66, 
		CB_INSE=67, CB_DECL=68, CB_DELE=69, OB_SLOT_B_O=70, OB_SPEC_B_O=71, OB_REFE_B_O=72, 
		OB_EXPA_B_O=73, OB_INSE_B_O=74, OB_DECL_B_O=75, OB_DELE_B_O=76, OB_TEXT_B_O=77, 
		OB_TEMP_B_O=78, OLB_SLOT_B_O=79, OLB_SPEC_B_O=80, OLB_REFE_B_O=81, OLB_EXPA_B_O=82, 
		OLB_INSE_B_O=83, OLB_DECL_B_O=84, OLB_DELE_B_O=85, OLB_TEXT_B_O=86, OLB_TEMP_B_O=87, 
		LB_SLOT_B_O=88, LB_SPEC_B_O=89, LB_REFE_B_O=90, LB_EXPA_B_O=91, LB_INSE_B_O=92, 
		LB_DECL_B_O=93, LB_DELE_B_O=94, LB_TEXT_B_O=95, LB_TEMP_B_O=96, OB_IMPORT=97, 
		EQOP_B_O=98, INOP_B_O=99, PE_B_O=100, CL_B_O=101, CO_B_O=102, SC_B_O=103, 
		NAME_B_O=104, INTE_B_O=105, COMM_O_O=106, WS_O_O=107, NL_OPER=108, OB_SLOT_O_O=109, 
		OB_SPEC_O_O=110, OB_REFE_O_O=111, OB_EXPA_O_O=112, OB_INSE_O_O=113, OB_DECL_O_O=114, 
		OB_DELE_O_O=115, OB_TEXT_O_O=116, OB_TEMP_O_O=117, OLB_SLOT_O_O=118, OLB_SPEC_O_O=119, 
		OLB_REFE_O_O=120, OLB_EXPA_O_O=121, OLB_INSE_O_O=122, OLB_DECL_O_O=123, 
		OLB_DELE_O_O=124, OLB_TEXT_O_O=125, OLB_TEMP_O_O=126, LB_SLOT_O_O=127, 
		LB_SPEC_O_O=128, LB_REFE_O_O=129, LB_EXPA_O_O=130, LB_INSE_O_O=131, LB_DECL_O_O=132, 
		LB_DELE_O_O=133, LB_TEXT_O_O=134, LB_TEMP_O_O=135, OL_IMPORT=136, EQOP_O_O=137, 
		INOP_O_O=138, PE_O_O=139, CL_O_O=140, CO_O_O=141, SC_O_O=142, NAME_O_O=143, 
		INTE_O_O=144, COMM_L_O=145, WS_L_O=146, NW_OPER=147, OB_SLOT_L_O=148, 
		OB_SPEC_L_O=149, OB_REFE_L_O=150, OB_EXPA_L_O=151, OB_INSE_L_O=152, OB_DECL_L_O=153, 
		OB_DELE_L_O=154, OB_TEXT_L_O=155, OB_TEMP_L_O=156, OLB_SLOT_L_O=157, OLB_SPEC_L_O=158, 
		OLB_REFE_L_O=159, OLB_EXPA_L_O=160, OLB_INSE_L_O=161, OLB_DECL_L_O=162, 
		OLB_DELE_L_O=163, OLB_TEXT_L_O=164, OLB_TEMP_L_O=165, LB_SLOT_L_O=166, 
		LB_SPEC_L_O=167, LB_REFE_L_O=168, LB_EXPA_L_O=169, LB_INSE_L_O=170, LB_DECL_L_O=171, 
		LB_DELE_L_O=172, LB_TEXT_L_O=173, LB_TEMP_L_O=174, L_IMPORT=175, EQOP_L_O=176, 
		INOP_L_O=177, PE_L_O=178, CL_L_O=179, CO_L_O=180, SC_L_O=181, NAME_L_O=182, 
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
		RULE_all = 0, RULE_text = 1, RULE_text_head = 2, RULE_text_body = 3, RULE_text_tail = 4, 
		RULE_refe = 5, RULE_refe_head = 6, RULE_refe_body = 7, RULE_refe_tail = 8, 
		RULE_slot = 9, RULE_slot_head = 10, RULE_slot_tail = 11, RULE_spec = 12, 
		RULE_spec_head = 13, RULE_spec_tail = 14, RULE_spsl_body = 15, RULE_temp = 16, 
		RULE_temp_head = 17, RULE_temp_body = 18, RULE_temp_tail = 19, RULE_temp_line = 20, 
		RULE_temp_text = 21, RULE_expa = 22, RULE_expa_head = 23, RULE_expa_body = 24, 
		RULE_expa_tail = 25, RULE_inse = 26, RULE_inse_head = 27, RULE_inse_body = 28, 
		RULE_inse_body_part = 29, RULE_inse_element = 30, RULE_inse_tail = 31, 
		RULE_dele = 32, RULE_dele_head = 33, RULE_dele_body = 34, RULE_dele_tail = 35, 
		RULE_decl = 36, RULE_decl_head = 37, RULE_decl_neck = 38, RULE_decl_body = 39, 
		RULE_decl_body_part = 40, RULE_decl_tail = 41, RULE_nameValue = 42, RULE_nameType = 43, 
		RULE_vari = 44, RULE_listName = 45, RULE_variName = 46, RULE_variNameIndx = 47, 
		RULE_typeName = 48, RULE_text_outor = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"all", "text", "text_head", "text_body", "text_tail", "refe", "refe_head", 
			"refe_body", "refe_tail", "slot", "slot_head", "slot_tail", "spec", "spec_head", 
			"spec_tail", "spsl_body", "temp", "temp_head", "temp_body", "temp_tail", 
			"temp_line", "temp_text", "expa", "expa_head", "expa_body", "expa_tail", 
			"inse", "inse_head", "inse_body", "inse_body_part", "inse_element", "inse_tail", 
			"dele", "dele_head", "dele_body", "dele_tail", "decl", "decl_head", "decl_neck", 
			"decl_body", "decl_body_part", "decl_tail", "nameValue", "nameType", 
			"vari", "listName", "variName", "variNameIndx", "typeName", "text_outor"
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
			null, null, null, null, null, null, null, "'>}'", "'<}'", "'+}'", null, 
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
			"OB_INSE", "OB_DECL", "OB_DELE", "OB_TEXT", "OB_TEMP", "OLB_SLOT", "OLB_SPEC", 
			"OLB_REFE", "OLB_EXPA", "OLB_INSE", "OLB_DECL", "OLB_DELE", "OLB_TEXT", 
			"OLB_TEMP", "LB_SLOT", "LB_SPEC", "LB_REFE", "LB_EXPA", "LB_INSE", "LB_DECL", 
			"LB_DELE", "LB_TEXT", "LB_TEMP", "TEXT_OUTOR", "COMM_B_S", "WS_B_S", 
			"CB_SLOT", "CB_SPEC", "NAME_B_S", "SC_B_S", "COMM_O_S", "WS_O_S", "NL_SLSP", 
			"NAME_O_S", "SC_O_S", "COMM_L_S", "NW_SLSP", "NAME_L_S", "SC_L_S", "COMM_REFE", 
			"WS_B_R", "CB_REFE", "CL_B_R", "NAME_B_R", "IN_B_R", "COMM_O_R", "WS_O_R", 
			"NL_REFE", "CL_O_R", "NAME_O_R", "IN_O_R", "COMM_L_R", "WS_L_R", "NW_REFE", 
			"CL_L_R", "NAME_L_R", "IN_L_R", "COMM_B_O", "WS_B_O", "CB_EXPA", "CB_INSE", 
			"CB_DECL", "CB_DELE", "OB_SLOT_B_O", "OB_SPEC_B_O", "OB_REFE_B_O", "OB_EXPA_B_O", 
			"OB_INSE_B_O", "OB_DECL_B_O", "OB_DELE_B_O", "OB_TEXT_B_O", "OB_TEMP_B_O", 
			"OLB_SLOT_B_O", "OLB_SPEC_B_O", "OLB_REFE_B_O", "OLB_EXPA_B_O", "OLB_INSE_B_O", 
			"OLB_DECL_B_O", "OLB_DELE_B_O", "OLB_TEXT_B_O", "OLB_TEMP_B_O", "LB_SLOT_B_O", 
			"LB_SPEC_B_O", "LB_REFE_B_O", "LB_EXPA_B_O", "LB_INSE_B_O", "LB_DECL_B_O", 
			"LB_DELE_B_O", "LB_TEXT_B_O", "LB_TEMP_B_O", "OB_IMPORT", "EQOP_B_O", 
			"INOP_B_O", "PE_B_O", "CL_B_O", "CO_B_O", "SC_B_O", "NAME_B_O", "INTE_B_O", 
			"COMM_O_O", "WS_O_O", "NL_OPER", "OB_SLOT_O_O", "OB_SPEC_O_O", "OB_REFE_O_O", 
			"OB_EXPA_O_O", "OB_INSE_O_O", "OB_DECL_O_O", "OB_DELE_O_O", "OB_TEXT_O_O", 
			"OB_TEMP_O_O", "OLB_SLOT_O_O", "OLB_SPEC_O_O", "OLB_REFE_O_O", "OLB_EXPA_O_O", 
			"OLB_INSE_O_O", "OLB_DECL_O_O", "OLB_DELE_O_O", "OLB_TEXT_O_O", "OLB_TEMP_O_O", 
			"LB_SLOT_O_O", "LB_SPEC_O_O", "LB_REFE_O_O", "LB_EXPA_O_O", "LB_INSE_O_O", 
			"LB_DECL_O_O", "LB_DELE_O_O", "LB_TEXT_O_O", "LB_TEMP_O_O", "OL_IMPORT", 
			"EQOP_O_O", "INOP_O_O", "PE_O_O", "CL_O_O", "CO_O_O", "SC_O_O", "NAME_O_O", 
			"INTE_O_O", "COMM_L_O", "WS_L_O", "NW_OPER", "OB_SLOT_L_O", "OB_SPEC_L_O", 
			"OB_REFE_L_O", "OB_EXPA_L_O", "OB_INSE_L_O", "OB_DECL_L_O", "OB_DELE_L_O", 
			"OB_TEXT_L_O", "OB_TEMP_L_O", "OLB_SLOT_L_O", "OLB_SPEC_L_O", "OLB_REFE_L_O", 
			"OLB_EXPA_L_O", "OLB_INSE_L_O", "OLB_DECL_L_O", "OLB_DELE_L_O", "OLB_TEXT_L_O", 
			"OLB_TEMP_L_O", "LB_SLOT_L_O", "LB_SPEC_L_O", "LB_REFE_L_O", "LB_EXPA_L_O", 
			"LB_INSE_L_O", "LB_DECL_L_O", "LB_DELE_L_O", "LB_TEXT_L_O", "LB_TEMP_L_O", 
			"L_IMPORT", "EQOP_L_O", "INOP_L_O", "PE_L_O", "CL_L_O", "CO_L_O", "SC_L_O", 
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

	public static class AllContext extends ParserRuleContext {
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
		public List<InseContext> inse() {
			return getRuleContexts(InseContext.class);
		}
		public InseContext inse(int i) {
			return getRuleContext(InseContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<Text_outorContext> text_outor() {
			return getRuleContexts(Text_outorContext.class);
		}
		public Text_outorContext text_outor(int i) {
			return getRuleContext(Text_outorContext.class,i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_SLOT) | (1L << OB_SPEC) | (1L << OB_REFE) | (1L << OB_EXPA) | (1L << OB_INSE) | (1L << OB_DECL) | (1L << OB_DELE) | (1L << OB_TEXT) | (1L << OB_TEMP) | (1L << OLB_SLOT) | (1L << OLB_SPEC) | (1L << OLB_REFE) | (1L << OLB_EXPA) | (1L << OLB_INSE) | (1L << OLB_DECL) | (1L << OLB_DELE) | (1L << OLB_TEXT) | (1L << OLB_TEMP) | (1L << LB_SLOT) | (1L << LB_SPEC) | (1L << LB_REFE) | (1L << LB_EXPA) | (1L << LB_INSE) | (1L << LB_DECL) | (1L << LB_DELE) | (1L << LB_TEXT) | (1L << LB_TEMP) | (1L << TEXT_OUTOR))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OB_SLOT_B_O - 70)) | (1L << (OB_SPEC_B_O - 70)) | (1L << (OB_REFE_B_O - 70)) | (1L << (OB_EXPA_B_O - 70)) | (1L << (OB_INSE_B_O - 70)) | (1L << (OB_DECL_B_O - 70)) | (1L << (OB_DELE_B_O - 70)) | (1L << (OB_TEXT_B_O - 70)) | (1L << (OB_TEMP_B_O - 70)) | (1L << (OLB_SLOT_B_O - 70)) | (1L << (OLB_SPEC_B_O - 70)) | (1L << (OLB_REFE_B_O - 70)) | (1L << (OLB_EXPA_B_O - 70)) | (1L << (OLB_INSE_B_O - 70)) | (1L << (OLB_DECL_B_O - 70)) | (1L << (OLB_DELE_B_O - 70)) | (1L << (OLB_TEXT_B_O - 70)) | (1L << (OLB_TEMP_B_O - 70)) | (1L << (LB_SLOT_B_O - 70)) | (1L << (LB_SPEC_B_O - 70)) | (1L << (LB_REFE_B_O - 70)) | (1L << (LB_EXPA_B_O - 70)) | (1L << (LB_INSE_B_O - 70)) | (1L << (LB_DECL_B_O - 70)) | (1L << (LB_DELE_B_O - 70)) | (1L << (LB_TEXT_B_O - 70)) | (1L << (LB_TEMP_B_O - 70)) | (1L << (OB_SLOT_O_O - 70)) | (1L << (OB_SPEC_O_O - 70)) | (1L << (OB_REFE_O_O - 70)) | (1L << (OB_EXPA_O_O - 70)) | (1L << (OB_INSE_O_O - 70)) | (1L << (OB_DECL_O_O - 70)) | (1L << (OB_DELE_O_O - 70)) | (1L << (OB_TEXT_O_O - 70)) | (1L << (OB_TEMP_O_O - 70)) | (1L << (OLB_SLOT_O_O - 70)) | (1L << (OLB_SPEC_O_O - 70)) | (1L << (OLB_REFE_O_O - 70)) | (1L << (OLB_EXPA_O_O - 70)) | (1L << (OLB_INSE_O_O - 70)) | (1L << (OLB_DECL_O_O - 70)) | (1L << (OLB_DELE_O_O - 70)) | (1L << (OLB_TEXT_O_O - 70)) | (1L << (OLB_TEMP_O_O - 70)) | (1L << (LB_SLOT_O_O - 70)) | (1L << (LB_SPEC_O_O - 70)) | (1L << (LB_REFE_O_O - 70)) | (1L << (LB_EXPA_O_O - 70)) | (1L << (LB_INSE_O_O - 70)) | (1L << (LB_DECL_O_O - 70)) | (1L << (LB_DELE_O_O - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LB_TEXT_O_O - 134)) | (1L << (LB_TEMP_O_O - 134)) | (1L << (OB_SLOT_L_O - 134)) | (1L << (OB_SPEC_L_O - 134)) | (1L << (OB_REFE_L_O - 134)) | (1L << (OB_EXPA_L_O - 134)) | (1L << (OB_INSE_L_O - 134)) | (1L << (OB_DECL_L_O - 134)) | (1L << (OB_DELE_L_O - 134)) | (1L << (OB_TEXT_L_O - 134)) | (1L << (OB_TEMP_L_O - 134)) | (1L << (OLB_SLOT_L_O - 134)) | (1L << (OLB_SPEC_L_O - 134)) | (1L << (OLB_REFE_L_O - 134)) | (1L << (OLB_EXPA_L_O - 134)) | (1L << (OLB_INSE_L_O - 134)) | (1L << (OLB_DECL_L_O - 134)) | (1L << (OLB_DELE_L_O - 134)) | (1L << (OLB_TEXT_L_O - 134)) | (1L << (OLB_TEMP_L_O - 134)) | (1L << (LB_SLOT_L_O - 134)) | (1L << (LB_SPEC_L_O - 134)) | (1L << (LB_REFE_L_O - 134)) | (1L << (LB_EXPA_L_O - 134)) | (1L << (LB_INSE_L_O - 134)) | (1L << (LB_DECL_L_O - 134)) | (1L << (LB_DELE_L_O - 134)) | (1L << (LB_TEXT_L_O - 134)) | (1L << (LB_TEMP_L_O - 134)) | (1L << (OB_SLOT_B_T - 134)) | (1L << (OB_SPEC_B_T - 134)) | (1L << (OB_TEXT_B_T - 134)) | (1L << (OLB_SLOT_B_T - 134)) | (1L << (OLB_SPEC_B_T - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (OLB_TEXT_B_T - 198)) | (1L << (LB_SLOT_B_T - 198)) | (1L << (LB_SPEC_B_T - 198)) | (1L << (LB_TEXT_B_T - 198)) | (1L << (OB_SLOT_O_T - 198)) | (1L << (OB_SPEC_O_T - 198)) | (1L << (OB_TEXT_O_T - 198)) | (1L << (OLB_SLOT_O_T - 198)) | (1L << (OLB_SPEC_O_T - 198)) | (1L << (OLB_TEXT_O_T - 198)) | (1L << (LB_SLOT_O_T - 198)) | (1L << (LB_SPEC_O_T - 198)) | (1L << (LB_TEXT_O_T - 198)) | (1L << (OB_SLOT_L_T - 198)) | (1L << (OB_SPEC_L_T - 198)) | (1L << (OB_TEXT_L_T - 198)) | (1L << (OLB_SLOT_L_T - 198)) | (1L << (OLB_SPEC_L_T - 198)) | (1L << (OLB_TEXT_L_T - 198)) | (1L << (LB_SLOT_L_T - 198)) | (1L << (LB_SPEC_L_T - 198)) | (1L << (LB_TEXT_L_T - 198)))) != 0)) {
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
					inse();
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
					text_outor();
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
		public Text_headContext text_head() {
			return getRuleContext(Text_headContext.class,0);
		}
		public Text_bodyContext text_body() {
			return getRuleContext(Text_bodyContext.class,0);
		}
		public Text_tailContext text_tail() {
			return getRuleContext(Text_tailContext.class,0);
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
			text_head();
			setState(118);
			text_body();
			setState(119);
			text_tail();
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

	public static class Text_headContext extends ParserRuleContext {
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
		public Text_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_headContext text_head() throws RecognitionException {
		Text_headContext _localctx = new Text_headContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text_head);
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

	public static class Text_bodyContext extends ParserRuleContext {
		public TerminalNode IN_TEXT() { return getToken(SlimeParser.IN_TEXT, 0); }
		public TerminalNode IN_OL_TEXT() { return getToken(SlimeParser.IN_OL_TEXT, 0); }
		public TerminalNode IN_L_TEXT() { return getToken(SlimeParser.IN_L_TEXT, 0); }
		public Text_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_bodyContext text_body() throws RecognitionException {
		Text_bodyContext _localctx = new Text_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_text_body);
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

	public static class Text_tailContext extends ParserRuleContext {
		public TerminalNode CB_TEXT() { return getToken(SlimeParser.CB_TEXT, 0); }
		public TerminalNode NL_TEXT() { return getToken(SlimeParser.NL_TEXT, 0); }
		public TerminalNode NW_TEXT() { return getToken(SlimeParser.NW_TEXT, 0); }
		public Text_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_tailContext text_tail() throws RecognitionException {
		Text_tailContext _localctx = new Text_tailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text_tail);
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
		public Refe_headContext refe_head() {
			return getRuleContext(Refe_headContext.class,0);
		}
		public Refe_bodyContext refe_body() {
			return getRuleContext(Refe_bodyContext.class,0);
		}
		public Refe_tailContext refe_tail() {
			return getRuleContext(Refe_tailContext.class,0);
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
			refe_head();
			setState(128);
			refe_body();
			setState(129);
			refe_tail();
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

	public static class Refe_headContext extends ParserRuleContext {
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
		public Refe_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refe_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefe_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefe_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefe_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Refe_headContext refe_head() throws RecognitionException {
		Refe_headContext _localctx = new Refe_headContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_refe_head);
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

	public static class Refe_bodyContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IN_B_R() { return getToken(SlimeParser.IN_B_R, 0); }
		public TerminalNode IN_O_R() { return getToken(SlimeParser.IN_O_R, 0); }
		public TerminalNode IN_L_R() { return getToken(SlimeParser.IN_L_R, 0); }
		public Refe_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refe_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefe_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefe_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefe_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Refe_bodyContext refe_body() throws RecognitionException {
		Refe_bodyContext _localctx = new Refe_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_refe_body);
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

	public static class Refe_tailContext extends ParserRuleContext {
		public TerminalNode CB_REFE() { return getToken(SlimeParser.CB_REFE, 0); }
		public TerminalNode NL_REFE() { return getToken(SlimeParser.NL_REFE, 0); }
		public TerminalNode NW_REFE() { return getToken(SlimeParser.NW_REFE, 0); }
		public Refe_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refe_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterRefe_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitRefe_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitRefe_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Refe_tailContext refe_tail() throws RecognitionException {
		Refe_tailContext _localctx = new Refe_tailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_refe_tail);
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
		public Slot_headContext slot_head() {
			return getRuleContext(Slot_headContext.class,0);
		}
		public Spsl_bodyContext spsl_body() {
			return getRuleContext(Spsl_bodyContext.class,0);
		}
		public Slot_tailContext slot_tail() {
			return getRuleContext(Slot_tailContext.class,0);
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
			slot_head();
			setState(139);
			spsl_body();
			setState(140);
			slot_tail();
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

	public static class Slot_headContext extends ParserRuleContext {
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
		public Slot_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlot_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlot_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlot_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slot_headContext slot_head() throws RecognitionException {
		Slot_headContext _localctx = new Slot_headContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_slot_head);
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

	public static class Slot_tailContext extends ParserRuleContext {
		public TerminalNode CB_SLOT() { return getToken(SlimeParser.CB_SLOT, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public Slot_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSlot_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSlot_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSlot_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slot_tailContext slot_tail() throws RecognitionException {
		Slot_tailContext _localctx = new Slot_tailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_slot_tail);
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
		public Spec_headContext spec_head() {
			return getRuleContext(Spec_headContext.class,0);
		}
		public Spsl_bodyContext spsl_body() {
			return getRuleContext(Spsl_bodyContext.class,0);
		}
		public Spec_tailContext spec_tail() {
			return getRuleContext(Spec_tailContext.class,0);
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
			spec_head();
			setState(147);
			spsl_body();
			setState(148);
			spec_tail();
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

	public static class Spec_headContext extends ParserRuleContext {
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
		public Spec_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpec_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpec_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpec_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_headContext spec_head() throws RecognitionException {
		Spec_headContext _localctx = new Spec_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_spec_head);
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

	public static class Spec_tailContext extends ParserRuleContext {
		public TerminalNode CB_SPEC() { return getToken(SlimeParser.CB_SPEC, 0); }
		public TerminalNode NL_SLSP() { return getToken(SlimeParser.NL_SLSP, 0); }
		public TerminalNode NW_SLSP() { return getToken(SlimeParser.NW_SLSP, 0); }
		public Spec_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpec_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpec_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpec_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_tailContext spec_tail() throws RecognitionException {
		Spec_tailContext _localctx = new Spec_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_spec_tail);
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

	public static class Spsl_bodyContext extends ParserRuleContext {
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
		public Spsl_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spsl_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterSpsl_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitSpsl_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitSpsl_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spsl_bodyContext spsl_body() throws RecognitionException {
		Spsl_bodyContext _localctx = new Spsl_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_spsl_body);
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
		public Temp_headContext temp_head() {
			return getRuleContext(Temp_headContext.class,0);
		}
		public Temp_bodyContext temp_body() {
			return getRuleContext(Temp_bodyContext.class,0);
		}
		public Temp_tailContext temp_tail() {
			return getRuleContext(Temp_tailContext.class,0);
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
			temp_head();
			setState(168);
			temp_body();
			setState(169);
			temp_tail();
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

	public static class Temp_headContext extends ParserRuleContext {
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
		public Temp_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_headContext temp_head() throws RecognitionException {
		Temp_headContext _localctx = new Temp_headContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_temp_head);
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

	public static class Temp_bodyContext extends ParserRuleContext {
		public List<Temp_lineContext> temp_line() {
			return getRuleContexts(Temp_lineContext.class);
		}
		public Temp_lineContext temp_line(int i) {
			return getRuleContext(Temp_lineContext.class,i);
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
		public Temp_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_bodyContext temp_body() throws RecognitionException {
		Temp_bodyContext _localctx = new Temp_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_temp_body);
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
					temp_line();
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
			temp_line();
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

	public static class Temp_tailContext extends ParserRuleContext {
		public TerminalNode CB_TEMP() { return getToken(SlimeParser.CB_TEMP, 0); }
		public TerminalNode NL_TEMP() { return getToken(SlimeParser.NL_TEMP, 0); }
		public TerminalNode NW_TEMP() { return getToken(SlimeParser.NW_TEMP, 0); }
		public Temp_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_tailContext temp_tail() throws RecognitionException {
		Temp_tailContext _localctx = new Temp_tailContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_temp_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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

	public static class Temp_lineContext extends ParserRuleContext {
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
		public List<Temp_textContext> temp_text() {
			return getRuleContexts(Temp_textContext.class);
		}
		public Temp_textContext temp_text(int i) {
			return getRuleContext(Temp_textContext.class,i);
		}
		public List<TerminalNode> LINE_DIVIDER() { return getTokens(SlimeParser.LINE_DIVIDER); }
		public TerminalNode LINE_DIVIDER(int i) {
			return getToken(SlimeParser.LINE_DIVIDER, i);
		}
		public Temp_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_lineContext temp_line() throws RecognitionException {
		Temp_lineContext _localctx = new Temp_lineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_temp_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(190);
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
					setState(185);
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
					setState(186);
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
					setState(187);
					spec();
					}
					break;
				case TEXT_LINE:
				case OL_TEXT_LINE:
				case L_TEXT_LINE:
					{
					setState(188);
					temp_text();
					}
					break;
				case LINE_DIVIDER:
					{
					setState(189);
					match(LINE_DIVIDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192); 
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

	public static class Temp_textContext extends ParserRuleContext {
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
		public Temp_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterTemp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitTemp_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitTemp_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_textContext temp_text() throws RecognitionException {
		Temp_textContext _localctx = new Temp_textContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_temp_text);
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
		public Expa_headContext expa_head() {
			return getRuleContext(Expa_headContext.class,0);
		}
		public Expa_bodyContext expa_body() {
			return getRuleContext(Expa_bodyContext.class,0);
		}
		public Expa_tailContext expa_tail() {
			return getRuleContext(Expa_tailContext.class,0);
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
			expa_head();
			setState(207);
			expa_body();
			setState(208);
			expa_tail();
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

	public static class Expa_headContext extends ParserRuleContext {
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
		public Expa_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpa_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpa_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpa_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expa_headContext expa_head() throws RecognitionException {
		Expa_headContext _localctx = new Expa_headContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expa_head);
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

	public static class Expa_bodyContext extends ParserRuleContext {
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public VariNameContext variName() {
			return getRuleContext(VariNameContext.class,0);
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
		public Expa_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpa_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpa_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpa_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expa_bodyContext expa_body() throws RecognitionException {
		Expa_bodyContext _localctx = new Expa_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expa_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OB_SPEC:
			case OB_REFE:
			case OB_INSE:
			case OB_DECL:
			case OB_TEXT:
			case OB_TEMP:
			case OLB_SPEC:
			case OLB_REFE:
			case OLB_INSE:
			case OLB_DECL:
			case OLB_TEXT:
			case OLB_TEMP:
			case LB_SPEC:
			case LB_REFE:
			case LB_INSE:
			case LB_DECL:
			case LB_TEXT:
			case LB_TEMP:
			case OB_SPEC_B_O:
			case OB_REFE_B_O:
			case OB_INSE_B_O:
			case OB_DECL_B_O:
			case OB_TEXT_B_O:
			case OB_TEMP_B_O:
			case OLB_SPEC_B_O:
			case OLB_REFE_B_O:
			case OLB_INSE_B_O:
			case OLB_DECL_B_O:
			case OLB_TEXT_B_O:
			case OLB_TEMP_B_O:
			case LB_SPEC_B_O:
			case LB_REFE_B_O:
			case LB_INSE_B_O:
			case LB_DECL_B_O:
			case LB_TEXT_B_O:
			case LB_TEMP_B_O:
			case NAME_B_O:
			case INTE_B_O:
			case OB_SPEC_O_O:
			case OB_REFE_O_O:
			case OB_INSE_O_O:
			case OB_DECL_O_O:
			case OB_TEXT_O_O:
			case OB_TEMP_O_O:
			case OLB_SPEC_O_O:
			case OLB_REFE_O_O:
			case OLB_INSE_O_O:
			case OLB_DECL_O_O:
			case OLB_TEXT_O_O:
			case OLB_TEMP_O_O:
			case LB_SPEC_O_O:
			case LB_REFE_O_O:
			case LB_INSE_O_O:
			case LB_DECL_O_O:
			case LB_TEXT_O_O:
			case LB_TEMP_O_O:
			case NAME_O_O:
			case INTE_O_O:
			case OB_SPEC_L_O:
			case OB_REFE_L_O:
			case OB_INSE_L_O:
			case OB_DECL_L_O:
			case OB_TEXT_L_O:
			case OB_TEMP_L_O:
			case OLB_SPEC_L_O:
			case OLB_REFE_L_O:
			case OLB_INSE_L_O:
			case OLB_DECL_L_O:
			case OLB_TEXT_L_O:
			case OLB_TEMP_L_O:
			case LB_SPEC_L_O:
			case LB_REFE_L_O:
			case LB_INSE_L_O:
			case LB_DECL_L_O:
			case LB_TEXT_L_O:
			case LB_TEMP_L_O:
			case NAME_L_O:
			case INTE_L_O:
			case OB_SPEC_B_T:
			case OB_TEXT_B_T:
			case OLB_SPEC_B_T:
			case OLB_TEXT_B_T:
			case LB_SPEC_B_T:
			case LB_TEXT_B_T:
			case OB_SPEC_O_T:
			case OB_TEXT_O_T:
			case OLB_SPEC_O_T:
			case OLB_TEXT_O_T:
			case LB_SPEC_O_T:
			case LB_TEXT_O_T:
			case OB_SPEC_L_T:
			case OB_TEXT_L_T:
			case OLB_SPEC_L_T:
			case OLB_TEXT_L_T:
			case LB_SPEC_L_T:
			case LB_TEXT_L_T:
				{
				setState(212);
				vari();
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					temp();
					}
					break;
				case 2:
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(216);
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
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==OB_IMPORT || _la==OL_IMPORT || _la==L_IMPORT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				variName();
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

	public static class Expa_tailContext extends ParserRuleContext {
		public TerminalNode CB_EXPA() { return getToken(SlimeParser.CB_EXPA, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public Expa_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expa_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterExpa_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitExpa_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitExpa_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expa_tailContext expa_tail() throws RecognitionException {
		Expa_tailContext _localctx = new Expa_tailContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expa_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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

	public static class InseContext extends ParserRuleContext {
		public Inse_headContext inse_head() {
			return getRuleContext(Inse_headContext.class,0);
		}
		public Inse_bodyContext inse_body() {
			return getRuleContext(Inse_bodyContext.class,0);
		}
		public Inse_tailContext inse_tail() {
			return getRuleContext(Inse_tailContext.class,0);
		}
		public InseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InseContext inse() throws RecognitionException {
		InseContext _localctx = new InseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_inse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			inse_head();
			setState(226);
			inse_body();
			setState(227);
			inse_tail();
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

	public static class Inse_headContext extends ParserRuleContext {
		public TerminalNode OB_INSE() { return getToken(SlimeParser.OB_INSE, 0); }
		public TerminalNode OLB_INSE() { return getToken(SlimeParser.OLB_INSE, 0); }
		public TerminalNode LB_INSE() { return getToken(SlimeParser.LB_INSE, 0); }
		public TerminalNode OB_INSE_B_O() { return getToken(SlimeParser.OB_INSE_B_O, 0); }
		public TerminalNode OLB_INSE_B_O() { return getToken(SlimeParser.OLB_INSE_B_O, 0); }
		public TerminalNode LB_INSE_B_O() { return getToken(SlimeParser.LB_INSE_B_O, 0); }
		public TerminalNode OB_INSE_O_O() { return getToken(SlimeParser.OB_INSE_O_O, 0); }
		public TerminalNode OLB_INSE_O_O() { return getToken(SlimeParser.OLB_INSE_O_O, 0); }
		public TerminalNode LB_INSE_O_O() { return getToken(SlimeParser.LB_INSE_O_O, 0); }
		public TerminalNode OB_INSE_L_O() { return getToken(SlimeParser.OB_INSE_L_O, 0); }
		public TerminalNode OLB_INSE_L_O() { return getToken(SlimeParser.OLB_INSE_L_O, 0); }
		public TerminalNode LB_INSE_L_O() { return getToken(SlimeParser.LB_INSE_L_O, 0); }
		public Inse_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inse_headContext inse_head() throws RecognitionException {
		Inse_headContext _localctx = new Inse_headContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inse_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB_INSE) | (1L << OLB_INSE) | (1L << LB_INSE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (OB_INSE_B_O - 74)) | (1L << (OLB_INSE_B_O - 74)) | (1L << (LB_INSE_B_O - 74)) | (1L << (OB_INSE_O_O - 74)) | (1L << (OLB_INSE_O_O - 74)) | (1L << (LB_INSE_O_O - 74)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (OB_INSE_L_O - 152)) | (1L << (OLB_INSE_L_O - 152)) | (1L << (LB_INSE_L_O - 152)))) != 0)) ) {
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

	public static class Inse_bodyContext extends ParserRuleContext {
		public List<Inse_body_partContext> inse_body_part() {
			return getRuleContexts(Inse_body_partContext.class);
		}
		public Inse_body_partContext inse_body_part(int i) {
			return getRuleContext(Inse_body_partContext.class,i);
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
		public Inse_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inse_bodyContext inse_body() throws RecognitionException {
		Inse_bodyContext _localctx = new Inse_bodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inse_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					inse_body_part();
					setState(232);
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
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(239);
			inse_body_part();
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

	public static class Inse_body_partContext extends ParserRuleContext {
		public VariNameContext variName() {
			return getRuleContext(VariNameContext.class,0);
		}
		public VariContext vari() {
			return getRuleContext(VariContext.class,0);
		}
		public TerminalNode INOP_B_O() { return getToken(SlimeParser.INOP_B_O, 0); }
		public TerminalNode INOP_O_O() { return getToken(SlimeParser.INOP_O_O, 0); }
		public TerminalNode INOP_L_O() { return getToken(SlimeParser.INOP_L_O, 0); }
		public List<Inse_elementContext> inse_element() {
			return getRuleContexts(Inse_elementContext.class);
		}
		public Inse_elementContext inse_element(int i) {
			return getRuleContext(Inse_elementContext.class,i);
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
		public TerminalNode OB_IMPORT() { return getToken(SlimeParser.OB_IMPORT, 0); }
		public TerminalNode OL_IMPORT() { return getToken(SlimeParser.OL_IMPORT, 0); }
		public TerminalNode L_IMPORT() { return getToken(SlimeParser.L_IMPORT, 0); }
		public Inse_body_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse_body_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse_body_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse_body_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse_body_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inse_body_partContext inse_body_part() throws RecognitionException {
		Inse_body_partContext _localctx = new Inse_body_partContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inse_body_part);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_B_O:
			case NAME_O_O:
			case NAME_L_O:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				variName();
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==INOP_B_O || _la==INOP_O_O || _la==INOP_L_O) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				vari();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) {
					{
					setState(244);
					_la = _input.LA(1);
					if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(245);
					inse_element();
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) {
						{
						{
						setState(246);
						_la = _input.LA(1);
						if ( !(_la==CO_B_O || _la==CO_O_O || _la==CO_L_O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						inse_element();
						}
						}
						setState(252);
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
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==OB_IMPORT || _la==OL_IMPORT || _la==L_IMPORT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				variName();
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

	public static class Inse_elementContext extends ParserRuleContext {
		public List<VariNameContext> variName() {
			return getRuleContexts(VariNameContext.class);
		}
		public VariNameContext variName(int i) {
			return getRuleContext(VariNameContext.class,i);
		}
		public TerminalNode INOP_B_O() { return getToken(SlimeParser.INOP_B_O, 0); }
		public TerminalNode INOP_O_O() { return getToken(SlimeParser.INOP_O_O, 0); }
		public TerminalNode INOP_L_O() { return getToken(SlimeParser.INOP_L_O, 0); }
		public Inse_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inse_elementContext inse_element() throws RecognitionException {
		Inse_elementContext _localctx = new Inse_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inse_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			variName();
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==INOP_B_O || _la==INOP_O_O || _la==INOP_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			variName();
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

	public static class Inse_tailContext extends ParserRuleContext {
		public TerminalNode CB_INSE() { return getToken(SlimeParser.CB_INSE, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public Inse_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inse_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterInse_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitInse_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitInse_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inse_tailContext inse_tail() throws RecognitionException {
		Inse_tailContext _localctx = new Inse_tailContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inse_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==CB_INSE || _la==NL_OPER || _la==NW_OPER) ) {
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
		public Dele_headContext dele_head() {
			return getRuleContext(Dele_headContext.class,0);
		}
		public Dele_bodyContext dele_body() {
			return getRuleContext(Dele_bodyContext.class,0);
		}
		public Dele_tailContext dele_tail() {
			return getRuleContext(Dele_tailContext.class,0);
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
		enterRule(_localctx, 64, RULE_dele);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			dele_head();
			setState(266);
			dele_body();
			setState(267);
			dele_tail();
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

	public static class Dele_headContext extends ParserRuleContext {
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
		public Dele_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dele_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDele_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDele_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDele_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dele_headContext dele_head() throws RecognitionException {
		Dele_headContext _localctx = new Dele_headContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dele_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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

	public static class Dele_bodyContext extends ParserRuleContext {
		public List<VariContext> vari() {
			return getRuleContexts(VariContext.class);
		}
		public VariContext vari(int i) {
			return getRuleContext(VariContext.class,i);
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
		public Dele_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dele_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDele_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDele_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDele_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dele_bodyContext dele_body() throws RecognitionException {
		Dele_bodyContext _localctx = new Dele_bodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dele_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					vari();
					setState(272);
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
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(279);
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

	public static class Dele_tailContext extends ParserRuleContext {
		public TerminalNode CB_DELE() { return getToken(SlimeParser.CB_DELE, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public Dele_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dele_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDele_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDele_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDele_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dele_tailContext dele_tail() throws RecognitionException {
		Dele_tailContext _localctx = new Dele_tailContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dele_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		public Decl_headContext decl_head() {
			return getRuleContext(Decl_headContext.class,0);
		}
		public Decl_bodyContext decl_body() {
			return getRuleContext(Decl_bodyContext.class,0);
		}
		public Decl_tailContext decl_tail() {
			return getRuleContext(Decl_tailContext.class,0);
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
		enterRule(_localctx, 72, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			decl_head();
			setState(284);
			decl_body();
			setState(285);
			decl_tail();
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

	public static class Decl_headContext extends ParserRuleContext {
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
		public Decl_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_headContext decl_head() throws RecognitionException {
		Decl_headContext _localctx = new Decl_headContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decl_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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

	public static class Decl_neckContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode EQOP_B_O() { return getToken(SlimeParser.EQOP_B_O, 0); }
		public TerminalNode CL_B_O() { return getToken(SlimeParser.CL_B_O, 0); }
		public TerminalNode CL_O_O() { return getToken(SlimeParser.CL_O_O, 0); }
		public TerminalNode CL_L_O() { return getToken(SlimeParser.CL_L_O, 0); }
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public Decl_neckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_neck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl_neck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl_neck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl_neck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_neckContext decl_neck() throws RecognitionException {
		Decl_neckContext _localctx = new Decl_neckContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decl_neck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME_B_O || _la==NAME_O_O || _la==NAME_L_O) {
				{
				setState(289);
				listName();
				}
			}

			setState(292);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			typeName();
			setState(294);
			match(EQOP_B_O);
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

	public static class Decl_bodyContext extends ParserRuleContext {
		public List<Decl_body_partContext> decl_body_part() {
			return getRuleContexts(Decl_body_partContext.class);
		}
		public Decl_body_partContext decl_body_part(int i) {
			return getRuleContext(Decl_body_partContext.class,i);
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
		public Decl_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_bodyContext decl_body() throws RecognitionException {
		Decl_bodyContext _localctx = new Decl_bodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_decl_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					decl_body_part();
					setState(297);
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
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(304);
			decl_body_part();
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

	public static class Decl_body_partContext extends ParserRuleContext {
		public Decl_neckContext decl_neck() {
			return getRuleContext(Decl_neckContext.class,0);
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
		public Decl_body_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_body_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl_body_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl_body_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl_body_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_body_partContext decl_body_part() throws RecognitionException {
		Decl_body_partContext _localctx = new Decl_body_partContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_decl_body_part);
		int _la;
		try {
			int _alt;
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				decl_neck();
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					{
					setState(307);
					listName();
					}
					}
					break;
				case 2:
					{
					{
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(308);
							nameType();
							setState(309);
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
						setState(315);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(316);
					nameType();
					}
					}
					break;
				case 3:
					{
					{
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(317);
							nameValue();
							setState(318);
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
						setState(324);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(325);
					nameValue();
					}
					}
					break;
				case 4:
					{
					{
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(326);
							vari();
							setState(327);
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
						setState(333);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					setState(334);
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
				setState(337);
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

	public static class Decl_tailContext extends ParserRuleContext {
		public TerminalNode CB_DECL() { return getToken(SlimeParser.CB_DECL, 0); }
		public TerminalNode NL_OPER() { return getToken(SlimeParser.NL_OPER, 0); }
		public TerminalNode NW_OPER() { return getToken(SlimeParser.NW_OPER, 0); }
		public Decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterDecl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitDecl_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitDecl_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_tailContext decl_tail() throws RecognitionException {
		Decl_tailContext _localctx = new Decl_tailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_decl_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 84, RULE_nameValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(342);
			listName();
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==CL_B_O || _la==CL_O_O || _la==CL_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(344);
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
		enterRule(_localctx, 86, RULE_nameType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(346);
			listName();
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==PE_B_O || _la==PE_O_O || _la==PE_L_O) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(348);
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
		public VariNameIndxContext variNameIndx() {
			return getRuleContext(VariNameIndxContext.class,0);
		}
		public VariNameContext variName() {
			return getRuleContext(VariNameContext.class,0);
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
		public RefeContext refe() {
			return getRuleContext(RefeContext.class,0);
		}
		public InseContext inse() {
			return getRuleContext(InseContext.class,0);
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
		enterRule(_localctx, 88, RULE_vari);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				variNameIndx();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				variName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				temp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				spec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				refe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				inse();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(357);
				text();
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
		enterRule(_localctx, 90, RULE_listName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(366);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(360);
						match(NAME_B_O);
						setState(361);
						match(CO_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(362);
						match(NAME_O_O);
						setState(363);
						match(CO_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(364);
						match(NAME_L_O);
						setState(365);
						match(CO_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(371);
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

	public static class VariNameContext extends ParserRuleContext {
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
		public VariNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVariName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVariName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVariName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariNameContext variName() throws RecognitionException {
		VariNameContext _localctx = new VariNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(373);
						match(NAME_B_O);
						setState(374);
						match(PE_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(375);
						match(NAME_O_O);
						setState(376);
						match(PE_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(377);
						match(NAME_L_O);
						setState(378);
						match(PE_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(384);
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

	public static class VariNameIndxContext extends ParserRuleContext {
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
		public VariNameIndxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variNameIndx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterVariNameIndx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitVariNameIndx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitVariNameIndx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariNameIndxContext variNameIndx() throws RecognitionException {
		VariNameIndxContext _localctx = new VariNameIndxContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variNameIndx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(398);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(386);
						match(NAME_B_O);
						setState(387);
						match(PE_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(388);
						match(NAME_O_O);
						setState(389);
						match(PE_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(390);
						match(NAME_L_O);
						setState(391);
						match(PE_L_O);
						}
						break;
					case INTE_B_O:
						{
						setState(392);
						match(INTE_B_O);
						setState(393);
						match(PE_B_O);
						}
						break;
					case INTE_O_O:
						{
						setState(394);
						match(INTE_O_O);
						setState(395);
						match(PE_O_O);
						}
						break;
					case INTE_L_O:
						{
						setState(396);
						match(INTE_L_O);
						setState(397);
						match(PE_L_O);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(403);
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
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(417);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_B_O:
						{
						setState(405);
						match(NAME_B_O);
						setState(406);
						match(CL_B_O);
						}
						break;
					case NAME_O_O:
						{
						setState(407);
						match(NAME_O_O);
						setState(408);
						match(CL_O_O);
						}
						break;
					case NAME_L_O:
						{
						setState(409);
						match(NAME_L_O);
						setState(410);
						match(CL_L_O);
						}
						break;
					case NAME_L_R:
						{
						setState(411);
						match(NAME_L_R);
						setState(412);
						match(CL_L_R);
						}
						break;
					case NAME_O_R:
						{
						setState(413);
						match(NAME_O_R);
						setState(414);
						match(CL_O_R);
						}
						break;
					case NAME_B_R:
						{
						setState(415);
						match(NAME_B_R);
						setState(416);
						match(CL_B_R);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(422);
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

	public static class Text_outorContext extends ParserRuleContext {
		public TerminalNode TEXT_OUTOR() { return getToken(SlimeParser.TEXT_OUTOR, 0); }
		public Text_outorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_outor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).enterText_outor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimeParserListener ) ((SlimeParserListener)listener).exitText_outor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlimeParserVisitor ) return ((SlimeParserVisitor<? extends T>)visitor).visitText_outor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_outorContext text_outor() throws RecognitionException {
		Text_outorContext _localctx = new Text_outorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_text_outor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e4\u01ad\4\2\t"+
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
		"\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\6\26\u00c1\n\26\r\26\16\26\u00c2\3\27\3\27\7\27\u00c7"+
		"\n\27\f\27\16\27\u00ca\13\27\3\27\3\27\3\27\5\27\u00cf\n\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00dc\n\32\3\32\3\32"+
		"\5\32\u00e0\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u00ed\n\36\f\36\16\36\u00f0\13\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u00fb\n\37\f\37\16\37\u00fe\13\37\5\37\u0100\n\37"+
		"\3\37\3\37\5\37\u0104\n\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$"+
		"\3$\3$\7$\u0115\n$\f$\16$\u0118\13$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"(\5(\u0125\n(\3(\3(\3(\3(\3)\3)\3)\7)\u012e\n)\f)\16)\u0131\13)\3)\3)"+
		"\3*\3*\3*\3*\3*\7*\u013a\n*\f*\16*\u013d\13*\3*\3*\3*\3*\7*\u0143\n*\f"+
		"*\16*\u0146\13*\3*\3*\3*\3*\7*\u014c\n*\f*\16*\u014f\13*\3*\5*\u0152\n"+
		"*\3*\5*\u0155\n*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u0169\n.\3/\3/\3/\3/\3/\3/\7/\u0171\n/\f/\16/\u0174\13/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u017e\n\60\f\60\16\60\u0181\13\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u0191\n\61\f\61\16\61\u0194\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01a4\n\62\f\62\16\62\u01a7\13"+
		"\62\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2!\27\2\f\f\25\25\36"+
		"\36OOXXaavv\177\177\u0088\u0088\u009d\u009d\u00a6\u00a6\u00af\u00af\u00c5"+
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
		"\u00ab\u00ab\5\2gg\u008e\u008e\u00b5\u00b5\5\2cc\u008a\u008a\u00b1\u00b1"+
		"\5\2DDnn\u0095\u0095\16\2\t\t\22\22\33\33LLUU^^ss||\u0085\u0085\u009a"+
		"\u009a\u00a3\u00a3\u00ac\u00ac\5\2ii\u0090\u0090\u00b7\u00b7\5\2ee\u008c"+
		"\u008c\u00b3\u00b3\5\2hh\u008f\u008f\u00b6\u00b6\5\2EEnn\u0095\u0095\16"+
		"\2\13\13\24\24\35\35NNWW``uu~~\u0087\u0087\u009c\u009c\u00a5\u00a5\u00ae"+
		"\u00ae\5\2GGnn\u0095\u0095\16\2\n\n\23\23\34\34MMVV__tt}}\u0086\u0086"+
		"\u009b\u009b\u00a4\u00a4\u00ad\u00ad\5\2FFnn\u0095\u0095\5\2ff\u008d\u008d"+
		"\u00b4\u00b4\5\2jj\u0091\u0091\u00b8\u00b8\5\2jk\u0091\u0092\u00b8\u00b9"+
		"\b\2\64\64::@@jj\u0091\u0091\u00b8\u00b8\2\u01bc\2t\3\2\2\2\4w\3\2\2\2"+
		"\6{\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2\16\u0085\3\2\2\2"+
		"\20\u0087\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u0098\3\2\2\2\36\u009a\3\2\2\2 \u00a4"+
		"\3\2\2\2\"\u00a9\3\2\2\2$\u00ad\3\2\2\2&\u00b4\3\2\2\2(\u00b9\3\2\2\2"+
		"*\u00c0\3\2\2\2,\u00ce\3\2\2\2.\u00d0\3\2\2\2\60\u00d4\3\2\2\2\62\u00df"+
		"\3\2\2\2\64\u00e1\3\2\2\2\66\u00e3\3\2\2\28\u00e7\3\2\2\2:\u00ee\3\2\2"+
		"\2<\u0103\3\2\2\2>\u0105\3\2\2\2@\u0109\3\2\2\2B\u010b\3\2\2\2D\u010f"+
		"\3\2\2\2F\u0116\3\2\2\2H\u011b\3\2\2\2J\u011d\3\2\2\2L\u0121\3\2\2\2N"+
		"\u0124\3\2\2\2P\u012f\3\2\2\2R\u0154\3\2\2\2T\u0156\3\2\2\2V\u0158\3\2"+
		"\2\2X\u015c\3\2\2\2Z\u0168\3\2\2\2\\\u0172\3\2\2\2^\u017f\3\2\2\2`\u0192"+
		"\3\2\2\2b\u01a5\3\2\2\2d\u01aa\3\2\2\2fs\5\4\3\2gs\5\f\7\2hs\5\24\13\2"+
		"is\5\32\16\2js\5\"\22\2ks\5B\"\2ls\5.\30\2ms\5\66\34\2ns\5J&\2os\5B\""+
		"\2ps\5\f\7\2qs\5d\63\2rf\3\2\2\2rg\3\2\2\2rh\3\2\2\2ri\3\2\2\2rj\3\2\2"+
		"\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\3\3\2\2\2vt\3\2\2\2wx\5\6\4\2xy\5\b"+
		"\5\2yz\5\n\6\2z\5\3\2\2\2{|\t\2\2\2|\7\3\2\2\2}~\t\3\2\2~\t\3\2\2\2\177"+
		"\u0080\t\4\2\2\u0080\13\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\5\20"+
		"\t\2\u0083\u0084\5\22\n\2\u0084\r\3\2\2\2\u0085\u0086\t\5\2\2\u0086\17"+
		"\3\2\2\2\u0087\u0088\5b\62\2\u0088\u0089\t\6\2\2\u0089\21\3\2\2\2\u008a"+
		"\u008b\t\7\2\2\u008b\23\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\5 \21"+
		"\2\u008e\u008f\5\30\r\2\u008f\25\3\2\2\2\u0090\u0091\t\b\2\2\u0091\27"+
		"\3\2\2\2\u0092\u0093\t\t\2\2\u0093\31\3\2\2\2\u0094\u0095\5\34\17\2\u0095"+
		"\u0096\5 \21\2\u0096\u0097\5\36\20\2\u0097\33\3\2\2\2\u0098\u0099\t\n"+
		"\2\2\u0099\35\3\2\2\2\u009a\u009b\t\13\2\2\u009b\37\3\2\2\2\u009c\u009d"+
		"\7%\2\2\u009d\u00a3\7&\2\2\u009e\u009f\7*\2\2\u009f\u00a3\7+\2\2\u00a0"+
		"\u00a1\7.\2\2\u00a1\u00a3\7/\2\2\u00a2\u009c\3\2\2\2\u00a2\u009e\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\t\f\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\5(\25\2"+
		"\u00ac#\3\2\2\2\u00ad\u00ae\t\r\2\2\u00ae%\3\2\2\2\u00af\u00b0\5*\26\2"+
		"\u00b0\u00b1\t\16\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\5*\26\2\u00b8\'\3\2\2\2\u00b9\u00ba\t\17\2"+
		"\2\u00ba)\3\2\2\2\u00bb\u00c1\5\4\3\2\u00bc\u00c1\5\24\13\2\u00bd\u00c1"+
		"\5\32\16\2\u00be\u00c1\5,\27\2\u00bf\u00c1\7\u00c2\2\2\u00c0\u00bb\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7\u00c1\2\2\u00c5\u00c7\7\u00c2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\7\u00c1\2\2\u00cc"+
		"\u00cf\7\u00ce\2\2\u00cd\u00cf\7\u00da\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf-\3\2\2\2\u00d0\u00d1\5\60\31\2\u00d1"+
		"\u00d2\5\62\32\2\u00d2\u00d3\5\64\33\2\u00d3/\3\2\2\2\u00d4\u00d5\t\20"+
		"\2\2\u00d5\61\3\2\2\2\u00d6\u00db\5Z.\2\u00d7\u00d8\t\21\2\2\u00d8\u00dc"+
		"\5\"\22\2\u00d9\u00da\t\21\2\2\u00da\u00dc\5\32\16\2\u00db\u00d7\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de"+
		"\t\22\2\2\u00de\u00e0\5^\60\2\u00df\u00d6\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\63\3\2\2\2\u00e1\u00e2\t\23\2\2\u00e2\65\3\2\2\2\u00e3\u00e4\5"+
		"8\35\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\5@!\2\u00e6\67\3\2\2\2\u00e7\u00e8"+
		"\t\24\2\2\u00e89\3\2\2\2\u00e9\u00ea\5<\37\2\u00ea\u00eb\t\25\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\5<\37\2\u00f2;\3\2\2\2\u00f3\u00f4\5^\60\2\u00f4\u00f5\t\26\2\2"+
		"\u00f5\u00ff\5Z.\2\u00f6\u00f7\t\21\2\2\u00f7\u00fc\5> \2\u00f8\u00f9"+
		"\t\27\2\2\u00f9\u00fb\5> \2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u00f6\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\3\2\2\2\u0101"+
		"\u0102\t\22\2\2\u0102\u0104\5^\60\2\u0103\u00f3\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0104=\3\2\2\2\u0105\u0106\5^\60\2\u0106\u0107\t\26\2\2\u0107\u0108"+
		"\5^\60\2\u0108?\3\2\2\2\u0109\u010a\t\30\2\2\u010aA\3\2\2\2\u010b\u010c"+
		"\5D#\2\u010c\u010d\5F$\2\u010d\u010e\5H%\2\u010eC\3\2\2\2\u010f\u0110"+
		"\t\31\2\2\u0110E\3\2\2\2\u0111\u0112\5Z.\2\u0112\u0113\t\25\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\5Z.\2\u011aG\3\2\2\2\u011b\u011c\t\32\2\2\u011cI\3\2\2\2\u011d"+
		"\u011e\5L\'\2\u011e\u011f\5P)\2\u011f\u0120\5T+\2\u0120K\3\2\2\2\u0121"+
		"\u0122\t\33\2\2\u0122M\3\2\2\2\u0123\u0125\5\\/\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\t\21\2\2\u0127\u0128"+
		"\5b\62\2\u0128\u0129\7d\2\2\u0129O\3\2\2\2\u012a\u012b\5R*\2\u012b\u012c"+
		"\t\25\2\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0133\5R*\2\u0133Q\3\2\2\2\u0134\u0151\5N(\2\u0135\u0152"+
		"\5\\/\2\u0136\u0137\5X-\2\u0137\u0138\t\27\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0152\5X-\2\u013f\u0140"+
		"\5V,\2\u0140\u0141\t\27\2\2\u0141\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0152\5V,\2\u0148\u0149\5Z.\2\u0149\u014a"+
		"\t\27\2\2\u014a\u014c\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\5Z.\2\u0151\u0135\3\2\2\2\u0151\u013b\3\2\2\2\u0151"+
		"\u0144\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0155\5Z"+
		".\2\u0154\u0134\3\2\2\2\u0154\u0153\3\2\2\2\u0155S\3\2\2\2\u0156\u0157"+
		"\t\34\2\2\u0157U\3\2\2\2\u0158\u0159\5\\/\2\u0159\u015a\t\21\2\2\u015a"+
		"\u015b\5Z.\2\u015bW\3\2\2\2\u015c\u015d\5\\/\2\u015d\u015e\t\35\2\2\u015e"+
		"\u015f\5b\62\2\u015fY\3\2\2\2\u0160\u0169\5`\61\2\u0161\u0169\5^\60\2"+
		"\u0162\u0169\5J&\2\u0163\u0169\5\"\22\2\u0164\u0169\5\32\16\2\u0165\u0169"+
		"\5\f\7\2\u0166\u0169\5\66\34\2\u0167\u0169\5\4\3\2\u0168\u0160\3\2\2\2"+
		"\u0168\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"[\3\2\2\2\u016a\u016b\7j\2\2\u016b\u0171\7h\2\2\u016c\u016d\7\u0091\2"+
		"\2\u016d\u0171\7\u008f\2\2\u016e\u016f\7\u00b8\2\2\u016f\u0171\7\u00b6"+
		"\2\2\u0170\u016a\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0176\t\36\2\2\u0176]\3\2\2\2\u0177\u0178"+
		"\7j\2\2\u0178\u017e\7f\2\2\u0179\u017a\7\u0091\2\2\u017a\u017e\7\u008d"+
		"\2\2\u017b\u017c\7\u00b8\2\2\u017c\u017e\7\u00b4\2\2\u017d\u0177\3\2\2"+
		"\2\u017d\u0179\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\t\36\2\2\u0183_\3\2\2\2\u0184\u0185\7j\2\2\u0185\u0191\7f\2\2\u0186"+
		"\u0187\7\u0091\2\2\u0187\u0191\7\u008d\2\2\u0188\u0189\7\u00b8\2\2\u0189"+
		"\u0191\7\u00b4\2\2\u018a\u018b\7k\2\2\u018b\u0191\7f\2\2\u018c\u018d\7"+
		"\u0092\2\2\u018d\u0191\7\u008d\2\2\u018e\u018f\7\u00b9\2\2\u018f\u0191"+
		"\7\u00b4\2\2\u0190\u0184\3\2\2\2\u0190\u0186\3\2\2\2\u0190\u0188\3\2\2"+
		"\2\u0190\u018a\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\t\37\2\2\u0196a\3\2\2\2\u0197\u0198\7j\2\2"+
		"\u0198\u01a4\7g\2\2\u0199\u019a\7\u0091\2\2\u019a\u01a4\7\u008e\2\2\u019b"+
		"\u019c\7\u00b8\2\2\u019c\u01a4\7\u00b5\2\2\u019d\u019e\7@\2\2\u019e\u01a4"+
		"\7?\2\2\u019f\u01a0\7:\2\2\u01a0\u01a4\79\2\2\u01a1\u01a2\7\64\2\2\u01a2"+
		"\u01a4\7\63\2\2\u01a3\u0197\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019b\3"+
		"\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\t \2\2\u01a9c\3\2\2\2\u01aa\u01ab"+
		"\7 \2\2\u01abe\3\2\2\2\"rt\u00a2\u00a4\u00b4\u00c0\u00c2\u00c8\u00ce\u00db"+
		"\u00df\u00ee\u00fc\u00ff\u0103\u0116\u0124\u012f\u013b\u0144\u014d\u0151"+
		"\u0154\u0168\u0170\u0172\u017d\u017f\u0190\u0192\u01a3\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
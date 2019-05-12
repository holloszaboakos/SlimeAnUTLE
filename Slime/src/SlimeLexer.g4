lexer grammar SlimeLexer;
RULE_DIV:   ([\n\r\t ]+ { _input.LA(1) == '{' }?
            |[\n\r\t ]+ { _input.LA(1) == '[' }?
            |[\n\r\t ]+ { _input.LA(1) == '<' }?)->skip;
fragment COMM : ('{#'  ( ~'#' | '#' (~'}'|EOF) )* '#}')
              | ('[#' (~[\n\r])*        {_input.LA(1) == '\n'|| _input.LA(1) == '\r' }?)
              | ('<#'  (~[\n\r\t ])*     {_input.LA(1) == '\n'|| _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}? );
COMM_OUTER:COMM->skip;
//OPEN BRACKETS
BOB_SLOT : '{$' 	        -> pushMode(B_SLSP);
BOB_SPEC : '{@' 	        -> pushMode(B_SLSP);
BOB_REFE : '{&' 	        -> pushMode(B_REFE);
BOB_EXTE : '{*' 	        -> pushMode(B_OPER);
BOB_PLUS : '{+' 	        -> pushMode(B_OPER);
BOB_DECL : '{=' 	        -> pushMode(B_OPER);
BOB_DELE : ('{x'|'{X') 	    -> pushMode(B_OPER);
BOB_TEXT : '{"' 	        -> pushMode(B_TEXT);
BOB_TEMP : '{|' 	        -> pushMode(B_TEMP);

OLB_SLOT : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS : '[+' 	    -> pushMode(O_OPER);
OLB_DECL : '[=' 	    -> pushMode(O_OPER);
OLB_DELE : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP : '[|' 	    -> pushMode(O_TEMP);

COB_SLOT : '<$' 	    -> pushMode(C_SLSP);
COB_SPEC : '<@' 	    -> pushMode(C_SLSP);
COB_REFE : '<&' 	    -> pushMode(C_REFE);
COB_EXTE : '<*' 	    -> pushMode(C_OPER);
COB_PLUS : '<+' 	    -> pushMode(C_OPER);
COB_DECL : '<=' 	    -> pushMode(C_OPER);
COB_DELE : ('<x'|'<X')  -> pushMode(C_OPER);
COB_TEXT : '<"' 	    -> pushMode(C_TEXT);
COB_TEMP : '<|' 	    -> pushMode(C_TEMP);

// This doesn't work:
// TEXT : ~('{=') +;
TEXT_OUTOR : ( ~[{[<]
       | [{[<] (~[$@&|=+*xX#"]|EOF)
       )+ ;


mode B_SLSP;
COMM_B_S: COMM -> skip;
WS_B_S:[\n\r\t ]->skip;
BCB_SLOT  : '$}' -> popMode ;
BCB_SPEC  : '@}' -> popMode ;
NAME_B_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
SC_B_S : ';'-> type(SC);

mode O_SLSP;
COMM_L_S: COMM -> skip;
WS_L_S:[\t ]->skip;
NL_SLSP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
NAME_O_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
SC_O_S : ';'-> type(SC);

mode C_SLSP;
COMM_C_S: COMM -> skip;
NW_SLSP  : ' ' -> popMode ;
NAME_C_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
SC_C_S : ';'-> type(SC);



mode B_REFE;
COMM_REFE: COMM -> skip;
WS_B_R:[\n\r\t ]->skip;
BCB_REFE  : '&}' -> popMode ;

REOP:':&';
CL_B_R:':'-> type(CL);
NAME_B_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
REGEX : {_input.LA(-1) == '&'}? ( ~[&\n\r\t :] | '&' (~[}\n\r\t ]|EOF))+;

mode O_REFE;
COMM_O_R: COMM -> skip;
WS_O_R:[ \t]->skip;
NL_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

REOP_O_R:':&' -> type(REOP);
CL_O_R:':'-> type(CL);
NAME_O_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
REGEX_O_R : ( ~[\n\r\t ] )+ ->type(REGEX);

mode C_REFE;
COMM_C_R: COMM -> skip;
NW_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

REOP_C_R:':&' -> type(REOP);
CL_C_R:':'-> type(CL);
NAME_C_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
REGEX_C_R : ( ~[\n\r\t :&] )+ ->type(REGEX);



mode B_OPER;
COMM_B_O: COMM -> skip;
WS_B_O:[\n\r\t ]->skip;

BCB_EXTE  : '*}' -> popMode ;
BCB_PLUS  : '+}' -> popMode ;
BCB_DECL  : '=}' -> popMode ;
BCB_DELE  : ('x}'|'X}') -> popMode ;

BOB_SLOT_B_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_B_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_B_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_B_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_B_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_B_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_B_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_B_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_B_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);

OLB_SLOT_B_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_B_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_B_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_B_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_B_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_B_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_B_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_B_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_B_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);

COB_SLOT_B_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_B_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_B_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_B_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_B_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_B_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_B_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_B_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_B_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

EQOP:':=';
PLOP:':+';
PE:'.';
CO:',';
CL:':';
SC:';';

NAME: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE: [0-9]+;



mode O_OPER;
COMM_O_O: COMM -> skip;
WS_O_O:[\t ]->skip;
NL_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

BOB_SLOT_O_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_O_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_O_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_O_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_O_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_O_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_O_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_O_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_O_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);

OLB_SLOT_O_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_O_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_O_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_O_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_O_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_O_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_O_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_O_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_O_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);

COB_SLOT_O_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_O_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_O_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_O_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_O_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_O_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_O_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_O_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_O_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

EQOP_O_O:':='-> type(EQOP);
PLOP_O_O:':+'-> type(PLOP);
PE_O_O:'.'-> type(PE);
CO_O_O:','-> type(CO);
CL_O_O:':'-> type(CL);
SC_O_O:';'-> type(SC);

NAME_O_O: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
INTE_O_O: [0-9]+ -> type(INTE);

mode C_OPER;
COMM_C_O: COMM -> skip;
NW_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

BOB_SLOT_C_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_C_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_C_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_C_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_C_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_C_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_C_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_C_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_C_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);

OLB_SLOT_C_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_C_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_C_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_C_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_C_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_C_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_C_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_C_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_C_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);

COB_SLOT_C_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_C_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_C_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_C_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_C_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_C_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_C_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_C_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_C_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

EQOP_C_O:':='-> type(EQOP);
PLOP_C_O:':+'-> type(PLOP);
PE_C_O:'.'-> type(PE);
CO_C_O:','-> type(CO);
CL_C_O:':'-> type(CL);
SC_C_O:';'-> type(SC);

NAME_C_O: [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
INTE_C_O: [0-9]+-> type(INTE);



mode B_TEXT;
BCB_TEXT  : '"}' -> popMode ;
IN_B_T : ( ~'"'
       | '"' (~'}'|EOF)
       )+ ;

mode O_TEXT;
NL_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?)-> popMode ;
IN_O_T : ( ~[\n\r])+ ->type(IN_B_T);

mode C_TEXT;
NW_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
IN_C_T : ( ~[\n\r\t ])+ ->type(IN_B_T);



mode B_TEMP;
BCB_TEMP  : '|}' -> popMode ;
TEXT_LINE:( ~[|\n\r{[<;] | '|' (~'}'|EOF) | [{[<] (~[;"@$|]|EOF)|[{[<] {_input.LA(1) == ';'||_input.LA(1) == '|'}?)+;
LINE_DIVIDER: ([ \t]*[\n\r][ \t]*) -> skip;

BOB_SLOT_B_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_B_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_B_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);

OLB_SLOT_B_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_B_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_B_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);

COB_SLOT_B_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_B_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_B_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

SC_B_T:';'-> type(SC);

mode O_TEMP;
NL_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;
O_TEXT_LINE: ( ~[\n\r{[<;] | [{[<] (~[;"@$\n\r]|EOF)|[{[<]{_input.LA(1) == ';'}? )+ ->type(TEXT_LINE);

BOB_SLOT_O_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_O_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_O_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);

OLB_SLOT_O_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_O_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_O_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);

COB_SLOT_O_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_O_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_O_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

SC_O_T:';'-> type(SC);

mode C_TEMP;
NW_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
C_TEXT_LINE: ( ~[\n\r\t {[<;] | [{[<] (~[;"@$\n\r\t ]|EOF|{_input.LA(1) == ';'}?) )+ ->type(TEXT_LINE);

BOB_SLOT_C_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_C_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_C_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);

OLB_SLOT_C_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_C_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_C_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);

COB_SLOT_C_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_C_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_C_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

SC_C_T:';'-> type(SC);

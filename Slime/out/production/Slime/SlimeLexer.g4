lexer grammar SlimeLexer;
RULE_DIV:   ([\n\r\t ]+ { _input.LA(1) == '{' }?
            |[\n\r\t ]+ { _input.LA(1) == '[' }?
            |[\n\r\t ]+ { _input.LA(1) == '<' }?)->skip;
fragment COMM : ('{#'  ( ~'#' | '#' (~'}'|EOF) )* '#}')
              | ('[#' (~[\n\r])*        {_input.LA(1) == '\n'}?)
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
NAME_B_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_B_S : ';';

mode O_SLSP;
COMM_L_S: COMM -> skip;
WS_L_S:[\t ]->skip;
NL_SLSP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
NAME_O_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_O_S : ';';

mode C_SLSP;
COMM_C_S: COMM -> skip;
NW_SLSP  : ' ' -> popMode ;
NAME_C_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_C_S : ';';



mode B_REFE;
COMM_REFE: COMM -> skip;
WS_B_R:[\n\r\t ]->skip;
BCB_REFE  : '&}' -> popMode ;

CL_B_R:':';
NAME_B_R: [a-zA-Z_][a-zA-Z_0-9]* ;
IN_B_R : ','( ~'&'
       | '&' (~'}'|EOF)
       )+;

mode O_REFE;
COMM_O_R: COMM -> skip;
WS_O_R:[ \t]->skip;
NL_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

CL_O_R:':';
NAME_O_R: [a-zA-Z_][a-zA-Z_0-9]* ;
IN_O_R : ','( ~[\n\r] )+ ;

mode C_REFE;
COMM_C_R: COMM -> skip;
WS_C_R:[ \t]->skip;
NW_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

CL_C_R:':';
NAME_C_R: [a-zA-Z_][a-zA-Z_0-9]* ;
IN_C_R : ','( ~[\n\r\t ] )+ ;



mode B_OPER;
COMM_B_O: COMM -> skip;
WS_B_O:[\n\r\t ]->skip;

BCB_EXTE  : '*}' -> popMode ;
BCB_PLUS  : '+}' -> popMode ;
BCB_DECL  : '=}' -> popMode ;
BCB_DELE  : ('x}'|'X}') -> popMode ;

BOB_SLOT_B_O : '{$' 	    -> pushMode(B_SLSP);
BOB_SPEC_B_O : '{@' 	    -> pushMode(B_SLSP);
BOB_REFE_B_O : '{&' 	    -> pushMode(B_REFE);
BOB_EXTE_B_O : '{*' 	    -> pushMode(B_OPER);
BOB_PLUS_B_O : '{+' 	    -> pushMode(B_OPER);
BOB_DECL_B_O : '{=' 	    -> pushMode(B_OPER);
BOB_DELE_B_O : ('{x'|'{X')  -> pushMode(B_OPER);
BOB_TEXT_B_O : '{"' 	    -> pushMode(B_TEXT);
BOB_TEMP_B_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_B_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_B_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_B_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_B_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_B_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_B_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_B_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_B_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_B_O : '[|' 	    -> pushMode(O_TEMP);

COB_SLOT_B_O : '<$' 	    -> pushMode(C_SLSP);
COB_SPEC_B_O : '<@' 	    -> pushMode(C_SLSP);
COB_REFE_B_O : '<&' 	    -> pushMode(C_REFE);
COB_EXTE_B_O : '<*' 	    -> pushMode(C_OPER);
COB_PLUS_B_O : '<+' 	    -> pushMode(C_OPER);
COB_DECL_B_O : '<=' 	    -> pushMode(C_OPER);
COB_DELE_B_O : ('<x'|'<X')  -> pushMode(C_OPER);
COB_TEXT_B_O : '<"' 	    -> pushMode(C_TEXT);
COB_TEMP_B_O : '<|' 	    -> pushMode(C_TEMP);

EQOP_B_O:':=';
PLOP_B_O:':+';
PE_B_O:'.';
CO_B_O:':';
CL_B_O:',';
SC_B_O:';';

NAME_B_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_B_O: [0-9]+;



mode O_OPER;
COMM_O_O: COMM -> skip;
WS_O_O:[\t ]->skip;
NL_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

BOB_SLOT_O_O : '{$' 	    -> pushMode(B_SLSP);
BOB_SPEC_O_O : '{@' 	    -> pushMode(B_SLSP);
BOB_REFE_O_O : '{&' 	    -> pushMode(B_REFE);
BOB_EXTE_O_O : '{*' 	    -> pushMode(B_OPER);
BOB_PLUS_O_O : '{+' 	    -> pushMode(B_OPER);
BOB_DECL_O_O : '{=' 	    -> pushMode(B_OPER);
BOB_DELE_O_O : ('{x'|'{X')  -> pushMode(B_OPER);
BOB_TEXT_O_O : '{"' 	    -> pushMode(B_TEXT);
BOB_TEMP_O_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_O_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_O_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_O_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_O_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_O_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_O_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_O_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_O_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_O_O : '[|' 	    -> pushMode(O_TEMP);

COB_SLOT_O_O : '<$' 	    -> pushMode(C_SLSP);
COB_SPEC_O_O : '<@' 	    -> pushMode(C_SLSP);
COB_REFE_O_O : '<&' 	    -> pushMode(C_REFE);
COB_EXTE_O_O : '<*' 	    -> pushMode(C_OPER);
COB_PLUS_O_O : '<+' 	    -> pushMode(C_OPER);
COB_DECL_O_O : '<=' 	    -> pushMode(C_OPER);
COB_DELE_O_O : ('<x'|'<X')  -> pushMode(C_OPER);
COB_TEXT_O_O : '<"' 	    -> pushMode(C_TEXT);
COB_TEMP_O_O : '<|' 	    -> pushMode(C_TEMP);

EQOP_O_O:':=';
PLOP_O_O:':+';
PE_O_O:'.';
CO_O_O:':';
CL_O_O:',';
SC_O_O:';';

NAME_O_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_O_O: [0-9]+;

mode C_OPER;
COMM_C_O: COMM -> skip;
NW_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

BOB_SLOT_C_O : '{$' 	    -> pushMode(B_SLSP);
BOB_SPEC_C_O : '{@' 	    -> pushMode(B_SLSP);
BOB_REFE_C_O : '{&' 	    -> pushMode(B_REFE);
BOB_EXTE_C_O : '{*' 	    -> pushMode(B_OPER);
BOB_PLUS_C_O : '{+' 	    -> pushMode(B_OPER);
BOB_DECL_C_O : '{=' 	    -> pushMode(B_OPER);
BOB_DELE_C_O : ('{x'|'{X')  -> pushMode(B_OPER);
BOB_TEXT_C_O : '{"' 	    -> pushMode(B_TEXT);
BOB_TEMP_C_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_C_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_C_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_C_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_C_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_C_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_C_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_C_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_C_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_C_O : '[|' 	    -> pushMode(O_TEMP);

COB_SLOT_C_O : '<$' 	    -> pushMode(C_SLSP);
COB_SPEC_C_O : '<@' 	    -> pushMode(C_SLSP);
COB_REFE_C_O : '<&' 	    -> pushMode(C_REFE);
COB_EXTE_C_O : '<*' 	    -> pushMode(C_OPER);
COB_PLUS_C_O : '<+' 	    -> pushMode(C_OPER);
COB_DECL_C_O : '<=' 	    -> pushMode(C_OPER);
COB_DELE_C_O : ('<x'|'<X')  -> pushMode(C_OPER);
COB_TEXT_C_O : '<"' 	    -> pushMode(C_TEXT);
COB_TEMP_C_O : '<|' 	    -> pushMode(C_TEMP);

EQOP_C_O:':=';
PLOP_C_O:':+';
PE_C_O:'.';
CO_C_O:':';
CL_C_O:',';
SC_C_O:';';

NAME_C_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_C_O: [0-9]+;



mode B_TEXT;
BCB_TEXT  : '"}' -> popMode ;
IN_B_T : ( ~'"'
       | '"' (~'}'|EOF)
       )+ ;

mode O_TEXT;
NL_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?)-> popMode ;
IN_O_T : ( ~[\n\r])+ ;

mode C_TEXT;
NW_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
IN_C_T : ( ~[\n\r\t ])+ ;



mode B_TEMP;
BCB_TEMP  : '|}' -> popMode ;
B_TEXT_LINE: ( ~[|\n\r{[<;] | '|' (~'}'|EOF) | [{[<] (~["@$]|EOF) )+;
LINE_DIVIDER: ([ \t]*[\n\r][ \t]*) -> skip;

BOB_SLOT_B_T : '{$' 	-> pushMode(B_SLSP);
BOB_SPEC_B_T : '{@' 	-> pushMode(B_SLSP);
BOB_TEXT_B_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_B_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_B_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_B_T : '["' 	-> pushMode(O_TEXT);

COB_SLOT_B_T : '<$' 	-> pushMode(C_SLSP);
COB_SPEC_B_T : '<@' 	-> pushMode(C_SLSP);
COB_TEXT_B_T : '<"' 	-> pushMode(C_TEXT);

SC_B_T:';';

mode O_TEMP;
NL_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;
O_TEXT_LINE: ( ~[|\n\r{[<;] | '|' (~[}\n\r]|EOF) | [{[<] (~["@$\n\r]|EOF) )+;

BOB_SLOT_O_T : '{$' 	-> pushMode(B_SLSP);
BOB_SPEC_O_T : '{@' 	-> pushMode(B_SLSP);
BOB_TEXT_O_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_O_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_O_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_O_T : '["' 	-> pushMode(O_TEXT);

COB_SLOT_O_T : '<$' 	-> pushMode(C_SLSP);
COB_SPEC_O_T : '<@' 	-> pushMode(C_SLSP);
COB_TEXT_O_T : '<"' 	-> pushMode(C_TEXT);

SC_O_T:';';

mode C_TEMP;
NW_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
C_TEXT_LINE: ( ~[|\n\r\t {[<;] | '|' (~[}\n\r\t ]|EOF) | [{[<] (~["@$\n\r\t ]|EOF) )+;

BOB_SLOT_C_T : '{$' 	-> pushMode(B_SLSP);
BOB_SPEC_C_T : '{@' 	-> pushMode(B_SLSP);
BOB_TEXT_C_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_C_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_C_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_C_T : '["' 	-> pushMode(O_TEXT);

COB_SLOT_C_T : '<$' 	-> pushMode(C_SLSP);
COB_SPEC_C_T : '<@' 	-> pushMode(C_SLSP);
COB_TEXT_C_T : '<"' 	-> pushMode(C_TEXT);

SC_C_T:';';

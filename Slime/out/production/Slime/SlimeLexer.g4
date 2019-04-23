lexer grammar SlimeLexer;
RULE_DIV:   ([\n\r\t ]+ { _input.LA(1) == '{' }?
            |[\n\r\t ]+ { _input.LA(1) == '[' }?
            |[\n\r\t ]+ { _input.LA(1) == '<' }?)->skip;
fragment COMM : ('{#'  ( ~'#' | '#' (~'}'|EOF) )* '#}')
              | ('[#' (~[\n\r])*        {_input.LA(1) == '\n'}?)
              | ('<#'  (~[\n\r\t ])*     {_input.LA(1) == '\n'|| _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}? );
COMM_OUTER:COMM->skip;
//OPEN BRACKETS
OB_SLOT : '{$' 	        -> pushMode(B_SLSP);
OB_SPEC : '{@' 	        -> pushMode(B_SLSP);
OB_REFE : '{&' 	        -> pushMode(B_REFE);
OB_EXTE : '{*' 	        -> pushMode(B_OPER);
OB_PLUS : '{+' 	        -> pushMode(B_OPER);
OB_DECL : '{=' 	        -> pushMode(B_OPER);
OB_DELE : ('{x'|'{X') 	-> pushMode(B_OPER);
OB_TEXT : '{"' 	        -> pushMode(B_TEXT);
OB_TEMP : '{|' 	        -> pushMode(B_TEMP);

OLB_SLOT : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS : '[+' 	    -> pushMode(O_OPER);
OLB_DECL : '[=' 	    -> pushMode(O_OPER);
OLB_DELE : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP : '[|' 	    -> pushMode(O_TEMP);

LB_SLOT : '<$' 	    -> pushMode(L_SLSP);
LB_SPEC : '<@' 	    -> pushMode(L_SLSP);
LB_REFE : '<&' 	    -> pushMode(L_REFE);
LB_EXTE : '<*' 	    -> pushMode(L_OPER);
LB_PLUS : '<+' 	    -> pushMode(L_OPER);
LB_DECL : '<=' 	    -> pushMode(L_OPER);
LB_DELE : ('<x'|'<X')  -> pushMode(L_OPER);
LB_TEXT : '<"' 	    -> pushMode(L_TEXT);
LB_TEMP : '<|' 	    -> pushMode(L_TEMP);

// This doesn't work:
// TEXT : ~('{=') +;
TEXT_OUTOR : ( ~[{[<]
       | [{[<] (~[$@&|=+*xX#"]|EOF)
       )+ ;


mode B_SLSP;
COMM_B_S: COMM -> skip;
WS_B_S:[\n\r\t ]->skip;
CB_SLOT  : '$}' -> popMode ;
CB_SPEC  : '@}' -> popMode ;
NAME_B_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_B_S : ';';

mode O_SLSP;
COMM_O_S: COMM -> skip;
WS_O_S:[\t ]->skip;
NL_SLSP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
NAME_O_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_O_S : ';';

mode L_SLSP;
COMM_L_S: COMM -> skip;
NW_SLSP  : ' ' -> popMode ;
NAME_L_S   : [a-zA-Z_][a-zA-Z_0-9]* ;
SC_L_S : ';';



mode B_REFE;
COMM_REFE: COMM -> skip;
WS_B_R:[\n\r\t ]->skip;
CB_REFE  : '&}' -> popMode ;

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

mode L_REFE;
COMM_L_R: COMM -> skip;
WS_L_R:[ \t]->skip;
NW_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

CL_L_R:':';
NAME_L_R: [a-zA-Z_][a-zA-Z_0-9]* ;
IN_L_R : ','( ~[\n\r\t ] )+ ;



mode B_OPER;
COMM_B_O: COMM -> skip;
WS_B_O:[\n\r\t ]->skip;

CB_EXTE  : '*}' -> popMode ;
CB_PLUS  : '+}' -> popMode ;
CB_DECL  : '=}' -> popMode ;
CB_DELE  : ('x}'|'X}') -> popMode ;

OB_SLOT_B_O : '{$' 	    -> pushMode(B_SLSP);
OB_SPEC_B_O : '{@' 	    -> pushMode(B_SLSP);
OB_REFE_B_O : '{&' 	    -> pushMode(B_REFE);
OB_EXTE_B_O : '{*' 	    -> pushMode(B_OPER);
OB_PLUS_B_O : '{+' 	    -> pushMode(B_OPER);
OB_DECL_B_O : '{=' 	    -> pushMode(B_OPER);
OB_DELE_B_O : ('{x'|'{X')  -> pushMode(B_OPER);
OB_TEXT_B_O : '{"' 	    -> pushMode(B_TEXT);
OB_TEMP_B_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_B_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_B_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_B_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_B_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_B_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_B_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_B_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_B_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_B_O : '[|' 	    -> pushMode(O_TEMP);

LB_SLOT_B_O : '<$' 	    -> pushMode(L_SLSP);
LB_SPEC_B_O : '<@' 	    -> pushMode(L_SLSP);
LB_REFE_B_O : '<&' 	    -> pushMode(L_REFE);
LB_EXTE_B_O : '<*' 	    -> pushMode(L_OPER);
LB_PLUS_B_O : '<+' 	    -> pushMode(L_OPER);
LB_DECL_B_O : '<=' 	    -> pushMode(L_OPER);
LB_DELE_B_O : ('<x'|'<X')  -> pushMode(L_OPER);
LB_TEXT_B_O : '<"' 	    -> pushMode(L_TEXT);
LB_TEMP_B_O : '<|' 	    -> pushMode(L_TEMP);

OB_IMPORT:'import' CL_B_O;

EQOP_B_O:':=';
PLOP_B_O:':+';
PE_B_O:'.';
CL_B_O:':';
CO_B_O:',';
SC_B_O:';';

NAME_B_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_B_O: [0-9]+;



mode O_OPER;
COMM_O_O: COMM -> skip;
WS_O_O:[\t ]->skip;
NL_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

OB_SLOT_O_O : '{$' 	    -> pushMode(B_SLSP);
OB_SPEC_O_O : '{@' 	    -> pushMode(B_SLSP);
OB_REFE_O_O : '{&' 	    -> pushMode(B_REFE);
OB_EXTE_O_O : '{*' 	    -> pushMode(B_OPER);
OB_PLUS_O_O : '{+' 	    -> pushMode(B_OPER);
OB_DECL_O_O : '{=' 	    -> pushMode(B_OPER);
OB_DELE_O_O : ('{x'|'{X')  -> pushMode(B_OPER);
OB_TEXT_O_O : '{"' 	    -> pushMode(B_TEXT);
OB_TEMP_O_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_O_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_O_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_O_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_O_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_O_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_O_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_O_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_O_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_O_O : '[|' 	    -> pushMode(O_TEMP);

LB_SLOT_O_O : '<$' 	    -> pushMode(L_SLSP);
LB_SPEC_O_O : '<@' 	    -> pushMode(L_SLSP);
LB_REFE_O_O : '<&' 	    -> pushMode(L_REFE);
LB_EXTE_O_O : '<*' 	    -> pushMode(L_OPER);
LB_PLUS_O_O : '<+' 	    -> pushMode(L_OPER);
LB_DECL_O_O : '<=' 	    -> pushMode(L_OPER);
LB_DELE_O_O : ('<x'|'<X')  -> pushMode(L_OPER);
LB_TEXT_O_O : '<"' 	    -> pushMode(L_TEXT);
LB_TEMP_O_O : '<|' 	    -> pushMode(L_TEMP);

OL_IMPORT:'import' CL_O_O;

EQOP_O_O:':=';
PLOP_O_O:':+';
PE_O_O:'.';
CL_O_O:':';
CO_O_O:',';
SC_O_O:';';

NAME_O_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_O_O: [0-9]+;

mode L_OPER;
COMM_L_O: COMM -> skip;
NW_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

OB_SLOT_L_O : '{$' 	    -> pushMode(B_SLSP);
OB_SPEC_L_O : '{@' 	    -> pushMode(B_SLSP);
OB_REFE_L_O : '{&' 	    -> pushMode(B_REFE);
OB_EXTE_L_O : '{*' 	    -> pushMode(B_OPER);
OB_PLUS_L_O : '{+' 	    -> pushMode(B_OPER);
OB_DECL_L_O : '{=' 	    -> pushMode(B_OPER);
OB_DELE_L_O : ('{x'|'{X')  -> pushMode(B_OPER);
OB_TEXT_L_O : '{"' 	    -> pushMode(B_TEXT);
OB_TEMP_L_O : '{|' 	    -> pushMode(B_TEMP);

OLB_SLOT_L_O : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC_L_O : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE_L_O : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE_L_O : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS_L_O : '[+' 	    -> pushMode(O_OPER);
OLB_DECL_L_O : '[=' 	    -> pushMode(O_OPER);
OLB_DELE_L_O : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT_L_O : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP_L_O : '[|' 	    -> pushMode(O_TEMP);

LB_SLOT_L_O : '<$' 	    -> pushMode(L_SLSP);
LB_SPEC_L_O : '<@' 	    -> pushMode(L_SLSP);
LB_REFE_L_O : '<&' 	    -> pushMode(L_REFE);
LB_EXTE_L_O : '<*' 	    -> pushMode(L_OPER);
LB_PLUS_L_O : '<+' 	    -> pushMode(L_OPER);
LB_DECL_L_O : '<=' 	    -> pushMode(L_OPER);
LB_DELE_L_O : ('<x'|'<X')  -> pushMode(L_OPER);
LB_TEXT_L_O : '<"' 	    -> pushMode(L_TEXT);
LB_TEMP_L_O : '<|' 	    -> pushMode(L_TEMP);

L_IMPORT:'import' CL_L_O;

EQOP_L_O:':=';
PLOP_L_O:':+';
PE_L_O:'.';
CL_L_O:':';
CO_L_O:',';
SC_L_O:';';

NAME_L_O: [a-zA-Z_][a-zA-Z_0-9]* ;
INTE_L_O: [0-9]+;



mode B_TEXT;
CB_TEXT  : '"}' -> popMode ;
IN_TEXT : ( ~'"'
       | '"' (~'}'|EOF)
       )+ ;

mode O_TEXT;
NL_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?)-> popMode ;
IN_OL_TEXT : ( ~[\n\r])+ ;

mode L_TEXT;
NW_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
IN_L_TEXT : ( ~[\n\r\t ])+ ;



mode B_TEMP;
CB_TEMP  : '|}' -> popMode ;
TEXT_LINE: ( ~[|\n\r{[<;] | '|' (~'}'|EOF) | [{[<] (~["@$]|EOF) )+;
LINE_DIVIDER: ([ \t]*[\n\r][ \t]*) -> skip;

OB_SLOT_B_T : '{$' 	-> pushMode(B_SLSP);
OB_SPEC_B_T : '{@' 	-> pushMode(B_SLSP);
OB_TEXT_B_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_B_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_B_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_B_T : '["' 	-> pushMode(O_TEXT);

LB_SLOT_B_T : '<$' 	-> pushMode(L_SLSP);
LB_SPEC_B_T : '<@' 	-> pushMode(L_SLSP);
LB_TEXT_B_T : '<"' 	-> pushMode(L_TEXT);

SC_B_T:';';

mode O_TEMP;
NL_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;
OL_TEXT_LINE: ( ~[|\n\r{[<;] | '|' (~[}\n\r]|EOF) | [{[<] (~["@$\n\r]|EOF) )+;

OB_SLOT_O_T : '{$' 	-> pushMode(B_SLSP);
OB_SPEC_O_T : '{@' 	-> pushMode(B_SLSP);
OB_TEXT_O_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_O_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_O_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_O_T : '["' 	-> pushMode(O_TEXT);

LB_SLOT_O_T : '<$' 	-> pushMode(L_SLSP);
LB_SPEC_O_T : '<@' 	-> pushMode(L_SLSP);
LB_TEXT_O_T : '<"' 	-> pushMode(L_TEXT);

SC_O_T:';';

mode L_TEMP;
NW_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
L_TEXT_LINE: ( ~[|\n\r\t {[<;] | '|' (~[}\n\r\t ]|EOF) | [{[<] (~["@$\n\r\t ]|EOF) )+;

OB_SLOT_L_T : '{$' 	-> pushMode(B_SLSP);
OB_SPEC_L_T : '{@' 	-> pushMode(B_SLSP);
OB_TEXT_L_T : '{"' 	-> pushMode(B_TEXT);

OLB_SLOT_L_T : '[$' 	-> pushMode(O_SLSP);
OLB_SPEC_L_T : '[@' 	-> pushMode(O_SLSP);
OLB_TEXT_L_T : '["' 	-> pushMode(O_TEXT);

LB_SLOT_L_T : '<$' 	-> pushMode(L_SLSP);
LB_SPEC_L_T : '<@' 	-> pushMode(L_SLSP);
LB_TEXT_L_T : '<"' 	-> pushMode(L_TEXT);

SC_L_T:';';

lexer grammar SlimeLex;

RULE_DIV: ({_input.LA(-1) != '}'}[ \t]*[\n\r][ \t]*{_input.LA(1) != '{'})->skip;
COMM: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;

//OPEN BRACKETS
OB_SLOT : '{$' 	        -> pushMode(SLOT_SPEC);
OB_SPEC : '{@' 	        -> pushMode(SLOT_SPEC);
OB_REFE : '{&' 	        -> pushMode(REFE);
OB_EXPA : '{<' 	        -> pushMode(OPER);
OB_INSE : '{>' 	        -> pushMode(OPER);
OB_DECL : '{+' 	        -> pushMode(OPER);
OB_DELE : ('{x'|'{X') 	-> pushMode(OPER);
OB_SKIP : '{"' 	        -> pushMode(SKIP_);
OB_TEMP : '{|' 	        -> pushMode(TEMP);

OLB_SLOT : '{;$' 	    -> pushMode(OL_SLOT_SPEC);
OLB_SPEC : '{;@' 	    -> pushMode(OL_SLOT_SPEC);
OLB_REFE : '{;&' 	    -> pushMode(OL_REFE);
OLB_EXPA : '{;<' 	    -> pushMode(OL_OPER);
OLB_INSE : '{;>' 	    -> pushMode(OL_OPER);
OLB_DECL : '{;+' 	    -> pushMode(OL_OPER);
OLB_DELE : ('{;x'|'{;X')  -> pushMode(OL_OPER);
OLB_SKIP : '{;"' 	    -> pushMode(OL_SKIP_);
OLB_TEMP : '{;|' 	    -> pushMode(OL_TEMP);

LB_SLOT : '!$' 	    -> pushMode(L_SLOT_SPEC);
LB_SPEC : '!@' 	    -> pushMode(L_SLOT_SPEC);
LB_REFE : '!&' 	    -> pushMode(L_REFE);
LB_EXPA : '!<' 	    -> pushMode(L_OPER);
LB_INSE : '!>' 	    -> pushMode(L_OPER);
LB_DECL : '!+' 	    -> pushMode(L_OPER);
LB_DELE : ('!x'|'!X')  -> pushMode(L_OPER);
LB_SKIP : '!"' 	    -> pushMode(L_SKIP_);
LB_TEMP : '!|' 	    -> pushMode(L_TEMP);

// This doesn't work:
// TEXT : ~('{+') +;
TEXT : ( ~[{!]
       | '{' (~[;$@&<>+xX#"|]|EOF)
       | '{;' (~[$@&<>+xX#"|]|EOF)
       | '!' (~[$@&<>+xX#"|]|EOF)
       )+ ;


mode SLOT_SPEC;
COMM_SLSP: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
WS_SLSP:[\n\r\t ]->skip;
CB_SLOT  : '$}' -> popMode ;
CB_SPEC  : '@}' -> popMode ;
KEY   : [a-zA-Z_][a-zA-Z_0-9]* ;
PC_SLSP : ';';

mode OL_SLOT_SPEC;
COMM_OL_SLSP: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
WS_OL_SLSP:[\t ]->skip;
NL_SLSP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;
OL_KEY   : [a-zA-Z_][a-zA-Z_0-9]* ;
PC_OL_SLSP : ';';

mode L_SLOT_SPEC;
COMM_L_SLSP: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
NW_SLSP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;
L_KEY   : [a-zA-Z_][a-zA-Z_0-9]* ;
PC_L_SLSP : ';';



mode REFE;
COMM_REFE: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
CB_REFE  : '&}' -> popMode ;
WS:[\n\r\t]->skip;
IN_REFE : ( ~'&'
       | '&' (~'}'|EOF)
       )+ ;

mode OL_REFE;
COMM_OL_REFE: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;

OL_WS:[ \t]->skip;
NL_REFE  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}|EOF) -> popMode ;
IN_OL_REFE : ( ~[\n\r] )+ ;

mode L_REFE;
COMM_L_REFE: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;

L_WS:[ \t]->skip;
NW_REFE  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;
IN_L_REFE : ( ~[\n\r\t ] )+ ;



mode OPER;
COMM_OPER: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
WS_OPER:[\n\r\t ]->skip;

CB_EXPA  : '>}' -> popMode ;
CB_INSE  : '<}' -> popMode ;
CB_DECL  : '+}' -> popMode ;
CB_DELE  : ('x}'|'X}') -> popMode ;

OB_SLOT_OPER : '{$' 	    -> pushMode(SLOT_SPEC);
OB_SPEC_OPER : '{@' 	    -> pushMode(SLOT_SPEC);
OB_REFE_OPER : '{&' 	    -> pushMode(REFE);
OB_EXPA_OPER : '{<' 	    -> pushMode(OPER);
OB_INSE_OPER : '{>' 	    -> pushMode(OPER);
OB_DECL_OPER : '{+' 	    -> pushMode(OPER);
OB_DELE_OPER : ('{x'|'{X')  -> pushMode(OPER);
OB_SKIP_OPER : '{"' 	    -> pushMode(SKIP_);
OB_TEMP_OPER : '{|' 	    -> pushMode(TEMP);

OLB_SLOT_OPER : '{;$' 	    -> pushMode(OL_SLOT_SPEC);
OLB_SPEC_OPER : '{;@' 	    -> pushMode(OL_SLOT_SPEC);
OLB_REFE_OPER : '{;&' 	    -> pushMode(OL_REFE);
OLB_EXPA_OPER : '{;<' 	    -> pushMode(OL_OPER);
OLB_INSE_OPER : '{;>' 	    -> pushMode(OL_OPER);
OLB_DECL_OPER : '{;+' 	    -> pushMode(OL_OPER);
OLB_DELE_OPER : ('{;x'|'{;X')  -> pushMode(OL_OPER);
OLB_SKIP_OPER : '{;"' 	    -> pushMode(OL_SKIP_);
OLB_TEMP_OPER : '{;|' 	    -> pushMode(OL_TEMP);

LB_SLOT_OPER : '!$' 	    -> pushMode(L_SLOT_SPEC);
LB_SPEC_OPER : '!@' 	    -> pushMode(L_SLOT_SPEC);
LB_REFE_OPER : '!&' 	    -> pushMode(L_REFE);
LB_EXPA_OPER : '!<' 	    -> pushMode(L_OPER);
LB_INSE_OPER : '!>' 	    -> pushMode(L_OPER);
LB_DECL_OPER : '!+' 	    -> pushMode(L_OPER);
LB_DELE_OPER : ('!x'|'!X')  -> pushMode(L_OPER);
LB_SKIP_OPER : '!"' 	    -> pushMode(L_SKIP_);
LB_TEMP_OPER : '!|' 	    -> pushMode(L_TEMP);

IMPORT:'import' DP;

EQOP:':=';
INOP:':<';
PU:'.';
DP:':';
CO:',';
PC:';';

NAME: [a-zA-Z_][a-zA-Z_0-9]* ;



mode OL_OPER;
COMM_OL_OPER: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
WS_OL_OPER:[\t ]->skip;
NL_OPER  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}|EOF) -> popMode ;

OB_SLOT_OL_OPER : '{$' 	    -> pushMode(SLOT_SPEC);
OB_SPEC_OL_OPER : '{@' 	    -> pushMode(SLOT_SPEC);
OB_REFE_OL_OPER : '{&' 	    -> pushMode(REFE);
OB_EXPA_OL_OPER : '{<' 	    -> pushMode(OPER);
OB_INSE_OL_OPER : '{>' 	    -> pushMode(OPER);
OB_DECL_OL_OPER : '{+' 	    -> pushMode(OPER);
OB_DELE_OL_OPER : ('{x'|'{X')  -> pushMode(OPER);
OB_SKIP_OL_OPER : '{"' 	    -> pushMode(SKIP_);
OB_TEMP_OL_OPER : '{|' 	    -> pushMode(TEMP);

OLB_SLOT_OL_OPER : '{;$' 	    -> pushMode(OL_SLOT_SPEC);
OLB_SPEC_OL_OPER : '{;@' 	    -> pushMode(OL_SLOT_SPEC);
OLB_REFE_OL_OPER : '{;&' 	    -> pushMode(OL_REFE);
OLB_EXPA_OL_OPER : '{;<' 	    -> pushMode(OL_OPER);
OLB_INSE_OL_OPER : '{;>' 	    -> pushMode(OL_OPER);
OLB_DECL_OL_OPER : '{;+' 	    -> pushMode(OL_OPER);
OLB_DELE_OL_OPER : ('{;x'|'{;X')  -> pushMode(OL_OPER);
OLB_SKIP_OL_OPER : '{;"' 	    -> pushMode(OL_SKIP_);
OLB_TEMP_OL_OPER : '{;|' 	    -> pushMode(OL_TEMP);

LB_SLOT_OL_OPER : '!$' 	    -> pushMode(L_SLOT_SPEC);
LB_SPEC_OL_OPER : '!@' 	    -> pushMode(L_SLOT_SPEC);
LB_REFE_OL_OPER : '!&' 	    -> pushMode(L_REFE);
LB_EXPA_OL_OPER : '!<' 	    -> pushMode(L_OPER);
LB_INSE_OL_OPER : '!>' 	    -> pushMode(L_OPER);
LB_DECL_OL_OPER : '!+' 	    -> pushMode(L_OPER);
LB_DELE_OL_OPER : ('!x'|'!X')  -> pushMode(L_OPER);
LB_SKIP_OL_OPER : '!"' 	    -> pushMode(L_SKIP_);
LB_TEMP_OL_OPER : '!|' 	    -> pushMode(L_TEMP);

OL_IMPORT:'import' DP;

OL_EQOP:':=';
OL_INOP:':<';
OL_PU:'.';
OL_DP:':';
OL_CO:',';
OL_PC:';';

OL_NAME: [a-zA-Z_][a-zA-Z_0-9]* ;

mode L_OPER;
COMM_L_OPER: (
              ('{#'  ( ~'#' | '#' (~'}'|EOF) )+ '#}') |
              ('{;#' (~[\n\r])+?        {_input.LA(1) == '\n'}{_input.LA(1) == '\r'})|
              ('!#'  (~[\n\r\t ])+?     {_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '})
              ) -> skip;
WS_L_OPER:[\t ]->skip;
NW_OPER  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;

OB_SLOT_L_OPER : '{$' 	    -> pushMode(SLOT_SPEC);
OB_SPEC_L_OPER : '{@' 	    -> pushMode(SLOT_SPEC);
OB_REFE_L_OPER : '{&' 	    -> pushMode(REFE);
OB_EXPA_L_OPER : '{<' 	    -> pushMode(OPER);
OB_INSE_L_OPER : '{>' 	    -> pushMode(OPER);
OB_DECL_L_OPER : '{+' 	    -> pushMode(OPER);
OB_DELE_L_OPER : ('{x'|'{X')  -> pushMode(OPER);
OB_SKIP_L_OPER : '{"' 	    -> pushMode(SKIP_);
OB_TEMP_L_OPER : '{|' 	    -> pushMode(TEMP);

OLB_SLOT_L_OPER : '{;$' 	    -> pushMode(OL_SLOT_SPEC);
OLB_SPEC_L_OPER : '{;@' 	    -> pushMode(OL_SLOT_SPEC);
OLB_REFE_L_OPER : '{;&' 	    -> pushMode(OL_REFE);
OLB_EXPA_L_OPER : '{;<' 	    -> pushMode(OL_OPER);
OLB_INSE_L_OPER : '{;>' 	    -> pushMode(OL_OPER);
OLB_DECL_L_OPER : '{;+' 	    -> pushMode(OL_OPER);
OLB_DELE_L_OPER : ('{;x'|'{;X')  -> pushMode(OL_OPER);
OLB_SKIP_L_OPER : '{;"' 	    -> pushMode(OL_SKIP_);
OLB_TEMP_L_OPER : '{;|' 	    -> pushMode(OL_TEMP);

LB_SLOT_L_OPER : '!$' 	    -> pushMode(L_SLOT_SPEC);
LB_SPEC_L_OPER : '!@' 	    -> pushMode(L_SLOT_SPEC);
LB_REFE_L_OPER : '!&' 	    -> pushMode(L_REFE);
LB_EXPA_L_OPER : '!<' 	    -> pushMode(L_OPER);
LB_INSE_L_OPER : '!>' 	    -> pushMode(L_OPER);
LB_DECL_L_OPER : '!+' 	    -> pushMode(L_OPER);
LB_DELE_L_OPER : ('!x'|'!X')  -> pushMode(L_OPER);
LB_SKIP_L_OPER : '!"' 	    -> pushMode(L_SKIP_);
LB_TEMP_L_OPER : '!|' 	    -> pushMode(L_TEMP);

L_IMPORT:'import' DP;

L_EQOP:':=';
L_INOP:':<';
L_PU:'.';
L_DP:':';
L_CO:',';
L_PC:';';

L_NAME: [a-zA-Z_][a-zA-Z_0-9]* ;



mode SKIP_;
CB_SKIP  : '"}' -> popMode ;
IN_SKIP : ( ~'"'
       | '"' (~'}'|EOF)
       )+ ;

mode OL_SKIP_;
NL_SKIP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}|EOF)-> popMode ;
IN_OL_SKIP : ( ~[\n\r])+ ;

mode L_SKIP_;
NW_SKIP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;
IN_L_SKIP : ( ~[\n\r\t ])+ ;



mode TEMP;
CB_TEMP  : '|}' -> popMode ;
TEXT_LINE: ( ~[|\n\r{!] | '|' (~'}'|EOF) | '{' (~[;"@$]|EOF) | '{;' (~["@$]|EOF) | '!' (~["@$]|EOF) )+;
LINE_DIVIDER: ([ \t]*[\n\r][ \t]*) -> skip;

OB_SLOT_TEMP : '{$' 	-> pushMode(SLOT_SPEC);
OB_SPEC_TEMP : '{@' 	-> pushMode(SLOT_SPEC);
OB_SKIP_TEMP : '{"' 	-> pushMode(SKIP_);

OLB_SLOT_TEMP : '{;$' 	-> pushMode(OL_SLOT_SPEC);
OLB_SPEC_TEMP : '{;@' 	-> pushMode(OL_SLOT_SPEC);
OLB_SKIP_TEMP : '{;"' 	-> pushMode(OL_SKIP_);

LB_SLOT_TEMP : '!$' 	-> pushMode(L_SLOT_SPEC);
LB_SPEC_TEMP : '!@' 	-> pushMode(L_SLOT_SPEC);
LB_SKIP_TEMP : '!"' 	-> pushMode(L_SKIP_);

mode OL_TEMP;
NL_TEMP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}|EOF) -> popMode ;
OL_TEXT_LINE: ( ~[|\n\r{!] | '|' (~[}\n\r]|EOF) | '{' (~[;"@$\n\r]|EOF) | '{;' (~["@$\n\r]|EOF) | '!' (~["@$\n\r]|EOF) )+;

OB_SLOT_OL_TEMP : '{$' 	-> pushMode(SLOT_SPEC);
OB_SPEC_OL_TEMP : '{@' 	-> pushMode(SLOT_SPEC);
OB_SKIP_OL_TEMP : '{"' 	-> pushMode(SKIP_);

OLB_SLOT_OL_TEMP : '{;$' 	-> pushMode(OL_SLOT_SPEC);
OLB_SPEC_OL_TEMP : '{;@' 	-> pushMode(OL_SLOT_SPEC);
OLB_SKIP_OL_TEMP : '{;"' 	-> pushMode(OL_SKIP_);

LB_SLOT_OL_TEMP : '!$' 	-> pushMode(L_SLOT_SPEC);
LB_SPEC_OL_TEMP : '!@' 	-> pushMode(L_SLOT_SPEC);
LB_SKIP_OL_TEMP : '!"' 	-> pushMode(L_SKIP_);

mode L_TEMP;
NW_TEMP  : ({_input.LA(1) == '\n'}{_input.LA(1) == '\r'}{_input.LA(1) == '\t'}{_input.LA(1) == ' '}|EOF) -> popMode ;
L_TEXT_LINE: ( ~[|\n\r{!] | '|' (~'}'|EOF) | '{' (~[;"@$]|EOF) | '{;' (~["@$]|EOF) | '!' (~["@$]|EOF) )+;

OB_SLOT_L_TEMP : '{$' 	-> pushMode(SLOT_SPEC);
OB_SPEC_L_TEMP : '{@' 	-> pushMode(SLOT_SPEC);
OB_SKIP_L_TEMP : '{"' 	-> pushMode(SKIP_);

OLB_SLOT_L_TEMP : '{;$' 	-> pushMode(OL_SLOT_SPEC);
OLB_SPEC_L_TEMP : '{;@' 	-> pushMode(OL_SLOT_SPEC);
OLB_SKIP_L_TEMP : '{;"' 	-> pushMode(OL_SKIP_);

LB_SLOT_L_TEMP : '!$' 	-> pushMode(L_SLOT_SPEC);
LB_SPEC_L_TEMP : '!@' 	-> pushMode(L_SLOT_SPEC);
LB_SKIP_L_TEMP : '!"' 	-> pushMode(L_SKIP_);

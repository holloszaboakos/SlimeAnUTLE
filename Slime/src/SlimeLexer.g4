lexer grammar SlimeLexer;
//We skip all whitespaces before special brackets
//They can be added by special char or by Text brackets
RULE_DIV:   ([\n\r\t ]+ { _input.LA(1) == '{' }?
            |[\n\r\t ]+ { _input.LA(1) == '[' }?
            |[\n\r\t ]+ { _input.LA(1) == '<' }?
            |[\n\r\t ]+ EOF )->skip;
//We skip all comments
fragment COMM : ('{#'  ( ~'#' | '#' (~'}'|EOF) )* '#}')
              | ('[#' (~[\n\r])*        {_input.LA(1) == '\n'|| _input.LA(1) == '\r' }?)
              | ('<#'  (~[\n\r\t ])*     {_input.LA(1) == '\n'|| _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}? );
COMM_OUTER:COMM->skip;

//We switch mode at every special open bracket
//Block Open Brackets
BOB_SLOT : '{$' 	        -> pushMode(B_SLSP);
BOB_SPEC : '{@' 	        -> pushMode(B_SLSP);
BOB_REFE : '{&' 	        -> pushMode(B_REFE);
BOB_EXTE : '{*' 	        -> pushMode(B_OPER);
BOB_PLUS : '{+' 	        -> pushMode(B_OPER);
BOB_DECL : '{=' 	        -> pushMode(B_OPER);
BOB_DELE : ('{x'|'{X') 	    -> pushMode(B_OPER);
BOB_TEXT : '{"' 	        -> pushMode(B_TEXT);
BOB_TEMP : '{|' 	        -> pushMode(B_TEMP);
//One Line Open Brackets
OLB_SLOT : '[$' 	    -> pushMode(O_SLSP);
OLB_SPEC : '[@' 	    -> pushMode(O_SLSP);
OLB_REFE : '[&' 	    -> pushMode(O_REFE);
OLB_EXTE : '[*' 	    -> pushMode(O_OPER);
OLB_PLUS : '[+' 	    -> pushMode(O_OPER);
OLB_DECL : '[=' 	    -> pushMode(O_OPER);
OLB_DELE : ('[x'|'[X')  -> pushMode(O_OPER);
OLB_TEXT : '["' 	    -> pushMode(O_TEXT);
OLB_TEMP : '[|' 	    -> pushMode(O_TEMP);
//Compact Open Brackets
COB_SLOT : '<$' 	    -> pushMode(C_SLSP);
COB_SPEC : '<@' 	    -> pushMode(C_SLSP);
COB_REFE : '<&' 	    -> pushMode(C_REFE);
COB_EXTE : '<*' 	    -> pushMode(C_OPER);
COB_PLUS : '<+' 	    -> pushMode(C_OPER);
COB_DECL : '<=' 	    -> pushMode(C_OPER);
COB_DELE : ('<x'|'<X')  -> pushMode(C_OPER);
COB_TEXT : '<"' 	    -> pushMode(C_TEXT);
COB_TEMP : '<|' 	    -> pushMode(C_TEMP);

// Every nonspecial char sequence is part of the subordinate language
TEXT_OUTOR : ( ~[{[<]
       | [{[<] (~[$@&|=+*xX#"]|EOF)
       )+ ;

//SLOT's and SPEC's lexer modes
//We have a separate mode for block, one line and compact versions of the bracket
mode B_SLSP;
//We skip all comments and whitespaces
COMM_B_S: COMM -> skip;
WS_B_S:[\n\r\t ]->skip;
//We return from lexer mode on closer brackets
BCB_SLOT  : '$}' -> popMode ;
BCB_SPEC  : '@}' -> popMode ;
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_B_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
//You can make more of the action divided by semicolons
SC_B_S : ';'-> type(SC);

mode O_SLSP;
//We skip all comments and not closer whitespaces
COMM_O_S: COMM -> skip;
WS_O_S:[\t ]->skip;
//We return from lexer mode on line break
NL_SLSP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_O_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
//You can make more of the action divided by semicolons
SC_O_S : ';'-> type(SC);

mode C_SLSP;
//We skip all comments
COMM_C_S: COMM -> skip;
//We return from lexer mode on whitespaces
NW_SLSP  : ([ \t]|{_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_C_S   : [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
//You can make more of the action divided by semicolons
SC_C_S : ';'-> type(SC);


//lexer modes of REFE
//We have a separate mode for block, one line and compact versions of the bracket
mode B_REFE;
//We skip all comments and whitespaces
COMM_REFE: COMM -> skip;
WS_B_R:[\n\r\t ]->skip;
//We return from lexer mode on closer brackets
BCB_REFE  : '&}' -> popMode ;

//We separate type restriction from RegEx by &:
REOP:':&';
//We devide types by colon
CL_B_R:':'-> type(CL);
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_B_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
//Everything else is part of the regex
REGEX : {_input.LA(-1) == '&'}? ( ~[&\n\r\t :] | '&' (~[}\n\r\t ]|EOF))+;

mode O_REFE;
//We skip all comments and not closer whitespaces
COMM_O_R: COMM -> skip;
WS_O_R:[ \t]->skip;
//We return from lexer mode on linebreaks
NL_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

//We separate type restriction from RegEx by &:
REOP_O_R:':&' -> type(REOP);
//We devide types by colon
CL_O_R:':'-> type(CL);
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_O_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
//Everything else is part of the regex
REGEX_O_R : ( ~[\n\r\t ] )+ ->type(REGEX);

mode C_REFE;
//We skip all comments
COMM_C_R: COMM -> skip;
//We return from lexer mode on whitespaces
NW_REFE  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

//We separate type restriction from RegEx by &:
REOP_C_R:':&' -> type(REOP);
//We devide types by colon
CL_C_R:':'-> type(CL);
//variable names consist of english letters, underscore and numbers but can not start by number
NAME_C_R: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
//Everything else is part of the regex
REGEX_C_R : ( ~[\n\r\t :&] )+ ->type(REGEX);



//DECL's, DELE's, PLUS's and EXTE's lexer modes
//We have a separate mode for block, one line and compact versions of the bracket
mode B_OPER;
//We skip all comments and whitespaces
COMM_B_O: COMM -> skip;
WS_B_O:[\n\r\t ]->skip;

//We return from lexer mode on closer brackets
BCB_EXTE  : '*}' -> popMode ;
BCB_PLUS  : '+}' -> popMode ;
BCB_DECL  : '=}' -> popMode ;
BCB_DELE  : ('x}'|'X}') -> popMode ;

//We switch mode at every special open bracket
//Block Open Brackets
BOB_SLOT_B_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_B_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_B_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_B_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_B_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_B_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_B_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_B_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_B_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);
//One Line Open Brackets
OLB_SLOT_B_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_B_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_B_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_B_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_B_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_B_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_B_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_B_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_B_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);
//One Compact Brackets
COB_SLOT_B_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_B_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_B_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_B_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_B_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_B_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_B_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_B_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_B_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

//We separate meta from value
EQOP:':=';
//We devide left and right of PLUS
PLOP:':+';
//We wrap path by period
PE:'.';
//We devide independent elements by comma
CO:',';
//We devide types and pairs by colon
CL:':';
//You can make more of the action divided by semicolons
SC:';';

//variable names consist of english letters, underscore and numbers but can not start by number
NAME: [a-zA-Z_][a-zA-Z_0-9]* ;
//Containers can be indexed by integer
INTE: [0-9]+;



mode O_OPER;
//We skip all comments and not closer whitespaces
COMM_O_O: COMM -> skip;
WS_O_O:[\t ]->skip;
//We return from lexer mode on line breacks
NL_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

//We switch mode at every special open bracket
//Block Open Brackets
BOB_SLOT_O_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_O_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_O_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_O_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_O_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_O_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_O_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_O_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_O_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);
//One Line Open Brackets
OLB_SLOT_O_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_O_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_O_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_O_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_O_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_O_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_O_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_O_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_O_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);
//One Compact Brackets
COB_SLOT_O_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_O_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_O_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_O_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_O_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_O_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_O_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_O_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_O_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

//We separate meta from value by :=
EQOP_O_O:':='-> type(EQOP);
//We devide left and right of plus by :+
PLOP_O_O:':+'-> type(PLOP);
//We wrap path by period
PE_O_O:'.'-> type(PE);
//We devide independent elements by colum
CO_O_O:','-> type(CO);
//We devide types and pairs by colon
CL_O_O:':'-> type(CL);
//You can make more of the action divided by semicolons
SC_O_O:';'-> type(SC);

//variable names consist of english letters, underscore and numbers but can not start by number
NAME_O_O: [a-zA-Z_][a-zA-Z_0-9]* -> type(NAME);
//containers can be indexed by integer
INTE_O_O: [0-9]+ -> type(INTE);

mode C_OPER;
//We skip all comments
COMM_C_O: COMM -> skip;
//We return from lexer mode on whitespaces
NW_OPER  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

//We switch mode at every special open bracket
//Block Open Brackets
BOB_SLOT_C_O : '{$' 	    ->  type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_C_O : '{@' 	    ->  type(BOB_SPEC), pushMode(B_SLSP);
BOB_REFE_C_O : '{&' 	    ->  type(BOB_REFE), pushMode(B_REFE);
BOB_EXTE_C_O : '{*' 	    ->  type(BOB_EXTE), pushMode(B_OPER);
BOB_PLUS_C_O : '{+' 	    ->  type(BOB_PLUS), pushMode(B_OPER);
BOB_DECL_C_O : '{=' 	    ->  type(BOB_DECL), pushMode(B_OPER);
BOB_DELE_C_O : ('{x'|'{X')  ->  type(BOB_DELE), pushMode(B_OPER);
BOB_TEXT_C_O : '{"' 	    ->  type(BOB_TEXT), pushMode(B_TEXT);
BOB_TEMP_C_O : '{|' 	    ->  type(BOB_TEMP), pushMode(B_TEMP);
//One Line Open Brackets
OLB_SLOT_C_O : '[$' 	    ->  type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_C_O : '[@' 	    ->  type(OLB_SPEC), pushMode(O_SLSP);
OLB_REFE_C_O : '[&' 	    ->  type(OLB_REFE), pushMode(O_REFE);
OLB_EXTE_C_O : '[*' 	    ->  type(OLB_EXTE), pushMode(O_OPER);
OLB_PLUS_C_O : '[+' 	    ->  type(OLB_PLUS), pushMode(O_OPER);
OLB_DECL_C_O : '[=' 	    ->  type(OLB_DECL), pushMode(O_OPER);
OLB_DELE_C_O : ('[x'|'[X')  ->  type(OLB_DELE), pushMode(O_OPER);
OLB_TEXT_C_O : '["' 	    ->  type(OLB_TEXT), pushMode(O_TEXT);
OLB_TEMP_C_O : '[|' 	    ->  type(OLB_TEMP), pushMode(O_TEMP);
//Compact Open Brackets
COB_SLOT_C_O : '<$' 	    ->  type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_C_O : '<@' 	    ->  type(COB_SPEC), pushMode(C_SLSP);
COB_REFE_C_O : '<&' 	    ->  type(COB_REFE), pushMode(C_REFE);
COB_EXTE_C_O : '<*' 	    ->  type(COB_EXTE), pushMode(C_OPER);
COB_PLUS_C_O : '<+' 	    ->  type(COB_PLUS), pushMode(C_OPER);
COB_DECL_C_O : '<=' 	    ->  type(COB_DECL), pushMode(C_OPER);
COB_DELE_C_O : ('<x'|'<X')  ->  type(COB_DELE), pushMode(C_OPER);
COB_TEXT_C_O : '<"' 	    ->  type(COB_TEXT), pushMode(C_TEXT);
COB_TEMP_C_O : '<|' 	    ->  type(COB_TEMP), pushMode(C_TEMP);

//We separate meta and value by :=
EQOP_C_O:':='-> type(EQOP);
//We devide types and pairs by colon
PLOP_C_O:':+'-> type(PLOP);
//We wrap path by period
PE_C_O:'.'-> type(PE);
//We devide independent elements by
CO_C_O:','-> type(CO);
//We devide types and pairs by colon
CL_C_O:':'-> type(CL);
//You can make more of the action divided by semicolons
SC_C_O:';'-> type(SC);

//variable names consist of english letters, underscore and numbers but can not start by number
NAME_C_O: [a-zA-Z_][a-zA-Z_0-9]*-> type(NAME);
//Containers can be indexed with integer
INTE_C_O: [0-9]+-> type(INTE);



//lexer modes of TEXT
//We have a separate mode for block, one line and compact versions of the bracket
mode B_TEXT;
//We return from lexer mode on closer brackets
BCB_TEXT  : '"}' -> popMode ;
// Every nonspecial char sequence is part of the text
IN_B_T : ( ~'"'
       | '"' (~'}'|EOF)
       )+ ;

mode O_TEXT;
//We return from lexer mode on line breaks
NL_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?)-> popMode ;
// Every nonspecial char sequence is part of the text
IN_O_T : ( ~[\n\r])+ ->type(IN_B_T);

mode C_TEXT;
//We return from lexer mode on whitespaces
NW_TEXT  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;
// Every nonspecial char sequence is part of the text
IN_C_T : ( ~[\n\r\t ])+ ->type(IN_B_T);



//lexer modes of TEMP
//We have a separate mode for block, one line and compact versions of the bracket
mode B_TEMP;
//We return from lexer mode on closer brackets
BCB_TEMP  : '|}' -> popMode ;
//We skip all whitespaces between lines
LINE_DIVIDER: ([ \t]*[\n\r][ \t]*) -> skip;

//We switch mode at some special open brackets
//Block Open Brackets
BOB_SLOT_B_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_B_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_B_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);
//One Line Open Brackets
OLB_SLOT_B_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_B_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_B_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);
//Compact Open Brackets
COB_SLOT_B_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_B_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_B_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

//You can make more of the action divided by semicolons
SC_B_T:';'-> type(SC);
// Every nonspecial char sequence is part of the subordinate language
TEXT_LINE:( ~[|\n\r{[<;] | '|' (~'}'|EOF) | [{[<] (~[;"@$|]|EOF|{_input.LA(1) == ';'||_input.LA(1) == '|'}?))+;

mode O_TEMP;
//We return from lexer mode on line breaks
NL_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r'}?) -> popMode ;

//We switch mode at some special open brackets
//Block Open Brackets
BOB_SLOT_O_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_O_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_O_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);
//One Line Open Brackets
OLB_SLOT_O_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_O_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_O_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);
//Compact Open Brackets
COB_SLOT_O_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_O_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_O_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

//You can make more of the action divided by semicolons
SC_O_T:';'-> type(SC);
// Every nonspecial char sequence is part of the subordinate language
O_TEXT_LINE: ( ~[\n\r{[<;] | [{[<] (~[;"@$\n\r]|EOF|{_input.LA(1) == ';'}?) )+ ->type(TEXT_LINE);

mode C_TEMP;
//We return from lexer mode on whitespaces
NW_TEMP  : ({_input.LA(1) == '\n' || _input.LA(1) == '\r' || _input.LA(1) == '\t' || _input.LA(1) == ' '}?) -> popMode ;

//We switch mode at some special open brackets
//Block Open Brackets
BOB_SLOT_C_T : '{$' 	-> type(BOB_SLOT), pushMode(B_SLSP);
BOB_SPEC_C_T : '{@' 	-> type(BOB_SPEC), pushMode(B_SLSP);
BOB_TEXT_C_T : '{"' 	-> type(BOB_TEXT), pushMode(B_TEXT);
//One Line Open Brackets
OLB_SLOT_C_T : '[$' 	-> type(OLB_SLOT), pushMode(O_SLSP);
OLB_SPEC_C_T : '[@' 	-> type(OLB_SPEC), pushMode(O_SLSP);
OLB_TEXT_C_T : '["' 	-> type(OLB_TEXT), pushMode(O_TEXT);
//Compact Open Brackets
COB_SLOT_C_T : '<$' 	-> type(COB_SLOT), pushMode(C_SLSP);
COB_SPEC_C_T : '<@' 	-> type(COB_SPEC), pushMode(C_SLSP);
COB_TEXT_C_T : '<"' 	-> type(COB_TEXT), pushMode(C_TEXT);

//You can make more of the action divided by semicolons
SC_C_T:';'-> type(SC);
// Every nonspecial char sequence is part of the subordinate language
C_TEXT_LINE: ( ~[\n\r\t {[<;] | [{[<] (~[;"@$\n\r\t ]|EOF|{_input.LA(1) == ';'}?) )+ ->type(TEXT_LINE);
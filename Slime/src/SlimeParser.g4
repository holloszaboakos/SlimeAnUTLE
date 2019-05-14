parser grammar SlimeParser;

//Setting the vocabulary
options { tokenVocab=SlimeLexer; }

//The root rule
file: (text|refe|slot|spec|temp|dele|exte|plus|decl|dele|refe|textOutor)*;

//brackets parser rules
//every bracket consists of the open bracket the body and the close token
//TEXT
text: textHead textBody textTail;
textHead:(BOB_TEXT|OLB_TEXT|COB_TEXT);
textBody:IN_B_T;
textTail:(BCB_TEXT|NL_TEXT|NW_TEXT);
//REFE
refe: refeHead refeBody refeTail;
refeHead:(BOB_REFE|OLB_REFE|COB_REFE);
refeBody: typeName REOP REGEX;
refeTail:(BCB_REFE|NL_REFE|NW_REFE);
//SLOT
slot: slotHead spslBody slotTail;
slotHead: (BOB_SLOT|OLB_SLOT|COB_SLOT);
slotTail:(BCB_SLOT|NL_SLSP|NW_SLSP);
//SPEC
spec: specHead spslBody specTail;
specHead:( BOB_SPEC|OLB_SPEC|COB_SPEC);
specTail:(BCB_SPEC|NL_SLSP|NW_SLSP);

spslBody:NAME (SC NAME)*  ;
//TEMP
temp: tempHead tempBody tempTail;
tempHead:(BOB_TEMP|OLB_TEMP|COB_TEMP);
tempBody:(tempBodyPart SC)* tempBodyPart;
tempBodyPart:(text|slot|spec|tempText|LINE_DIVIDER)+;
tempTail:(BCB_TEMP|NL_TEMP|NW_TEMP);
tempText:(TEXT_LINE LINE_DIVIDER)* TEXT_LINE;
//EXTE
exte: exteHead exteBody exteTail;
exteHead:(BOB_EXTE|OLB_EXTE|COB_EXTE);
exteBody:(exteBodyPart SC?)* exteBodyPart;
exteBodyPart:vari (CL (temp|spec))?;
exteTail:(BCB_EXTE|NL_OPER|NW_OPER);
//PLUS
plus: plusHead plusBody plusTail;
plusHead:(BOB_PLUS|OLB_PLUS|COB_PLUS);
plusBody:(plusBodyPart SC?)* plusBodyPart;
plusBodyPart: vari PLOP vari (CL (plusElement CO)* plusElement)?;
plusElement: variPath PLOP variPath;
plusTail:(BCB_PLUS|NL_OPER|NW_OPER);
//DELE
dele: deleHead deleBody deleTail;
deleHead:(BOB_DELE|OLB_DELE|COB_DELE) ;
deleBody:((variPath|refe) SC?)* (variPath|refe) ;
deleTail:(BCB_DELE|NL_OPER|NW_OPER);
//DECL
decl: declHead  declBody declTail;
declHead: (BOB_DECL|OLB_DECL|COB_DECL) ;
declNeck:listName? CL typeName EQOP;
declBody: (declBodyPart SC?)* declBodyPart;
declBodyPart: declNeck
                (listName|listVari|
                (nameType CO)* nameType|
                (nameValue CO)* nameValue);
declTail:(BCB_DECL|NL_OPER|NW_OPER);

//declaring value to attributes
nameValue:(listName EQOP listVari);
//metadata
nameType:(listName CL typeName);
//list of variables
listVari: (vari CO)* vari;
//variable
vari: variPath|decl|temp|spec|slot|refe|plus|text|exte;
//path
variPath: ((NAME|INTE) PE)* (NAME|INTE);
//declaring value to values
listName: (NAME CO)* NAME;
//type with type embedding
typeName: (NAME CL)* NAME;

//subordinate language
textOutor:TEXT_OUTOR;
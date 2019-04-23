parser grammar SlimeParser;

options { tokenVocab=SlimeLexer; }

file: (text|refe|slot|spec|temp|dele|exte|plus|decl|dele|refe|textOutor)*;

text: textHead textBody textTail;
textHead:(BOB_TEXT|OLB_TEXT|COB_TEXT|
          BOB_TEXT_B_O|OLB_TEXT_B_O|COB_TEXT_B_O|
          BOB_TEXT_O_O|OLB_TEXT_O_O|COB_TEXT_O_O|
          BOB_TEXT_C_O|OLB_TEXT_C_O|COB_TEXT_C_O|
          BOB_TEXT_B_T|OLB_TEXT_B_T|COB_TEXT_B_T|
          BOB_TEXT_O_T|OLB_TEXT_O_T|COB_TEXT_O_T|
          BOB_TEXT_C_T|OLB_TEXT_C_T|COB_TEXT_C_T);
textBody:(IN_B_T|IN_O_T|IN_C_T);
textTail:(BCB_TEXT|NL_TEXT|NW_TEXT);

refe: refeHead refeBody refeTail;
refeHead:(BOB_REFE|OLB_REFE|COB_REFE|
          BOB_REFE_B_O|OLB_REFE_B_O|COB_REFE_B_O|
          BOB_REFE_O_O|OLB_REFE_O_O|COB_REFE_O_O|
          BOB_REFE_C_O|OLB_REFE_C_O|COB_REFE_C_O);
refeBody: typeName (IN_B_R|IN_O_R|IN_C_R);
refeTail:(BCB_REFE|NL_REFE|NW_REFE);

slot: slotHead spslBody slotTail;
slotHead: (BOB_SLOT|OLB_SLOT|COB_SLOT|
            BOB_SLOT_B_O|OLB_SLOT_B_O|COB_SLOT_B_O|
            BOB_SLOT_O_O|OLB_SLOT_O_O|COB_SLOT_O_O|
            BOB_SLOT_C_O|OLB_SLOT_C_O|COB_SLOT_C_O|
            BOB_SLOT_B_T|OLB_SLOT_B_T|COB_SLOT_B_T|
            BOB_SLOT_O_T|OLB_SLOT_O_T|COB_SLOT_O_T|
            BOB_SLOT_C_T|OLB_SLOT_C_T|COB_SLOT_C_T);
slotTail:(BCB_SLOT|NL_SLSP|NW_SLSP);

spec: specHead spslBody specTail;
specHead:( BOB_SPEC|OLB_SPEC|COB_SPEC|
            BOB_SPEC_B_O|OLB_SPEC_B_O|COB_SPEC_B_O|
            BOB_SPEC_O_O|OLB_SPEC_O_O|COB_SPEC_O_O|
            BOB_SPEC_C_O|OLB_SPEC_C_O|COB_SPEC_C_O|
            BOB_SPEC_B_T|OLB_SPEC_B_T|COB_SPEC_B_T|
            BOB_SPEC_O_T|OLB_SPEC_O_T|COB_SPEC_O_T|
            BOB_SPEC_C_T|OLB_SPEC_C_T|COB_SPEC_C_T);
specTail:(BCB_SPEC|NL_SLSP|NW_SLSP);

spslBody:(NAME_B_S SC_B_S|NAME_O_S SC_O_S|NAME_C_S SC_C_S)* (NAME_B_S|NAME_O_S|NAME_C_S) ;

temp: tempHead tempBody tempTail;
tempHead:(BOB_TEMP|OLB_TEMP|COB_TEMP|
          BOB_TEMP_B_O|OLB_TEMP_B_O|COB_TEMP_B_O|
          BOB_TEMP_O_O|OLB_TEMP_O_O|COB_TEMP_O_O|
          BOB_TEMP_C_O|OLB_TEMP_C_O|COB_TEMP_C_O);
tempBody:(tempBodyPart (SC_B_T|SC_C_T|SC_O_T))* tempBodyPart;
tempBodyPart:(text|slot|spec|tempText|LINE_DIVIDER)+;
tempTail:(BCB_TEMP|NL_TEMP|NW_TEMP);
tempText:(B_TEXT_LINE LINE_DIVIDER)* B_TEXT_LINE|O_TEXT_LINE|C_TEXT_LINE;

exte: exteHead exteBody exteTail;
exteHead:(BOB_EXTE|OLB_EXTE|COB_EXTE|
           BOB_EXTE_B_O|OLB_EXTE_B_O|COB_EXTE_B_O|
           BOB_EXTE_O_O|OLB_EXTE_O_O|COB_EXTE_O_O|
           BOB_EXTE_C_O|OLB_EXTE_C_O|COB_EXTE_C_O);
exteBody:(exteBodyPart (SC_B_O|SC_O_O|SC_C_O))* exteBodyPart;
exteBodyPart:vari ((CL_B_O|CL_O_O|CL_C_O) (temp|spec))?;
exteTail:(BCB_EXTE|NL_OPER|NW_OPER);

plus: plusHead plusBody plusTail;
plusHead:(BOB_PLUS|OLB_PLUS|COB_PLUS|
           BOB_PLUS_B_O|OLB_PLUS_B_O|COB_PLUS_B_O|
           BOB_PLUS_O_O|OLB_PLUS_O_O|COB_PLUS_O_O|
           BOB_PLUS_C_O|OLB_PLUS_C_O|COB_PLUS_C_O);
plusBody:(plusBodyPart (SC_B_O|SC_O_O|SC_C_O))* plusBodyPart;
plusBodyPart: vari (PLOP_B_O|PLOP_O_O|PLOP_C_O) vari ((CL_B_O|CL_O_O|CL_C_O) (plusElement(CO_B_O|CO_O_O|CO_C_O))* plusElement)?;
plusElement: variPath (PLOP_B_O|PLOP_O_O|PLOP_C_O) variPath;
plusTail:(BCB_PLUS|NL_OPER|NW_OPER);

dele: deleHead deleBody deleTail;
deleHead:(BOB_DELE|OLB_DELE|COB_DELE|
           BOB_DELE_B_O|OLB_DELE_B_O|COB_DELE_B_O|
           BOB_DELE_O_O|OLB_DELE_O_O|COB_DELE_O_O|
           BOB_DELE_C_O|OLB_DELE_C_O|COB_DELE_C_O) ;
deleBody:((variPath|refe) (SC_B_O|SC_O_O|SC_C_O))* (variPath|refe) ;
deleTail:(BCB_DELE|NL_OPER|NW_OPER);


decl: declHead  declBody declTail;
declHead: (BOB_DECL|OLB_DECL|COB_DECL|
            BOB_DECL_B_O|OLB_DECL_B_O|COB_DECL_B_O|
            BOB_DECL_O_O|OLB_DECL_O_O|COB_DECL_O_O|
            BOB_DECL_C_O|OLB_DECL_C_O|COB_DECL_C_O) ;
declNeck:listName? (CL_B_O|CL_O_O|CL_C_O) typeName (EQOP_B_O|EQOP_O_O|EQOP_C_O);
declBody: (declBodyPart (SC_B_O|SC_O_O|SC_C_O))* declBodyPart;
declBodyPart: declNeck( listName|listVari|
                 (nameType (CO_B_O|CO_O_O|CO_C_O))* nameType|
                 (nameValue (CO_B_O|CO_O_O|CO_C_O))* nameValue)|
                 vari;
declTail:(BCB_DECL|NL_OPER|NW_OPER);


nameValue:(listName (EQOP_B_O|EQOP_O_O|EQOP_C_O) listVari);
nameType:(listName (CL_B_O|CL_O_O|CL_C_O) typeName);
listVari: (vari (CO_B_O|CO_O_O|CO_C_O))* vari;
vari: variPath|decl|temp|spec|slot|refe|plus|text;
listName: (NAME_B_O CO_B_O|NAME_O_O CO_O_O|NAME_C_O CO_C_O)* (NAME_B_O|NAME_O_O|NAME_C_O);
variPath: (NAME_B_O PE_B_O|NAME_O_O PE_O_O|NAME_C_O PE_C_O|INTE_B_O PE_B_O|INTE_O_O PE_O_O|INTE_C_O PE_C_O)*
              (NAME_B_O|NAME_O_O|NAME_C_O|INTE_B_O|INTE_O_O|INTE_C_O);
typeName: (NAME_B_O CL_B_O|NAME_O_O CL_O_O|NAME_C_O CL_C_O|NAME_C_R CL_C_R|NAME_O_R CL_O_R|NAME_B_R CL_B_R)*
          (NAME_B_O|NAME_O_O|NAME_C_O|NAME_B_R|NAME_O_R|NAME_C_R);


textOutor:TEXT_OUTOR;
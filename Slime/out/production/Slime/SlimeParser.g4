parser grammar SlimeParser;

options { tokenVocab=SlimeLexer; }

file: (text|refe|slot|spec|temp|dele|expa|plus|decl|dele|refe|textOutor)*;

text: textHead textBody textTail;
textHead:(OB_TEXT|OLB_TEXT|LB_TEXT|
          OB_TEXT_B_O|OLB_TEXT_B_O|LB_TEXT_B_O|
          OB_TEXT_O_O|OLB_TEXT_O_O|LB_TEXT_O_O|
          OB_TEXT_L_O|OLB_TEXT_L_O|LB_TEXT_L_O|
          OB_TEXT_B_T|OLB_TEXT_B_T|LB_TEXT_B_T|
          OB_TEXT_O_T|OLB_TEXT_O_T|LB_TEXT_O_T|
          OB_TEXT_L_T|OLB_TEXT_L_T|LB_TEXT_L_T);
textBody:(IN_TEXT|IN_OL_TEXT|IN_L_TEXT);
textTail:(CB_TEXT|NL_TEXT|NW_TEXT);

refe: refeHead refeBody refeTail;
refeHead:(OB_REFE|OLB_REFE|LB_REFE|
          OB_REFE_B_O|OLB_REFE_B_O|LB_REFE_B_O|
          OB_REFE_O_O|OLB_REFE_O_O|LB_REFE_O_O|
          OB_REFE_L_O|OLB_REFE_L_O|LB_REFE_L_O);
refeBody: typeName (IN_B_R|IN_O_R|IN_L_R);
refeTail:(CB_REFE|NL_REFE|NW_REFE);

slot: slotHead spslBody slotTail;
slotHead: (OB_SLOT|OLB_SLOT|LB_SLOT|
            OB_SLOT_B_O|OLB_SLOT_B_O|LB_SLOT_B_O|
            OB_SLOT_O_O|OLB_SLOT_O_O|LB_SLOT_O_O|
            OB_SLOT_L_O|OLB_SLOT_L_O|LB_SLOT_L_O|
            OB_SLOT_B_T|OLB_SLOT_B_T|LB_SLOT_B_T|
            OB_SLOT_O_T|OLB_SLOT_O_T|LB_SLOT_O_T|
            OB_SLOT_L_T|OLB_SLOT_L_T|LB_SLOT_L_T);
slotTail:(CB_SLOT|NL_SLSP|NW_SLSP);

spec: specHead spslBody specTail;
specHead:( OB_SPEC|OLB_SPEC|LB_SPEC|
            OB_SPEC_B_O|OLB_SPEC_B_O|LB_SPEC_B_O|
            OB_SPEC_O_O|OLB_SPEC_O_O|LB_SPEC_O_O|
            OB_SPEC_L_O|OLB_SPEC_L_O|LB_SPEC_L_O|
            OB_SPEC_B_T|OLB_SPEC_B_T|LB_SPEC_B_T|
            OB_SPEC_O_T|OLB_SPEC_O_T|LB_SPEC_O_T|
            OB_SPEC_L_T|OLB_SPEC_L_T|LB_SPEC_L_T);
specTail:(CB_SPEC|NL_SLSP|NW_SLSP);

spslBody:(NAME_B_S SC_B_S|NAME_O_S SC_O_S|NAME_L_S SC_L_S)* (NAME_B_S|NAME_O_S|NAME_L_S) ;

temp: tempHead tempBody tempTail;
tempHead:(OB_TEMP|OLB_TEMP|LB_TEMP|
          OB_TEMP_B_O|OLB_TEMP_B_O|LB_TEMP_B_O|
          OB_TEMP_O_O|OLB_TEMP_O_O|LB_TEMP_O_O|
          OB_TEMP_L_O|OLB_TEMP_L_O|LB_TEMP_L_O);
tempBody:(tempBodyPart (SC_B_T|SC_L_T|SC_O_T))* tempBodyPart;
tempBodyPart:(text|slot|spec|tempText|LINE_DIVIDER)+;
tempTail:(CB_TEMP|NL_TEMP|NW_TEMP);
tempText:(TEXT_LINE LINE_DIVIDER)* TEXT_LINE|OL_TEXT_LINE|L_TEXT_LINE;

expa: expaHead expaBody expaTail;
expaHead:(OB_EXPA|OLB_EXPA|LB_EXPA|
           OB_EXPA_B_O|OLB_EXPA_B_O|LB_EXPA_B_O|
           OB_EXPA_O_O|OLB_EXPA_O_O|LB_EXPA_O_O|
           OB_EXPA_L_O|OLB_EXPA_L_O|LB_EXPA_L_O);
expaBody:(expaBodyPart (SC_B_O|SC_O_O|SC_L_O))* expaBodyPart;
expaBodyPart:vari ((CL_B_O|CL_O_O|CL_L_O) (temp|spec))?;
expaTail:(CB_EXPA|NL_OPER|NW_OPER);

plus: plusHead plusBody plusTail;
plusHead:(OB_PLUS|OLB_PLUS|LB_PLUS|
           OB_PLUS_B_O|OLB_PLUS_B_O|LB_PLUS_B_O|
           OB_PLUS_O_O|OLB_PLUS_O_O|LB_PLUS_O_O|
           OB_PLUS_L_O|OLB_PLUS_L_O|LB_PLUS_L_O);
plusBody:(plusBodyPart (SC_B_O|SC_O_O|SC_L_O))* plusBodyPart;
plusBodyPart: vari (PLOP_B_O|PLOP_O_O|PLOP_L_O) vari ((CL_B_O|CL_O_O|CL_L_O) (plusElement(CO_B_O|CO_O_O|CO_L_O))* plusElement)?;
plusElement: variPath (PLOP_B_O|PLOP_O_O|PLOP_L_O) variPath;
plusTail:(CB_PLUS|NL_OPER|NW_OPER);

dele: deleHead deleBody deleTail;
deleHead:(OB_DELE|OLB_DELE|LB_DELE|
           OB_DELE_B_O|OLB_DELE_B_O|LB_DELE_B_O|
           OB_DELE_O_O|OLB_DELE_O_O|LB_DELE_O_O|
           OB_DELE_L_O|OLB_DELE_L_O|LB_DELE_L_O) ;
deleBody:((variPath|refe) (SC_B_O|SC_O_O|SC_L_O))* (variPath|refe) ;
deleTail:(CB_DELE|NL_OPER|NW_OPER);


decl: declHead  declBody declTail;
declHead: (OB_DECL|OLB_DECL|LB_DECL|
            OB_DECL_B_O|OLB_DECL_B_O|LB_DECL_B_O|
            OB_DECL_O_O|OLB_DECL_O_O|LB_DECL_O_O|
            OB_DECL_L_O|OLB_DECL_L_O|LB_DECL_L_O) ;
declNeck:listName? (CL_B_O|CL_O_O|CL_L_O) typeName (EQOP_B_O|EQOP_O_O|EQOP_L_O);
declBody: (declBodyPart (SC_B_O|SC_O_O|SC_L_O))* declBodyPart;
declBodyPart: declNeck( listName|listVari|
                 (nameType (CO_B_O|CO_O_O|CO_L_O))* nameType|
                 (nameValue (CO_B_O|CO_O_O|CO_L_O))* nameValue)|
                 vari;
declTail:(CB_DECL|NL_OPER|NW_OPER);


nameValue:(listName (EQOP_B_O|EQOP_O_O|EQOP_L_O) listVari);
nameType:(listName (CL_B_O|CL_O_O|CL_L_O) typeName);
listVari: (vari (CO_B_O|CO_O_O|CO_L_O))* vari;
vari: variPath|decl|temp|spec|slot|refe|plus|text;
listName: (NAME_B_O CO_B_O|NAME_O_O CO_O_O|NAME_L_O CO_L_O)* (NAME_B_O|NAME_O_O|NAME_L_O);
variPath: (NAME_B_O PE_B_O|NAME_O_O PE_O_O|NAME_L_O PE_L_O|INTE_B_O PE_B_O|INTE_O_O PE_O_O|INTE_L_O PE_L_O)*
              (NAME_B_O|NAME_O_O|NAME_L_O|INTE_B_O|INTE_O_O|INTE_L_O);
typeName: (NAME_B_O CL_B_O|NAME_O_O CL_O_O|NAME_L_O CL_L_O|NAME_L_R CL_L_R|NAME_O_R CL_O_R|NAME_B_R CL_B_R)*
          (NAME_B_O|NAME_O_O|NAME_L_O|NAME_B_R|NAME_O_R|NAME_L_R);


textOutor:TEXT_OUTOR;
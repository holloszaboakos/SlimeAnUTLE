parser grammar SlimeParser;

options { tokenVocab=SlimeLexer; }

all: (text|refe|slot|spec|temp|dele|expa|inse|decl|dele|refe|text_outor)*;

text: text_head text_body text_tail;
text_head:(OB_TEXT|OLB_TEXT|LB_TEXT|
          OB_TEXT_B_O|OLB_TEXT_B_O|LB_TEXT_B_O|
          OB_TEXT_O_O|OLB_TEXT_O_O|LB_TEXT_O_O|
          OB_TEXT_L_O|OLB_TEXT_L_O|LB_TEXT_L_O|
          OB_TEXT_B_T|OLB_TEXT_B_T|LB_TEXT_B_T|
          OB_TEXT_O_T|OLB_TEXT_O_T|LB_TEXT_O_T|
          OB_TEXT_L_T|OLB_TEXT_L_T|LB_TEXT_L_T);
text_body:(IN_TEXT|IN_OL_TEXT|IN_L_TEXT);
text_tail:(CB_TEXT|NL_TEXT|NW_TEXT);

refe: refe_head refe_body refe_tail;
refe_head:(OB_REFE|OLB_REFE|LB_REFE|
          OB_REFE_B_O|OLB_REFE_B_O|LB_REFE_B_O|
          OB_REFE_O_O|OLB_REFE_O_O|LB_REFE_O_O|
          OB_REFE_L_O|OLB_REFE_L_O|LB_REFE_L_O);
refe_body: typeName (IN_B_R|IN_O_R|IN_L_R);
refe_tail:(CB_REFE|NL_REFE|NW_REFE);

slot: slot_head spsl_body slot_tail;
slot_head: (OB_SLOT|OLB_SLOT|LB_SLOT|
            OB_SLOT_B_O|OLB_SLOT_B_O|LB_SLOT_B_O|
            OB_SLOT_O_O|OLB_SLOT_O_O|LB_SLOT_O_O|
            OB_SLOT_L_O|OLB_SLOT_L_O|LB_SLOT_L_O|
            OB_SLOT_B_T|OLB_SLOT_B_T|LB_SLOT_B_T|
            OB_SLOT_O_T|OLB_SLOT_O_T|LB_SLOT_O_T|
            OB_SLOT_L_T|OLB_SLOT_L_T|LB_SLOT_L_T);
slot_tail:(CB_SLOT|NL_SLSP|NW_SLSP);

spec: spec_head spsl_body spec_tail;
spec_head:( OB_SPEC|OLB_SPEC|LB_SPEC|
            OB_SPEC_B_O|OLB_SPEC_B_O|LB_SPEC_B_O|
            OB_SPEC_O_O|OLB_SPEC_O_O|LB_SPEC_O_O|
            OB_SPEC_L_O|OLB_SPEC_L_O|LB_SPEC_L_O|
            OB_SPEC_B_T|OLB_SPEC_B_T|LB_SPEC_B_T|
            OB_SPEC_O_T|OLB_SPEC_O_T|LB_SPEC_O_T|
            OB_SPEC_L_T|OLB_SPEC_L_T|LB_SPEC_L_T);
spec_tail:(CB_SPEC|NL_SLSP|NW_SLSP);

spsl_body:(NAME_B_S SC_B_S|NAME_O_S SC_O_S|NAME_L_S SC_L_S)* (NAME_B_S|NAME_O_S|NAME_L_S) ;

temp: temp_head temp_body temp_tail;
temp_head:(OB_TEMP|OLB_TEMP|LB_TEMP|
          OB_TEMP_B_O|OLB_TEMP_B_O|LB_TEMP_B_O|
          OB_TEMP_O_O|OLB_TEMP_O_O|LB_TEMP_O_O|
          OB_TEMP_L_O|OLB_TEMP_L_O|LB_TEMP_L_O);
temp_body:(temp_line (SC_B_T|SC_L_T|SC_O_T))* temp_line;
temp_tail:(CB_TEMP|NL_TEMP|NW_TEMP);
temp_line:(text|slot|spec|temp_text|LINE_DIVIDER)+;
temp_text:(TEXT_LINE LINE_DIVIDER)* TEXT_LINE|OL_TEXT_LINE|L_TEXT_LINE;

expa: expa_head expa_body expa_tail;
expa_head:(OB_EXPA|OLB_EXPA|LB_EXPA|
           OB_EXPA_B_O|OLB_EXPA_B_O|LB_EXPA_B_O|
           OB_EXPA_O_O|OLB_EXPA_O_O|LB_EXPA_O_O|
           OB_EXPA_L_O|OLB_EXPA_L_O|LB_EXPA_L_O);
expa_body:(expa_body_part (SC_B_O|SC_O_O|SC_L_O))* expa_body_part;
expa_body_part:(vari ((CL_B_O|CL_O_O|CL_L_O) temp|(CL_B_O|CL_O_O|CL_L_O) spec)?|(OB_IMPORT|OL_IMPORT|L_IMPORT) variName);
expa_tail:(CB_EXPA|NL_OPER|NW_OPER);

inse: inse_head inse_body inse_tail;
inse_head:(OB_INSE|OLB_INSE|LB_INSE|
           OB_INSE_B_O|OLB_INSE_B_O|LB_INSE_B_O|
           OB_INSE_O_O|OLB_INSE_O_O|LB_INSE_O_O|
           OB_INSE_L_O|OLB_INSE_L_O|LB_INSE_L_O);
inse_body:(inse_body_part (SC_B_O|SC_O_O|SC_L_O))* inse_body_part;
inse_body_part: variName (INOP_B_O|INOP_O_O|INOP_L_O) vari ((CL_B_O|CL_O_O|CL_L_O) inse_element((CO_B_O|CO_O_O|CO_L_O) inse_element)*)?| (OB_IMPORT|OL_IMPORT|L_IMPORT) variName;
inse_element: variName (INOP_B_O|INOP_O_O|INOP_L_O) variName;
inse_tail:(CB_INSE|NL_OPER|NW_OPER);

dele: dele_head dele_body dele_tail;
dele_head:(OB_DELE|OLB_DELE|LB_DELE|
           OB_DELE_B_O|OLB_DELE_B_O|LB_DELE_B_O|
           OB_DELE_O_O|OLB_DELE_O_O|LB_DELE_O_O|
           OB_DELE_L_O|OLB_DELE_L_O|LB_DELE_L_O) ;
dele_body:(vari (SC_B_O|SC_O_O|SC_L_O))* vari ;
dele_tail:(CB_DELE|NL_OPER|NW_OPER);


decl: decl_head  decl_body decl_tail;
decl_head: (OB_DECL|OLB_DECL|LB_DECL|
            OB_DECL_B_O|OLB_DECL_B_O|LB_DECL_B_O|
            OB_DECL_O_O|OLB_DECL_O_O|LB_DECL_O_O|
            OB_DECL_L_O|OLB_DECL_L_O|LB_DECL_L_O) ;
decl_neck:listName? (CL_B_O|CL_O_O|CL_L_O) typeName (EQOP_B_O|EQOP_O_O|EQOP_L_O);
decl_body: (decl_body_part (SC_B_O|SC_O_O|SC_L_O))* decl_body_part;
decl_body_part: decl_neck( (listName)|
                 ((nameType (CO_B_O|CO_O_O|CO_L_O))* nameType)|
                 ((nameValue (CO_B_O|CO_O_O|CO_L_O))* nameValue)|
                 ((vari (CO_B_O|CO_O_O|CO_L_O))* vari))|vari;
decl_tail:(CB_DECL|NL_OPER|NW_OPER);


nameValue:(listName (CL_B_O|CL_O_O|CL_L_O) vari);
nameType:(listName (PE_B_O|PE_O_O|PE_L_O) typeName);
vari: variNameIndx|variName|decl|temp|spec|refe|inse|text;
listName: (NAME_B_O CO_B_O|NAME_O_O CO_O_O|NAME_L_O CO_L_O)* (NAME_B_O|NAME_O_O|NAME_L_O);
variName: (NAME_B_O PE_B_O|NAME_O_O PE_O_O|NAME_L_O PE_L_O)* (NAME_B_O|NAME_O_O|NAME_L_O);
variNameIndx: (NAME_B_O PE_B_O|NAME_O_O PE_O_O|NAME_L_O PE_L_O|INTE_B_O PE_B_O|INTE_O_O PE_O_O|INTE_L_O PE_L_O)*
              (NAME_B_O|NAME_O_O|NAME_L_O|INTE_B_O|INTE_O_O|INTE_L_O);
typeName: (NAME_B_O CL_B_O|NAME_O_O CL_O_O|NAME_L_O CL_L_O|NAME_L_R CL_L_R|NAME_O_R CL_O_R|NAME_B_R CL_B_R)*
          (NAME_B_O|NAME_O_O|NAME_L_O|NAME_B_R|NAME_O_R|NAME_L_R);


text_outor:TEXT_OUTOR;
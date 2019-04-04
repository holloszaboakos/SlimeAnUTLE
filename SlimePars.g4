parser grammar SlimePars;

options { tokenVocab=SlimeLex; }

all: (COMM|ski_|refe|slot|spec|temp|dele|expa|inse|decl|dele|refe|text)*;

ski_: ski_head ski_body ski_tail;
ski_head:(OB_SKIP|OLB_SKIP|LB_SKIP|
          OB_SKIP_OPER|OLB_SKIP_OPER|LB_SKIP_OPER|
          OB_SKIP_OL_OPER|OLB_SKIP_OL_OPER|LB_SKIP_OL_OPER|
          OB_SKIP_L_OPER|OLB_SKIP_L_OPER|LB_SKIP_L_OPER|
          OB_SKIP_TEMP|OLB_SKIP_TEMP|LB_SKIP_TEMP|
          OB_SKIP_OL_TEMP|OLB_SKIP_OL_TEMP|LB_SKIP_OL_TEMP|
          OB_SKIP_L_TEMP|OLB_SKIP_L_TEMP|LB_SKIP_L_TEMP);
ski_body:(IN_SKIP|IN_OL_SKIP|IN_L_SKIP);
ski_tail:(CB_SKIP|NL_SKIP|NW_SKIP);

refe: refe_head refe_body refe_tail;
refe_head:(OB_REFE|OLB_REFE|LB_REFE|
          OB_REFE_OPER|OLB_REFE_OPER|LB_REFE_OPER|
          OB_REFE_OL_OPER|OLB_REFE_OL_OPER|LB_REFE_OL_OPER|
          OB_REFE_L_OPER|OLB_REFE_L_OPER|LB_REFE_L_OPER);
refe_body: (IN_REFE|IN_OL_REFE|IN_L_REFE);
refe_tail:(CB_REFE|NL_REFE|NW_REFE);

slot: slot_head spsl_body slot_tail;
slot_head: (OB_SLOT|OLB_SLOT|LB_SLOT|
            OB_SLOT_OPER|OLB_SLOT_OPER|LB_SLOT_OPER|
            OB_SLOT_OL_OPER|OLB_SLOT_OL_OPER|LB_SLOT_OL_OPER|
            OB_SLOT_L_OPER|OLB_SLOT_L_OPER|LB_SLOT_L_OPER|
            OB_SLOT_TEMP|OLB_SLOT_TEMP|LB_SLOT_TEMP|
            OB_SLOT_OL_TEMP|OLB_SLOT_OL_TEMP|LB_SLOT_OL_TEMP|
            OB_SLOT_L_TEMP|OLB_SLOT_L_TEMP|LB_SLOT_L_TEMP);
slot_tail:(CB_SLOT|NL_SLSP|NW_SLSP);

spec: spec_head spsl_body spec_tail;
spec_head:( OB_SPEC|OLB_SPEC|LB_SPEC|
            OB_SPEC_OPER|OLB_SPEC_OPER|LB_SPEC_OPER|
            OB_SPEC_OL_OPER|OLB_SPEC_OL_OPER|LB_SPEC_OL_OPER|
            OB_SPEC_L_OPER|OLB_SPEC_L_OPER|LB_SPEC_L_OPER|
            OB_SPEC_TEMP|OLB_SPEC_TEMP|LB_SPEC_TEMP|
            OB_SPEC_OL_TEMP|OLB_SPEC_OL_TEMP|LB_SPEC_OL_TEMP|
            OB_SPEC_L_TEMP|OLB_SPEC_L_TEMP|LB_SPEC_L_TEMP);
spec_tail:(CB_SPEC|NL_SLSP|NW_SLSP);

spsl_body:(KEY PC_SLSP|OL_KEY PC_OL_SLSP|L_KEY PC_L_SLSP)* (KEY|OL_KEY|L_KEY) ;

temp: (OB_TEMP|OB_TEMP_OPER|OLB_TEMP|OLB_TEMP_OPER|LB_TEMP|LB_TEMP_OPER) temp_line ((PC|OL_PC|L_PC) temp_line)* (CB_TEMP|NL_TEMP|NW_TEMP);
temp_line:(ski_|slot|spec|temp_text|LINE_DIVIDER)+;
temp_text:(TEXT_LINE LINE_DIVIDER)* TEXT_LINE|OL_TEXT_LINE|L_TEXT_LINE;

expa: expa_head expa_body expa_tail;
expa_head:(OB_EXPA|OLB_EXPA|LB_EXPA|
           OB_EXPA_OPER|OLB_EXPA_OPER|LB_EXPA_OPER|
           OB_EXPA_OL_OPER|OLB_EXPA_OL_OPER|LB_EXPA_OL_OPER|
           OB_EXPA_L_OPER|OLB_EXPA_L_OPER|LB_EXPA_L_OPER);
expa_body:(vari ((DP|OL_DP|L_DP) temp|(DP|OL_DP|L_DP) spec)?|(IMPORT|OL_IMPORT|L_IMPORT) variName);
expa_tail:(CB_EXPA|NL_OPER|NW_OPER);

inse: inse_head inse_body inse_tail;
inse_head:(OB_INSE|OLB_INSE|LB_INSE|
           OB_INSE_OPER|OLB_INSE_OPER|LB_INSE_OPER|
           OB_INSE_OL_OPER|OLB_INSE_OL_OPER|LB_INSE_OL_OPER|
           OB_INSE_L_OPER|OLB_INSE_L_OPER|LB_INSE_L_OPER);
inse_body:(inse_body_part (PC|OL_PC|L_PC))* inse_body_part;
inse_body_part: variName (INOP|OL_INOP|L_INOP) vari ((DP|OL_DP|L_DP) inse_element((CO|OL_CO|L_CO) inse_element)*)?| (IMPORT|OL_IMPORT|L_IMPORT) variName;
inse_element: variName (INOP|OL_INOP|L_INOP) variName;
inse_tail:(CB_INSE|NL_OPER|NW_OPER);

dele: dele_head dele_body dele_tail;
dele_head:(OB_DELE|OLB_DELE|LB_DELE|
           OB_DELE_OPER|OLB_DELE_OPER|LB_DELE_OPER|
           OB_DELE_OL_OPER|OLB_DELE_OL_OPER|LB_DELE_OL_OPER|
           OB_DELE_L_OPER|OLB_DELE_L_OPER|LB_DELE_L_OPER) ;
dele_body:(vari (PC|OL_PC|L_PC))* vari ;
dele_tail:(CB_DELE|NL_OPER|NW_OPER);


decl: decl_head  decl_body decl_tail;
decl_head: (OB_DECL|OLB_DECL|LB_DECL|
            OB_DECL_OPER|OLB_DECL_OPER|LB_DECL_OPER|
            OB_DECL_OL_OPER|OLB_DECL_OL_OPER|LB_DECL_OL_OPER|
            OB_DECL_L_OPER|OLB_DECL_L_OPER|LB_DECL_L_OPER) ;
decl_neck:listName? (DP|OL_DP|L_DP) typeName EQOP;
decl_body: (decl_body_part (PC|OL_PC|L_PC))* decl_body_part;
decl_body_part: decl_neck( (listName)|
                 ((nameType (CO|OL_CO|L_CO))* nameType)|
                 ((nameValue (CO|OL_CO|L_CO))* nameValue)|
                 ((vari (CO|OL_CO|L_CO))* vari));
decl_tail:(CB_DECL|NL_OPER|NW_OPER);


nameValue:(listName (DP|OL_DP|L_DP) vari);
nameType:(listName (PU|OL_PU|L_PU) typeName);
vari: variName|decl|temp|spec|refe|inse;
listName: (NAME CO|OL_NAME OL_CO|L_NAME L_CO)* (NAME|OL_NAME|L_NAME);
variName: (NAME PU|OL_NAME OL_PU|L_NAME L_PU)* (NAME|OL_NAME|L_NAME);
typeName: (NAME DP|OL_NAME OL_DP|L_NAME L_DP)* (NAME|OL_NAME|L_NAME);


text:TEXT;

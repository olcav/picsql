grammar picsql;

query: selectstmt;

selectstmt :
    SELECT selectionlist
     FROM from_source_list (',' from_source_list)*
    (WHERE where_clause)?;

 // TODO : implements
from_pic_source: LEFT_PARENTHESIS DIGITS ',' DIGITS ',' DIGITS ',' DIGITS ',' DIGITS RIGHT_PARENTHESIS  alias? tablesample?;

from_source_list: (pic_path | from_pic_source | subquery);

selectionlist: selection (',' selection)*;

selection :
    single_field |
    LEFT_PARENTHESIS selection RIGHT_PARENTHESIS |
    selection ( STAR | DIVIDE | MODULO) selection |
    selection ( PLUS | MINUS) selection;

single_field :
     DIGITS |
     DECIMAL |
     alias_dot? alias_value |
     STAR |
     'x' |
     'y'  |
     zero_param_function |
     one_params_function |
     three_params_function |
     multiple_params_function;

alias_value: 'r' | 'g' | 'b';

zero_param_function : 'rand()' | 'rank()' | 'pi()';
one_params_function: ('sin' | 'cos' | 'tan') LEFT_PARENTHESIS selection RIGHT_PARENTHESIS;
three_params_function: ('lag' | 'lead') LEFT_PARENTHESIS alias_dot? alias_value ',' selection ',' selection RIGHT_PARENTHESIS;
multiple_params_function: ('min' | 'max') LEFT_PARENTHESIS selection (',' selection)* RIGHT_PARENTHESIS;

expression: selection OPERATOR_CONDITION single_field;

begin_path: STR DOTS DIVIDE |
            DOT DIVIDE;

alias : STR;
alias_dot : STR DOT;

path_part: STR;

path: begin_path? path_part (DOT path_part)*;

// TODO : implements
tablesample : 'tablesample' LEFT_PARENTHESIS DIGITS ('percent' | 'pixels') RIGHT_PARENTHESIS;

pic_path: path  alias? tablesample?;

subquery: LEFT_PARENTHESIS selectstmt RIGHT_PARENTHESIS  alias? tablesample?;  // TODO : implements

where_clause:
    expression |
    where_clause OPERATOR_LOGIC where_clause |
    LEFT_PARENTHESIS where_clause RIGHT_PARENTHESIS;

SELECT : 'select';
FROM : 'from';
WHERE : 'where';
OPERATOR_LOGIC : 'and' | 'or';
STAR : '*';
DIVIDE : '/';
MODULO : '%';
PLUS : '+';
MINUS :  '-';
DIGITS: '0'..'9'+;
DECIMAL: '0'..'9'+ DOT '0'..'9'+;
STR: [a-zA-Z0-9]+;
DOTS: ':';
LEFT_PARENTHESIS : '(';
RIGHT_PARENTHESIS : ')';
OPERATOR_CONDITION : '=' | '!=' | '<' | '>' | '<=' | '>=';
DOT : '.';
WS : [ \t\r\n]+ -> skip ;
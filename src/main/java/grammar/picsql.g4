grammar picsql;

SELECT : 'select';
FROM : 'from';
WHERE : 'where';
COMMA: ',';
OPERATOR_LOGIC : 'and' | 'or';
STAR : '*';
DIVIDE : '/';
PATH_SLASH:  '\\';
MIN : 'min';
MAX: 'max';
X: 'x';
Y: 'y';
XY: 'xy';
T: 't';
R: 'r';
G: 'g';
B: 'b';
RAND: 'rand()';
RANK: 'rank()';
PI: 'pi()';
ABS: 'abs';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';
LAG: 'lag';
LEAD: 'lead';
FLIP: 'flip';
DISCR: 'discr';
BUTTER: 'butter';
MODULO : '%';
PLUS : '+';
MINUS :  '-';
DIGITS: '0'..'9'+;
DECIMAL: '0'..'9'+ DOT '0'..'9'+;
STR: [a-zA-Z0-9]+;
SPECIAL_CHAR : '_' | '-';
STR_PATH: [a-zA-Z0-9];
DOTS: ':';
LEFT_PARENTHESIS : '(';
RIGHT_PARENTHESIS : ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET : ']';
OPERATOR_CONDITION : '=' | '!=' | '<' | '>' | '<=' | '>=';
DOT : '.';
IN : 'in';
WS : [ \t\r\n]+ -> skip ;

query: selectstmt;

selectstmt :
    SELECT selectionlist
     FROM from_source_list (',' from_source_list)*
    (WHERE where_clause)?;

from_pic_source: LEFT_PARENTHESIS DIGITS COMMA DIGITS COMMA DIGITS COMMA DIGITS COMMA DIGITS RIGHT_PARENTHESIS  alias?;

from_source_list: (pic_path | from_pic_source | subquery);

selectionlist: selection (COMMA selection)*;

selection :
    single_field |
    LEFT_PARENTHESIS selection RIGHT_PARENTHESIS |
    selection ( STAR | DIVIDE | MODULO) selection |
    selection ( PLUS | MINUS) selection;

col_value : alias_dot? alias_value |  X | Y | T;

mask_conv_vals :
    selection COMMA selection COMMA
    selection COMMA selection COMMA
    selection COMMA selection COMMA
    selection COMMA selection COMMA
    selection;

mask_conv:
 LEFT_BRACKET mask_conv_vals RIGHT_BRACKET
;

negate_single_field: MINUS single_field;

single_field :
     negate_single_field |
     DIGITS |
     DECIMAL |
     STAR |
     col_value |
     mask_conv |
     zero_param_function |
     one_params_function |
     three_params_function |
     multiple_params_function |
     flip_function |
     discr_function |
     butter_function;

alias_value: R | G | B;

zero_param_function : RAND | RANK | PI;
one_params_function: (SIN | COS | TAN ) LEFT_PARENTHESIS selection RIGHT_PARENTHESIS;
three_params_function: (LAG | LEAD) LEFT_PARENTHESIS alias_dot? alias_value COMMA selection COMMA selection RIGHT_PARENTHESIS;
multiple_params_function: (MIN | MAX) LEFT_PARENTHESIS selection (COMMA selection)* RIGHT_PARENTHESIS;
flip_function: FLIP LEFT_PARENTHESIS selection COMMA (X|Y|XY) RIGHT_PARENTHESIS;
discr_function: DISCR LEFT_PARENTHESIS selection COMMA selection RIGHT_PARENTHESIS;
butter_function: BUTTER LEFT_PARENTHESIS alias_value RIGHT_PARENTHESIS;

bool_expression:
    selection OPERATOR_CONDITION selection;

begin_path: DOT DOT? (PATH_SLASH | DIVIDE)  | STR DOTS (PATH_SLASH | DIVIDE);

alias : STR;
alias_dot : STR DOT;
path_part: DOT DOT | STR | SPECIAL_CHAR;

path: begin_path? path_part ((PATH_SLASH | DIVIDE) path_part)* DOT path_part;

pic_path:
    (
    LEFT_PARENTHESIS path COMMA DIGITS RIGHT_PARENTHESIS |
    LEFT_PARENTHESIS path COMMA DIGITS COMMA DIGITS RIGHT_PARENTHESIS |
      LEFT_PARENTHESIS path COMMA DIGITS COMMA DIGITS COMMA DIGITS COMMA DIGITS RIGHT_PARENTHESIS
    | path) alias?;

subquery: LEFT_PARENTHESIS selectstmt RIGHT_PARENTHESIS  alias?;

where_clause:
    bool_expression |
    where_clause OPERATOR_LOGIC where_clause |
    LEFT_PARENTHESIS where_clause RIGHT_PARENTHESIS;

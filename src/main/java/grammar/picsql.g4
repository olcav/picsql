grammar picsql;

query: selectstmt;

selectstmt :
    SELECT selectionlist
    FROM from_source_list (',' from_source_list)*
    (WHERE where_clause)?;

from_source_list: (pic_path | subquery);

selectionlist: selection (',' selection)*;

selection :
    single_field |
    LEFT_PARENTHESIS selection RIGHT_PARENTHESIS |
    selection ( STAR | DIVIDE | MODULO) selection |
    selection ( PLUS | MINUS) selection;

single_field :
     DIGITS |
     alias_value |
     STR DOT alias_value |
     STAR |
     'x' |
     'y'  |
     unary_function;

alias_value: 'r' | 'g' | 'b';

unary_function : 'rand()' | 'rank()';
expression: selection OPERATOR_CONDITION DIGITS;

begin_path: STR DOTS DIVIDE |
            DOT DIVIDE;

alias : STR;

path_part: STR;

path: begin_path? path_part (DOT path_part)*;

pic_path:
    path  alias?;

subquery: LEFT_PARENTHESIS selectstmt RIGHT_PARENTHESIS;

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
MINUS : '-';
DIGITS: '0'..'9'+;
STR: [a-zA-Z0-9]+;
DOTS: ':';
LEFT_PARENTHESIS : '(';
RIGHT_PARENTHESIS : ')';
OPERATOR_CONDITION : '=' | '!=' | '<' | '>' | '<=' | '>=';
DOT : '.';
WS : [ \t\r\n]+ -> skip ;
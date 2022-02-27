import java.util.ArrayList;

enum OPERATOR {
    EQUALS,
    NOT_EQUALS,
    LESS,
    MORE,
    LESS_EQUALS,
    MORE_EQUALS
}
public class SqlPicQueryExpression {

    private String field;
    private OPERATOR operator;
    private Integer value;

    public SqlPicQueryExpression(String field, OPERATOR operator, Integer value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public OPERATOR getOperator() {
        return operator;
    }

    public Integer getValue() {
        return value;
    }
}

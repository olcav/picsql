import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SqlPicQueryParserTest {
    @ParameterizedTest
    @ValueSource(strings = {
            "select * from test",
            "select r,g,b from test",
            "select r*2,g+2,b-5 from test",
            "select t.r,t.g,t.b from test t",
            "select t.r,t2.r,t.g from test t, test t2",
            "select * from test where r = 2",
            "select * from test where r = 2 and g > 10",
            "select * from test where (r = 2 and g > 10) or b < 120",
            "select * from (100,100,255,0,0)"
    })
    public void testSqlParsingValidation(String sql){
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(sql);
        sqlPicQueryParser.getQuery();
        assertFalse(sqlPicQueryParser.haveSyntaxErrors());
    }

}

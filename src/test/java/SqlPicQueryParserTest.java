import grammar.picsqlParser;
import org.antlr.v4.runtime.misc.Interval;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SqlPicQueryParserTest {

    @ParameterizedTest
    @ValueSource(strings = {
            // Basic selections
            "select * from test",
            "select r,g,b from test",
            "select r*2,g+2,b-5 from test",
            "select t.r,t.g,t.b from test t",
            "select t.r,t2.r,t.g from test t, test t2",

            // Where
            "select * from test where r = 2",
            "select * from test where r = 2 and g > 10",
            "select * from test where (r = 2 and g > 10) or b < 120",
            "select * from test where r < b",

            // Source picture from data
            "select * from (100,100,255,0,0)",
            "select * from (100,100,255,0,0) t1, test t2",
            "select t1.r,t2.g,t3.b from (100,100,255,0,0) t1, (100,100,0,255,125) t2",

            // Source picture from subquery
            "select * from (select r, g from test.bmp)",
            "select t1.r, t2.b, t2.b from (select r, g from test.bmp) t1, (select b from test2.bmp where r > 50) t2",

            // Math functions
            "select sin(1), tan(5.2) from test"
    })
    public void testSqlParsingValidation(String sql){
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        picsqlParser parser = sqlPicQueryParser.parse(sql);

        picsqlParser.QueryContext query  = parser.query();
        int a = query.start.getStartIndex();
        int b = query.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String viewSql = query.start.getInputStream().getText(interval);
        assertEquals(sql, viewSql);

        assertFalse(sqlPicQueryParser.haveSyntaxErrors());
    }

}

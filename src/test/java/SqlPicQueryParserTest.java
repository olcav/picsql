import grammar.picsqlParser;
import org.antlr.v4.runtime.misc.Interval;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SqlPicQueryParserTest {

    private static Stream<Arguments> queriesProvider() {
        return Arrays.stream(QueryBank.QUERIES_PARSING_TESTS).map(Arguments::of);
    }

    @ParameterizedTest
    @MethodSource("queriesProvider")
    public void testSqlParsingValidation(String sql){
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        picsqlParser parser = sqlPicQueryParser.buildParser(sql);

        picsqlParser.QueryContext query  = parser.query();
        int a = query.start.getStartIndex();
        int b = query.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String viewSql = query.start.getInputStream().getText(interval);
        assertEquals(sql, viewSql);
        assertFalse(sqlPicQueryParser.haveSyntaxErrors());
    }

}

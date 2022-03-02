import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SqlPicQueryExecuteTest {

    private static Stream<Arguments> queriesProvider() {
        return Arrays.stream(QueryBank.QUERIES).map(Arguments::of);
    }

    @ParameterizedTest
    @MethodSource("queriesProvider")
    public void testSqlExecutionOnPictures(String sql){
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parseToImage(sql);
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(sqlPicQueryParser.getQuery(), "./src/test/java/testimgs/test"+sql.hashCode()+".bmp", "bmp");
    }

}

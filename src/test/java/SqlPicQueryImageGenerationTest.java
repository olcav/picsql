import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SqlPicQueryImageGenerationTest {

    private static Stream<Arguments> queriesProvider() {
        return Arrays.stream(QueryBank.QUERIES).map(Arguments::of);
    }

    private static int numTest = 0;

    @ParameterizedTest
    @MethodSource("queriesProvider")
    public void testSqlExecutionOnPictures(String sql){
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parseToWriteImage(
                sql,
                "./examples/face_" + numTest + ".bmp",
                "bmp"
        );
        numTest++;
    }

}

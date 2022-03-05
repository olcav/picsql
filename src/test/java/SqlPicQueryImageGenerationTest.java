import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SqlPicQueryImageGenerationTest {

  private static Stream<Arguments> queriesProvider() {
    return Arrays.stream(QueryBank.QUERIES_GENERATION_TESTS).map(Arguments::of);
  }

  private static int numTest = 0;

  @ParameterizedTest
  @MethodSource("queriesProvider")
  public void testSqlExecutionOnPictures(String sql) throws IOException {
    SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
    String image = "./examples/face_" + numTest + ".bmp";
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(sqlPicQueryParser.parseToImage(sql), "bmp", baos);
    byte[] resultImage = baos.toByteArray();
    byte[] actual = Files.readAllBytes(new File(image).toPath());
    assertThat(resultImage).containsExactly(actual);
    numTest++;
  }
}

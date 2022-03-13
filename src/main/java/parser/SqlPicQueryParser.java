package parser;

import grammar.picsqlLexer;
import grammar.picsqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.AnimatedGifEncoder;
import visitor.SqlPicQuerySelectQueryVisitor;
import visitor.value.PictureValue;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SqlPicQueryParser {

  private picsqlParser picsqlParser;

  public SqlPicQueryParser() {
    super();
  }

  public boolean haveSyntaxErrors() {
    return this.picsqlParser.getNumberOfSyntaxErrors() > 0;
  }

  public void parseToWriteGif(String sql, String filePath, int frameRate) {
    buildParser(sql);
    AnimatedGifEncoder e = new AnimatedGifEncoder();
    e.start(filePath);
    e.setDelay(80);
    SqlPicQuerySelectQueryVisitor visitor = new SqlPicQuerySelectQueryVisitor();
    List<BufferedImage> bufferedImages = visitor.visitQueryMultipleTimes(picsqlParser.query(), frameRate);
    for(BufferedImage b : bufferedImages) {
      e.addFrame(b);
    }
    e.finish();
  }

  public BufferedImage parseToImage(SqlPicQuerySelectQueryVisitor visitor) {
    return ((PictureValue) visitor.visitQuery(picsqlParser.query())).getValue();
  }

  public BufferedImage parseToImage(String sql) {
    buildParser(sql);
    SqlPicQuerySelectQueryVisitor sqlPicQuerySelectQueryVisitor = new SqlPicQuerySelectQueryVisitor();
    return parseToImage(sqlPicQuerySelectQueryVisitor);
  }

  public picsqlParser buildParser(String sql) {
    CharStream input = CharStreams.fromString(sql);
    picsqlLexer picsqlLexer = new picsqlLexer(input);
    CommonTokenStream tokenstream = new CommonTokenStream(picsqlLexer);
    picsqlParser = new picsqlParser(tokenstream);
    return picsqlParser;
  }

  public void parseToWriteImage(String sql, String newFile, String newFileFormat) {
    buildParser(sql);
    SqlPicQuerySelectQueryVisitor sqlPicQuerySelectQueryVisitor = new SqlPicQuerySelectQueryVisitor();
    int frameRate = sqlPicQuerySelectQueryVisitor.getFrameRate(picsqlParser.query());

    if (frameRate > 0) {
      parseToWriteGif(sql, newFile, frameRate);
    } else {
      BufferedImage bufferedImage = parseToImage(sqlPicQuerySelectQueryVisitor);
      try {
        ImageIO.write(bufferedImage, newFileFormat, new File(newFile));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

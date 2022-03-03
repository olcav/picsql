import grammar.picsqlLexer;
import grammar.picsqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.SqlPicQuerySelectQueryVisitor;
import visitor.value.PictureValue;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SqlPicQueryParser {

    private picsqlParser picsqlParser;

    public SqlPicQueryParser() {
        super();
    }

    public boolean haveSyntaxErrors() {
        return this.picsqlParser.getNumberOfSyntaxErrors() > 0;
    }

    public BufferedImage parseToImage(String sql) {
        buildParser(sql);
        SqlPicQuerySelectQueryVisitor sqlPicQuerySelectQueryVisitor = new SqlPicQuerySelectQueryVisitor();
        return ((PictureValue) sqlPicQuerySelectQueryVisitor.visitQuery(picsqlParser.query())).getValue();
    }

    picsqlParser buildParser(String sql) {
        CharStream input = CharStreams.fromString(sql);
        picsqlLexer picsqlLexer = new picsqlLexer(input);
        CommonTokenStream tokenstream = new CommonTokenStream(picsqlLexer);
        picsqlParser = new picsqlParser(tokenstream);
        return picsqlParser;
    }

    public void parseToWriteImage(String sql, String newFile, String newFileFormat){
        BufferedImage bufferedImage = parseToImage(sql);
        try {
            ImageIO.write(bufferedImage, newFileFormat, new File(newFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

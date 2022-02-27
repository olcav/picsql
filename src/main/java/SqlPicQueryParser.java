import grammar.picsqlLexer;
import grammar.picsqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SqlPicQueryParser {

    private picsqlParser picsqlParser;

    public SqlPicQueryParser() {
        super();
    }

    public void parse(String sql){
        CharStream input = CharStreams.fromString(sql);
        picsqlLexer picsqlLexer = new picsqlLexer(input);
        CommonTokenStream tokenstream = new CommonTokenStream(picsqlLexer);
        picsqlParser = new picsqlParser(tokenstream);
    }

    public SqlPicQuery getQuery() {
        SqlPicQueryListener l = new SqlPicQueryListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        grammar.picsqlParser.QueryContext query = picsqlParser.query();
        walker.walk(l, query);
        return l.getSqlPicQuery();
    }
}

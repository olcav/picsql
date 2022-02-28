import model.SqlPicQuery;

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                        select
                            sin(r)*255,
                            cos(g)*255,
                            cos(b)*255
                        from ./test.bmp
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

import model.SqlPicQuery;

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                        select
                            t2.g,t2.b, t.r
                        from (255,255,100,54,0) t,./test.bmp t2
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

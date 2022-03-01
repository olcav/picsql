import model.SqlPicQuery;

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                select
                lag(r,x%20,y%20),
                g*lead(g,x%10,15)%255,
                r
                from ./test.bmp
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

import model.SqlPicQuery;

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                        select
                            lag(t.r,10,10),
                            lead(t.g,x%10,y%10),
                            lag(t.b,8,8)
                        from ./test.bmp t, ./test2.bmp t2
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

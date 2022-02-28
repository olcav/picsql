import model.SqlPicQuery;

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                        select
                            t.r,lead(t.g,x%10,rank()%10)
                        from ./test.bmp t, ./test2.bmp t2
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parse(
                """
                        select
                            r,g,b
                        from ./test.bmp
                        """
        );
        SqlPicQuery query = sqlPicQueryParser.getQuery();
        SqlPicQueryExecutor executor = new SqlPicQueryExecutor();
        executor.execute(query, "result.bmp", "bmp");
    }

}

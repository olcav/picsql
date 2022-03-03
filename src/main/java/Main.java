public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parseToWriteImage("""
                select
                    rand()*255,g,rand()*255
                from ./test.bmp
                """,
                "result.bmp",
                "bmp");
    }

}

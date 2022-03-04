public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parseToWriteImage("""
                select r,g,b
                from ./examples/face.bmp
                """,
                "result.bmp",
                "bmp");
    }

}

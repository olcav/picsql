public class Main {

    public static void main(String[] args) {
        SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
        sqlPicQueryParser.parseToWriteImage("""
                select t.r,lag(t2.b, 10,10), t.g
                from 
                    (select subT.r,subT.b,subT.r from 
                        (select lag(r,5,5),b,r from ./test.bmp where r > 120) subT
                    where subT.g > 120) t,
                    (select b,g,r from ./test2.bmp where g > 120) t2
                """,
                "result.bmp",
                "bmp");
    }

}

public class QueryBank {

    public static final String[] QUERIES_PARSING_TESTS = {
            // Basic selections
            "select r,g,b from ./examples/face.bmp",
            "select g,b,r from ./examples/face.bmp",
            "select t.r,t2.r,t.g from ./examples/face.bmp t, ./examples/face.bmp t2",

            // Path tests
            "select r,g,b from C:/examples/face.bmp",
            "select r,g,b from ../../../../examples/face.bmp",
            "select r,g,b from ../examples/face.bmp",
            "select r,g,b from ./examples/test/anotherdir/face.bmp",

            // Where
            "select r,g,b from ./examples/face.bmp where r > 120",
            "select r,g,b from ./examples/face.bmp where r > 120 and g < 100",
            "select r,g,b from ./examples/face.bmp where b > r",

            // Source picture from data
            "select r,g,b from (100,100,255,0,0)",
            "select t1.r,t2.g,t2.b from (100,100,255,0,0) t1, (100,100,0,255,125) t2",

            // Source picture from subquery
            "select r,g,b from (select r, g from test.bmp)",
            "select t1.r, t2.b, t2.b from (select r, g from test.bmp) t1, (select b from test2.bmp where r > 50) t2",

            // Math functions
            "select sin(1), tan(5.2),cos(r*g) from ./examples/face.bmp",
            "select pi() from ./examples/face.bmp",
            "select sin(1), tan(5.2), cos(r) from ./examples/face.bmp",
            "select sin(r*b), tan(g*r), cos(r) from ./examples/face.bmp",

            // Lead / Lag
            "select lead(r,5,5),lag(g,10,10) from ./examples/face.bmp",
            "select r,(lead(r,5,5)*lag(g,5,5))%255,lag(r,10,10) from ./examples/face.bmp",
            "select lag(r, x%10, y%10), lead(g, x%10, y%10), lag(b, x%10, y%10) from ./examples/face.bmp"
    };


    public static final String[] QUERIES_GENERATION_TESTS = {
            // Basic selections
            //"select * from ./examples/face.bmp",
            "select r,g,b from ./examples/face.bmp",
            "select g,b,r from ./examples/face.bmp",
            "select t.r,t2.r,t.g from ./examples/face.bmp t, ./examples/face.bmp t2",

            // Where
            "select r,g,b from ./examples/face.bmp where r > 120",
            "select r,g,b from ./examples/face.bmp where r > 120 and g < 100",
            //"select r,g,b from ./examples/face.bmp where b > r",

            // Source picture from data
            "select r,g,b from (100,100,255,0,0)",
            "select t1.r,t2.g,t2.b from (100,100,255,0,0) t1, (100,100,0,255,125) t2",

            // Source picture from subquery
            //"select * from (select r, g from test.bmp)",
            //"select t1.r, t2.b, t2.b from (select r, g from test.bmp) t1, (select b from test2.bmp where r > 50) t2",

            // Math functions
            "select sin(1), tan(5.2),cos(r*g) from ./examples/face.bmp",
            "select pi() from ./examples/face.bmp",
            "select sin(1), tan(5.2), cos(r) from ./examples/face.bmp",
            "select sin(r*b), tan(g*r), cos(r) from ./examples/face.bmp",

            // Lead / Lag
            "select lead(r,5,5),lag(g,10,10) from ./examples/face.bmp",
            "select r,(lead(r,5,5)*lag(g,5,5))%255,lag(r,10,10) from ./examples/face.bmp",
            "select lag(r, x%10, y%10), ead(g, x%10, y%10), lag(b, x%10, y%10) from ./examples/face.bmp"
    };

}

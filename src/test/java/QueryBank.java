public class QueryBank {

    public static final String[] QUERIES = {
            // Basic selections
            "select * from ./test.bmp",
            "select r,g,b from ./test.bmp",
            "select r*2,g+2,b-5 from ./test.bmp",
            "select t.r,t.g,t.b from ./test.bmp t",
            "select t.r,t2.r,t.g from ./test.bmp t, ./test2.bmp t2",

            // Where
            "select * from ./test.bmp where r = 2",
            "select * from ./test.bmp where r = 2 and g > 10",
            "select * from ./test.bmp where (r = 2 and g > 10) or b < 120",
            "select * from ./test.bmp where r < b",

            // Source picture from data
            "select r,g,b from (100,100,255,0,0)",
            "select t1.r,t2.g,t2.b from (100,100,255,0,0) t1, test t2",
            "select t1.r,t2.g,t2.b from (100,100,255,0,0) t1, (100,100,0,255,125) t2",

            // Source picture from subquery
            //"select * from (select r, g from test.bmp)",
            //"select t1.r, t2.b, t2.b from (select r, g from test.bmp) t1, (select b from test2.bmp where r > 50) t2",

            // Math functions
            "select sin(1), tan(5.2),cos(r*g) from ./test.bmp",
            "select pi() from ./test.bmp",
            "select sin(1), tan(5.2), cos(r) from ./test.bmp",
            "select sin(r*b), tan(g*r), cos(r) from ./test.bmp",

            // Lead / Lag
            "select lead(r,5,5),lag(g,10,10) from ./test.bmp",
            "select r,(lead(r,5,5)*lag(g,5,5))%255,lag(r,10,10) from ./test.bmp"
    };

}

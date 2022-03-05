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
            // No change
            "select r,g,b from ./examples/face.bmp",

            // Select a small region
            "select r,g,b from (./examples/face.bmp,10,50,120,120)",

            // Select colors from color rectangle
            "select r,g,b from (100,100,255,0,0)",

            // Color blend
            "select g,b,r from ./examples/face.bmp",

            // Play with x and y
            "select (r*y)%255, x,  b from ./examples/face.bmp",

            // Only x and y
            "select x*2, y+10, x -10 from ./examples/face.bmp",

            // Where condition on r
            "select r,g,b from ./examples/face.bmp where r > 120",

            // Where condition on r and g
            "select r,g,b from ./examples/face.bmp where r > 20 and g < 200",

            // Maths
            "select (r*sin(x))%255, (g*tan(y))%255, (cos(r))%255 from ./examples/face.bmp",

            // Lag / lead
            "select lag(r, 10, 10), lead(g, 5, 5), g from ./examples/face.bmp",

            // Complex Lag / lead
            "select lag(r, sin(x), (r*g)%10), lag(r, y%10, rank()%10), lead(b, 10,15) from ./examples/face.bmp",

            // Crazy nested Lag / lead
            "select lag(r, lag(g,5,5)%5, 5), lag(g, 10, lag(r,5,5)%5), lag(r, lag(g,5,15)%20, lead(g,15,5)%10) from ./examples/face.bmp",

            // Picture blending
            "select f.r,f.g,f2.b from ./examples/face.bmp f, ./examples/face2.bmp f2",

            // Picture blending madness
            "select (f.r+f2.b)%255, lead(f.r, f2.b%10, 10), f.g from ./examples/face.bmp f, ./examples/face2.bmp f2",

            // Subquery
            "select sub1.r, sub2.g, (sub2.b+sub1.r)%255 from (select r from ./examples/face.bmp where r > 60) sub1, (select b,g,lag(r, 5,5) from ./examples/face2.bmp) sub2",
    };

}

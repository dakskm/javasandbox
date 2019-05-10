package practice.staticexamples;

public class Employee {
    public static String ename;
    public static int i;
    public static int x, y;

    public static final int a;
    public final int t;

    static {
        a = 10;
    }

    Employee(String name, int num) {
        ename = name;
        t = num; //this is ok since t is only final but can be assigned only one time.
//        a = 10; //should be in static block only since a is static final
    }

    void increment() {
//        t = 100; //not allowed since t is final, it should be assigned a value during declaration or in constructor
        i++;
    }

    static void incrementXY() {
        x++;
        y++;
    }
}

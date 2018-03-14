package excercises.datatypedefaults;

public class DataTypes {

    boolean boo;

    byte b;

    char c;

    short s;
    int i;
    long l;

    float f;
    double d;

    void display() {
        System.out.println("boolean boo: " + boo);
        System.out.println("byte b: " + b);
        System.out.println("char c: " + c);
        System.out.println("short s: " + s);
        System.out.println("int i: " + i);
        System.out.println("long l: " + l);
        System.out.println("float f: " + f);
        System.out.println("double d: " + d);
    }

    void sizeOf() {
        System.out.println("boolean boo: " + boo);
        System.out.println("byte b: " + b);
        System.out.println("char c: " + c);
        System.out.println("short s: " + s);
        System.out.println("int i: " + i);
        System.out.println("long l: " + l);
        System.out.println("float f: " + f);
        System.out.println("double d: " + d);
    }

    void initialize(boolean boo, byte b, char c, short s, int i, long l, float f, double d) {
        boo = boo;
        b = b;
        c = c;
        s = s;
        i = i;
        l = l;
        f = f;
        d = d;
    }
}

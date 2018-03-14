package excercises.bytechar;

public class ByteCharExamples {
    public static void main(String args[]) {
        char c1 = '\u0020';
        char c2 = '\u0021';

        char c3 = 32;
        char c4 = 33;

        byte b1 = 32;
        byte b2[] = {33};

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("b1: " + b1);
        System.out.println("b2: " + new String(b2));

        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);

    }
}

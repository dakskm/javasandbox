package practice.objectequals;

public class ComplexMain {
    public static void main(String args[]) {
        Complex c1 = new Complex(30.0, 5.6);
        Complex c2 = new Complex(30.0, 5.6);
        Complex c3 = new Complex(30.1, 5.6);

        int i = 9899;

        System.out.println(c1.equals(i));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
    }
}

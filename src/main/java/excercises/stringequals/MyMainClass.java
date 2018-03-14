package excercises.stringequals;

public class MyMainClass {

    public static void main(String args[]) {
        String s1 = new String("Dakshin");
        String s2 = new String("Dakshin");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        char c = '\uffff';

        System.out.println(c);
    }
}

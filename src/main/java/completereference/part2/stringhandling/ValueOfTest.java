package completereference.part2.stringhandling;

public class ValueOfTest {
    public static void main(String args[]) {
        int i = 10;
        long j = 20;

        float k = 20;
        double l = 100.25;

        char chars[] = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("int i: " + i);
        System.out.println("long j: " + j);
        System.out.println("float k: " + k);
        System.out.println("double l: " + l);
        System.out.println("chars: " + chars);

        System.out.println("valueOf int i: " + String.valueOf(i));
        System.out.println("valueOf long j: " + String.valueOf(j));
        System.out.println("valueOf float k: " + String.valueOf(k));
        System.out.println("valueOf double l: " + String.valueOf(l));
        System.out.println("valueOf chars: " + String.valueOf(chars));

        String str = null;

        System.out.println(String.valueOf(str));
        System.out.println(str.toString());
    }
}

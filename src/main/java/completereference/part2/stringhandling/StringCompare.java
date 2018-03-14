package completereference.part2.stringhandling;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("India");
        String s2 = new String("India");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "India";
        String s4 = "India";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        char chars[] = s3.toCharArray();
        byte b[] = s3.getBytes();

        for (char c : chars) {
            System.out.println(c);
        }

        for(byte b1: b) {
            System.out.println(b1);
        }

        byte A = 'A';
        byte a = 'a';

        System.out.println(a);
        System.out.println(a);
    }
}

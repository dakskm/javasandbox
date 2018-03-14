package excercises.alphabetchecker;

public class AlphabetChecker {
    public static void main(String args[]) {
        System.out.println(args[0]);

        String testString = new String(args[0]);

        char chars[] = testString.toCharArray();

        byte a = 'a';
        byte A = 'A';
        byte z = 'z';
        byte Z = 'Z';

        StringBuffer sbAlpha = new StringBuffer();
        StringBuffer sbSpecial = new StringBuffer();

        for (char c : chars) {
            System.out.println("byte: " + (byte) c);

            if ((c >= a && c <= z) || (c >= A && c <= Z)) {
                System.out.println("yes " + c);
                sbAlpha.append(c);
            } else {
                System.out.println("no " + c);
                sbSpecial.append(c);
            }
        }

        System.out.println(sbAlpha.toString());
        System.out.println(sbSpecial.toString());

        System.out.println("----------------");
        for (int i = 32; i < 127; i++)
            System.out.println(i + " " + (char) i);
    }
}

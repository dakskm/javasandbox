package practice.strings.misc;

public class StringExample1 {
    public static void main(String args[]) {
        int[] a = new int[26];
        byte[] b = new byte[26];

        for (int i = 0; i < 26; i++) {
            a[i] = i + 65;
            b[i] = (byte)(i + 65);
        }

        String strFromChar = new String(a, 0, 26);
        String str = new String();


        System.out.println(strFromChar);

        String name = "Dakshinamurthy".replaceAll("murthy", "Murthy");

        System.out.println(name);

        System.out.println("chinnababu".contains(Character.toString('c')));
    }
}

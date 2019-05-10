package practice.strings.misc;

public class StringExample2 {
    public static void main(String args[]) {
        String str1 = "first";
        String str2 = "second";

        String result = reverseString(str1 + str2);

        System.out.println(result);

        StringBuilder sb = new StringBuilder(result);
        sb.reverse().insert(5, " ");
        System.out.println(sb.toString());

        if("Dakshin".substring(0,3) == "Dak")
            System.out.println("equal " + "Dakshin".substring(0,3));
        else
            System.out.println("not equal " + "Dakshin".substring(0,3));
    }

    static String reverseString(String str) {
        String reversedStr = "";
        char[] charArr = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + String.valueOf(charArr[i]);
        }
        return reversedStr;
    }
}

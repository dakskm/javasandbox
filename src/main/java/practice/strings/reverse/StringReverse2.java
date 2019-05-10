package practice.strings.reverse;

/*
How to reverse String in Java using Iteration and Recursion? (solution)

Your task is to write a program to reverse String in Java without using StringBuffer class.
You also need to provide both iterative and recursive algorithm for String reversal.
You can use other String utility methods e.g. charAt(), toCharArray() or substring() from java.lang.String class.

 */

public class StringReverse2 {
    public static String reverse(String s) {
        return (s==null || s.length()<=1)? s : reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String args[]) {
        System.out.println(reverse("Dakshin"));
        System.out.println(reverse(""));
        System.out.println(reverse("d"));
        System.out.println(reverse(null));
        System.out.println('c' + "H");
    }
}

package practice.strings.palindrome;

/*
How to check if String is Palindrome?(solution)

Another easy coding question based upon String, I am sure you must have done this numerous time.
Your program should return true if String is Palindrome, otherwise false. For example, if the input is "radar",
the output should be true, if input is "madam" output will be true, and if input is "Java" output should be false.

 */

public class Palindrome {
    public static void main(String args[]) {
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("super"));
    }

    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}

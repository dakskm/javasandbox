package practice.palindrome.string;

/*
String Palindrome (solution)
You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String
which is equal to the reverse of itself e.g. "Bob" is a palindrome because of the reverse of "Bob" is also "Bob".
Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve
without using any library method e.g. indexOf() or subString() so be prepared for that.
 */

public class PalindromeExample {
    public static void main(String args[]) {
        String str = "abcdefedcba";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome1(str));
    }

    static boolean isPalindrome(String str) {
        char[] charArr = str.toLowerCase().toCharArray();
        int i = 0;
        int strLen = str.length() - 1;
        int j;
        for (i = 0, j = strLen; i < j; i++, j--) {
            if (charArr[i] != charArr[j]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome1(String str) {
        if (str.length() < 2)
            return true;
        else
            return str.charAt(0) != str.charAt(str.length()-1) ? false :
                    isPalindrome1(str.substring(1, str.length() - 1));
    }
}

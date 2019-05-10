package practice.strings.longestpalindrome;

public class Palindrome {
  public static void main(String args[]) {
    String testString = "radar hi test madam a thiliht";

    String s = "radar";
    int l = 0;
    int r = s.length() - 1;

    System.out.println(isPalindrome(s, l, r));

    System.out.println(longestPalindrome(testString));
    System.out.println(longestPalindrome(""));
    System.out.println(longestPalindrome(null));
    System.out.println(longestPalindrome("a"));
    System.out.println(longestPalindrome("b c aa"));
  }

  static String longestPalindrome(String str) {
    if (str != null && str.length() >= 1) {
      String[] strs = str.split("\\s");
      String winner = null;
      int max = Integer.MIN_VALUE;

      for (int i = 0; i < strs.length; i++) {
        String guinea = strs[i];
        if (isPalindrome(guinea, 0, guinea.length() - 1))
          if (guinea.length() > max) {
            max = guinea.length();
            winner = guinea;
          }
      }
      return winner;
    } else return str;
  }

  static boolean isPalindrome(String s, int l, int r) {
    if (l < r) {
      if (s.charAt(l++) == s.charAt(r--)) isPalindrome(s, l, r);
      else return false;
    }
    return true;
  }
}

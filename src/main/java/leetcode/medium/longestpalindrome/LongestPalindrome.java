package leetcode.medium.longestpalindrome;

public class LongestPalindrome {
  public static void main(String args[]) {
    String result;
    result = getLongestPalindrome("babad");
    System.out.println(result);

    result = getLongestPalindrome("cbbd");
    System.out.println(result);

    result = getLongestPalindrome("abcabcbb");
    System.out.println(result);

    result = getLongestPalindrome("eaeeaeabcddcba");
    System.out.println(result);

    result = getLongestPalindrome(null);
    System.out.println(result);

    result = getLongestPalindrome("d");
    System.out.println(result);

    result = getLongestPalindrome("  ");
    System.out.println(result);
  }

  public static String getLongestPalindrome(String s) {
    String resultStr = null;
    if (s != null) {
      int maxLength = 0;
      int len = s.length();

      if (len > 1) {
        int subStrLen = 0;
        for (int i = 0; i <= len; i++) {
          for (int j = i + 1; j <= len; j++) {
            String subStr = s.substring(i, j);
//            System.out.println(subStr);
            if (isPalindrome1(s.substring(i, j))) {
//          System.out.println(subStr);
//          System.out.println("is a palindrome");
              subStrLen = j - i + 1;
              if (maxLength < subStrLen) {
                maxLength = subStrLen;
                resultStr = subStr;
              }
            } else {
//          System.out.println("is not a palindrome");
            }
          }
        }
      } else
        return s;
    }
    return resultStr;
  }

  public static boolean isPalindrome(String s) {
    int len = s.length();
    int i, j;

    for (i = 0, j = len - 1; i < j; i++, j--) {
      if (s.charAt(i) != s.charAt(j))
        break;
    }

    if (len % 2 == 0) {
      if (i - 1 == j)
        return true;
    } else {
      if (i == j)
        return true;
    }

    return false;
  }

  public static boolean isPalindrome1(String s) {
    String ns = "";
    int len = s.length();
    int i;

    for (i = len - 1; i >= 0; i--) {
      ns = ns + String.valueOf(s.charAt(i));
    }

    if (s.equals(ns))
      return true;
    else
      return false;
  }
}

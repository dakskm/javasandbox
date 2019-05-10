package practice.strings.substring;

public class FindSubstring {
  public static void main(String args[]) {
    boolean result = findSubstring("geeksforgeeks", "for");
    System.out.println(result);

      boolean result1 = findSubstring("geeksforgeeks", "for");
      System.out.println(result1);
  }

  static boolean findSubstring(String first, String second) {
    int fl = first.length();
    int sl = second.length();
    char[] fc = first.toCharArray();
    char[] sc = second.toCharArray();
    int i, j;

    for (i = 0; i < fl; i++) {
      int seqCount = 0;
      for (j = 0; j < sl; j++) {
        if (sc[j] != fc[i]) {
          break;
        } else {
          seqCount++;
          i++;
        }
      }
      if (seqCount == sl) return true;
    }

    return false;
  }

  static boolean isSubSequence(String str1, String str2, int m, int n) {
    int j = 0;

    // Traverse str2 and str1, and compare
    // current character of str2 with first
    // unmatched char of str1, if matched
    // then move ahead in str1
    for (int i = 0; i < n && j < m; i++)
        if (str1.charAt(j) == str2.charAt(i))
            j++;

    // If all characters of str1 were found
    // in str2
    return (j == m);
  }
}

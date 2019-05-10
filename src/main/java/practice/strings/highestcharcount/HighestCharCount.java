package practice.strings.highestcharcount;

/*
How  to return highest occurred character in a String? (solution)

You need to write a function to implement an algorithm which will accept a string of characters and should find the
highest occurrence of the character and display it. For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee"
it should return "a".
 */

public class HighestCharCount {
  static final int NO_OF_CHARS = 256;

  public static void main(String args[]) {
      String s = "aaaaaaabbcccaaaaaaa";
      System.out.println(highestCharCount(s));
  }

  static char highestCharCount(String s) {
    int len = s.length();
    int counts[] = new int[NO_OF_CHARS];

    for (int i = 0; i < len; i++)
        counts[s.charAt(i)]++;

    int max = Integer.MIN_VALUE;
    for (int i=0;i<NO_OF_CHARS;i++) {
      if (counts[i] > max)
          max = i;
    }

    return (char) max;
  }
}

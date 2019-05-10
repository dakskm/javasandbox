package leetcode.google.easy.most.common.word;

public class MostCommon {
  public static void main(String args[]) {
    String s = "Bob hit a ball, the hit BALL flew far after it was hit.";

    String ns = "";
    for (char c : s.toCharArray()) {
      if (isAlphabet(c))
        ns = ns + String.valueOf(c);
    }

    System.out.println(ns);
  }

  public static boolean isAlphabet(char c) {
    return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || ((int)c == 32));
  }
}

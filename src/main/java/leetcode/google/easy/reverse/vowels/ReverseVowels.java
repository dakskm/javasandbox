package leetcode.google.easy.reverse.vowels;

import java.util.*;

public class ReverseVowels {
  public static void main(String args[]) {
    System.out.println(reverseVowels("Sore was I ere I saw Eros."));
  }

  public static String reverseVowels(String s) {
    System.out.println(s);
    final int LEN = s.length();
    String vowels = "aeiouAEIOU";
    HashMap<Integer, Character> hm = new LinkedHashMap<Integer, Character>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < LEN; i++) {
      char c = s.charAt(i);
      if(vowels.contains(String.valueOf(c)))
        hm.put(i, c);
    }

    System.out.println(hm);

    Iterator<Integer> it = hm.keySet().iterator();
    for (int i = LEN - 1; i >=0; i--) {
      char c = s.charAt(i);
      if(vowels.contains(String.valueOf(c))) {
        sb.append(hm.get(it.next()));
      } else {
        sb.append(c);
      }
    }

    return sb.reverse().toString();
  }

}

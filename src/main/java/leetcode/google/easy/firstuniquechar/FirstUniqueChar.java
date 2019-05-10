package leetcode.google.easy.firstuniquechar;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueChar {
  public static void main(String args[]) {
    System.out.println(firstUniqeChar("loveleetcode"));
    System.out.println(firstUniqeChar1("loveleetcode"));
  }

  public static int firstUniqeChar(String s) {
    int len = s.length();
    String str = "";
    HashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (hm.containsKey(c))
        hm.put(c, hm.get(c) + 1);
      else
        hm.put(c, 1);
    }

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (hm.get(c) == 1)
        return i;
    }

    return -1;
  }

  public static int firstUniqeChar1(String s) {
    int len = s.length();

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (s.indexOf(c) == s.lastIndexOf(c))
        return i;
    }
    return -1;
  }
}

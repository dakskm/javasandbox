package leetcode.medium.longestsubstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {
  public static void main(String args[]) {
    System.out.println(lengthOfLongestSubstring("yxtadypogegxdwwasmpjxjmsqbzbgquhopjtqykwfqtippkjdbsakfvciudplzybphwf"));

    System.out.println(lengthOfLongestSubstring1("yxtadypogegxdwwasmpjxjmsqbzbgquhopjtqykwfqtippkjdbsakfvciudplzybphwf"));
  }

  public static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new LinkedHashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
      // try to extend the range [i, j]
      if (!set.contains(s.charAt(j))){
        System.out.println("Add " + s.charAt(j));
        set.add(s.charAt(j++));
        System.out.println(set);
        ans = Math.max(ans, j - i);
      }
      else {
        System.out.println("Remove " + s.charAt(i));
        set.remove(s.charAt(i++));
        System.out.println(set);
      }
    }
    return ans;
  }

  public static int lengthOfLongestSubstring1(String s) {
    int maxLen = 0;
    if (s != null) {
      int len = s.length();
      String finalStr = "";
      String tempStr = "";

      for (int i = 0; i < len; i++) {
        tempStr = String.valueOf(s.charAt(i));
        for (int j = i + 1; j < len; j++) {
          String checkStr = String.valueOf(s.charAt(j));
          if (!tempStr.contains(checkStr)) {
            tempStr = tempStr + String.valueOf(s.charAt(j));
            System.out.println("tempStr: " + tempStr);
          } else
            break;
        }

        if (finalStr.length() < tempStr.length()) {
          finalStr = tempStr;
          System.out.println("finalStr: " + finalStr);
        }

      }

      return finalStr.length();
    }
    return maxLen;
  }
}

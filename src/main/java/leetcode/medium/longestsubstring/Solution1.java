package leetcode.medium.longestsubstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution1 {
  public int lengthOfLongestSubstring(String s) {
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
}

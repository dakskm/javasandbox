package leetcode.medium.longestsubstring;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", which the length is 3. Example 2:
 * <p>
 * Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1. Example 3:
 * <p>
 * Input: "pwwkew" Output: 3 Explanation: The answer is "wke", with the length of 3. Note that the answer must be a
 * substring, "pwke" is a subsequence and not a substring.
 */

public class Solution {
  public int lengthOfLongestSubstring(String s) {
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

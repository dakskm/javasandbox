package leetcode.longest.paranthesis;

import java.util.Stack;

public class LongestParanthesis1 {
  public static void main(String args[]) {
    System.out.println(longestParanthesis("()"));
  }

  public static int longestParanthesis(String s) {
    int len = s.length();
    Stack<int[]> stack = new Stack<int[]>();
    int result = 0;

    for(int i = 0; i<len; i++) {
      if(s.charAt(i) == '(') {
        stack.push(new int[]{i, 0});
      } else {
        if(stack.isEmpty() || stack.peek()[1] == 1) {
          stack.push(new int[]{i, 1});
        } else {
          stack.pop();
          int currentLen = 0;
          if(stack.isEmpty())
            currentLen = i + 1;
          else {
            currentLen = i - stack.peek()[0];
          }
          result = Math.max(result, currentLen);
        }
      }
    }
    return result;
  }
}

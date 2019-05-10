package leetcode.google.easy.validparenthesis;

import java.util.Stack;

public class ValidParenthesis {
  public static void main(String args[]) {
    System.out.println(validParenthesis("()(){}[]"));
    System.out.println(validParenthesis("()["));
    System.out.println(validParenthesis("[{()}]"));
    System.out.println(validParenthesis("]"));
  }

  public static boolean validParenthesis(String s) {
    int len = s.length();
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);

      if (c == '[' || c == '{' || c == '(') {
        stack.push(c);
      } else if (c == ']' || c == '}' || c == ')') {
        if(stack.isEmpty())
          return false;

        char popC = stack.pop();
        if (!compareChars(popC, c))
          return false;
      }
    }
    if(stack.isEmpty())
      return true;
    else
      return false;
  }

  public static boolean compareChars(char c1, char c2) {
    if (c1 == '[' && c2 == ']')
      return true;
    else if (c1 == '{' && c2 == '}')
      return true;
    else if (c1 == '(' && c2 == ')')
      return true;

    return false;
  }
}

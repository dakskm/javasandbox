package leetcode.valid.parenthesis;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParanthesis {
  public static void main(String args[]) {
    System.out.println(isValid("[{(})]"));
//    System.out.println(isValid("([{}])"));
//    System.out.println(isValid("sdfs(sdfdf[dsfdf{dfdsf}34543]3454)345345"));
//    System.out.println(isValid("["));
  }

  public static boolean isValid(String s) {
    LinkedList<Character> list = new LinkedList<>();

    int len = s.length();

    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (c == '{' || c == '[' || c == '(')
        list.add(c);
      else if (c == '}' || c == ']' || c == ')') {
        char c2 = list.getLast();
        list.removeLast();
        if (!compare(c2, c))
          return false;
      }
    }

    if(list.isEmpty())
      return true;
    else
      return false;
  }

  public static boolean compare(char c1, char c2) {
    if((c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']') || (c1 == '(' && c2 == ')'))
      return true;
    else
      return false;
  }
}

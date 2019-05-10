package practice.strings.checkdigits;

/*
How to check if a String contains only digits?  (solution)

You need to write a program to check a String contains only numbers by using Regular expression in Java.
You can use Java API but a solution without using Java API will be better because that is what interviewer can always
ask.
 */

public class StringChecker {
  public boolean areDigitsOnly(String s) {
    if (s != null && s != "") {

      char[] c = s.toCharArray();

      for (int i = 0; i < s.length(); i++) if (!Character.isDigit(s.charAt(i))) return false;
    }

    return true;
  }

  public boolean areDigitsOnly1(String s) {
    s.matches("[0-9]+");
    return true;
  }

  public static void main(String args[]) {
    String s = "5644565465646a54";

    System.out.println(s.matches("[0-9]+"));
  }
}

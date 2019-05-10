package practice.strings.shuffle;

/*
How to check if a String is valid shuffle of two String? (solution)

One more difficult String algorithm based coding question for senior developers.
You are given 3 strings: first,  second, and  third.  third String is said to be a shuffle of first and second
if it can be formed by interleaving the characters of first and second String in a way that maintains the left to
right ordering of the characters from each string. For example, given first = "abc" and second = "def",
third = "dabecf"  is a valid shuffle since it preserves the character ordering of the two strings. So, given these
3 strings write a function that detects whether third String is a valid shuffle of first and second String.
 */

public class PreserveOrder {
  public static void main(String args[]) {
    System.out.println(orderCheck("abc", "def", "deabfc"));
    System.out.println(orderCheck("abca", "defgh", "abcadefgh"));
    System.out.println(orderCheck("abca", "defgh", "defghabca"));
  }

  static boolean orderCheck(String a, String b, String c) {
    char[] chars = c.toCharArray();
    String first = "";
    String second = "";

    for (char cc : chars) {
      if (a.contains(String.valueOf(cc)))
        first = first + cc;
      else if (b.contains(String.valueOf(cc)))
        second = second + cc;
    }

//    System.out.println(first);
//    System.out.println(second);

    return (a.equals(first) && b.equals(second));
  }
}

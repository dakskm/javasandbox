package practice.strings.permutation;

/*
How to find all permutations of String? (solution)

I have seen this String interview question on many interviews. It has a easy recursive solution but thinks get really
tricky when Interviewer ask you to solve this question without using recursion. You can use Stack though. Write a
program to print all permutations of a String in Java, for example, the if input is "xyz" then it should print
"xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 */

public class Permutation {
  public static void main(String args[]) {
    permute("Dakshin", 0, 6);
  }

  static void permute(String s, int l, int r) {
    if (l == r) System.out.println(s);
    else {
      for (int i = l; i <= r; i++) {
        s = swap(s, l, i);
        permute(s, l + 1, r);
        s = swap(s, l, i);
      }
    }
  }

  static String swap(String s, int i, int j) {
    char[] chars = s.toCharArray();
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
    return String.valueOf(chars);
  }
}

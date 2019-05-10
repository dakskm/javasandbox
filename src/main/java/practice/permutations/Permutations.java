package practice.permutations;

public class Permutations {
  static int count = 0;
  public static void main(String args[]) {
      String str = "abcd";
      char space = '\u00A0';

      System.out.printf("Dakshina%cmurthy", space);

      System.out.println();
      permute(str, 0, (str.length() - 1));
      System.out.println(count);
  }

  static void permute(String str, int l, int r) {
    if (l == r) {
      System.out.println(str);
      count++;
    } else {
      for (int i = l; i <= r; i++) {
        str = swap(str, l, i);
        permute(str, l + 1, r);
        str = swap(str, l, i);
      }
    }
  }

  static String swap(String str, int l, int r) {
      char[] chars = str.toCharArray();
      char temp = chars[l];
      chars[l] = chars[r];
      chars[r] = temp;

      return String.valueOf(chars);
  }
}

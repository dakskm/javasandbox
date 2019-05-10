package practice.strings.reverse.number;

public class ReverseNumber {
  public static void main(String args[]) {
    long i = 566765644;

    System.out.println(reverse(i));
  }

  static long reverse(long i) {
    long result = 0, r;

    while (i % 10 != 0) {
        r = i % 10;
        result = (result * 10) + r;
        i = i / 10;
    }

    return result;
  }
}

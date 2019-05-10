package practice.gcd;

public class Gcd {
  public static void main(String args[]) {
    System.out.println(gcd(36, 60));

    System.out.println(gcd(7, 5));
  }

  static int gcd(int a, int b) {

    if (a == 0 || b == 0)
        return 0;

    if (a == b)
        return b;

    if (a > b)
        return gcd(a - b, b);

    return gcd(a, b - a);
  }
}

package practice.factorial;

/*
Factorial (solution)
This is one of the simplest programs you can expect on interviews. It is generally asked to see if you can code or not.
Sometimes interviewer may also ask about changing a recursive solution to iterative one or vice-versa.
 */

public class FactTest1 {
  public static void main(String args[]) {
    System.out.println(fact(5));
  }

  static long fact(long n) {
    if (n <= 1)
      return 1;
    else
      return n * fact(n - 1);
  }
}

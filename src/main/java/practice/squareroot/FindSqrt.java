package practice.squareroot;

/*
Square root of number (solution)
You need to write a program to calculate the square root of a number without using the Math.sqrt() function of JDK.
You need to write your logic and method to calculate the square root. You can though use popular algorithm e.g.
Newton's method.

squareroot = t + number/t /2
t- squareroot != 0

 */

public class FindSqrt {
  public static void main(String args[]) {
      System.out.println(sqrt(2));
      System.out.println(sqrt(9));
  }

  public static double sqrt(int number) {
    double t;

    double sr = number / 2;

    do {
      t = sr;
      sr = (t + (number / t)) / 2;
    } while ((t - sr) != 0);

    return sr;
  }
}

package practice.febonacci;

/*
Fibonacci series (solution)
Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number.
Be prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and
memoization.
 */

public class FebonacciTest4 {
  public static void main(String args[]) {
    int n = 20;
    febIteration(n);
    febRecursion(0, 1, 1, n);
  }

  static void febIteration(int n) {
    int a = 0;
    int b = 1;
    int sum;

    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      sum = a + b;
      b = a;
      a = sum;
    }
  }

  static void febRecursion(int a, int b, int i, int n) {
    System.out.println();
    recursion(a, b, i, n);
  }

  static void recursion(int a, int b, int i, int n) {
    if (i <= n) {
      System.out.print(a + " ");
      i++;
      recursion(a + b, a, i, n);
    }
  }
}

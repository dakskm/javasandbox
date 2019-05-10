package practice.febonacci;

/*
Fibonacci series (solution)
Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number.
Be prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and
memoization.
 */

public class FebonacciTest {
    public static void main(String args[]) {
        long a = 0;
        long b = 1;
        long sum = 0;
        long total = 0;

        long n = 141;

        if (n == 0) {
            System.out.println("febonacci count is " + a);
        } else if (n > 0) {
            while ((a + b) <= n) {
                sum = a + b;
                total += sum;
                a = b;
                b = sum;
                System.out.print(sum + " ");
            }
            System.out.println();
            System.out.print("febonacci total " + total);
        } else if (n < 0) {
            System.out.println("n can't be a negative number");
        }

        a = 0;
        b = 1;
        n = 144;
        System.out.println();
        feboRecursion(a, b, n);
    }

    static long feboRecursion(long a, long b, long n) {
        if ((a + b) <= n) {
            System.out.print((a + b) + " ");
            feboRecursion(b, a + b, n);
        }
        return a + b;
    }
}

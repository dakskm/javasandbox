package excercises.fibonacci;

public class FibonacciTest {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int sum = 0;

        int upTo = 100;

        while ((a + b) < upTo) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

        System.out.println();
        fibo(0, 1, upTo);
    }

    public static void fibo(int a, int b, int upTo) {
        if ((a + b) < upTo) {
            System.out.print((a + b) + " ");
            fibo(b, a + b, upTo);
        }
    }
}

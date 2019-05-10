package excercises.factorial;

public class RecursionFact {
    public static void main(String args[]) {
        System.out.println(fact(20));
        System.out.println(fact(20, 1));
    }

    public static long fact(long n) {

        if (n <= 1)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static long fact(long n, long prod) {

        if (n <= 1)
            return prod;
        else
            return fact(n - 1, n * prod);
    }
}

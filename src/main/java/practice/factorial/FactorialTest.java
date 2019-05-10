package practice.factorial;

public class FactorialTest {
    public static void main(String args[]) {

        System.out.println(fact(5));
    }

    static long fact(long n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}

package practice.febonacci;

public class FeboTest3 {
    public static void main(String args[]) {
        System.out.println(febo(10));
    }

    static int febo(int n) {
        if(n<=1)
            return n;
        else
            return febo(n-1) + febo(n-2);
    }
}

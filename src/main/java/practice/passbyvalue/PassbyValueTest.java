package practice.passbyvalue;

public class PassbyValueTest {
    public static void main(String args[]) {
        int x = 9;
        int y = 10;

        swap(x, y);

        System.out.println(x);
        System.out.println(y);
    }

    public static void swap(int x, int y) {
        int temp;
        System.out.println(x);
        System.out.println(y);
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}

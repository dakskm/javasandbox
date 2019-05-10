package practice.variables.scope;

public class VariableScopeTest {
    public static void main(String args[]) {
        int a;
        int x = 10;
        int y = 20;

        for (int i = 0; i < 5; i++)
            System.out.println("test");

        display(10,20);
    }

    public static void display(int x, int y) {
        System.out.println(x);
        System.out.println(y);
        System.out.println();
    }
}

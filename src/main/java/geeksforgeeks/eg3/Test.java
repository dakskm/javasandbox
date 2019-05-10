package geeksforgeeks.eg3;

public class Test {
    enum Color {
        RED, WHITE, BLACK, BLUE
    }

    public static void main(String args[]) {
        for(Color c: Color.values()) {
            System.out.println(c.name() + " index of " + c.ordinal());
            System.out.println(Color.valueOf(c.toString()));
        }

        System.out.println(String.valueOf(9));
        System.out.println(String.valueOf('c'));
        System.out.println(String.valueOf(9L));
        System.out.println(String.valueOf(9.0f));
        System.out.println(String.valueOf(9.0));
        System.out.println(String.valueOf(true));
        System.out.println("Dakshin".contains(String.valueOf('f')));
    }
}

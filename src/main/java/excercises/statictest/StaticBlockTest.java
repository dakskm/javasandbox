package excercises.statictest;

public class StaticBlockTest {
    static {
        System.out.println("I'm static before main:");
    }

    public static void main(String args[]) {
        System.out.println("I'm main");
    }

    static {
        System.out.println("I'm static after main");
    }
}

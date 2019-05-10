package practice.staticblocks;

public class Employee {
    public static int i;

    static {
        i = 10;
        System.out.println("Static block called");
    }
}

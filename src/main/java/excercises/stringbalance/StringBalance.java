package excercises.stringbalance;

import java.util.Stack;

public class StringBalance {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push('c');
        s1.push("sdkjhfsdljkhf");
        s1.push('i');
        s1.push('n');
        s1.push('n');
        s1.push('a');
        s1.push('b');

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println(s1);
    }
}

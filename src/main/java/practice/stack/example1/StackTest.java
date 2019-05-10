package practice.stack.example1;

public class StackTest {
    public static void main(String args[]) {
        StackClass<Integer> integerStack = new StackClass<Integer>(3);

        System.out.println(integerStack.getPos());
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack.getPos());
        integerStack.displayAll();

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());

        StackClass<String> strStack = new StackClass<String>(3);

        System.out.println(integerStack.getPos());
        strStack.push("sdks");
        strStack.push("skdjsjd");
        strStack.push("sdjddj");
        System.out.println(integerStack.getPos());
        strStack.displayAll();

        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());

    }
}

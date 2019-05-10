package practice.staticblocks;

public class StaticBlocksExample {
    public static void main(String args[]) {
        //static blocks isns't called since there is no call to static method/variable
//        System.out.println("test");

        //static block is called since we're accessing static variable
        System.out.println(Employee.i);

        //static block is called since we're invoking the object of a class which has static variables/methods.
//        Employee e1 = new Employee();
    }
}

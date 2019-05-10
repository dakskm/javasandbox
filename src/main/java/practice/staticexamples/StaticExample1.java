package practice.staticexamples;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class StaticExample1 {
    public static void main(String args[]) {
        Employee e1 = new Employee("Dakshin", 200);
        Employee e2 = new Employee("Sowju", 500);

        System.out.println(e1.ename);
        System.out.println(e2.ename);

        e1.increment();
        e2.increment();

        Employee.incrementXY();
        Employee.incrementXY();

        System.out.println(Employee.i);
        System.out.println(Employee.x);
        System.out.println(Employee.y);


        System.out.println(Employee.a);
        System.out.println(e1.t);
        System.out.println(e2.t);

    }
}

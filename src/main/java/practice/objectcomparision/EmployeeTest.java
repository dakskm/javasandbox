package practice.objectcomparision;

public class EmployeeTest {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Department d1 = new Department();

        e1.eNo = 324870;
        e1.name = "slkfj";

        e2.eNo = 2909;
        e2.name = "dslfkjd";

        Employee e3 = new Employee();
        e3.eNo = 324870;
        e3.name = "slkfj";

        System.out.println(e1.equals(d1));

        System.out.println(e1.equals(e2));
    }
}

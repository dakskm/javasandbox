package practice.association;

public class AssociationExample {
    public static void main(String args[]) {
        Bank b1 = new Bank("ICICI");
        Employee e1 = new Employee("Narayana");

        System.out.println(e1.toString() + " is an employee of " + b1.toString());
    }
}

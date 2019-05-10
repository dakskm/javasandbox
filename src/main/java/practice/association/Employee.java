package practice.association;

public class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    String getEmpName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

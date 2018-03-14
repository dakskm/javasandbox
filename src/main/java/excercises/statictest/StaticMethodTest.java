package excercises.statictest;

public class StaticMethodTest {
    public static void main(String args[]) {
        Employee.migrate();
    }

}

class Employee {
    int rollNo;
    String name;
    static String country = "India";

    static void migrate() {
        country = "USA";

        Employee s1 = new Employee(123, "", "Australia");
        s1.display();
    }

    Employee(int rollNo, String name, String country) {
        this.rollNo = rollNo;
        this.name = name;
        this.country = country;
    }

    void display() {
        System.out.println("rollno: " + rollNo);
        System.out.println("name: " + name);
        System.out.println("country: " + country);
    }
}



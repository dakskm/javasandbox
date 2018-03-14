package excercises.statictest;

public class StaticInstanceVariableTest {

    public static void main(String args[]) {
        Student s1 = new Student(1, "ram", "USA");
        s1.display();
        Student s2 = new Student(2, "rudra", "Singapore");
        s2.display();
        s1.display();
        Student s3 = new Student(3, "naga", "India");
        s3.display();
        s2.display();
        s1.display();
    }
}

class Student {
    int rollNo;
    String name;
    static String country = "India";

    Student(int rollNo, String name, String country) {
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

package practice.objects;

public class StudentTest {
    public static void main(String args[]) {
        Student s1 = new Student(123, "Ram");

        System.out.println("before creating an object");
        s1.display();

        Student s2 = (Student) s1.clone();
        System.out.println("after copying object to a new one");
        System.out.println("reference of s1 " + s1.hashCode());
        System.out.println("reference of s2 " + s2.hashCode());

        System.out.println("updating s1 attributes");
        s1.set(3982, "dkls");
        s1.display();
        s2.display();
    }
}

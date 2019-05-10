package practice.callbyref.example1;

public class PassbyReferenceTest {
    public static void main(String args[]) {
        Student s1 = new Student("Ram");
        Student s2 = new Student("Rudra");

        swap(s1, s2);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }

    /**
     * @param s1
     * @param s2
     */
    public static void swap(Student s1, Student s2) {
        String temp = s1.name;
        s1.name = s2.name;
        s2.name = temp;
    }
}

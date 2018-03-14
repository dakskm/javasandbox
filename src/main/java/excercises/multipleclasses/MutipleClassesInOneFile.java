package excercises.multipleclasses;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MutipleClassesInOneFile {
    public static void main(String args[]) {
        Student s = new Student(190, "rama");

        s.display();
    }
}

class Student{
    int i;
    String name;

    Student(int i, String name) {
        this.i = i;
        this.name = name;
    }

    void display() {
        System.out.println("i: " + i);
        System.out.println("name: " + name);
    }
}

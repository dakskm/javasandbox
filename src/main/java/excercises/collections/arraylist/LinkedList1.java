package excercises.collections.arraylist;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String args[]) {
        LinkedList<String> l1 = new LinkedList<String>();

        l1.add("three");
        l1.addFirst("one");
        l1.add(1, "two");

        l1.addLast("four");

        System.out.println(l1.contains("one"));

        System.out.println(l1);
    }
}

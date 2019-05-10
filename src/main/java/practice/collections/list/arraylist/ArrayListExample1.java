package practice.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String args[]) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(0, 7);
        al2.add(1, 8);

        al1.forEach(e -> System.out.print(e + " "));

        al1.addAll(2, al2);
        System.out.println();
        al1.forEach(e -> System.out.print(e + " "));
    }
}

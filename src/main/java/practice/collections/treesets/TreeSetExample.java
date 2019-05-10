package practice.collections.treesets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        Set<Integer> s = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        s.add(1);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(6);
        s.add(5);
        s.add(5);

        System.out.println(s);
    }
}

package practice.arrays.three;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class CommonElements {

    public static void main(String args[]) {
        int input1[] = {1, 5, 10, 20, 40, 80};
        int input2[] = {6, 7, 20, 80, 100};
        int input3[] = {3, 4, 15, 20, 80, 30, 70, 120};

        TreeSet<Integer> i1 = getTreeSet(input1);
        TreeSet<Integer> i2 = getTreeSet(input2);
        TreeSet<Integer> i3 = getTreeSet(input3);
        Set set1 = new HashSet(Arrays.asList(input1));
        Set set2 = new HashSet(Arrays.asList(input1));
        Set set3 = new HashSet(Arrays.asList(input1));

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

//    Set<Integer> s1 = new HashSet<>(i1);
//    s1.retainAll(i2);
//    s1.retainAll(i3);
        i1.retainAll(i2);
        i1.retainAll(i3);

        set1.addAll(set2);
        set1.retainAll(set3);

        System.out.println(i1);
        System.out.println(Arrays.toString(set1.toArray()));
    }

    static LinkedHashSet<Integer> getLinkedHashSet(int elements[]) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        for (int element : elements)
            lhs.add(element);

        return lhs;
    }

    static TreeSet<Integer> getTreeSet(int elements[]) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        for (int element : elements)
            ts.add(element);

        return ts;
    }
}

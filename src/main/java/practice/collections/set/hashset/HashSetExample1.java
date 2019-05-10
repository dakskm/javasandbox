package practice.collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String args[]) {
        HashSet<Integer> hs1 = new HashSet<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        HashSet<Integer> hs2 = new HashSet<Integer>(Arrays.asList(new Integer[]{3, 4, 5, 7}));

        display(hs1);
        display(hs2);

        HashSet<Integer> union = new HashSet<>(hs1);
        union.addAll(hs2);
        display(union);

        HashSet<Integer> intersection = new HashSet<>(hs1);
        intersection.retainAll(hs2);
        display(intersection);

        HashSet<Integer> diff = new HashSet<>(hs1);
        diff.removeAll(hs2);
        display(diff);
    }

    static void display(HashSet<Integer> hs) {
        for(Integer i: hs)
            System.out.print(i + " ");

        System.out.println();
    }
}

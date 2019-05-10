package excercises.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class ArrayList3 {
    public static void main(String args[]) {
        ArrayList<Double> arrayList1 = new ArrayList<>();

        arrayList1.add(1.0);
        arrayList1.add(2.0);
        arrayList1.add(3.0);
        arrayList1.add(4.0);
        arrayList1.add(5.0);
        arrayList1.add(6.0);
        arrayList1.add(7.0);

        Spliterator<Double> splitr = arrayList1.spliterator();
        while (splitr.tryAdvance(n -> System.out.println(n))) ;

        ArrayList<Double> arrayList2 = new ArrayList<>();
        splitr = arrayList1.spliterator();
//        while (splitr.tryAdvance(n -> arrayList2.add(Math.sqrt(n)))) ;
        splitr.forEachRemaining(n -> arrayList2.add(Math.sqrt(n)));
//
        splitr = arrayList2.spliterator();
        while (splitr.tryAdvance(n -> System.out.println(n))) ;
//        splitr.forEachRemaining(n -> System.out.println(n));
//
//        System.out.println("done");

        Iterator<Double> itr = arrayList2.iterator();
        itr.forEachRemaining(n -> System.out.println(n));
    }
}

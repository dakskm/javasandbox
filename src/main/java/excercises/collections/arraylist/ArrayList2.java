package excercises.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String args[]) {
        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");

        ListIterator itr = al1.listIterator();

        System.out.println("straight");

        while (itr.hasNext()) {
            System.out.print(itr.nextIndex() + " " + itr.next() + " ");
        }

        itr.set("five1");

        System.out.println(al1);

        System.out.println("\nreverse");

        while (itr.hasPrevious()) {
            System.out.print(itr.previousIndex() + " " + itr.previous() + " ");
        }

        itr.add("five");
        System.out.println("\n" + al1);


        System.out.println(itr.previousIndex());

        System.out.println(al1);

        System.out.println("printing using foreach");

        al1.forEach(item -> System.out.println(item));

        al1.forEach(item -> {
                    System.out.println("item: " + item);
                    if (item.equals("five"))
                        System.out.println("I found it");
                }
        );
    }
}

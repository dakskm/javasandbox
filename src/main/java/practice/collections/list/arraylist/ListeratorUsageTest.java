package practice.collections.list.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListeratorUsageTest {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();

        char[] alphabets = new char[26];

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char) (i + 65);
            al.add(String.valueOf(alphabets[i]));
        }

        ListIterator li = al.listIterator();

        if (al.size() > 0) {
            System.out.println("English Alphabets:");
            while (li.hasNext()) {
                System.out.print(li.next() + " ");
            }

            System.out.println("\n");
            System.out.println("English Alphabets Reverse Order:");
            while (li.hasPrevious()) {
                System.out.print(li.previous() + " ");
            }

            System.out.println();
            for (String str: al) {
                System.out.print(str + " ");
            }

            System.out.println();
            al.forEach(e -> System.out.print(e + " "));
        }
    }
}

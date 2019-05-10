package excercises.collections.arraylist;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("one");
        hs.add("");
        hs.add("two");
        hs.add(" ");
        hs.add("three");
        hs.add(null);
        hs.add("four");

        System.out.println(hs);
    }
}

package excercises.collections.arraylist;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String args[]) {
        LinkedHashSet<String> lHS = new LinkedHashSet<String>();

        lHS.add(null);
        lHS.add(" ");
        lHS.add("1");
        lHS.add("2");
        lHS.add("3");
        lHS.add("4");
        lHS.add(null);
        lHS.add("5");

        System.out.println(lHS);
    }
}

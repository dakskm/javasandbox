package practice.collections.vectors;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {
    public static void main(String args[]) {
        Vector<Integer> v = new Vector<Integer>();
        Vector v1 = new Vector();

        v1.add(1);
        v1.add("askjfdh");

        v.add(1);


        ArrayList al = new ArrayList();

        al.add(1);
        al.add("Dakshin");

        System.out.println(al.get(1));
        System.out.println(al.indexOf("sdaf"));
    }
}

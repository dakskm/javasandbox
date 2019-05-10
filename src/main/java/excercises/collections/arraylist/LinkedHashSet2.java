package excercises.collections.arraylist;

import java.util.*;

public class LinkedHashSet2 {
    public static void main(String args[]) {
        String testStr = "jkadkjaskZZZZZhjdfsjkhskQahjv  ddjdjdhkjhkdas 73763 jkdk jajshj jkjdkjd";

        LinkedHashSet<String> lHS = new LinkedHashSet<String>();
        char testStrArr[] = testStr.toCharArray();

        for(int i = 0;i<testStr.length();i++)
            lHS.add(String.valueOf(testStr.charAt(i)));

        String result = "";

        ArrayList<String> al = new ArrayList<String>(lHS);

        System.out.println(lHS);

        for(String e: lHS)
            result = result + e;
        System.out.println(result);

        Collections.reverse(al);

        System.out.println(al);

        result = "";
        for(String e: al)
            result = result + e;
        System.out.println(result);

    }
}

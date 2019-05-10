package practice.collections.set.linkedhashset;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class LinkedHashSetExample1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a string");
        String testString = "asfdlkdsklfjd sasdlk;jf ds0-30w03-2 asde3902''dskljd s0938;;; ";

        System.out.println("user input string is " + testString);

        LinkedHashSet lhs = new LinkedHashSet();

        char[] strArr = testString.toCharArray();
        for(int i = 0; i < strArr.length; i++) {
            lhs.add(String.valueOf(strArr[i]));
        }

        lhs.forEach(e -> System.out.print(e));
        LinkedList<String> ll = new LinkedList<>(lhs);
        ArrayList<String> ar = new ArrayList<>(lhs);

        Iterator<String> it = ll.descendingIterator();

        System.out.println();

        while(it.hasNext())
            System.out.print(it.next());
    }
}

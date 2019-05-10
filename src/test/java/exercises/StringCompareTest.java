package exercises;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StringCompareTest {
    @Test
    public void test1() {
//        String input = "solar eclipse";
//
//        if (input == "solar eclipse") {
//            System.out.println("input is solar eclipse");
//        } else {
//            System.out.println("input is something else");
//        }
//
//        String input2 = new String("lunar eclipse");
//        String input3 = new String("lunar eclipse");
//
//        if (input2 == input3) {
//            System.out.println("equal: " + System.identityHashCode(input2) + " " + System.identityHashCode(input3));
//        } else {
//            System.out.println("not equal: " + System.identityHashCode(input2) + " " + System.identityHashCode(input3));
//        }
//
//        if (input2.equals(input3)) {
//            System.out.println("equal: " + System.identityHashCode(input2) + " " + System.identityHashCode(input3));
//        } else {
//            System.out.println("not equal: " + System.identityHashCode(input2) + " " + System.identityHashCode(input3));
//        }
    	
    	ArrayList<String> al1 = new ArrayList();
    	al1.add("hi");
    	al1.add("India");
    	
    	ArrayList<String> al2 = new ArrayList();
    	al2.add("India");
    	al2.add("hi");
    	al2.add("ap");
    	
    	System.out.println("are equal? " + al1.containsAll(al2));
    	System.out.println("are equal? " + al2.containsAll(al1));
    }
}

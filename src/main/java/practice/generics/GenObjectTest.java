package practice.generics;

/*
Write a program to remove duplicates from an array in Java without using the Java Collection API.
The array can be an array of String, Integer or Character, your solution should be independent of the type of array.
If you want to practice more array based questions then see this list of top 30 array interview questions
from Java interviews.
 */

public class GenObjectTest {
    public static void main(String args[]) {
        String str = "asdkfdlkfjdkl";
        int num = 124231234;

        GenObject<String> strObj = new GenObject<String>(str);
        System.out.println(strObj.removeDups());

        GenObject<Integer> intObj = new GenObject<Integer>(new Integer(num));
        System.out.println(intObj.removeDups());

        Character c = new Character('c');
        GenObject<Character> charObj = new GenObject<Character>(c);
    }
}

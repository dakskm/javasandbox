package practice.strings.reverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StringReverse1 {
    public static void main(String args[]) {
        String str = "arduR amaR agaN yhtrumanihskaD";

        stringReverseUsingBytes(str);

        stringReverseUsingStrBuilder(str);

        stringReverseBySwapping(str);

        stringReverseUsingArrayList(str);
    }

    //reverse by Arraylist
    static void stringReverseUsingArrayList(String str) {
        ArrayList<Character> al = new ArrayList<Character>();

        for(char a: str.toCharArray())
            al.add(a);

        Collections.reverse(al);
        String result = "";

        Iterator i = al.iterator();
        while (i.hasNext())
            result = result + i.next().toString();

        System.out.println(result);
    }

    //reverse by swapping
    static void stringReverseBySwapping(String str) {
        char[] strCharacters = str.toCharArray();
        int start;
        int end = str.length()-1;
        char temp;

        for(start = 0; start < end; start++, end--) {
            temp = strCharacters[start];
            strCharacters[start] = strCharacters[end];
            strCharacters[end] = temp;
        }

        System.out.println(new String(strCharacters));
    }

    //reverse using string builder
    static void stringReverseUsingStrBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);

        System.out.println(new String(sb.reverse()));
    }

    //reverse using byte array
    static void stringReverseUsingBytes(String str) {
        int strLength = str.length();

        byte[] strBytes = str.getBytes();
        byte[] strReverse = new byte[strBytes.length];

        for (int i = 0; i < str.length(); i++) {
            strReverse[i] = strBytes[strLength - i - 1];
        }

        System.out.println(new String(strReverse));
    }
}

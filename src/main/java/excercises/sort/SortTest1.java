package excercises.sort;

import java.util.Arrays;

public class SortTest1 {
    public static void main(String args[]) {
        String str1 = "Geeks for geeks";

        char str1Array[] = str1.replace(' ', '\u0020').toCharArray();

        Arrays.sort(str1Array);

        System.out.println(new String(str1Array));
        
    }
}

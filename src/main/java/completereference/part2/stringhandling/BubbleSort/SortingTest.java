package completereference.part2.stringhandling.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingTest {
    public static void main(String args[]) {
        String sentence = "Now is the time for all good things";

        String words[] = sentence.split(" ");

        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());

        for(String word : words) {
            System.out.println(word);
        }

        System.out.println(String.join(" ", words));
    }
}

package practice.strings.sortsstringsonlens;

/*
Sort an array of strings according to string lengths
We are given an array of strings, we need to sort the array in increasing order of string lengths.

Examples:

Input : {"GeeksforGeeeks", "I", "from", "am"}
Output : I am from GeeksforGeeks

Input :  {"You", "are", "beautiful", "looking"}
Output : You are looking beautiful

 */

import java.util.Arrays;
import java.util.HashMap;

public class SortStrings {
  public static void main(String args[]) {
    String strs[] = {"GeeksforGeeeks", "I", "from", "am"};

    String resultStrs[] = sortStrings(strs);

    for (int i = 0; i < resultStrs.length; i++) System.out.print(resultStrs[i] + " ");

    sortStrings1(strs);

    System.out.println();
    for (int i = 0; i < strs.length; i++) System.out.print(strs[i] + " ");
  }

  static String[] sortStrings(String[] strs) {
    int lens[] = new int[strs.length];
    String resultStrs[] = new String[strs.length];
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    for (int i = 0; i < strs.length; i++) {
      lens[i] = strs[i].length();
      hm.put(lens[i], strs[i]);
    }

    Arrays.sort(lens);

    for (int i = 0; i < lens.length; i++) resultStrs[i] = hm.get(lens[i]);

    return resultStrs;
  }

  static void sortStrings1(String[] strs) {
    for (int i = 0; i < strs.length; i++) {
      for (int j = i + 1; j < strs.length; j++) {
        if (strs[i].length() > strs[j].length()) {
          String temp = strs[i];
          strs[i] = strs[j];
          strs[j] = temp;
        }
      }
    }
  }
}

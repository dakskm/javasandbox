package leetcode.threesum;

import java.util.*;

public class ThreeSum {
  public static void main(String args[]) {
    int a[] = {-1, 0, 1, 2, -1, -4};

    System.out.println(getThreeSumNums(a, 0));
  }

  public static HashSet<ArrayList<Integer>> getThreeSumNums(int[] a, int x) {
    int len = a.length;
    HashMap<Integer, Integer> hm = new HashMap<>();
    HashSet<ArrayList<Integer>> all = new HashSet<ArrayList<Integer>>();

    for (int i = 0; i < len; i++) {
      hm.put(a[i], i);
    }

    for (int i = 0; i < len; i++) {
      for (int j = i; i < len; i++) {
        if (i != j) {
          int sum = a[i] + a[j];
          if (hm.containsKey(x - sum)) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(a[i]);
            al.add(a[j]);
            al.add(x - sum);
            Collections.sort(al);
            all.add(al);
          }
        }
      }
    }

    return all;
  }
}

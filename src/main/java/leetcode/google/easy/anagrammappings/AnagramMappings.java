package leetcode.google.easy.anagrammappings;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class AnagramMappings {
  public static void main(String args[]) {
    int a[] = {12, 28, 46, 32, 50};
    int b[] = {50, 12, 32, 46, 28};

    System.out.println(Arrays.toString(anagramMappings1(a, b)));

    int c[] = {12, 28, 28, 32, 50};
    int d[] = {28, 28, 50, 12, 32};
    System.out.println(Arrays.toString(anagramMappings1(c, d)));
  }

  //handles dups.
  public static int[] anagramMappings(int[] A, int[] B) {
    HashMap<Integer, LinkedList<Integer>> hm = new HashMap<Integer, LinkedList<Integer>>();

    for (int i = 0; i < B.length; i++) {
      if (hm.containsKey(B[i])) {
        LinkedList<Integer> al = hm.get(B[i]);
        al.add(i);
        hm.put(B[i], al);
      } else {
        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(i);
        hm.put(B[i], al);
      }
    }

    int[] result = new int[A.length];
    for (int j = 0; j < A.length; j++) {
      if (hm.containsKey(A[j])) {
        LinkedList<Integer> al = hm.get(A[j]);
        result[j] = al.removeFirst();
      }
    }
    return result;
  }

  //Doesn't handle dups.
  public static int[] anagramMappings1(int[] A, int[] B) {
    Map<Integer, Integer> D = new HashMap();
    for (int i = 0; i < B.length; ++i)
      D.put(B[i], i);

    int[] ans = new int[A.length];
    int t = 0;
    for (int x: A)
      ans[t++] = D.get(x);
    return ans;
  }
}

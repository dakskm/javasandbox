package practice.arrays.intersection;

/*
9.   Write a program to find intersection of two sorted arrays in Java? (solution)
Another interesting array interview question, where you need to treat the array as Set.
Your task is to write a function in your favorite language
e.g. Java, Python, C or C++ to return the intersection of two sorted arrays.
For example, if the two sorted arrays as input are {21, 34, 41, 22, 35} and {61, 34, 45, 21, 11},
it should return an intersection array with numbers {34, 21},
For the sake of this problem you can assume that numbers in each integer array are unique.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfArrays {
  public static void main(String args[]) {
    int array1[] = {66, 22, 34, 21, 34, 41, 22, 35};
    int array2[] = {76, 75, 76, 76, 61, 34, 45, 22, 11};

    TreeSet<Integer> ts1 = getTreeSet(array1);
    TreeSet<Integer> ts2 = getTreeSet(array2);

    System.out.println(ts1);
    System.out.println(ts2);

    ts1.retainAll(ts2);

    if (ts1.size() >= 1)
        System.out.println(ts1);
    else
        System.out.println("no interesection elements");

    //        Set<Integer> intersection = new HashSet<Integer>(ts1);
    //        intersection.retainAll(ts2);
    //        System.out.println(intersection);
    //        System.out.println(ts1.retainAll(ts1));
  }

  static TreeSet<Integer> getTreeSet(int elements[]) {
    TreeSet<Integer> ts = new TreeSet<Integer>();

    for (int element : elements) ts.add(element);

    return ts;
  }

  static void display() {}
}

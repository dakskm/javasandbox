package practice.arrays.everyelementrepeated;

/*
10. There is an array with every element repeated twice except one. Find that element? (solution)
This is an interesting array coding problem, just opposite of question related to finding duplicates in array.
Here you need to find the unique number which is not repeated twice.
For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3.
Also, don't forget to write couple of unit test for your solution.
 */

import java.util.HashSet;

public class FindUnique {
    public static void main(String args[]) {
        int elements[] = {5, 5, 2, 2, 0, 4, 4, 1, 1, 6, 7, 7, 6};

        findUnique(elements);
    }

    static void findUnique(int elements[]) {
        HashSet<Integer> lhs = new HashSet<Integer>();

        int actualSum = 0;

        for(int element: elements) {
            actualSum += element;
            lhs.add(element);
        }

        int expectedSum =0;
        for(int i: lhs)
            expectedSum = expectedSum + i;
        expectedSum = expectedSum * 2;

        System.out.printf("unique element %d", (expectedSum - actualSum));
    }
}

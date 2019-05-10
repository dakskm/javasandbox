package practice.arrays.everyelementrepeated;

/*
There is an array with every element repeated twice except one. Find that element? (solution)
This is an interesting array coding problem, just opposite of question related to finding duplicates in array.
Here you need to find the unique number which is not repeated twice. For example if given array is
{1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3. Also, don't forget to write couple of unit test
for your solution.

Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5PM8r9g9B
 */

import java.util.Arrays;

public class FindUnique2 {
    public static void main(String args[]) {
        int a[] = {5, 5, 2, 2, 0, 4, 4, 1, 1, 6, 7, 7, 6};
        System.out.println(findUnique(a));

        int b[] = {20, 4, 4, 1, 1};
        System.out.println(findUnique(b));

        int c[] = {5, 5, 2, 2, 4, 4, 1, 3, 1, 6, 7, 7, 6};
        System.out.println(findUnique(c));
    }

    static int findUnique(int a[]) {
        int len = a.length;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < len - 1; i = i + 2) {
            if (a[i] != a[i + 1]) {
                return i;
            }
        }

        return len;
    }
}

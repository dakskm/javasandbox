package practice.arrays.reverse;

/*
How to reverse array in place in Java? (solution)
Now let's see one of the most frequently asked array interview question. You need to write a program which accepts an
integer array and your program needs to reverse that array in place, which means you cannot use additional buffer or
array, but one or two variables will be fine. Of course you cannot use any open source library or Java API method to
directly solve this problem, you need to create your own logic. Here is one such logic to solve this problem :
 */

import java.util.Arrays;

public class ReversingArray {
    public static void main(String args[]) {
        int a[] = {9, 4, 2, 8, 6, 5, 1};
        System.out.printf("array before sorting " + Arrays.toString(a));
        reverseArray(a);
        System.out.println();
        System.out.printf("array after sorting " + Arrays.toString(a));
    }

    static void reverseArray(int a[]) {
        int len = a.length;
        int temp;
        int i, j;
        for(i=0, j = len-1;i<len && i<j;i++,j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}

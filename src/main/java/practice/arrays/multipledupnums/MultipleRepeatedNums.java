package practice.arrays.multipledupnums;

/*
How to find repeated numbers in an array if it contains multiple duplicates? (solution)
This is actually the follow-up question of problem 2, how to find a duplicate number on integer array. In that case,
an array contains only one duplicate but what if it contains multiple duplicates? Suppose, an array contains n numbers
ranging from 0 to n-1 and there are 5 duplicates on it, how do you find it? You can use the approach, we have learned
in similar String based problem of finding repeated characters in given String.
 */

public class MultipleRepeatedNums {
    final static int NUMBERS = 10;

    public static void main(String args[]) {
        int a[] = {1, 1, 3, 9, 9, 9, 8, 6, 4, 4, 3, 2, 1};

        countRepeatedNums(a);
    }

    static void countRepeatedNums(int[] a) {
        int[] count = new int[NUMBERS];

        for(int i = 0; i< a.length;i++)
            count[a[i]]++;

        for(int i=0;i<NUMBERS;i++) {
            System.out.printf("number %d repeated %d times", i, count[i]);
            System.out.println();
        }
    }
}

package practice.sorts.bubblesort.firstime;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubblesort1(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        bubblesort2(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubblesort1(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void bubblesort2(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

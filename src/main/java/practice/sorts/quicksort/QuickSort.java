package practice.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
        int a[] = {10, 80, 30, 90, 40, 50, 70};

        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    static void quickSort(int a[], int low, int high) {
        if(high > low) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}

package practice.sorts.quicksort;

import java.util.Arrays;

public class QuickSort1 {
    public static void main(String args[]) {
        int a[] = {10, 80, 30, 90, 40, 50, 70};
        int low = 0;
        int high = a.length - 1;

        System.out.println(Arrays.toString(a));
        quicksort(a, low, high);
        System.out.println(Arrays.toString(a));
    }

    static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            quicksort(a, low, pi - 1);
            quicksort(a, pi + 1, high);
        }

    }

    static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = (low - 1);

        for(int j = low; j < high; j++) {
            if(a[j] <= pivot) {
                i++;

                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }
}

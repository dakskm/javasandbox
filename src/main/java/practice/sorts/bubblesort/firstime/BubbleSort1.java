package practice.sorts.bubblesort.firstime;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String args[]) {
        int a[] = {10, 80, 30, 90, 40, 50, 70};

        bubbleSort(a);

    System.out.println(Arrays.toString(a));
    }

    static void bubbleSort(int a[]) {
        int l = a.length;

        for(int i = 0; i<l; i++) {
            for(int j=0;j<l;j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

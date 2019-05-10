package practice.arrays.passbyref;

import java.util.Arrays;

public class PassByRedd {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        update(a);

    System.out.print(Arrays.toString(a));
    }

    static void update(int a[]) {
        for(int i=0;i<a.length;i++)
            a[i] = a[i] + 1;
    }
}

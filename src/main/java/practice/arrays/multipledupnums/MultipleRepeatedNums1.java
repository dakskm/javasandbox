package practice.arrays.multipledupnums;

import com.sun.imageio.plugins.common.I18N;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultipleRepeatedNums1 {
    public static void main(String args[]) {
        int a[] = {1, 1, 3, 9, 9, 9, 8, 6, 4, 4, 3, 2, 1};

        printDupeNums(a);
    }

    static void printDupeNums(int a[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : a) {
            if (hm.containsKey(i))
                hm.put(i, hm.get(i) + 1);
            else
                hm.put(i, 1);
        }

        System.out.println(hm);

        Set<Integer> keys = hm.keySet();

        for (Integer key : keys) {
            int value = hm.get(key);
            if (value > 1)
                System.out.println("[" + key + ", " + hm.get(key) + "]");
        }

        Iterator<Integer> it = hm.keySet().iterator();
        Integer key;
        while(it.hasNext()) {
            key = it.next();
            Integer val = hm.get(key);
            if(val > 1)
                System.out.println("[" + key + ", " + hm.get(key) + "]");
            else
                it.remove();
        }

        System.out.println(hm);
    }
}

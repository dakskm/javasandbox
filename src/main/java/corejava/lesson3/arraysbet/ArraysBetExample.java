package corejava.lesson3.arraysbet;

import java.util.Arrays;
import java.util.Random;

public class ArraysBetExample {
    public static void main(String args[]) {
        int n = 49;
        int[] originalArr = new int[n];
        int[] resultArr = new int[6];

        for (int i = 0; i < n; i++)
            originalArr[i] = i + 1;

        Random r = new Random();
        int orgArrLen = originalArr.length - 1;
        for (int i = 0; i < resultArr.length; i++) {
//            Double r = Math.random();
//            int ran = (int) (r * n);
            int random = r.nextInt(orgArrLen);
            String output = String.format("random is %d", random);
            System.out.println(output);

            resultArr[i] = originalArr[random];
            originalArr[random] = originalArr[orgArrLen];
            orgArrLen--;
        }

        Arrays.sort(resultArr);

        for(int i : resultArr)
            System.out.println("array element is " + i);
    }
}

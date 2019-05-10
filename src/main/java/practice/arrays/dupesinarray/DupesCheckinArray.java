package practice.arrays.dupesinarray;

/*
2. How to find duplicate number on Integer array in Java? (solution)
An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in the array.
You need to write a program to find that duplicate number. For example, if an array with length 6 contains numbers
{0, 3, 1, 2, 3}, then duplicated number is 3.
Actually, this problem is very similar to previous one and you can apply the same trick of comparing actual
sum of an array to expected sum of series to find out that duplicate. This is generally asked as follow-up question of
previous problem.
 */

public class DupesCheckinArray {
    final static int NO_OF_CHARS = 256;

    public static void main(String args[]) {
        String s = "Dakshinamurthy";

        printDups(s);
    }

    static void printDups(String s) {
        int count[] = new int[NO_OF_CHARS];
        getCharCounts(s, count);

        for(int i=0;i<NO_OF_CHARS;i++)
            if(count[i]>1)
                System.out.println(String.valueOf((char) i));
    }

    static void getCharCounts(String s, int count[]) {
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
    }
}

package practice.primenumber;

/*
Prime number (solution)
Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not
divisible by any other number e.g. 3, 5, 7, 11, 13, 17 etc. Be prepared for cross e.g. checking till the square root of
a number etc.

sqrt(num) + 1

(num * num) - 1 %24

 */

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class PrimenumberTest {
    public static void main(String args[]) {
        int num = 100;
        int i, j;

//        for (i = 3; i < num; i++) {
//            for (j = 2; j <= i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//            }
//            if (i == j) {
//                System.out.println(i + " is a prime");
//                System.out.println(i + " isPrime " + isPrime1(i));
//                System.out.println(i + " isPrime " + isPrime2(i));
//            }
//        }

        System.out.println();
        for(i =0; i<20; i++) {
            System.out.printf("number %d is prime: " + isPrime2(i), i);
            System.out.println();
        }
    }

    static boolean isPrime1(double num) {
        int sqrtResult = (int) Math.sqrt(num) + 1;

        for (int i = 2; i < sqrtResult; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(double num) {
        if (num <= 1)
            return false;
        else if (num > 1 && num < 4)
            return true;
        else {
            if (((num * num) - 1) % 24 == 0)
                return true;
            else
                return false;
        }
    }
}

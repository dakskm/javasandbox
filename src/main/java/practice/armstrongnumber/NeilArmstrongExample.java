package practice.armstrongnumber;

/*
Armstrong number (solution)
A number is called an Armstrong number if it is equal to the cube of its each digit.
for example, 153 is an Armstrong number because 153= 1+ 125+27 which is equal to 1^3+5^3+3^3.
You need to write a program to check if given number is Armstrong number or not.
 */

import java.util.Scanner;

public class NeilArmstrongExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = readIntegerInput(in);

        System.out.println("user input interger is " + num);

        int sum = 0;
        sum = getSumofCubesRursive(num, sum);

        System.out.println("sum of cubes of all numbers " + sum);
        if (num == sum)
            System.out.println("arm strong number");
        else
            System.out.println("not an arm strong number");
    }

    static int getSumofCubesRursive(int num, int sum) {
        int r = 0;
        System.out.println("num is " + num);
        if (num > 0) {
            r = num % 10;
            System.out.println(r);
            System.out.println(sum);
            sum = (int) Math.pow(r, 3) + getSumofCubesRursive(num / 10, sum);
        }

        return sum;
    }

    static int getSumofCubes(int num) {
        int r = 0;
        int sum = 0;
        while (num > 0) {
            r = num % 10;
            sum = sum + (int) Math.pow(r, 3);
            num = num / 10;
        }
        return sum;
    }

    static int readIntegerInput(Scanner in) {
        int i;
        try {
            System.out.println("enter integer number");
            i = in.nextInt();
        } catch (Exception e) {
            System.out.println("invalid enter " + e.getMessage());
            in.nextLine();
            i = readIntegerInput(in);
        }
        return i;
    }
}


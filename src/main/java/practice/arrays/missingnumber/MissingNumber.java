package practice.arrays.missingnumber;

/*
1. How to find the missing number in integer array of 1 to 100? (solution)
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview.
You have given an integer array which contains numbers from 1 to 100 but one number is missing,
you need to write a Java program to find that missing number in an array.
You cannot use any open source library or Java API method which solves this problem.
One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum,
the difference would be the missing number.

Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5OBmWUmzw
 */

public class MissingNumber {
  public static void main(String args[]) {
    int arr[] = new int[100];

    for (int i = 0; i < 100; i++) arr[i] = i + 1;

    arr[78] = 0;

    int expectedSum = (arr.length) * (arr.length + 1) / 2;

    int actualSum = 0;
    for (int i = 0; i < arr.length; i++) actualSum += arr[i];

    System.out.println("expectedSum is " + expectedSum);
    System.out.println("actualSum is " + actualSum);
    System.out.println("Missing num is " + (expectedSum - actualSum));
  }
}

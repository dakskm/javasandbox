package practice.strings.duplicates.example1;

/*
How to Print duplicate characters from String? (solution)

To start with, we have a simple String related coding question frequently asked in programming interviews.
You need to write a program in C, C++, Java or Python to print duplicate characters from a given String, for example
if String is "Java" then program should print "a". Bonus points if your program is robust and handle different kinds of
input e.g. String without duplicate, null or empty String etc. Bonus points if you also write unit tests for normal and
edge cases.

Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5OSYNr8RD
 */

import java.util.Arrays;

public class FindDups {

  static int NO_OF_CHARS = 256;

  public static void main(String args[]) {
    String s = "Programming";

    System.out.println(getDuplicates(s));
  }

  static String getDuplicates(String s) {
    String str = "";

    if (s != null) {
      int strlen = s.length();

      if (strlen <= 1) System.out.println("no dups");
      else {
        int count[] = new int[NO_OF_CHARS];

        for (int i = 0; i < strlen; i++) count[s.charAt(i)]++;

        for (int i = 0; i < NO_OF_CHARS; i++) {
          if (count[i] > 1) {
            str = str + (char)i;
          }
        }
      }
    }
    return str;
  }
}

package practice.matrices.addition;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class MatrixAddition {
  public static void main(String args[]) {

    int m, n;
    Scanner in = new Scanner(System.in);

    try {
      System.out.println("Enter number of rows and columns");
      m = in.nextInt();
      n = in.nextInt();

      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int third[][] = new int[m][n];

      System.out.println("Enter values for the first matrix");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          String instruction = String.format("enter [%d, %d] value", i, j);
          System.out.println(instruction);
          first[i][j] = in.nextInt();
          in.nextLine();
        }
      }
      display(first);

      System.out.println("Enter values for the second matrix");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          String instruction = String.format("enter [%d, %d] value", i, j);
          System.out.println(instruction);
          second[i][j] = in.nextInt();
          in.nextLine();
        }
      }
      display(second);

      System.out.println();
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          third[i][j] = first[i][j] + second[i][j];
        }
      }
      display(third);

    } catch (Exception e) {
      System.out.println("Exception occurred " + e.getMessage());
    }
  }

  static void display(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}

package practice.files.reading.scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerExample {
  public static void main(String args[]) {
    String filePath = "/users/dakshin/downloads/srirama.txt";

    File file = new File(filePath);

    long count = 0;
    long stTime = System.currentTimeMillis();
    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
        count++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    long edTime = System.currentTimeMillis();

      System.out.println("lines: " + count);
      System.out.println("time diff: " + (edTime - stTime));
  }
}

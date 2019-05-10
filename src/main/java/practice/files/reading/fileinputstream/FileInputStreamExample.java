package practice.files.reading.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamExample {
  public static void main(String args[]) {
    String filepath = "/users/dakshin/downloads/srirama.txt";

    FileInputStream fis = null;
    Scanner sc = null;

    try {
      fis = new FileInputStream(filepath);
      sc = new Scanner(fis);

      int count = 0;

      long stMillis = System.currentTimeMillis();
      while (sc.hasNextLine()) {
        count++;
//        System.out.println(sc.nextLine());
      }
      long edMillis = System.currentTimeMillis();

      System.out.println("lines: " + count);
      System.out.println("time diff: " + (edMillis - stMillis));

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (sc != null) sc.close();
        if (fis != null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

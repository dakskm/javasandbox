package practice.files.reading.bufferedreader;

import java.io.*;

public class BufferedReaderExample {
  public static void main(String args[]) {
    String filepath = "/users/dakshin/downloads/srirama.txt";
    File file;
    FileReader fr = null;
    BufferedReader br = null;

    try {
      file = new File(filepath);
      fr = new FileReader(file);
      br = new BufferedReader(fr);
      String line;
      long count = 0;

      long stMillis = System.currentTimeMillis();
      while ((line = br.readLine()) != null) {
        count++;
//        System.out.println(line);
      }
      long edMillis = System.currentTimeMillis();

      System.out.println("lines: " + count);
      System.out.println("time diff: " + (edMillis - stMillis));

    } catch (Exception e) {
      System.out.println("exception");
      e.printStackTrace();
    } finally {
      try {
        if (br != null)
          br.close();

        if (fr != null)
          fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

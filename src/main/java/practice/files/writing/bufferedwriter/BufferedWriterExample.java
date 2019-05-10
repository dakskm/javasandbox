package practice.files.writing.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
  public static void main(String args[]) {
    String filePath = "/users/dakshin/downloads/srirama.txt";

    FileWriter fw = null;
    BufferedWriter bw = null;

    try {
      fw = new FileWriter(filePath);
      bw = new BufferedWriter(fw);
      String content = "sriramajayam sriramajayam sriramajayam sriramajayam sriramajayam sriramajayam sriramajayam\n";

      for (long i = 0; i < 100000000; i++)
        bw.write(content);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bw != null)
          bw.close();

        if (fw != null)
          fw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

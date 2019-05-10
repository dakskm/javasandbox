package practice.files.reading.filereader;

import java.io.FileReader;

public class FileReaderExample {
  public static void main(String args[]) {
    String filepath =
        "/Users/Dakshin/Apple/iApps/Trex/Performance_Testing/results/round6/sustained/18_15s_65m/"
            + "2018-03-28_11-53-45-564/iapps-10-140-248-232_mesos-slave.INFO";
    String filepath1 = "/users/dakshin/downloads/srirama.txt";

    try {
      FileReader fr = new FileReader(filepath);
      int i;
      int count = 0;

      long stTime = System.currentTimeMillis();
      while ((i = fr.read()) != -1) {
//          System.out.print((char) i);
          if((char)i == '\n')
              count++;
      }
      long edTime = System.currentTimeMillis();

      System.out.println("lines: " + count);
      System.out.println("time diff: " + (edTime - stTime));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

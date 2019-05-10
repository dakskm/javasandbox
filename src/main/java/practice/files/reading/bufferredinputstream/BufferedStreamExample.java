package practice.files.reading.bufferredinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedStreamExample {
    public static void main(String args[]) {
        String filepath = "/users/dakshin/downloads/srirama.txt";

        FileInputStream fis;
        BufferedInputStream bis;

        byte[] buf = new byte[1048];

        try {
            fis = new FileInputStream(filepath);
            bis = new BufferedInputStream(fis);
            int l = 0;
            long count = 0;

            long stMillis = System.currentTimeMillis();
            while((l = bis.read(buf))!=-1) {
              count++;
//                System.out.println(new String(buf));
            }
            long edMillis = System.currentTimeMillis();

            System.out.println("number of lines " + count);
            System.out.println("time diff: " + (edMillis - stMillis));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

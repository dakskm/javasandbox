package geeksforgeeks.serailization.example1;

import java.io.*;

public class TestSerialize {
    public static void main(String args[]) {
        B b = new B(10, 20);

        try{
            FileOutputStream fos = new FileOutputStream("/Users/Dakshin/Downloads/test1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(b);

            oos.close();
            fos.close();
        } catch (Exception fe) {
            System.out.println("file not founf " + fe.getMessage());
        }
    }
}

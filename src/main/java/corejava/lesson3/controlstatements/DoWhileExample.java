package corejava.lesson3.controlstatements;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = null;
        String con = null;

        try {
            pw = new PrintWriter("/Users/Dakshin/Desktop/test.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Enter your name");
            String name = in.nextLine();

            System.out.println("Enter your age");
            int age = in.nextInt();
            in.nextLine();

            String output = String.format("Name is %20s and age is %6d", name, age);
            pw.println(output);

            System.out.println("are you done y/n");
            con = in.nextLine();
        } while (con.equalsIgnoreCase("n"));

        pw.close();
    }
}

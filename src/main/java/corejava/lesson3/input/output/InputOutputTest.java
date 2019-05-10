package corejava.lesson3.input.output;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutputTest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter you age");
        int age = in.nextInt();

        String output = String.format("Your name is %s and your age is %d", name, age);
        System.out.println(output);

        try {
            PrintWriter pw = new PrintWriter("/users/dakshin/desktop/test.txt", "UTF-8");
            pw.print(output);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String inputFile = "/Users/Dakshin/Desktop/untitled text 13.xml";
        try {
            Scanner filePointer = new Scanner(Paths.get(inputFile), "UTF-8");
            while (filePointer.hasNext()) {
                System.out.println(filePointer.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

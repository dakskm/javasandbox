package excercises.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackExample {

    public static void main(String args[]) {

        StackClass s1 = new StackClass(4);

        s1.pop();

        s1.push("{");
        s1.currentPosition();
        s1.push("{");
        s1.currentPosition();
        s1.push("[");
        s1.currentPosition();
        s1.push("[");
        s1.currentPosition();
        s1.push("third child");
        s1.currentPosition();

        s1.printArray();

        s1.pop();
        s1.currentPosition();
        s1.pop();
        s1.currentPosition();
        s1.printArray();
        s1.pop();
        s1.currentPosition();
        s1.pop();
        s1.currentPosition();
        s1.pop();
        s1.currentPosition();
        s1.pop();
        s1.currentPosition();

        s1.currentPosition();

//        s1.push("Dakshin");
//        s1.push("Sowju");
//        s1.push("Ram");
//        s1.push("Rudra");
//        s1.push("third child");
//
//        s1.printArray();
//
//        System.out.println(s1.pop());
//        System.out.println(s1.pop());
//        System.out.println(s1.pop());
//        System.out.println(s1.pop());
//        System.out.println(s1.pop());

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input;
//
//        try {
//            do {
//                input = br.readLine();
//
//
//            } while (!input.equals("exit"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
    }
}

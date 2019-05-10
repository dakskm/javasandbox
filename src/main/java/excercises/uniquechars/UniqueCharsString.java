package excercises.uniquechars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Arrays;

public class UniqueCharsString {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputStr = null;

            do {
                inputStr = br.readLine();
                System.out.println("input string: " + inputStr);

                String result = uniqueString(inputStr);

                System.out.println("unique string: " + result);

            } while (!inputStr.equals("exit"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String uniqueString(String inputStr) {

        int inputStrLen = inputStr.length();
        String str = "";

        for (int i = 0; i < inputStrLen; i++) {
            char c = inputStr.charAt(i);
            if (!str.contains(String.valueOf(c))) {
                str = str + c;
            }
        }
        return str;
    }
}

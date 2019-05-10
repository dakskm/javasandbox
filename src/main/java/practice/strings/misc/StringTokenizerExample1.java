package practice.strings.misc;

import java.util.StringTokenizer;

/**
 * StringTokenizer is legacy not recommended in modren code
 */
public class StringTokenizerExample1 {
    public static void main(String args[]) {
        String str = "hello how are you Ram and Rudra";

        StringTokenizer strTokens = new StringTokenizer(str);

        while (strTokens.hasMoreTokens()) {

        }
    }
}

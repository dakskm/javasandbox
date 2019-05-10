package practice.strings.removedups;

/*
How to remove duplicate characters from String? (solution)

This is one of the interesting String question, which also has lots of variants. You need to remove duplicate
characters from a given string keeping only the first occurrences. For example, if the input is ‘bananas’ the output
will be ‘bans’. Pay attention to what output could be, because if you look closely original order of characters are
retained the in output. This is where many developer make the a mistake of shorting character array of String and
removing duplicates, similar to how you remove duplicates from array. That destroys original order of characters and
will not be correct solution in this case.
 */

import java.util.LinkedHashSet;

public class RemoveDups {
    public static void main(String args[]) {
        System.out.println(removeDups("bananas"));
    }

    static String removeDups(String str) {
        //second way
        String result = "";

        for(char c: str.toCharArray())
            if(!result.contains(String.valueOf(c)))
                result = result + c;

        return result;
    }
}

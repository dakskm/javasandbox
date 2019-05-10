package practice.strings.removechar;

/*
Write a program to remove a given characters from String? (solution)

One of my favorite coding question, when I interview Java developers. You need to write a Java method which will
accept a String and a character to be removed and return a String, which doesn't has that character e.g
remove(String word, char ch).  You need to provide both iterative and recursive solution of this method and also has
to write JUnit tests to cover cases like null and empty String, input which only contains letter to be removed, String
which doesn't contain given character etc.
 */

public class RemoveChar {
    public static void main(String args[]){
        System.out.println(removeChar("Dakshinamurthy", 'a'));
    }

    static String removeChar(String s, char c) {
        int len = s.length();

        String result = "";
        for(char a: s.toCharArray())
            if(c!=a)
               result = result + a;

        return result;
    }
}

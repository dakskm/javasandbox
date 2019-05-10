package practice.strings.rotatedstrings;

/*
Check if two string rotation of each other
Write a program which accepts two given String and checks if they are the rotation of each. If they then return true
otherwise return false. A String is said to be a rotation of other string if they contain same characters and the
sequence is rotated across any character e.g "dabc" is a rotation of "abcd" but "dbac" is not.
 */

public class RotatedStrings {
    public static void main(String args[]) {
        System.out.println(isRotatedStr("ABCD","BCDA"));
    }

    static boolean isRotatedStr(String s1, String s2) {
        if(s1 !=null && s2 != null)
            return ((s1.length() == s2.length())
                    && (s1 + s1).contains(s2));
        else
            return false;
    }
}

package practice.strings.vowels;

import practice.strings.checkdigits.StringCheckUsingBytes;

public class VowelsConsonents {
    static String vowels = "aeiou";
    public static void main(String args[]) {


        String inputString = "java";

        System.out.println(getVowelsConsonants(inputString));
    }

    static String getVowelsConsonants(String s) {

        int vowelsCount = 0;
        int consCount = 0;

        for(int i=0;i<s.length();i++) {
            if(vowels.contains(String.valueOf(s.charAt(i))))
                vowelsCount++;
            else
                consCount++;
        }
        return String.format("number of vowels %d and consonants %d",vowelsCount, consCount);
    }
}

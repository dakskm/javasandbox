package practice.strings.reverse.sentence;

/*
How to reverse words in a sentence without using library method? (solution)

Write a function, which takes a String word and returns sentence on which words are reversed in order e.g.
if an input is "Java is best programming language", the output should be "language programming best is Java".

 */

public class ReverseSentence {
  public static void main(String args[]) {
    String s = "Java is a great language";

    System.out.println(reverseSentence(s));
  }

  static String reverseSentence(String s) {
    String[] strings = s.split("\\s");
    String result = "";

    for (int i = strings.length - 1; i >= 0; i--)
        result = result + strings[i] + " ";

    return result;
  }
}

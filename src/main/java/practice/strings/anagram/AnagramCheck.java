package practice.strings.anagram;

import java.util.Arrays;

public class AnagramCheck {
  public static void main(String args[]) {
    String str1 = "Lis  ten";
    String str2 = "Sile n t";

    stringSort(str1);
    stringSort(str2);
  }

  static boolean isAnagram() {

    return true;
  }

  static void stringSort(String str) {
    char[] chars = str.replaceAll("\\s", "").toLowerCase().toCharArray();
    int strLen = chars.length;

    Arrays.sort(chars);

//    for (int i = 0; i < strLen; i++) {
//      for (int j = i; j < strLen; j++) {
//        if (chars[i] > chars[j]) {
//          char temp = chars[i];
//          chars[i] = chars[j];
//          chars[j] = temp;
//        }
//      }
//    }
    System.out.println(String.valueOf(chars));
  }
}

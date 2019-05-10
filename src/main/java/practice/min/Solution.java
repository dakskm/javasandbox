package practice.min;


import java.io.*;
import java.util.*;

/*
Given a string s, break s such that every substring of the partition can be found in the dictionary.
Return the minimum break needed.
Example
Given a String DogMat
Given a dictionary ["Dog", "Mat", "Do", "gM", "at", "D", "og"]
return 1
we can break the sentences in three ways, as follows:
DogMat = Dog Mat break 1
DogMat = Do gM at break 2
DogMat = D og Mat break 2
but the first way has the minimum break, thus return 1

 *
 */

class Solution {
  public static void main(String[] args) {
    //make dictionary and try
    Set<String> dict = new HashSet<String>() {{
      add("Dog");
      add("Mat");
      add("Do");
      add("gM");
      add("at");
      add("D");
      add("og");
    }};

    String str1 = "DogMat";
    int result1 = breakme(str1, dict);
    System.out.println(str1 + " min breaks " + result1);

    String str2 = "Mat";
    int result2 = breakme(str2, dict);
    System.out.println(str2 + " min breaks " + result2);

    String str3 = "Dog";
    int result3 = breakme(str3, dict);
    System.out.println(str3 + " min breaks " + result3);

    String str4 = "DogM";
    int result4 = breakme(str4, dict);
    System.out.println(str4 + " min breaks " + result4);

    String str5 = null;
    int result5 = breakme(str5, dict);
    System.out.println(str5 + " min breaks " + result5);

    String str6 = null;
    Set<String> dictNull = null;
    int result6 = breakme(str6, dictNull);
    System.out.println("min breaks when string and dict are null " + result6);

    String str7 = "ogMat";
    int result7 = breakme(str7, dict);
    System.out.println(str7 + " min breaks " + result7);

    String str8 = "Dat";
    int result8 = breakme(str8, dict);
    System.out.println(str8 + " min breaks " + result8);

    String str9 = "Doatog";
    int result9 = breakme(str9, dict);
    System.out.println(str9 + " min breaks " + result9);

    String str10 = "MatMaM";
    int result10 = breakme(str10, dict);
    System.out.println(str10 + " min breaks " + result10);
  }

  public static int breakme(String s, Set<String> dict) {
    //your code goes here
    if (s != null && dict != null) {
      int len = s.length();
      LinkedHashSet<String> ts = new LinkedHashSet<String>();

      //finding all valid combinations of strings that exist in the set.
      for (int i = 0; i < len; i++) {
        String tempStr = String.valueOf(s.charAt(i));
        if (dict.contains(tempStr))
          ts.add(tempStr);
        for (int j = i + 1; j < len; j++) {
          tempStr = tempStr + s.charAt(j);
          if (dict.contains(tempStr))
            ts.add(tempStr);
        }
      }

//      for (String str : ts) {
//        System.out.println("valid combinations exist in set: " + str);
//      }

      //Converting LinkedHashMap to Array for easy iterations.
      String strs[] = ts.toArray(new String[ts.size()]);

      //logic to find min value
      int strsLen = strs.length;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < strsLen; i++) {
        int count = 0;
        //selecting first string in each iteration.
        String str = strs[i];
//         System.out.println(str);
        if (s.contains(str)) {
          count++;
          for (int j = i + 1; j < strsLen; j++) {
            String holder = str + strs[j];
//            System.out.println("holder: " + holder);
            if (s.contains(holder)) {
              count++;
              str = str + strs[j];
//              System.out.println("combined: " + str);
            }
          }
        }

//        System.out.println("min: " + min);
//        System.out.println("count: " + count);
        if (count < min && str.length() == s.length()) {
//           System.out.println("final string: " + str);
          min = count;
        }
//        System.out.println("min: " + min);
      }
      return min;
    } else
      return -1;
  }
}
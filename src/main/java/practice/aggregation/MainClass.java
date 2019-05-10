package practice.aggregation;

public class MainClass {
  public static void main(String args[]) {
    String str = "Dakshin";
    System.out.println(str.charAt(0));
  }

  public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    if (s != null) {
      int len = s.length();
      String finalStr = "";
      String tempStr = "";

      for (int i = 0; i < len; i++) {
        tempStr = String.valueOf(s.charAt(i));
        for (int j = i + 1; j < len; j++) {
          String checkStr = String.valueOf(s.charAt(j));
          if (!tempStr.contains(checkStr)) {
            tempStr = tempStr + String.valueOf(s.charAt(j));
            System.out.println("tempStr: " + tempStr);
          } else
            break;
        }

        if (finalStr.length() < tempStr.length()) {
          finalStr = tempStr;
          System.out.println("finalStr: " + finalStr);
        }

      }

      return finalStr.length();
    }
    return maxLen;
  }
}

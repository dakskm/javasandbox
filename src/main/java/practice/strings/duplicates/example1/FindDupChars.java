package practice.strings.duplicates.example1;

public class FindDupChars {
  public static void main(String args[]) {
    String str = "Built in Apps";

    printDupChars("Built in Apps");
  }

  static void printDupChars(String s) {
    int len = s.length();
    String temp = "";
    char c;

    System.out.printf("Duplicate chars of %s", s);
    System.out.println();
    for (int i = 0; i < len; i++) {
      c = s.charAt(i);
      if (temp.contains(String.valueOf(c))) {
        System.out.printf("%c is a duplicate", c);
        System.out.println();
      } else
        temp = temp + String.valueOf(c);
    }
  }
}

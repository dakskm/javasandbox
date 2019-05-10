package practice.strings.firstnonrepeated.example1;

public class StringUtil {
  static final int NO_OF_CHARS = 256;

  public char firstNonRepeatedChar(String s) {
    int count[] = new int[NO_OF_CHARS];
    int l = s.length();

    for (int i = 0; i < l; i++)
      count[s.charAt(i)]++;

    for (int i = 0; i < s.length(); i++) {
      if (count[s.charAt(i)] == 1) {
        return s.charAt(i);
      }
    }
    return '\u0000';
  }
}

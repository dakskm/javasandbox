package practice.strings.checkdigits;

public class StringCheckUsingBytes {
  public boolean areDigitsExisting(String s) {
    int zero = '0';
    int nine = '9';

    for (int i = 0; i < s.length(); i++) {
      int c = s.charAt(i);
      if (c >= zero && c <= nine) return true;
    }
    return false;
  }

  public static void main(String args[]) {
    StringCheckUsingBytes s = new StringCheckUsingBytes();

    boolean result = s.areDigitsExisting("kdjsas kjlsdjksdksdj klsdjds klk0saksah");

    System.out.println(result);
  }
}

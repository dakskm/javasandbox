package inheritance;

public class Base {
  static String cookie;

  static {
    System.out.println("I'm base");
    cookie = "test";
  }
}

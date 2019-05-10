package excercises.bytechar;

public class ByteCharExamples {
  public static void main(String args[]) {
    char c1 = '\u0020';
    char c2 = '\u0021';

    char c3 = 32;
    char c4 = 33;

    char c5 = Character.MIN_VALUE + 1; //\u0001
    char c6 = '\u00A0';

    byte b1 = 32;
    byte b2[] = {33};

    System.out.println("c1: " + c1);
    System.out.println("c2: " + c2);
    System.out.println("b1: " + b1);
    System.out.println("b2: " + new String(b2));

    System.out.println("c3: " + c3);
    System.out.println("c4: " + c4);

    System.out.println("c5askljd" + c5 + "sadlkfj");
    System.out.println("c6asdjshaslk" + c6 + "salkjdksljd");

  }
}

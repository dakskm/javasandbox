package practice.exceptions;

public class ExceptionalHandling {
    public static void main(String args[]) {
        int i[] = new int[4];

        try {
            System.out.println("I'm try");
            int j = i[8];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occurred");
        } finally{
            System.out.print("I'm finally block");
        }
    }
}

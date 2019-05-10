package practice.strings.checkdigits;

public class StringOnlyDigits {
    public static void main(String args[]) {
        System.out.println("099823892369".matches("[0-9]+b"));

        System.out.println("aaaaa".matches("\\w+"));

        System.out.println("aa99".matches("[0-9]+"));

        System.out.println("".matches("[0-9]+"));

        System.out.println("099823892369".matches("[0-9]+"));
    }
}

package practice.palindrome.number;

/*
Integer Palindrome (solution)
This is generally asked as follow-up or alternative of the previous program. This time you need to check if given
Integer is palindrome or not. An integer is called palindrome if its equal to its reverse e.g. 1001 is a palindrome
but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the
number and modulus 10 to get the last digit. This trick is used to solve this problem.
 */

public class PalindromeExample {
    public static void main(String args[]) {
        int num1 = 12321;

        int original = num1;
        int r;
        int num2 = 0;

        while (num1 > 0) {
            r = num1 % 10;
            num2 = (num2 * 10) + r;
            num1 = num1 / 10;
        }

        if(original == num2) {
            System.out.println("integer palindrome " + original + " " + num2);
        } else {
            System.out.println("not a palindrome " + original + " " + num2);
        }
    }
}

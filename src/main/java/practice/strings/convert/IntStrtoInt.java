package practice.strings.convert;

/*
How to convert numeric String to an int? (solution)

A classical coding interview question based upon String. You need to write a method like atoi() from C/C++, which
takes a numeric String and return its int equivalent. For example, if you pass "67263" to the program then it should
return 67263. Make sure your solution is robust i.e. it should be able to handle + and - character, null and empty
String, integer overflow and other corner cases. Bonus points if you come up with good unit test cases. By the way,
if your interviewer doesn't mention to you about atoi() then you can also use Java API's parseInt() or valueOf()
method to solve this problem.
 */

public class IntStrtoInt {
    public static void main(String args[]) {
        String s = "";

        System.out.println(atoi(s));

        String s1 = "java is great";

        System.out.println(s1.replaceAll("\\s", "%20"));
    }

    static int atoi(String s) {
        if(s !=null && s!="") {
            return Integer.parseInt(s);
        }
        return 0;
    }
}

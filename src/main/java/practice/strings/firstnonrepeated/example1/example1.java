package practice.strings.firstnonrepeated.example1;

public class example1 {

    public static void main(String args[]) {
        String s = "geeqksfodgeeksfo";

        StringUtil su = new StringUtil();

        char result = su.firstNonRepeatedChar(s);

        if(result != '\u0000')
            System.out.printf("the first non repeating char is %c", result);
        else
            System.out.println("all characters are repeating");
    }

}

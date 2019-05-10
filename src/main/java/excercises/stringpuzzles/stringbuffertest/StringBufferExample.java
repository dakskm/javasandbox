package excercises.stringpuzzles.stringbuffertest;

public class StringBufferExample {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Dakshinmurthy");

        sb.setLength(20);

        for(int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }
}

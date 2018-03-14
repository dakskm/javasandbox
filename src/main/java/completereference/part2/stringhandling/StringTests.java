package completereference.part2.stringhandling;

public class StringTests {
    public static void main(String args[]) {
        System.out.println("class starts here");

        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars, 2, 3);
        System.out.println("new string value: " + s);

        byte bytes[] = s.getBytes();

        for (int i = 0; i < bytes.length; i++)
            System.out.println("byte: " + bytes[i]);
    }
}

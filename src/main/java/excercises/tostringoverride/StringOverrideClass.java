package excercises.tostringoverride;

public class StringOverrideClass {
    public static void main(String args[]) {
        Box b = new Box(23.399, 39.2787, 384.3939);
        String str = "Box: " + b;

        System.out.println(b);
        System.out.println(str);
    }
}
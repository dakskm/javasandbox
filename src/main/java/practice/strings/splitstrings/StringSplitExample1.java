package practice.strings.splitstrings;

public class StringSplitExample1 {
    public static void main(String args[]) {
        String str = "eehyderabad ki kalisosthaaru ee silicon speeduki tadabatataaru vassa vasss";

        String strs[] = str.split("s+", 0);
        display(strs);
    }

    static void display(String[] strs) {
        for(String str: strs)
            System.out.println("str -> " + str);
    }
}

package practice.strings.swapping;

public class StringSwapping {
    public static void main(String args[]) {
        String daks = "Dakshin";
        String sow = "Sowjanya";

        System.out.println(daks);
        System.out.println(sow);

        daks = (sow + daks);
        sow = daks.substring(sow.length(), daks.length());
        daks = daks.substring(0, daks.length() - sow.length());

        System.out.println("daks: " + daks);
        System.out.println("sow: " + sow);
    }
}

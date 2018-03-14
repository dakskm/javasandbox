package excercises.anagram;

public class AnagramTest {
    public static void main(String args[]) {
        String sourceStr = "GeeksForGeeks";
        String targetStr = "forgeeksgeeks";

        anagramChecker(sourceStr, targetStr);
    }

    public static void anagramChecker(String sourceStr, String targetStr) {
        byte sourceStrBytes[] = sourceStr.replaceAll("\\s", "").toLowerCase().getBytes();
        byte targetStrBytes[] = targetStr.replaceAll("\\s", "").toLowerCase().getBytes();

        byte temp = 0;

        String curatedSourceStr = curatedString(sourceStrBytes);

        System.out.println("string: " + curatedSourceStr);

        String curatedTargetStr = curatedString(targetStrBytes);

        System.out.println("string: " + curatedTargetStr);

        if(curatedSourceStr.equals(curatedTargetStr)) {
            System.out.println("strings are anagrams");
        } else {
            System.out.println("strings aren't anagrams");
        }
    }

    public static String curatedString(byte[] strBytes) {
        byte temp = 0;

        for (int i = 0; i < strBytes.length - 1; i++) {
            for (int j = i + 1; j < strBytes.length - 1; j++) {
                if (strBytes[i] > strBytes[j]) {
                    temp = strBytes[i];
                    strBytes[i] = strBytes[j];
                    strBytes[j] = temp;
                }
            }
        }
        return new String(strBytes);
    }
}

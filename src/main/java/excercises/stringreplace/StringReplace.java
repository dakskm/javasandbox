package excercises.stringreplace;

public class StringReplace {
    public static void main(String args[]) {
//        String result1 = replaceLoop("Dakshinamurthy", 'a');
//
//        System.out.println("result1: " + result1);
//
//        String result2 = replaceRecursion("Dakshinamurthy", 'a');
//
//        System.out.println("result2: " + result2);
//
//        String result3 = "Dakshinamurthy".replaceAll("a", "");
//
//        System.out.println("result3: " + result3);

        char charToReplace = 'a';

        String str1 = new String(Character.toString(charToReplace));

        String result4 = "Dakshinamurthy".replace(str1, "");

        System.out.println("result4: " + result4);

    }

    public static String replaceLoop(String inputStr, char charToReplace) {
        char chars[] = inputStr.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char i: chars) {
            if (i != charToReplace)
                stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }

    public static String replaceRecursion(String inputStr, char charToReplace) {
        char chars[] = inputStr.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();

        replace(chars, charToReplace, 0, stringBuffer);

        return stringBuffer.toString();
    }

    public static void replace(char[] inputChars, char charToReplace, int index, StringBuffer stringBuffer) {

        if (index < inputChars.length) {
            if (inputChars[index] != charToReplace) {
                stringBuffer.append(inputChars[index]);
            }
            replace(inputChars, charToReplace, index + 1, stringBuffer);
        }
    }

}

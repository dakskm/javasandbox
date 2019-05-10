package corejava.lesson3.strings;

public class StringExamples {
    public static void main(String[] args) {

        //code points
        int[] codePointsArr = "Dakshinamurthy".codePoints().toArray();
        for(int i = 0; i < codePointsArr.length; i++) {
        System.out.println(codePointsArr[i]);
        }

        //ascii chars
        String str = "Java\u2122";
        System.out.println(str);

        String str1 = "ƒƒƒ©©∆˚¬µ∫ƒ∂ß®´´†¥¨ˆˆπ¬˚µ˜˜√ç≈";
        for(int i = 0; i< str1.length();i++)
            System.out.println(str1.charAt(i));

        int[] codePointsStr1 = str1.codePoints().toArray();
        for(int i = 0; i< codePointsStr1.length;i++)
            System.out.println(codePointsStr1[i]);

        String str2 = "\u2324" + "\u5689";
        System.out.println(str2);
    }
}

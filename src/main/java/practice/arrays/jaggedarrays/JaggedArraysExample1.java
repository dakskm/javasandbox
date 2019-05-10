package practice.arrays.jaggedarrays;

public class JaggedArraysExample1 {
    public static void main(String args[]) {
        int[][] multArr = new int[4][];

        for (int i = 0; i < multArr.length; i++)
            multArr[i] = new int[i + 1];

        int k = 0;
        for (int i = 0; i < multArr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                multArr[i][j] = k;
                k++;
            }
        }

        int noOfTabs = multArr.length;
        for (int i = 0; i < multArr.length; i++) {
            String tabsString = getTabs(noOfTabs);
            System.out.println(tabsString);
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  " + multArr[i][j]);
            }
            System.out.println();
            noOfTabs--;
        }
    }

    static String getTabs(int noOfTabs) {
        String tabsString = "";

        for (int i = 0; i < noOfTabs; i++)
            tabsString = tabsString + "\t";

        return tabsString;
    }
}

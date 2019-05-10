package library.stringmethods;

public class StringMethodsTest {
    public static void main(String args[]) {
        int[][] magicSquare1 =
                {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8}
                };

        int[][] magicSquare =
                {
                        {2, 7, 12, 13},
                        {16, 9, 6, 3},
                        {5, 4, 15, 10},
                        {11, 14, 1, 8}
                };

        Boolean finalResult = true;

        int squareLength = magicSquare.length;

        for (int i = 0; i < squareLength; i++) {
            if (magicSquare[i].length != squareLength) {
                finalResult &= false;
            }
        }

        if (finalResult == true) {
            System.out.println("Square rows and columns counts are equal");

            int[] rowTotal = new int[squareLength];
            int[] columnTotal = new int[squareLength];

            for (int i = 0; i < squareLength; i++) {
                for (int j = 0; j < squareLength; j++) {
                    rowTotal[i] += magicSquare[i][j];
                    columnTotal[i] += magicSquare[j][i];
                }
            }

            int sum = rowTotal[0];

            for (int i = 0; i < squareLength; i++) {
                if (rowTotal[i] != sum && columnTotal[i] != sum)
                    finalResult &= false;
            }

            int leftDiagnol = 0;
            int rightDiagnol = 0;

            for (int i = 0; i < squareLength; i++) {
                for (int j = 0; j < squareLength; j++) {
                    if (i == j)
                        leftDiagnol += magicSquare[i][j];
                }
            }

            for (int i = 0, j = squareLength - 1; i < squareLength; i++, j--) {
                rightDiagnol += magicSquare[i][j];
            }

            if (leftDiagnol != sum && rightDiagnol != sum) {
                finalResult &= false;
            }

            if (finalResult != true) {
                System.out.println("Square isn't magic");
            } else {
                System.out.println("Square is magic");
            }

        } else {
            System.out.println("Square rows and columns counts aren't equal");
            System.out.println("Square isn't magic");
        }
    }
}

package w3resource;

public class AmericanFlag {
    public static void main(String args[]) {
        final int STAR_ROWS = 9;
        final int STAR_COLUMNS = 10;

        for (int i = 0; i < STAR_ROWS; i++) {
            if ((i % 2) == 0) {
                for (int j = 0; j < STAR_COLUMNS; j += 2)
                    System.out.print("*\t\t");
            } else {
                for (int j = 0; j < STAR_COLUMNS - 2; j++)
                    System.out.print("\t*");
            }
            System.out.println("");
        }

    }
}

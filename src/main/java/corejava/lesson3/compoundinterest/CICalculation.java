package corejava.lesson3.compoundinterest;

public class CICalculation {
    public static void main(String args[]) {
        final int INTEREST_RATE = 8;
        final int NUMBER_OF_YEARS = 10;
        final int START_AMOUNT = 10000;

        double balance = START_AMOUNT;
        String output;

        for (int i = 0; i < NUMBER_OF_YEARS; i++) {
            balance = balance * (INTEREST_RATE + 100) / 100;
            output = String.format("%2d-year balance %.2f", i + 1, balance);
            System.out.println(output);
        }
    }
}

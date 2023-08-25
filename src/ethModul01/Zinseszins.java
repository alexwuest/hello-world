package ethModul01;

import java.util.Scanner;

public class Zinseszins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User enters amount and it will be stored in variable
        System.out.println("Please enter the amount:");
        int amount = input.nextInt();

        // User enters interest in % and it will be stored in variable
        System.out.println("Please enter the interest in %:");
        float interest = input.nextFloat();

        // For preparing and deklare some variables
        double balance = (float) amount;
        double interestAmountYear;

        for (int i = 1; i < 11; i++) {
            interestAmountYear = balance / 100 * interest;
            interestAmountYear = Math.round(interestAmountYear * 100) / 100.00;     // rounding on two digits
            balance = balance + interestAmountYear;
            balance = Math.round(balance * 100) / 100.00;                           // rounding on two digits
            System.out.println("Im " + i + ". Jahr gibt es " + interestAmountYear + " Fr. Zins. Neuer Kontostand: " + balance + "Fr.");
        }
    }
}

package ethModul01;

import java.util.Scanner;

public class Cashmachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Definition of smallest amount that can be paid out
        int amountMin = 10;

        // Definition of max. balance
        double balance = 3879.95;

        // Deklaration of variables
        int withdrawChoice;
        int withdraw = 0;

        // User enters amount and it will be stored in variable
        System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
        System.out.println("****************************************");
        System.out.println("Ihr aktuelles Saldo lautet: " + balance + "CHF");
        System.out.print("Wie viel möchten Sie abheben? ");
        int amount = input.nextInt();
        System.out.println("Eingegebener Geldbetrag: " + amount);

        // Check if the entered amount can be paid out if not ask customer if higher or lower amount should be paid out
        if (amount % amountMin != 0) {
            int amountDiff = amount % 10;
            System.out.println("Leider ist die gewünschte Auszahlung nicht möglich!");
            if (amount < amountMin) {
                System.out.println("Der minimale Betrag, welcher ausgezahlt werden kann ist: " + amountMin + "CHF. Wollen Sie diesen beziehen (1) ?");
                withdrawChoice = input.nextInt();
                if (withdrawChoice == 1) {
                    withdraw = amountMin;
                }
            } else {
                System.out.println("Wollen Sie stattdessen " + (amount - amountDiff) + " CHF (1) oder " + (amount + amountMin - amountDiff) + "CHF (2) abheben?");
                withdrawChoice = input.nextInt();
                if (withdrawChoice == 1) {
                    withdraw = amount - amountDiff;
                } else if (withdrawChoice == 2) {
                    withdraw = amount + amountMin - amountDiff;
                }
            }
        } else {
            withdraw = amount;
        }

        // If user made wrong input there is now withdraw saved. It will stop the programm!
        if (withdraw == 0) {
            System.out.println("Fehleingabe. Abbruch!");
            System.exit(0);
        }

        // If the actual balance is not high enough.
        if (withdraw > balance) {
            System.out.println("Der eingegebene Betrag übersteigt das aktuelle Guthaben.");
            System.exit(0);
        }

        // If user made correct input the programm will calculate the withdrawl
        else {
            System.out.println("Der Betrag " + withdraw + "CHF, wird ausbezahlt.");
            int note100 = withdraw / 100;
            int withdrawTemp = withdraw % 100;
            int note50 = withdrawTemp / 50;
            withdrawTemp = withdrawTemp % 50;
            int note20 = withdrawTemp / 20;
            withdrawTemp = withdrawTemp % 20;
            int note10 = withdrawTemp / 10;
            if (note100 > 0) {
                System.out.println(note100 + "x 100CHF Note, Total CHF " + note100 * 100);
            }
            if (note50 > 0) {
                System.out.println(note50 + "x 50HF Note, Total CHF " + note50 * 50);
            }
            if (note20 > 0) {
                System.out.println(note20 + "x 20CHF Note, Total CHF " + note20 * 20);
            }
            if (note10 > 0) {
                System.out.println(note10 + "x 10CHF Note, Total CHF " + note10 * 10);
            }

            balance = balance - withdraw;
            balance = Math.round(balance * 100) / 100.00;     // rounding on two digits
            System.out.println("****************************************");
            System.out.println("Neuer Kontostand: " + balance + " CHF");
            System.out.println("Wir freuen uns auf Ihren nächsten Besuch!");
            System.out.println("****************************************");
        }
    }
}

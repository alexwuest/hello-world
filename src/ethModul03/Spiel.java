package ethModul03;

import java.util.Scanner;

public class Spiel {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int[] karten = new int[6];
        int summe = 0;

        // User input for array size
        System.out.print("Bitte geben Sie die Grösse des Arrays ein : ");
        int arraySize = eingabe.nextInt();

        // User input in array
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Bitte geben Sie den Eintrag " + (i + 1) + " ein: ");
            karten[i] = eingabe.nextInt();
        }

        // Output of the array
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Dies ist Wert " + (i + 1) + ": " + karten[i]);
        }

        // Sum of all entries - Of course could be combined with the for above!
        for (int i = 0; i < arraySize; i++) {
            summe = summe + karten[i];
        }
        System.out.println("Die Summe aller Karten ist: " + summe);
    }
}

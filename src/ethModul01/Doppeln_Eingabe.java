package ethModul01;

//Import Scanner für Benutzereingabe

import java.util.Scanner;

public class Doppeln_Eingabe {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        //Initialisierung der Variablen als long
        long zahl;
        long doppelte_zahl;

        //Eingabe durch Benutzer des zu errechnenden Werts
        System.out.println("Bitte geben Sie den Wert ein, welcher verdoppelt werden soll:");

        //Berechnung des doppelten Werts
        zahl = eingabe.nextLong();
        doppelte_zahl = zahl * 2;

        //Ausgabe des Werts
        System.out.println("Die Eingabe lautete: " + zahl);
        System.out.println("Der errechnete Wert lautet: " + doppelte_zahl);
    }
}

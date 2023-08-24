package ethModul01;

//Import Scanner für Benutzereingabe

import java.util.Scanner;

public class Doppeln_Eingabe {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        //Deklaration der Variablen als int
        int zahl;
        int doppelte_zahl;
        System.out.println("Bitte geben Sie den Wert ein, welcher verdoppelt werden soll:");
        zahl = eingabe.nextInt();
        doppelte_zahl = zahl * 2;
        System.out.println("Die Eingabe lautete: " + zahl);
        System.out.println("Der errechnete Wert lautet: " + doppelte_zahl);
    }
}

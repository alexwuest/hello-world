package ethModul01;

import java.util.Scanner;

public class Bremsweg_Berechnung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // Deklarieren der Variablen
        float geschwindigkeit;
        float reaktionsweg;
        float bremsweg;
        float anhalteweg;

        // Eingabe der Geschwindigkeit durch Benutzer
        System.out.println("Bitte geben Sie die Geschwindigkeit in km/h ein:");
        geschwindigkeit = eingabe.nextInt();

        // Berechnung von Reaktionsweg
        reaktionsweg = geschwindigkeit / 10 * 3;

        // Berechnung von Bremsweg
        bremsweg = (geschwindigkeit / 10) * (geschwindigkeit / 10);

        // Brechnung von Anhalteweg
        anhalteweg = reaktionsweg + bremsweg;

        // Ausgabe der Resultate
        System.out.println("Der Anhalteweg beträgt " + anhalteweg + "m");
        System.out.println("Dieser setzt sich zusammen aus " + reaktionsweg + "m Reaktionsweg und " + bremsweg + "m Anhalteweg");
    }
}

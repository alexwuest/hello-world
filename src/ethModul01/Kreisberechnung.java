package ethModul01;

import java.util.Scanner;

public class Kreisberechnung {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // Deklarierung der Variablen
        double radius;
        double umfang;
        double flaeche;
        final double PI;
        PI = 3.14159265359;

        // Radius Eingabe durch Benutzer
        System.out.println("Bitte geben Sie den Radius des Kreises ein:");
        radius = eingabe.nextDouble();

        // Berechnung der Kreisfläche A = radius * radius * PI
        // Berechnung des Kreisumfangs U = 2 * r * PI
        flaeche = radius * radius * PI;
        umfang = 2.0 * radius * PI;

        // Werte auf 2 Kommastellen runden
        flaeche = Math.round(flaeche * 100) / 100.0;
        umfang = Math.round(umfang * 100) / 100.0;

        // Ausgabe des Werts
        System.out.println("Die Fläche des Kreises ist " + flaeche + " der Umfang des Kreises ist " + umfang);
    }
}


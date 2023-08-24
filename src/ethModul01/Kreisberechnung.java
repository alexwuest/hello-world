package ethModul01;

import java.util.Scanner;

public class Kreisberechnung {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        //Deklarierung der Variablen
        double radius;
        double umfang;
        double flaeche;
        final double pi;
        pi = 3.14159265359;

        //Radius Eingabe durch Benutzer
        System.out.println("Bitte geben Sie den Radius des Kreises ein:");
        radius = eingabe.nextDouble();

        //Berechnung der Kreisfläche A = radius * radius * pi
        //Berechnung des Kreisumfangs U = 2 * r * pi
        flaeche = radius * radius * pi;
        umfang = 2 * radius * pi;

        //Werte auf 2 Kommastellen runden
        flaeche = Math.round(flaeche * 100) / 100.0;
        umfang = Math.round(umfang * 100) / 100.0;

        //Ausgabe des Werts
        System.out.println("Die Fläche des Kreises ist " + flaeche + " der Umfang des Kreises ist " + umfang);
    }
}


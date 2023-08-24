package ethModul01;

import java.util.Scanner;

public class Dechiffre {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        // Ceasar-Entschlüsselung für ein beliegiges Zeichen
        // Deklarieren Variablen
        String zeichen;
        int chiff_schluessel;
        char buchstabe;
        int buchstabe_ascii;
        int buchstabe_ascii_chiff;
        char buchstabe_chiff;

        // Die beiden Eingaben durch den Benutzer
        System.out.println("Geben Sie ein verschlüsseltes Zeichen ein!");
        zeichen = eingabe.next();

        System.out.println("Geben Sie einen Schlüssel ein!");
        chiff_schluessel = eingabe.nextInt();

        // Ausgabe der Eingabe
        System.out.println("Sie haben " + zeichen + " und " + chiff_schluessel + " eingegeben");

        // String in char umwandeln und nur 1 Zeichen verwenden.
        buchstabe = zeichen.charAt(0);

        // Buchstabe in ASCII Ordnungszahl umwandeln
        buchstabe_ascii = (int) buchstabe;

        // Buchstabe um Chiffrierschlüssel verschieben durch Addition
        buchstabe_ascii_chiff = buchstabe_ascii + chiff_schluessel;

        // Buchstabe_ascii_chiffriert umwandeln in ASCII Zeichen und Ausgabe
        buchstabe_chiff = (char) buchstabe_ascii_chiff;
        System.out.println("Das entschlüsselte Zeichen ist: " + buchstabe_chiff);

    }
}

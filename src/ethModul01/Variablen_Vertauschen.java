package ethModul01;

import java.util.Scanner;

public class Variablen_Vertauschen {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        // Deklarieren Variablen
        String name1;
        String name1_temp;
        String name2;

        // Die beiden Namen durch Benutzer eingeben lassen
        System.out.println("Bitte den ersten Namen eingeben:");
        name1 = eingabe.next();

        System.out.println("Bitte den zweiten Namen eingeben:");
        name2 = eingabe.next();

        System.out.println("Die eingegebenen Namen lauten " + name1 + " und " + name2);

        // Ab hier werden die Variablen Inhalte name1 und name2 getauscht, damit dabei nicht ein Wert gelöscht wird
        // muss eine Hilsvariable hier name1_temp verwendet werden.
        name1_temp = name1;
        name1 = name2;
        name2 = name1_temp;
        System.out.println("Nach dem Wechsel lauten die Namen " + name1 + " und " + name2);
    }
}

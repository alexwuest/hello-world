package ethModul03;
import java.util.Scanner;
public class BossPuzzle {
    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);
        char [][] spielfeld = new char [3][3];
        spielfeld[0][0] = '3';
        spielfeld[0][1] = '4';
        spielfeld[0][2] = ' ';
        spielfeld[1][0] = '7';
        spielfeld[1][1] = '8';
        spielfeld[1][2] = '5';
        spielfeld[2][0] = '2';
        spielfeld[2][1] = '1';
        spielfeld[2][2] = '6';

        // Going trough the array
        System.out.println("S   1 2 3");
        System.out.println("Z -------");
        for (int i = 0; i < 3; i++){
            System.out.print(i+1 + " | ");
            for (int j = 0; j < 3; j++){
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
        int zug_zeile = 0;
        int leer_zeile = 0;
        int leer_spalte = 2;

        while (zug_zeile != 9){
            // Ask player for move
            System.out.println("Welches Feld möchten Sie verschieben?");
            System.out.print("Zeile (9 für Abbruch): ");
            zug_zeile = eingabe.nextInt();
            System.out.print("Spalte: ");
            int zug_spalte = eingabe.nextInt();

            // Perform move
            spielfeld[leer_zeile][leer_spalte] = spielfeld[zug_zeile - 1][zug_spalte - 1];
            spielfeld[zug_zeile - 1][zug_spalte - 1] = ' ';

            leer_zeile = --zug_zeile;
            leer_spalte = --zug_spalte; // zug_spalte - 1 funktioniert nicht auch nicht in () !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            // The new playground after move
            System.out.println("S   1 2 3");
            System.out.println("Z -------");
            for (int i = 0; i < 3; i++){
                System.out.print(i+1 + " | ");
                for (int j = 0; j < 3; j++){
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Leere Zeile: " + (leer_zeile + 1));
            System.out.println("Leere Spalte: " + (leer_spalte + 1));
            System.out.println("Zug Zeile: " + zug_zeile);
            System.out.println("Zug Spalte: " + zug_spalte);
        }
    }
}

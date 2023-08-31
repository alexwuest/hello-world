package ethModul03;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        char spielbrett[][] = new char[3][3];
        int player = 1;

        // Start playground empty
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spielbrett[i][j] = ' ';
            }
        }
        // Print playground
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(spielbrett[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();
        int zug_zeile = 0;
        int zug_spalte = 0;
        // Players entries
        System.out.println("Das Spiel beginnt:");
        while (zug_zeile != 9) {
            // Stop faulty move by player
            boolean faultyMove = true;
            while (faultyMove == true) {
                System.out.println("Spieler " + player);
                System.out.print("Zeile (Abbruch 9): ");
                zug_zeile = eingabe.nextInt();
                System.out.print("Spalte: ");
                zug_spalte = eingabe.nextInt();
                // Check if entry is outside of the playground
                if (zug_zeile < 0 || zug_zeile > 3) {
                    System.out.println("Spieleingabe ausserhalb Spielfeld! Erneute Eingabe");
                }
                // If entry is inside the playground check if field already played
                else {
                    if (spielbrett[(zug_zeile - 1)][(zug_spalte - 1)] != ' ') {
                        System.out.println("Auf dem Feld ist schon ein Zeichen! Erneute Eingabe");
                    } else {
                        faultyMove = false;
                    }
                }
            }
            // Check which player is playing, write correct sign and switch player
            if (player == 1) {
                spielbrett[zug_zeile - 1][zug_spalte - 1] = 'X';
                player = 2;
            } else {
                spielbrett[zug_zeile - 1][zug_spalte - 1] = 'O';
                player = 1;
            }
            // Print new playground
            System.out.println("  1   2   3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + ":");
                for (int j = 0; j < 3; j++) {
                    System.out.print(spielbrett[i][j]);
                    System.out.print(" | ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

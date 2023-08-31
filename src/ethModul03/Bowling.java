package ethModul03;
import java.util.Scanner;
public class Bowling {
    public static void main(String[] args){
        Scanner eingabe = new Scanner(System.in);
        // Pregame inputs
        System.out.print("Bitte Anzahl Spieler eingeben: ");
        int players = eingabe.nextInt();
        System.out.print("Bitte Anzahl Runden eingeben: ");
        int rounds = eingabe.nextInt();

        // Declare all variables
        int resultate[][] = new int [rounds][players];
        int resultatePlayer[] = new int [players];
        int strikesPlayer[] = new int [players];
        int zeroPlayer[] = new int [players];

        // Input of results
        for (int i = 0; i < rounds; i++){
            System.out.println((i+1) + ". Runde");
            for (int j = 0; j < players; j++){
                System.out.print("Resultat Spieler " + (j+1) + ": ");
                int eingabe_temp = eingabe.nextInt();

                // Check if input is 0-10
                while (eingabe_temp > 0 && eingabe_temp > 10){
                    System.out.print("Wert zwischen 0 - 10 eingeben. Korrekter Wert für Spieler " + (j+1) + ":");
                    eingabe_temp = eingabe.nextInt();
                }
                // Chef if strike
                if (eingabe_temp == 10){
                    strikesPlayer[j] = +1;
                }
                // Chef if 0 pins
                else if (eingabe_temp == 0) {
                    zeroPlayer[j] = +1;
                }
                // Write results
                resultate[i][j] = eingabe_temp;
                resultatePlayer[j] = eingabe_temp + resultatePlayer[j];
            }
        }
        // Output of results
        System.out.println("_______________________________");
        System.out.println("             Spieler");
        System.out.print("            ");
        for (int i = 0; i < players; i++){
            System.out.print((i+1) + "   ");
        }
        System.out.println();
        System.out.println("_______________________________");
        for (int i = 0; i < rounds; i++){
            System.out.print((i+1) + ". Runde ");
            for (int j = 0; j < players; j++){
                System.out.print("   " + resultate[i][j]);
            }
            System.out.println();
        }
        System.out.println("_______________________________");
        System.out.print("Summe:   ");
        for (int j = 0; j < players; j++){
            System.out.print("  " + resultatePlayer[j]);
        }
        System.out.println();
        System.out.print("Strikes: ");
        for (int j = 0; j < players; j++){
            System.out.print("   " + strikesPlayer[j]);
        }
        System.out.println();
        System.out.print("Zero:    ");
        for (int j = 0; j < players; j++){
            System.out.print("   " + zeroPlayer[j]);
        }
        System.out.println();
        System.out.println("_______________________________");
    }
}

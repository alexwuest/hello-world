package ethModul03;

public class ArrayArray {
    public static void main(String[] args){
        char [][] meinArray = new char [5][5];
        /* Letter Z
        meinArray[0][0] = 'X';
        meinArray[0][1] = 'X';
        meinArray[0][2] = 'X';
        meinArray[0][3] = 'X';
        meinArray[0][4] = 'X';
        meinArray[1][0] = ' ';
        meinArray[1][1] = ' ';
        meinArray[1][2] = ' ';
        meinArray[1][3] = 'X';
        meinArray[1][4] = ' ';
        meinArray[2][0] = ' ';
        meinArray[2][1] = ' ';
        meinArray[2][2] = 'X';
        meinArray[2][3] = ' ';
        meinArray[2][4] = ' ';
        meinArray[3][0] = ' ';
        meinArray[3][1] = 'X';
        meinArray[3][2] = ' ';
        meinArray[3][3] = ' ';
        meinArray[3][4] = ' ';
        meinArray[4][0] = 'X';
        meinArray[4][1] = 'X';
        meinArray[4][2] = 'X';
        meinArray[4][3] = 'X';
        meinArray[4][4] = 'X';
        */

        // Letter A
        meinArray[0][0] = ' ';
        meinArray[0][1] = ' ';
        meinArray[0][2] = 'X';
        meinArray[0][3] = ' ';
        meinArray[0][4] = ' ';
        meinArray[1][0] = ' ';
        meinArray[1][1] = 'X';
        meinArray[1][2] = ' ';
        meinArray[1][3] = 'X';
        meinArray[1][4] = ' ';
        meinArray[2][0] = 'X';
        meinArray[2][1] = 'X';
        meinArray[2][2] = 'X';
        meinArray[2][3] = 'X';
        meinArray[2][4] = 'X';
        meinArray[3][0] = 'X';
        meinArray[3][1] = ' ';
        meinArray[3][2] = ' ';
        meinArray[3][3] = ' ';
        meinArray[3][4] = 'X';
        meinArray[4][0] = 'X';
        meinArray[4][1] = ' ';
        meinArray[4][2] = ' ';
        meinArray[4][3] = ' ';
        meinArray[4][4] = 'X';

        // Going trough the array
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(meinArray[i][j]);
            }
            System.out.println("");
        }




    }
}

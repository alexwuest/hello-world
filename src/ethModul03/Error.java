package ethModul03;

public class Error {
    public static void main(String[] args) {
        // Signatur mit einem Parameter
        public static void linie(int x) {
            for (int i = 0; i < x; i++) {
                System.out.print('-');
            }
        }
// Signatur mit zwei Parametern
        public static void linie(int x, char c) {
            for (int i = 0; i < x; i++){
                System.out.print(c);
            }
        }
    }
}

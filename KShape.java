public class KShape {
    public static void main(String[] args) {
        int rows = 7;
        char currentChar = 'A';

        // Upper half of the 'K' shape pattern
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (currentChar + j - 1) + " ");
            }
            System.out.println();
        }

        // Lower half of the 'K' shape pattern
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (currentChar + j - 1) + " ");
            }
            System.out.println();
        }
    }
}


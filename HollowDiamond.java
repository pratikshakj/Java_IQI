import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd): ");
        int rows = scanner.nextInt();
        int midRow = (rows + 1) / 2;
        
        for (int i = 1; i <= midRow; i++) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = midRow - 1; i >= 1; i--) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



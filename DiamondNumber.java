import java.util.Scanner;
public class DiamondNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd): ");
        int rows = scanner.nextInt();
        int midRow = (rows + 1) / 2;
        
        // Upper half of the diamond number pattern
        for (int i = 1; i <= midRow; i++) {
            int num = i;
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num);
                if (k < i) {
                    num--;
                } else {
                    num++;
                }
            }
            System.out.println();
        }
        
        // Lower half of the diamond number pattern
        for (int i = midRow - 1; i >= 1; i--) {
            int num = i;
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num);
                if (k < i) {
                    num--;
                } else {
                    num++;
                }
            }
            System.out.println();
        }
    }
}


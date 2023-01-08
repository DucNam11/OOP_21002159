import java.util.Scanner;

public class HillPatternC {
    public static void main(String[] args) {

        int size, row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        size = sc.nextInt();

        for (row = 1; row <= size; row++) {
            for (col = 1; col <= size - row; col++) {
                System.out.print("  ");
            }
            for (col = 1; col <= row * 2 - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (row = size - 1; row > 0; row--) {
            for (col = 1; col <= size - row; col++) {
                System.out.print("  ");
            }
            for (col = 1; col <= row * 2 - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}



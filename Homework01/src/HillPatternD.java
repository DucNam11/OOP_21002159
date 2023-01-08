import java.util.Scanner;

public class HillPatternD {
    public static void main(String[] args) {
        int size, row, colIndex;
        int colBlank = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        size = sc.nextInt();


        for (row = 1; row <= size; row++) {

            if (row == 1) {
                for (colIndex = 1; colIndex <= 2 * size - 1; colIndex++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (colIndex = 1; colIndex <= size - row + 1; colIndex++) {
                    System.out.print("# ");
                }

                for (colIndex = 1; colIndex <= colBlank; colIndex++) {
                    System.out.print("  ");
                }
                for (colIndex = 1; colIndex <= size - row + 1; colIndex++) {
                    System.out.print("# ");
                }
                colBlank += 2;
                System.out.println();
            }

        }

        for (row = size - 1; row >= 1; row--) {
            if (row == 1) {
                for (colIndex = 1; colIndex <= 2 * size - 1; colIndex++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (colIndex = 1; colIndex <= size - row + 1; colIndex++) {
                    System.out.print("# ");
                }

                for (colIndex = 1; colIndex <= colBlank - 4; colIndex++) {
                    System.out.print("  ");
                }
                for (colIndex = 1; colIndex <= size - row + 1; colIndex++) {
                    System.out.print("# ");
                }
                colBlank -= 2;
                System.out.println();

            }
        }
    }
}

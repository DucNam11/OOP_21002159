import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        int numRows, numCol, row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        numRows = sc.nextInt();
        numCol = 2 * numRows - 1;
        for (row = 1; row <= numRows; row++) {
            for (col = 1; col <= numCol; col++) {
                if ((row + col <= 2 * numRows) && (row <= col)) {
                    System.out.print(("# "));
                } else {
                    System.out.print(("  "));
                }
            }
            System.out.println();
        }
    }
}

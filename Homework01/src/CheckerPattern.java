import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        int size, row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = sc.nextInt();
        for (row = 1; row <= size; row++) {
            for (col = 1; col <= size; col++) {
                if (row % 2 == 0) {
                    System.out.print((" #"));
                } else {
                    System.out.print(("# "));
                }
            }
            System.out.println();

        }

    }
}

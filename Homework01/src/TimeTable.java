import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int i = -1; i <= size; i++) {
            if (i == -1) {
                System.out.print("* |");
            } else if (i == 0) {
                System.out.print("----");
            } else if (i > 0) {
                System.out.print(i + " |");
            }

            for (int j = 1; j <= size; j++) {
                if (i == -1) {
                    System.out.printf("%4d", j);
                    continue;
                } else if (i == 0) {
                    System.out.print("----");
                    continue;
                }

                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

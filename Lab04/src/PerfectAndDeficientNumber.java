import java.util.Scanner;

public class PerfectAndDeficientNumber {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        System.out.println("These numbers are perfect:");
        int count1 = 0;
        for (int i = 6; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count1++;
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%c)]", count1, (double) count1 / n * 100, '%');
        System.out.println();
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect:");
        int count2 = 0;
        for (int i = 12; i <= n; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count2++;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%c)]", count2, (double) count2 / n * 100, '%');
    }
}

import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        System.out.println("These numbers are equal to the product of prime factors:");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%c)]", count, (double) count / n * 100, '%');
    }
}

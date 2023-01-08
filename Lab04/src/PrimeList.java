import java.util.Scanner;

public class PrimeList {

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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int n = in.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("[%d primes found (%.2f%c)]", count, (double) count / n * 100, '%');
    }
}

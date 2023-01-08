import java.util.Scanner;

public class SpecialSeries {
    public static double calculateTerm(double x, int numTerms) {
        double term = 1.0;
        for (int i = 1; i < numTerms; i++) {
            if (i % 2 != 0) {
                term *= i;
            } else {
                term /= i;
            }
        }
        return term * Math.pow(x, numTerms) / numTerms;
    }

    public static double specialSeries(double x, int numTerms) {
        double result = 0.0;
        for (int i = 0; i < numTerms; i++) {
            result += calculateTerm(x, (2 * i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x;

        while (true) {
            x = in.nextDouble();
            if (x < -1 || x > 1) System.out.print("x not in (-1,1), please enter x again: ");
            else break;
        }

        System.out.print("Enter the number of terms: ");
        int numTerms = in.nextInt();

        System.out.println("The sum of the series is: " + specialSeries(x, numTerms));
    }
}

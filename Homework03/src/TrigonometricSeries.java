public class TrigonometricSeries {
    public static double calculateTerm(double x, int numTerms) {
        double term = 1;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    public static double sin(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 != 0 ? -1 : 1) * calculateTerm(x, (2 * i + 1));
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, 2 * i);
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 0;
        int numTerms = 20;

        System.out.println("Calculated values:");
        System.out.printf("sin(%d) = %f \n", (int) Math.round(x * 180 / Math.PI), sin(x, numTerms));
        System.out.printf("cos(%d) = %f \n", (int) Math.round(x * 180 / Math.PI), cos(x, numTerms));

        System.out.println("java.lang.Math values:");
        System.out.printf("sin(%d) = %f \n", (int) Math.round(x * 180 / Math.PI), Math.sin(x));
        System.out.printf("cos(%d) = %f \n", (int) Math.round(x * 180 / Math.PI), Math.cos(x));
    }
}

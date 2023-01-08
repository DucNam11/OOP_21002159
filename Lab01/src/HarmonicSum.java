public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 50000;

        double sumL2R = 0.0;
        double sumR2l = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= MAXDENOMINATOR; ++denominator) {
            sumL2R += 1 / (double) denominator;
        }
        System.out.println("The sum from left-to-right is:" + sumL2R);

        for (int denominator = MAXDENOMINATOR; denominator >= 1; --denominator) {
            sumR2l += 1 / (double) denominator;
        }
        System.out.println("The sum from right-to-left is:" + sumR2l);

        if (sumL2R > sumR2l) {
            absDiff = sumL2R - sumR2l;
        } else {
            absDiff = sumR2l - sumL2R;
        }
        System.out.println("The absolute difference is: " + absDiff);
    }
}

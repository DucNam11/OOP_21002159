package excercise1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder
                describe = new StringBuilder();
        for (int i = coeffs.length-1; i >= 0; i--) {

            describe.append(coeffs[i] + (i != 0 ? "*x^"+i+" + ":""));
        }
        return describe.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial result = this;
        if (result.getDegree() < right.getDegree()) {
            result  = right;
            right = this;
        }

        double[] resultCoeffs  = result.coeffs;
        double[] rightCoeffs = right.coeffs;
        for (int i = 0; i < resultCoeffs.length; i++)
        {
            if (i > rightCoeffs.length-1) {
                continue;
            }
            resultCoeffs[i] += rightCoeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] resultCoeffs  = new double[this.getDegree() + right.getDegree()+1];
        double[] rightCoeffs = right.coeffs;
        for (int i =0; i < resultCoeffs.length; i++)
        {
            double tmp = 0.0;
            for (int j = 0; j <= i; j++)
            {
                if (j > coeffs.length-1) {
                    continue;
                }
                if (i-j > rightCoeffs.length-1) {
                    continue;
                }
                tmp += coeffs[j] * rightCoeffs[i-j];
            }
            resultCoeffs[i] = tmp;
        }
        return new MyPolynomial(resultCoeffs);
    }
}

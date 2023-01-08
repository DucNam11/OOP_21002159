package excercise1_8;
public class TestPolynomial {
    public static void main(String[] args) {
        //declare poly1
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        //declare poly2
        double coeffs[] = {1.1, 3.3, 5.5, 7.7};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);
        //test
        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println();
        System.out.println("Polynomial 1 : " + polynomial1.toString());
        System.out.println("Polynomial 2 : " + polynomial2.toString());
        System.out.println();
        System.out.println( polynomial1.toString() + " = " + polynomial1.evaluate(4));
        System.out.println();
        System.out.println(polynomial2.add(polynomial1));
        System.out.println();
        System.out.println(polynomial2.multiply(polynomial1));
    }
}
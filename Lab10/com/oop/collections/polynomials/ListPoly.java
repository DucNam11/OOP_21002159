package com.oop.collections.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double i : coeffs) {
            coefficients.add(i);
        }
    }

    public int degree() {
        return coefficients.size() - 1;
    }

    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    public double[] coefficients() {
        double[] poly = new double[coefficients.size()];
        for (int i = 0; i <= poly.length; i++) {
            poly[i] = coefficient(i);
        }
        return poly;
    }
}

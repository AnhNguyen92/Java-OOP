package main.java.moreExerciesOnClasses.Lab3_2;

public class TestMyPolynomial {

	public static void main(String[] args) {
		// Test program
		// Can invoke with a variable number of arguments
		MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		System.out.println(polynomial1.toString());
		System.out.println(polynomial2);
		// Can also invoke with an array
		double[] coeffs = new double[] { 1.2, 3.4, 5.6, 7.8 };
		MyPolynomial p1 = new MyPolynomial(coeffs);
		System.out.println(p1);
		
		MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial p3 = new MyPolynomial(1.1, 2.2);
		
		System.out.println(p2.add(p3));
		System.out.println(p2.multiply(p3));
	}
}

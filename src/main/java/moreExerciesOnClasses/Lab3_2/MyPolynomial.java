package main.java.moreExerciesOnClasses.Lab3_2;

import java.util.Arrays;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		super();
		this.coeffs = coeffs;
	}

	public int getDegree() {
		return coeffs.length - 1;
	}
	
	public double evaluate(double x) {
		double evaluate = 0.0;
		for (int i = 0; i < coeffs.length; i++) {
			evaluate += coeffs[i] * Math.pow(x, i);
		}
		
		return evaluate;
	}
	
	public MyPolynomial add(MyPolynomial right) {
		int maxDegree = Math.max(this.getDegree(), right.getDegree());
		double[] coeffsResult = new double[maxDegree];
		
//		for (int i = 0; i < coeffs.length; i++) {
//			coeffsResult[i] = coeffs[i];
//		}
		coeffsResult = Arrays.copyOf(coeffs, coeffs.length);
		
		for (int i = 0; i < right.coeffs.length; i++) {
			coeffsResult[i] += right.coeffs[i];
		}
		this.coeffs = coeffsResult;
		
		return this;
	}
	
	public MyPolynomial multiply(MyPolynomial right) {
		int maxDegree = this.coeffs.length + right.coeffs.length;
		double[] coeffsResult = new double[maxDegree];
		for (int i = 0; i < coeffsResult.length; i++) {
			coeffsResult[i] = 0.0;
		}
		
		for (int i = 0; i < this.getDegree(); i++) {
			for (int j = 0; j < right.getDegree(); j++) {
				coeffsResult[i + j] += coeffs[i] * right.coeffs[j];
			}
		}
		this.coeffs = coeffsResult;
		
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = getDegree(); i > 0; i--) {
			builder.append(coeffs[i]).append("x^").append(i);
			if (coeffs[i] > 0) {
				builder.append("+");
			}
		}
		builder.append(coeffs[0]);		
		
		return "MyPolynomial [coeffs=" + Arrays.toString(coeffs) + "]";
	}
	
	
}

package main.java.moreExerciesOnClasses.Lab3_1;

public class MyComplex {
	double real = 0.0;
	double imag = 0.0;

	public MyComplex() {
	}

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public boolean isReal() {
		return imag == 0;
	}

	public boolean isImaginary() {
		return real == 0;
	}

	public boolean equals(double real, double imag) {
		return (this.real == real) && (this.imag == imag);
	}

	public boolean equals(MyComplex another) {
		return equals(another.real, another.imag);
	}

	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	public double argument() {
		return Math.atan2(imag, real);
	}

	public MyComplex add(MyComplex right) {
		this.real += right.real;
		this.imag += right.imag;
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		MyComplex sum = new MyComplex(this.real, this.imag);
		return sum.add(right);
	}

	public MyComplex subtract(MyComplex right) {
		this.real -= right.real;
		this.imag -= right.imag;
		return this;
	}

	public MyComplex subtractNew(MyComplex right) {
		MyComplex sum = new MyComplex(this.real, this.imag);
		return sum.subtract(right);
	}

	public MyComplex multiply(MyComplex right) {
		double newReal = this.real * right.real - this.imag * right.imag;
		double newImag = this.real * right.imag + this.imag * right.real;
		this.real = newReal;
		this.imag = newImag;
		return this;
	}

	public MyComplex divide(MyComplex right) {
		MyComplex conjugate = new MyComplex(right.real, 0.0 - right.imag);
		MyComplex dividor = this.multiply(conjugate);
		double quotient = right.real * right.real - right.imag * right.imag;
		this.real = dividor.real / quotient;
		this.imag = dividor.real / quotient;
		return this;
	}

	public MyComplex conjugate() {
		this.imag = this.imag * (-1.0);
		return this;
	}

	@Override
	public String toString() {
		return "MyComplex [real=" + real + ", imag=" + imag + "]";
	}

}

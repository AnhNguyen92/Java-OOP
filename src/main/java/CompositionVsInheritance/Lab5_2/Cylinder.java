package main.java.CompositionVsInheritance.Lab5_2;

public class Cylinder {
	private Circle base;
	private double height;

	public Cylinder() {
		base = new Circle(); // Call the constructor to construct the Circle
		height = 1.0;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}

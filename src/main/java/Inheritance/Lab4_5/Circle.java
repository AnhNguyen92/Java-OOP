package main.java.Inheritance.Lab4_5;

public class Circle extends Shape {
	private double radius = 1.0;

	public Circle() {
		super();
	}

	public Circle(String color, boolean filled) {
		super(color, filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * (radius + radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

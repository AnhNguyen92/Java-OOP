package main.java.PolymorphismAbstractClassesAndInterfaces.Lab6_1;

public class Circle extends Shape {
	protected double radius = 1.0;

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

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * (radius + radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

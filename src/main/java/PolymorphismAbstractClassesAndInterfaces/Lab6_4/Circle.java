package main.java.PolymorphismAbstractClassesAndInterfaces.Lab6_4;

public class Circle implements GeometricObject {
	protected double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * (radius + radius);
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

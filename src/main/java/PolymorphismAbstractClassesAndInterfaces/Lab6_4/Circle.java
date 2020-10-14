package main.java.PolymorphismAbstractClassesAndInterfaces.Lab6_4;

public class Circle implements GeometricObject {
	protected double radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

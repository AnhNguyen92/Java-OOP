package main.java.Inheritance.Lab4_5;

public class Square extends Rectangle {
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void setWidth(double side) {
		setSide(side);
	}

	@Override
	public void setLength(double side) {
		setSide(side);
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}

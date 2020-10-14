package main.java.exercisesOnComposition.Lab2_6;

public class MyRectangle {
	private MyPoint topLeft;
	private MyPoint bottomRight;

	public MyRectangle() {
	}

	public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
		super();
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public MyRectangle(int x1, int y1, int x2, int y2) {
		this.topLeft = new MyPoint(x1, y1);
		this.bottomRight = new MyPoint(x2, y2);
	}

	public MyPoint getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(MyPoint topLeft) {
		this.topLeft = topLeft;
	}

	public MyPoint getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(MyPoint bottomRight) {
		this.bottomRight = bottomRight;
	}

	public MyPoint getTopRight() {
		return new MyPoint(bottomRight.getX(), topLeft.getY());
	}

	public MyPoint getBottomLeft() {
		return new MyPoint(topLeft.getX(), bottomRight.getY());
	}

	public double getArea() {
		double width = topLeft.distance(getTopRight());
		double height = topLeft.distance(getBottomLeft());

		return width * height;
	}

	public double getCircumference() {
		double width = topLeft.distance(getTopRight());
		double height = topLeft.distance(getBottomLeft());

		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	}

}

package main.java.Composition.Lab2_5;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle() {
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y2);
		this.v2 = new MyPoint(x2, y3);
		this.v3 = new MyPoint(x3, y3);
	}

	public double getPerimeter() {
		double distance12 = this.v1.distance(v2);
		double distance13 = this.v1.distance(v3);
		double distance23 = this.v2.distance(v3);

		return distance12 + distance13 + distance23;
	}

	public String getType() {
		String type = "Scalene";
		int counter = 0;
		double distance12 = this.v1.distance(v2);
		double distance13 = this.v1.distance(v3);
		double distance23 = this.v2.distance(v3);
		if (distance12 == distance13) {
			counter++;
		}
		if (distance12 == distance23) {
			counter++;
		}
		if (distance13 == distance23) {
			counter++;
		}
		if (counter == 1) {
			type = "Isosceles";
		} else if (counter > 1) {
			type = "Equilateral";
		}
		return type;
	}

	@Override
	public String toString() {
		return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}

}

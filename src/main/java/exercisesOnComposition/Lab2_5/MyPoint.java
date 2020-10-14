package main.java.exercisesOnComposition.Lab2_5;

public class MyPoint {
	private int x = 0;
	private int y = 0;

	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		return new int[] { x, y };
	}

	public void setXY(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public double distance() {
		return distance(0, 0);
	}
	
	public double distance(MyPoint another) {
		return distance(another.getX(), another.getY());
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}	
	
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}

}

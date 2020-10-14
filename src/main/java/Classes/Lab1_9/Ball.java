package main.java.Classes.Lab1_9;

public class Ball {
	private float x;
	private float y;
	private float xDelta;
	private float yDelta;

	public Ball(float x, float y, float xDelta, float yDelta) {
		super();
		this.x = x;
		this.y = y;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}

	public void move() {
		x += xDelta;
		y += yDelta;
	}

	public void reflectHorizontal() {
		xDelta = -xDelta;
	}

	public void reflectVertical() {
		yDelta = -yDelta;
	}

	@Override
	public String toString() {
		return "Ball [x=" + x + ", y=" + y + ", xDelta=" + xDelta + ", yDelta=" + yDelta + "]";
	}

}

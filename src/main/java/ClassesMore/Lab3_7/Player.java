package main.java.ClassesMore.Lab3_7;

public class Player {
	private int number;
	private float x;
	private float y;
	private float z = 0.0f;

	public Player(int number, float x, float y, float z) {
		super();
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void move(float xDisp, float yDisp, float zDisp) {
		this.x = xDisp;
		this.y = yDisp;
		this.z = zDisp;
	}

	public void jump(float zDisp) {
		this.z = zDisp;
	}

	public boolean near(Ball ball) {
		double distance = Math.sqrt((x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY())
				+ (z - ball.getZ()) * (z - ball.getZ()));
		return distance < 8;
	}

	public void kick(Ball ball) {
		ball.setXYZ(ball.getX() - 2, ball.getY() - 2, 0);
	}
}

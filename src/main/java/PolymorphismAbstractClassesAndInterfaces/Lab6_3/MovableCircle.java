package main.java.PolymorphismAbstractClassesAndInterfaces.Lab6_3;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
		super();
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUp() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveRight() {
		center.y += center.ySpeed;
	}

}

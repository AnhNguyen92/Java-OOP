package main.java.CompositionVsInheritance.Lab5_1;

public class Line {
	private Point begin; // beginning point
	private Point end; // ending point

	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY); // construct the Points here
		end = new Point(beginX, beginY); // construct the Points here
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		begin = new Point(beginX, beginY);
	}

	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	public void setEndXY(int endX, int endY) {
		end = new Point(endX, endY);
	}

	public int getLength() {
		return (int) Math.sqrt((double) (end.getX() - begin.getX()) * (end.getX() - begin.getX())
				+ (end.getY() - begin.getY()) * (end.getY() - begin.getY()));
	}

	public double getGradient() {
		return Math.atan2((end.getY() - begin.getY()), (end.getX() - begin.getX()));
	}

	@Override
	public String toString() {
		return "Line [begin=" + begin.toString() + ", end=" + end.toString() + "]";
	}

}

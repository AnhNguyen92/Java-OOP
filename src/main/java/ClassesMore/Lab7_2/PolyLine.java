package main.java.ClassesMore.Lab7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	private List<Point> points = new ArrayList<Point>();

	public PolyLine() {
	}

	public PolyLine(List<Point> points) {
		super();
		this.points = points;
	}

	public void appendPoint(Point point) {
		points.add(point);
	}

	public void appendPoint(int x, int y) {
		appendPoint(new Point(x, y));
	}

	public double getLength() {
		double length = 0.0;
		int size = points.size();
		for (int i = 0; i < size; i++) {
			length += points.get(i).distance(points.get((i + 1)/ size));
		}
		
		return length;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		for (Point point : points) {
			builder.append("(").append(point.getX()).append(",").append(point.getX()).append(")");
		}
		builder.append("}");
		
		return builder.toString();
	}

}

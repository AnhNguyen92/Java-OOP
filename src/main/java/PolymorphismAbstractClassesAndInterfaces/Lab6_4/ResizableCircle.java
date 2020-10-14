package main.java.PolymorphismAbstractClassesAndInterfaces.Lab6_4;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		super.setRadius(getRadius() * (100 - percent) / 100);
	}

	@Override
	public String toString() {
		return "ResizableCircle [radius=" + getRadius() + "]";
	}

}

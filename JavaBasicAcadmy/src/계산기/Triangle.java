package 계산기;

public class Triangle implements Figure {

	private double width;
	private double height;

	public Triangle() {

	}

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double calArea() {

		return width * height / 2;
	}
}

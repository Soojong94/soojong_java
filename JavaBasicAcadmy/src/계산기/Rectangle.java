package 계산기;

public class Rectangle implements Figure{

	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double calArea() {

		return width * height;
	}
}

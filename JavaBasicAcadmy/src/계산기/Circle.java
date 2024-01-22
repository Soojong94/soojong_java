package 계산기;

public class Circle implements Figure{

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double calArea() {

		return radius * radius * 3.141592;
	}

}

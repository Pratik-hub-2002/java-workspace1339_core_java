package saturdays;

public class Circle_Operations {

	double radius;
	double pi = 3.14;

	public Circle_Operations(double radius) {
		this.radius = radius;
	}

	public double area() {
		return pi * radius * radius;
	}

	public double circumference() {
		return 2 * pi * radius;
	}
}

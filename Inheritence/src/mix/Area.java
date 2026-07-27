package mix;

public class Area {

	double radius;
	int lenght;
	int breadth;
	double base;
	double height;

	public double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}

	public int calculateArea(int lenght, int breadth) {

		return lenght * breadth;
	}

	public double calculateArea(double base, double height) {

		return 0.5 * base * height;
	}
}

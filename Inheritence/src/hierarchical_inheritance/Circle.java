package hierarchical_inheritance;

public class Circle extends Shape {

	public void showCircle() {

		type = "Circle";

		System.out.println("Shape Type: " + type);
	}

	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.showCircle();
	}

}

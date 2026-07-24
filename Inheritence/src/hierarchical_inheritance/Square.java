package hierarchical_inheritance;

public class Square extends Shape {

	public void showSquare() {

		type = "Square";

		System.out.println("Shape Type: " + type);
	}

	public static void main(String[] args) {

		Square square = new Square();

		square.showSquare();

	}

}

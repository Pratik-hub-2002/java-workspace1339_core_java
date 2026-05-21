import java.util.*;

public class Triangle {

	void checkTriangle(float a, float b, float c) {

		if (a == b && b == c) {
			System.out.println("This is Eqilateral Triangle");
		} else if (a == b || b == c || c == a) {
			System.out.println("This is Isosceles Triangle");
		} else {
			System.out.println("This is Scalene Triangle");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st side = ");
		float a = sc.nextFloat();

		System.out.println("Enter 2nd side = ");
		float b = sc.nextFloat();

		System.out.println("Enter 3rd side = ");
		float c = sc.nextFloat();
		
		Triangle t = new Triangle();
		t.checkTriangle(a, b, c);

	}
}

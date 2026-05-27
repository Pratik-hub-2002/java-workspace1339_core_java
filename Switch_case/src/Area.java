import java.util.*;

public class Area {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");

		System.out.println("Enter your choice = ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter radius of Circle = ");
			double r = sc.nextDouble();
			System.out.println("Area = " + (r * r * 3.14));
			break;
		case 2:
			System.out.println("Enter length = ");
			double l = sc.nextDouble();

			System.out.println("Enter breadth = ");
			double b = sc.nextDouble();

			System.out.println("Area = " + (l * b));
			break;
		case 3:
			System.out.println("Enter side = ");
			double s = sc.nextDouble();

			System.out.println("Area = " + (s * s));
			break;

		default:
			System.out.println("Not Defined");
		}
	}

}

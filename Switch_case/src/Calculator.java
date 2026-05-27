import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		System.out.println("Choose Operation = ");
		int choice = sc.nextInt();

		System.out.println("Enter first number");
		int f = sc.nextInt();

		System.out.println("Enter second number");
		int s = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Addition = " + (f + s));
			break;
		case 2:
			System.out.println("Substraction = " + (f - s));
			break;
		case 3:
			System.out.println("Multiplication = " + (f * s));
			break;
		case 4:
			System.out.println("Division = " + (f / s));
			break;
		default:
			System.out.println("Invalid Choice");
		}

	}

}

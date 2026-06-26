package practice;

import java.util.Scanner;

public class Operators {

	public void operation(int choice, double num1, double num2) {

		switch (choice) {

		case 1:
			System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println("Substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
			} else {
				System.out.println("Cannot divide by zero.");
			}
			break;
		case 5:
			System.out.println("Modulus of " + num1 + " % " + num2 + " = " + (num1 % num2));
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select the operation you want to perform..!");

		System.out.println("\n1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		int choice = sc.nextInt();

		System.out.println("Enter num 1");
		double num1 = sc.nextDouble();

		System.out.println("Enter num 2");
		double num2 = sc.nextDouble();

		System.out.println();

		Operators o = new Operators();
		o.operation(choice, num1, num2);

		sc.close();

	}

}

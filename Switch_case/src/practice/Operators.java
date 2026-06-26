package practice;

import java.util.Scanner;

public class Operators {

	public double operation(char operator, double num1, double num2) {

		switch (operator) {

		case '+':
			return Addition;
			break;
		case '-':
			System.out.println("Substraction");
			break;
		case '*':
			System.out.println("Multiplication");
			break;
		case '/':
			System.out.println("Division");
			break;
		case '%':
			System.out.println("Mod");
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select the operation you want to perform..! (+, -, *, /): ");
		char operator = sc.next().charAt(0);

		System.out.println("Enter num 1");
		double num1 = sc.nextDouble();

		System.out.println("Enter num 2");
		double num2 = sc.nextDouble();

		Operators o = new Operators();

		sc.close();

	}

}

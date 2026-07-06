package practice;

import java.util.Scanner;

public class Addition {

	public int addition(int num1, int num2) {

		return num1 + num2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Addition a = new Addition();

		do {
			System.out.println("Enter 1st number = ");
			int num1 = sc.nextInt();

			System.out.println("Enter 2nd number = ");
			int num2 = sc.nextInt();

			int result = a.addition(num1, num2);
			System.out.println("\nAddition of " + num1 + " + " + num2 + " = " + result);
		} while (true);
	}
}

package online;

import java.util.Scanner;

public class Swapping {

	public void swap(int num1, int num2) {

		System.out.println(num1);
		System.out.println(num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println(num1);
		System.out.println(num2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();

		Swapping swap = new Swapping();
		swap.swap(num1, num2);
	}

}

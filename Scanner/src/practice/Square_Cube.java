package practice;

import java.util.Scanner;

public class Square_Cube {

	public int calculate(int choice, Scanner sc) {

		switch (choice) {

		case 1:
			System.out.println("Enter number to find square = ");
			int square = sc.nextInt();
			return square * square;
		case 2:
			System.out.println("Enter number to find cube = ");
			int cube = sc.nextInt();
			return cube * cube * cube;
		default:
			System.out.println("Invalid Choice!!");
			return 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Square_Cube scc = new Square_Cube();

		char ch;
		do {
			System.out.println("Select one of the below:");
			System.out.println("1. Square");
			System.out.println("2. Cube");
			int choice = sc.nextInt();

			int result = scc.calculate(choice, sc);

			System.out.println("Result = " + result);

			System.out.println("do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}

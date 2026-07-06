package practice;

import java.util.Scanner;

public class Multi_Div {

	public void multi_div(int choice, int first_num, int second_num) {

		switch (choice) {

		case 1:
			int multiplication = first_num * second_num;
			System.out.println("Multiplication of " + first_num + " x " + second_num + " = " + multiplication + "\n");
			break;
		case 2:
			if (second_num == 0) {
				System.out.println("Division by zero is not possible.\n");
			} else {
				int division = first_num / second_num;
				System.out.println("Division of " + first_num + " / " + second_num + " = " + division + "\n");
			}
			break;
		default:
			System.out.println("Invalid Choice.!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Multi_Div md = new Multi_Div();

		char ch;
		do {
			System.out.println("Choose one of the below !\n");
			System.out.println("1. Multiplication");
			System.out.println("2. Division");
			int choice = sc.nextInt();

			System.out.println("Enter your first digit = ");
			int first_num = sc.nextInt();

			System.out.println("Enter your second digit = ");
			int second_num = sc.nextInt();

			md.multi_div(choice, first_num, second_num);

			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}

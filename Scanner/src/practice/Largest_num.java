package practice;

import java.util.Scanner;

public class Largest_num {

	public int largest_num(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Largest_num ln = new Largest_num();

		do {
			System.out.println("Enter 1st number = ");
			int num1 = sc.nextInt();

			System.out.println("Enter 2nd number = ");
			int num2 = sc.nextInt();

			System.out.println("Enter 3rd number = ");
			int num3 = sc.nextInt();

			int result = ln.largest_num(num1, num2, num3);
			System.out.println("From = " + num1 + ", " + num2 + ", " + num3);
			System.out.println(result + " is the largest.");
		} while (true);

	}

}

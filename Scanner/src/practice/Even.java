package practice;

import java.util.Scanner;

public class Even {

	public String even(int num) {
		if (num % 2 == 0) {
			return num + " is an even number.";
		} else {
			return num + " is an odd number.";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Even e = new Even();

		do {
			System.out.println("Enter any number to check if even or odd = ");
			int num = sc.nextInt();

			String result = e.even(num);
			System.out.println(result);

		} while (true);

	}

}

package practice;

import java.util.Scanner;

public class Pos_Neg_Zero {

	public String pos_neg_zero(int num) {

		if (num > 0) {
			return num + " is a positive number.";
		} else if (num < 0) {
			return num + " is a negative number.";
		} else {
			return num + " is not positive nor negative number.";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pos_Neg_Zero pnz = new Pos_Neg_Zero();

		do {

			System.out.println("Enter any number to check if positive, negative or 0 ");
			int num = sc.nextInt();

			String result = pnz.pos_neg_zero(num);
			System.out.println(result);

		} while (true);

	}

}

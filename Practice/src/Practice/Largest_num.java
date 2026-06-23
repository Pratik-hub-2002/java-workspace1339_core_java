package Practice;

import java.util.Scanner;

public class Largest_num {

	public int large(int first_num, int second_num, int third_num) {

		if (first_num >= second_num && first_num >= third_num) {
			return first_num;
		} else if (second_num >= third_num && second_num >= first_num) {
			return second_num;
		} else {
			return third_num;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number = ");
		int first_num = sc.nextInt();

		System.out.println("Enter second number = ");
		int second_num = sc.nextInt();

		System.out.println("Enter third number = ");
		int third_num = sc.nextInt();

		Largest_num l = new Largest_num();
		int largest = l.large(first_num, second_num, third_num);

		System.out.println("Largest number = " + largest);

		sc.close();

	}
}

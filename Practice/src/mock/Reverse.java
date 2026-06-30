package mock;

import java.util.Scanner;

public class Reverse {

	public void reverse(int num1, int num2, int num3, int num4) {

		int[] numbers = { num1, num2, num3, num4 };

		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number = ");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd number = ");
		int num2 = sc.nextInt();

		System.out.println("Enter 3rd number = ");
		int num3 = sc.nextInt();

		System.out.println("Enter 4th number = ");
		int num4 = sc.nextInt();

		Reverse r = new Reverse();
		r.reverse(num1, num2, num3, num4);

		sc.close();

	}

}

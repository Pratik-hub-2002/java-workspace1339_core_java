package mock;

import java.util.Scanner;

public class Reverse {

	public void reverse(int num) {

		int rem, rev = 0;

		do {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		} while (num != 0);
		System.out.println("Reversed Number = " + rev);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number = ");
		int num = sc.nextInt();

		Reverse r = new Reverse();
		r.reverse(num);

		sc.close();

	}

}

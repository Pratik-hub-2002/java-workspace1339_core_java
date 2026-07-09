package july;

import java.util.Scanner;

public class Palindrome_num {

	public void palindrome_num(int num) {

		int temp = num;
		int rev = 0;

		while (num != 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (temp == rev) {
			System.out.println(temp + " is a Palindrome number.");
		} else {
			System.out.println(temp + " is not a Palindrome number.");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Palindrome_num pn = new Palindrome_num();

		while (true) {
			System.out.println("Enter number to check palindrome or not");
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}

			pn.palindrome_num(num);
		}

		sc.close();

	}
}

package July;

import java.util.Scanner;

public class Reverse_num {

	public void reverse_num(int num) {

		int rem, rev = 0;

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter number to reverse = ");
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}
			Reverse_num rn = new Reverse_num();
			rn.reverse_num(num);
		}

		sc.close();

	}

}

package online;

import java.util.Scanner;

public class Prime_num {

	public void prime(int num) {

		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					isPrime = false;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number.");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number to check if the number is prime: ");
		int num = sc.nextInt();

		Prime_num pn = new Prime_num();
		pn.prime(num);

		sc.close();

	}
}

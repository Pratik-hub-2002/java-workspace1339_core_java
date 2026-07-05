package July;

import java.util.Scanner;

public class Prime_num_loop {

	boolean isPrime = true;

	void prime(int num, int num2) {

		for (int i = num; i <= num2; i++) {

			isPrime = true;

			if (i <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(i + " is a prime number.");
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any number to check if prime or not = ");
			int num = sc.nextInt();

			System.out.println("Enter any number to check if prime or not = ");
			int num2 = sc.nextInt();

			if (num == 0) {
				break;
			}
			Prime_num_loop p = new Prime_num_loop();
			p.prime(num, num2);
		}

		sc.close();

	}
}

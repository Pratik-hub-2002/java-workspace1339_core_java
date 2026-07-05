package July;

import java.util.Scanner;

public class Prime_num {

	boolean isPrime = true;

	void prime(int num) {

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is a not a prime number.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nEnter any number to check if prime or not = ");
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}

			Prime_num p = new Prime_num();
			p.prime(num);
		}

		sc.close();

	}
}

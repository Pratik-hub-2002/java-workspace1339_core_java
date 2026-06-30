package Practice;

import java.util.Scanner;

public class Prime {

	boolean isPrime = true;

	public void prime(int num) {

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not Prime");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		Prime p = new Prime();

		p.prime(num);

		sc.close();

	}

}

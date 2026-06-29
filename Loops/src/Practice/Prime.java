package Practice;

import java.util.Scanner;

class Prime {

	public void prime(int start, int end, int num) {

//		for (int i = start; i <= end; i++) {
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " = is a Prime number");
		} else {
			System.out.println(num + " = is not a Prime number");
		}
	}
//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter start number = ");
//		int start = sc.nextInt();
//
//		System.out.println("Enter end number = ");
//		int end = sc.nextInt();

		System.out.println("Enter any number  = ");
		int num = sc.nextInt();

		Prime p = new Prime();
		p.prime(num, num, num);
//		p.prime(start, end);

		sc.close();

	}
}
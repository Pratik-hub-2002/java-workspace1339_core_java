package methods;

public class NoMethod_NoPara {

	public void calSquare() {
		int num = 5;
		System.out.println("Square of = " + num + " = " + (num * num));
	}

	public void calCube() {
		int num = 5;
		System.out.println("Cube of = " + num + " = " + (num * num * num));
	}

	public void calSum() {
		int num = 5;
		int numa = 10;
		System.out.println("Sum of " + num + " + " + numa + " = " + (num + numa));
	}

	public void calgreatest() {
		int a = 10, b = 25, c = 15;

		if (a > b && a > c) {
			System.out.println(a + " is greater than = " + b + ", " + c);
		} else if (b > c) {
			System.out.println(b + " is greater than = " + a + ", " + c);
		} else {
			System.out.println(c + " is greater than = " + b + ", " + a);
		}
	}

	public void even_odd() {
		int num = 9;
		if (num % 2 == 0) {
			System.out.println(num + " is Even number");
		} else {
			System.out.println(num + " is Odd number");
		}
	}

	public void factorial() {
		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " = " + fact);
	}

	public void reverse() {

		int num = 12345;
		int temp = num;
		int rem, rev = 0;

		while (temp != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println("Reverse number of " + num + " = " + rev);
	}

	public void prime() {

		int num = 9;
		boolean isPrime = true;

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
			System.out.println(num + " is a Prime number.");
		} else {
			System.out.println(num + " is not a Prime number.");
		}
	}

	public void count() {

		int num = 123456789;
		int temp = num;
		int count = 0;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		System.out.println("Count of " + num + " = " + count);
	}
}

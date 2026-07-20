package saturdays;

public class Check_prime {

	int cprime;

	public Check_prime(int cprime) {

		this.cprime = cprime;
	}

	public void checkPrime() {

		if (cprime <= 1) {
			System.out.println(cprime + " is not a prime number.");
			return;
		}

		boolean isPrime = true;

		for (int i = 2; i <= cprime / 2; i++) {

			if (cprime % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(cprime + " is a prime number.");
		} else {
			System.out.println(cprime + " is not a prime number.");
		}
	}
}

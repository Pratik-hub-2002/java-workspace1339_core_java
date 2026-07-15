package methods;

public class Prime_Number_Checker {

	public boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		} else {

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}

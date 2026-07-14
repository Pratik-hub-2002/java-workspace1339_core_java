package offline;

public class Prime_num {

	public static void main(String[] args) {

		for (int i = 0; i <= 30; i++) {

			boolean isPrime = true;

			if (i <= 1) {
				isPrime = false;
			} else {

				for (int j = 2; j <= i / 2; j++) {

					if (i % j == 0) {
						isPrime = false;
					}
				}
			}
			if (isPrime) {
				System.out.println(i + " is Prime");
			} else {
				System.out.println(i + " is not a Prime");
			}
		}

	}
}
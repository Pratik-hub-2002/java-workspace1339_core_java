package mix;

public class Prime_Number {

	private int pnum;

	public Prime_Number(int pnum) {

		this.pnum = pnum;
	}

	public void setPnum(int pnum) {

		this.pnum = pnum;
	}

	public int getPnum() {

		return pnum;
	}

	public String checkPrime() {

		boolean isPrime = true;

		if (pnum <= 1) {

			isPrime = false;

		} else {

			for (int i = 2; i <= pnum / 2; i++) {

				if (pnum % i == 0) {

					isPrime = false;
				}
			}
		}

		if (isPrime) {
			return "Prime";
		} else {
			return "Not Prime";
		}

	}

}

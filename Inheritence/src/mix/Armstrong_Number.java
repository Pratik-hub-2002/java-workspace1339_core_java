package mix;

public class Armstrong_Number {

	int armnum;

	public Armstrong_Number(int armnum) {
		this.armnum = armnum;
	}

	public boolean isArmstrong(int armnum) {

		int num = armnum;
		int original = num;
		int sum = 0;

		while (num > 0) {

			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		return original == sum;
	}
}

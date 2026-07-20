package saturdays;

public class Power_Calculation {

	int base;
	int exponent;

	public Power_Calculation(int base, int exponent) {

		this.base = base;
		this.exponent = exponent;
	}

	public long calculate_power() {

		long power = 1;

		for (int i = 1; i <= exponent; i++) {
			power = power * base;
		}

		return power;
	}
}

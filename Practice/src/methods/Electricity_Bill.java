package methods;

public class Electricity_Bill {

	public double calculateBill(int units) {

		if (units <= 100) {
			return units * 5;
		} else if (units <= 200) {
			return (100 * 5) + ((units - 100) * 7);
		} else {
			return (100 * 5) + (100 * 7) + ((units - 200) * 10);
		}
	}
}
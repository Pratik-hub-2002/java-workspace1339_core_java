package saturdays;

public class Electricity_Bill {

	int units;

	public Electricity_Bill(int units) {
		this.units = units;
	}

	public double calculateBill() {

		if (units <= 100) {
			return units * 5;
		} else if (units <= 200) {
			return units * 7;
		} else {
			return units * 10;
		}
	}
}

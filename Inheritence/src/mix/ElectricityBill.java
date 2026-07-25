package mix;

public class ElectricityBill {

	int units;

	public ElectricityBill(int units) {

		this.units = units;
	}

	public int calculateElectricityBill(int units) {

		int bill = 0;

		if (units <= 100) {
			bill = units * 5;

		} else if (units <= 200) {
			bill = (100 * 5) + ((units - 100) * 7);

		} else {
			bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);

		}

		System.out.println("Units: " + units);
		System.out.println("Bill Rs. " + bill);
		return bill;
	}
}

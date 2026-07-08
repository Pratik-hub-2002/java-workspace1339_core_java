package methods;

public class Vehicle {
	int vehicleId;
	String vehicleName;
	String companyName;
	double vehiclePrice;
	double discount;

	public double calculateFinalPrice() {

		if (vehiclePrice > 100000) {
			discount = vehiclePrice * 0.10;
		} else {
			discount = vehiclePrice * 0.05;
		}

		return vehiclePrice - discount;
	}
}

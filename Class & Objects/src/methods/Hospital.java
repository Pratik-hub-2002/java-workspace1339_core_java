package methods;

public class Hospital {
	int patientId;
	String patientName;
	String disease;
	int daysAdmitted;
	double roomCharge;

	public double calculateBill() {

		double bill = daysAdmitted * roomCharge;

		if (bill > 10000) {
			bill = bill - (bill * 0.10);
		}

		return bill;
	}
}

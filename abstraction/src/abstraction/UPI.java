package abstraction;

public class UPI implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("------ UPI Payment ------");
		System.out.println("Validating UPI ID...");
		System.out.println("Processing Payment...");
		System.out.println("Payment Successful");
		System.out.println("Amount Paid : ₹" + amount);

	}

}

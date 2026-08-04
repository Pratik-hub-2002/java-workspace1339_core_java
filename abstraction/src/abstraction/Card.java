package abstraction;

public class Card implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("------ Card Payment ------");
		System.out.println("Validating Card...");
		System.out.println("Checking Bank...");
		System.out.println("Payment Successful");
		System.out.println("Amount Paid : ₹" + amount);

	}

}

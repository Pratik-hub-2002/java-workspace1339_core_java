package abstraction;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {

		System.out.println("------ Net Banking ------");
		System.out.println("Connecting to Bank...");
		System.out.println("Authorizing Transaction...");
		System.out.println("Payment Successful");
		System.out.println("Amount Paid : ₹" + amount);

	}

}

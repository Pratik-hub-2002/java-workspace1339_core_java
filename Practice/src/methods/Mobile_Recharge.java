package methods;

public class Mobile_Recharge {

	public void dataPlan() {
		System.out.println("Available Data Plans:");
		System.out.println("1. ₹199 - 2GB/day");
		System.out.println("2. ₹299 - 3GB/day");
	}

	public void talkTime() {
		System.out.println("Available Talktime Plans:");
		System.out.println("1. ₹100 Talktime");
		System.out.println("2. ₹500 Talktime");
	}

	public void comboPack() {
		System.out.println("Available Combo Packs:");
		System.out.println("1. ₹399 - Unlimited Calls + 2GB/day");
		System.out.println("2. ₹599 - Unlimited Calls + 3GB/day");
	}

	public double recharge(double balance, double rechargeAmount) {

		if (balance <= 0) {
			System.out.println("Invalid Balance!");
			return balance;
		}

		if (rechargeAmount > balance) {
			System.out.println("Insufficient Balance!");
			return balance;
		}

		double remainingBalance = balance - rechargeAmount;

		System.out.println("Recharge Successful!");
		System.out.println("Recharge Amount: ₹" + rechargeAmount);
		System.out.println("Remaining Balance: ₹" + remainingBalance);

		return remainingBalance;
	}
}
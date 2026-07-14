package methods;

public class Mobile_Recharge {

	public void dataPlan() {

		System.out.println("Available Data Plans:");
		System.out.println("₹199 - 2GB/day");
		System.out.println("₹299 - 3GB/day");
	}

	public void talkTime() {

		System.out.println("Available Talktime Plans:");
		System.out.println("₹100 Talktime");
		System.out.println("₹500 Talktime");
	}

	public void comboPack() {

		System.out.println("Available Combo Packs:");
		System.out.println("₹399 - Unlimited Calls + 2GB/day");
		System.out.println("₹599 - Unlimited Calls + 3GB/day");
	}

	public void recharge(double amount) {

		System.out.println("Recharge Successful!");
		System.out.println("Recharge Amount: ₹" + amount);
	}

}

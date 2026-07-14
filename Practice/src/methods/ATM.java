package methods;

public class ATM {

	double balance = 111111;

	public void checkBalance() {

		System.out.println("Your Balance Amount: " + balance);
	}

	public double withdrawAmount(int withdraw) {

		balance = balance - withdraw;
		return balance;

	}

}

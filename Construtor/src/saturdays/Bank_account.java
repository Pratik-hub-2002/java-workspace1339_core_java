package saturdays;

public class Bank_account {

	long anumber;
	double balance = 111111.11;

	public Bank_account(long anumber) {
		this.anumber = anumber;

	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	public double withdraw(int amount) {

		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance!");
		}
		return balance;
	}

	public double showbalance() {
		return balance;
	}
}

package saturdays;

public class ATM_simulation {

	long accountNumber;
	double balance = 10000000;

	public ATM_simulation(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double deposit(double amount) {

		balance += amount;
		return balance;
	}

	public double withdraw(double amount) {

		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance!");
		}
		return balance;
	}

	public double check_balance() {

		return balance;
	}
}

package practice;

public class Bank_Account {

	private double balance;

	public Bank_Account(double balance) {

		setBalance(balance);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		if (amount > 0) {

			setBalance(getBalance() + amount);
			System.out.println("Amount Deposited Successfully.");
		} else {

			System.out.println("Invalid Amount.");
		}
	}

	public void withdraw(double amount) {

		if (amount <= getBalance()) {

			setBalance(getBalance() - amount);
			System.out.println("Amount Withdrawn Successfully.");
		} else {

			System.out.println("Insufficient Balance.");
		}
	}
}

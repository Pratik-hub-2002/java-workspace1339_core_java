package mix;

public class Bank_Account {

	private double balance;

	public Bank_Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		if (amount <= 0) {
			System.out.println("Invalid Deposit Amount!");
		} else {
			balance += amount;
			System.out.println("₹" + amount + " Deposited Successfully.");
		}
	}

	public void withdraw(int amount) {

		if (amount <= 0) {
			System.out.println("Invalid Amount! Amount must be greater than 0.");
		} else if (amount % 100 != 0) {
			System.out.println("Withdrawal amount should be in multiples of ₹100.");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance!");
		} else {
			balance -= amount;
			System.out.println("₹" + amount + " Withdrawn Successfully.");
		}
	}
}
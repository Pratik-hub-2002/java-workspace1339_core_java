package oop;

public class Current extends Account implements Transaction {

	public Current(long accountNumber, String name, double balance, int pin) {
		super(accountNumber, name, balance, pin);
	}

	@Override
	public void withdraw(double amount) {

		if (amount > getBalance()) {
			System.out.println("Insufficienet Balance");
		} else {
			if (amount % 100 == 0) {
				System.out.println("Withdraw Successful!");
				setBalance(getBalance() - amount);
				System.out.printf("Balance is: %.2f%n", getBalance());
			} else {
				System.out.println("Enter in the multiples for 100, 200, 500 only!");
			}
		}
	}

	@Override
	public void deposit(double amount) {

		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposit Successful!");
			System.out.printf("Balance is: %.2f%n", getBalance());
		} else {
			System.out.println("Invalid Amount");
		}
	}

	@Override
	public void checkBalance() {
		System.out.printf("Balance is: %.2f%n", getBalance());
	}

	@Override
	public void accountType() {

		System.out.println("Current Account");
	}
	
	
}

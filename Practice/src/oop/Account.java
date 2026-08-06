package oop;

public abstract class Account {

	private long account_number;
	private String name;
	private double balance;
	private int pin;

	public Account(long account_number, String name, double balance, int pin) {

		this.account_number = account_number;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public final boolean validatePin(int enteredPin) {

		if (this.pin == enteredPin) {
			return true;
		}
		return false;
	}

	public long getAccountNumber() {
		return account_number;
	}

	public String getName() {
		return name;
	}

	public void displayDetails() {
		System.out.println("\n===== ACCOUNT DETAILS =====");
		System.out.println("Account Number : " + account_number);
		System.out.println("Account Holder : " + name);
		System.out.printf("Balance        : %.2f%n", balance);
	}

	public abstract void accountType();
}

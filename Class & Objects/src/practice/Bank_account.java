package practice;

public class Bank_account {

	long account_num;
	double balance = 100000.53;

	public void displayBalance() {

		System.err.println("-----------Balance of Account-------");
		System.out.println("Account number: " + account_num);
		System.out.println("Balance Left: " + balance);
	}
}

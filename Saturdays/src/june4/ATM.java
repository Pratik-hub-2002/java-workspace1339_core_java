package june4;

import java.util.Scanner;

public class ATM {

	double balance = 111111.5656;

	public void atm(int choices, Scanner sc) {

		switch (choices) {

		case 1:
			System.out.println("Your Balance is = %.2f%n" + balance);
			break;
		case 2:
			System.out.println("Enter withdrawl amount ..!");
			int withdraw_amt = sc.nextInt();

			if (withdraw_amt <= balance) {

				if (withdraw_amt % 100 == 0) {

					balance = balance - withdraw_amt;

					System.out.println("Withdrawl Successfull..!");
					System.out.println("Balance Amount = " + balance);

				} else {
					System.out.println("Amount should be in the multiples of 100.");
				}
			} else {
				System.out.println("Balance Insufficient..!");
			}
			break;
		case 3:
			System.out.println("Enter Deposit Amount = ");
			int deposit_amt = sc.nextInt();

			if (deposit_amt % 100 == 0) {

				balance = deposit_amt + balance;
				System.out.println("Deposit Successful..!");
				System.out.println("Total Balance = " + balance);
			} else {
				System.out.println("Amount should be in the multiples of 100.");
			}
			break;
		case 4:
			System.out.println("Thank You for visiting ATM..!");
			break;

		default:
			System.out.println("Invallid Choice");
		}
	}

	public static void main(String[] args) {

		double balance = 111111.5656;

		Scanner sc = new Scanner(System.in);

		System.out.println("Select one from the menu = ");

		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		int choice = sc.nextInt();

		ATM a = new ATM();
		a.atm(choice, sc);

		sc.close();

	}

}

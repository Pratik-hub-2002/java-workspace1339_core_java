package oop;

import java.util.Scanner;

public class ATM_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account account = null;
		Transaction transaction = null;

		System.out.println("Select Account Type: ");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		int ops = sc.nextInt();

		System.out.print("Enter Account Number: ");
		long accountNumber = sc.nextLong();

		sc.nextLine(); // consume newline

		System.out.print("Enter Account Holder Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		System.out.print("Create 4-digit PIN: ");
		int pin = sc.nextInt();

		switch (ops) {

		case 1:
			System.out.println("Saving Account");
			Saving saving = new Saving(accountNumber, name, balance, pin);

			account = saving;
			transaction = saving;
			break;
		case 2:
			System.out.println("Current Account");
			Current current = new Current(accountNumber, name, balance, pin);

			account = current;
			transaction = current;
			break;
		default:
			System.out.println("Invalid Account Type!");
			sc.close();
			return;
		}

		System.out.print("Enter PIN: ");
		int enteredPin = sc.nextInt();
		if (!account.validatePin(enteredPin)) {
			System.out.println("Invalid PIN!");
			sc.close();
			return;
		}

		char ch;
		do {

			System.out.println("============Welcome==========");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Show Details");
			System.out.println("5. Exit");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the deposit amount: ");
				int depositAmount = sc.nextInt();
				transaction.deposit(depositAmount);
				break;

			case 2:
				System.out.println("Enter the withdraw amount: ");
				int withdrawAmount = sc.nextInt();
				transaction.withdraw(withdrawAmount);
				break;

			case 3:
				transaction.checkBalance();
				break;

			case 4:
				account.displayDetails();
				break;

			case 5:
				System.out.println("Thank You for using ATM.");
				return;

			default:
				System.out.println("Invalid Choice");
			}

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		System.out.println("Thank You for using ATM.");
		sc.close();
	}
}

package practice;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("============= MENU =============");
		System.out.println("1. Person");
		System.out.println("2. Bank Account");
		System.out.println("21. Exit");
		System.out.println("================================");
		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt();

		char ch;

		do {

			switch (choice) {

			case 1:
				System.err.println("===========Person=============");

				sc.nextLine();
				System.out.println("Enter your name: ");
				String name = sc.nextLine();

				System.out.println("Enter age: ");
				int age = sc.nextInt();

				Person p1 = new Person(name, age);

				System.out.println("Name: " + p1.getName());
				System.out.println("Age: " + p1.getAge());

				break;

			case 2:
				System.err.println("===========Bank Account=============");

				System.out.print("Enter Initial Balance : ");
				double balance = sc.nextDouble();

				Bank_Account account = new Bank_Account(balance);

				System.out.println("Enter deposit amount: ");
				double deposit = sc.nextDouble();
				account.deposit(deposit);

				System.out.println("Enter withdraw amount: ");
				int withdraw = sc.nextInt();
				account.withdraw(withdraw);

				System.out.println("Current Balance: Rs. " + account.getBalance());

				break;

			case 21:
				System.out.println("Thank You !");
				return;

			default:
				System.out.println("Invalid Choice!");
				break;
			}

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}

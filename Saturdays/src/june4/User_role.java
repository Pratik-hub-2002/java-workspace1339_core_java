package june4;

import java.util.Scanner;

public class User_role {

	public void role(int choice) {

		switch (choice) {

		case 1:
			System.out.println("Admin Roles");
			System.out.println("Permissions: Add, Update, Delete, View");
			break;
		case 2:
			System.out.println("Manager Roles");
			System.out.println("Permissions: Add, Update, View");
			break;
		case 3:
			System.out.println("Employee Roles");
			System.out.println("Permissions: View");
			break;
		default:
			System.out.println("Invalid Input..!");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome..!");

		System.out.println("Who you are..?");
		System.out.println("1. Admin");
		System.out.println("2. Manager");
		System.out.println("3. Employee");
		int choice = sc.nextInt();

		User_role ur = new User_role();
		ur.role(choice);

		sc.close();

	}

}

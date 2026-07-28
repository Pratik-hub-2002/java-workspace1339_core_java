package dynamic_dispatch;

import java.util.Scanner;

public class Company_Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee emp = null;

		char ch = 'Y';
		do {
			System.out.println("========== Employee ==========");
			System.out.println("1. Manager");
			System.out.println("2. Developer");
			System.out.println("3. Tester");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("Thank You!");
				break;
			}

			System.out.print("Enter Employee ID : ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Employee Name : ");
			String name = sc.nextLine();

			System.out.print("Enter Designation : ");
			String designation = sc.nextLine();

			System.out.print("Enter Basic Salary : ");
			double salary = sc.nextDouble();

			switch (choice) {

			case 1:
				emp = new Manager(id, name, designation, salary);
				break;

			case 2:
				emp = new Developer(id, name, designation, salary);
				break;

			case 3:
				emp = new Tester(id, name, designation, salary);
				break;

			default:
				System.out.println("Invalid Choice");
				continue;
			}

			emp.displayDetails();
			System.out.println("Total Salary : ₹" + emp.calculateSalary());

			System.out.println("Return to main menu..!");
			System.out.println("Y/N");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}
}

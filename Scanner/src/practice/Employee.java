package practice;

import java.util.Scanner;

public class Employee {

	public double employee(double basic) {
		double hra = basic * 0.20;
		double da = basic * 0.50;
		double pf = basic * 0.12;
		double esic = basic * 0.0075;
		double bonus;

		if (basic > 50000) {
			bonus = basic * 0.10;
		} else {
			bonus = basic * 0.05;
		}

		double salary = basic + hra + da + bonus;

		int pt = 0;
		if (salary >= 9000) {
			pt = 200;
		} else if (salary >= 7500) {
			pt = 175;
		}

		double net_salary = salary - pf - esic - pt;

		System.out.println("Basic = " + basic);
		System.out.println("HRA = " + hra);
		System.out.println("DA = " + da);
		System.out.println("Bonus = " + bonus);
		System.out.println("PF = " + pf);
		System.out.println("ESIC = " + esic);
		System.out.println("PT = " + pt);

		return net_salary;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();

		char ch;
		do {

			System.out.println("Enter Employee ID:");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Employee Name:");
			String name = sc.nextLine();
			

			System.out.println("Enter Basic Salary:");
			double basic = sc.nextDouble();

			double net_salary = e.employee(basic);
			System.out.println("\nEmployee Details");
			System.out.println("----------------");
			System.out.println("Employee ID : " + id);
			System.out.println("Employee Name : " + name);
			System.out.printf("Employee Salary : Rs. %.2f%n", net_salary);

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
	}

}

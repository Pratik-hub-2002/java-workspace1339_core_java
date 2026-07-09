package june4;

import java.util.Scanner;

public class Employee {

	public double employee(double basic) {

		double hra = basic * 0.20;
		double da = basic * 0.50;
		double bonus;

		if (basic > 50000) {
			bonus = basic * 0.10;
		} else {
			bonus = basic * 0.05;
		}

		System.out.println("Basic = " + basic);
		System.out.println("HRA = " + hra);
		System.out.println("DA = " + da);
		System.out.println("Bonus = " + bonus);
		return basic + hra + da + bonus;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Basic Salary = ");
		double basic = sc.nextDouble();

		Employee e = new Employee();
		double total_salary = e.employee(basic);

		System.out.println("Total Salary = " + total_salary);

		sc.close();
	}
}

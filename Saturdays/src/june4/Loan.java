package june4;

import java.util.Scanner;

public class Loan {

	public void loan(int age, int salary, int cibil) {

		if (age >= 21 && age <= 50) {

			if (salary >= 25000) {

				if (cibil >= 700 && cibil <= 900) {
					System.out.println("Eligible for Loan..!");
				} else {
					System.out.println("Your cibil is low for loan..!");
				}

			} else {
				System.out.println("Salary should be INR25000 or more");
			}
		} else {
			System.out.println("Age should be 21 or more ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		System.out.println("Enter your salary = ");
		int salary = sc.nextInt();

		System.out.println("Enter your CIBIL score = ");
		int cibil = sc.nextInt();

		Loan l = new Loan();
		l.loan(age, salary, cibil);

		sc.close();

	}
}

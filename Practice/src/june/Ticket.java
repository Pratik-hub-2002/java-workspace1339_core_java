package june;

import java.util.Scanner;

public class Ticket {

	public double ticket(int age, double bill_amt) {

		if (age >= 18) {

			if (age >= 60) {

				System.out.println("\nSenior Citizen Discount..!");
				return bill_amt - (bill_amt * 20 / 100);
			} else {

				System.out.println("\nNormal Discount..!");
				return bill_amt - (bill_amt * 8 / 100);
			}
		} else {
			System.out.println("\nChildren Discount..!");
			return bill_amt - (bill_amt * 15 / 100);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bill Amount = ");
		double bil_amt = sc.nextDouble();

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		Ticket t = new Ticket();

		double final_price = t.ticket(age, bil_amt);

		System.out.println("Your final bill amout = Rs. " + final_price);
		sc.close();

	}

}

package practice;

import java.util.Scanner;

public class Simple_interest {

	float principal;
	float time;
	float rate;
	float months;

	public float calculateSI(float principal, float time, float rate) {

		return (principal * time * rate) / 100;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Simple_interest si = new Simple_interest();

		char ch;

		do {

			System.out.println("Enter the Principal Amount: ");
			si.principal = sc.nextFloat();

			System.out.println("Enter the Rate of Interest: ");
			si.rate = sc.nextFloat();

			System.out.println("Enter the Time in months: ");
			si.months = sc.nextFloat();

			float time = si.months / 12;

			float result = si.calculateSI(si.principal, time, si.rate);

			System.out.println("Simple Interest: " + result);

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}

}

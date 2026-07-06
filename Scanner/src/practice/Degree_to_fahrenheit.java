package practice;

import java.util.Scanner;

public class Degree_to_fahrenheit {

	public double degree(double degree) {

		return (9.0 / 5) * degree + 32;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Degree_to_fahrenheit gtf = new Degree_to_fahrenheit();

		char ch;
		do {
			System.out.println("Enter temperature in °C");
			double degree = sc.nextDouble();

			double result = gtf.degree(degree);
			System.out.println(result);

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}

}

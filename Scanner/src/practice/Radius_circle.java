package practice;

import java.util.Scanner;

public class Radius_circle {

	double pi = 3.14;

	public double radius_circle(double radius) {

		return radius * radius * pi;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Radius_circle rc = new Radius_circle();

		do {
			System.out.println("Enter radius of Circle = ");
			double radius = sc.nextDouble();

			double result = rc.radius_circle(radius);
			System.out.println("Area of Cicrle = " + result);

		} while (true);

	}

}

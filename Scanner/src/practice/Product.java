package practice;

import java.util.Scanner;

public class Product {

	double cgst = 0.09;
	double sgst = 0.09;

	public double product(int product, double price) {

		double amount = product * price;
		double gst = (amount * cgst) + (amount * sgst);

		return amount + gst;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product p = new Product();

		char ch;
		do {
			System.out.println("Enter the price of the product = ");
			double price = sc.nextDouble();

			System.out.println("Enter the quantity of the product = ");
			int quantity = sc.nextInt();

			double result = p.product(quantity, price);
			System.out.println("Quantity = " + quantity);
			System.out.println("Price = " + price);
			System.out.println("SGST 9% = Rs. " + (quantity * price * p.sgst));
			System.out.println("CGST 9% = Rs. " + (quantity * price * p.cgst));
			System.out.println("The final price Rs. " + result);

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}

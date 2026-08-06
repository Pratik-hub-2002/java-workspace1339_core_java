package oop;

import java.util.Scanner;

public class MainBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User Name (One Word): ");
		String uname = sc.next();

		System.out.println("Enter mob no: ");
		long mob_no = sc.nextLong();

		sc.nextLine();
		System.out.print("Enter Movie Name: ");
		String movie = sc.nextLine();

		System.out.print("Enter Seat Number: ");
		String seat = sc.nextLine();

		System.out.print("Enter Ticket Price: ");
		double price = sc.nextDouble();

		Customer cust = new Customer(uname, mob_no, movie, seat, price);

		cust.role();
		cust.bookTicket();

		Admin admin = new Admin("Pratik", 5846469);
		admin.role();
		admin.bookTicket();

		sc.close();
	}
}

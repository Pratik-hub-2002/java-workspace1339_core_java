package june4;

import java.util.Scanner;

public class Ticket {

	double student = 0.10;

	public void ticket(int choice, int quantity, String stud) {

		int price = 0;

		switch (choice) {

		case 1:
			price = 100;
			System.out.println("1. Silver Ticket Selected");
			break;
		case 2:
			price = 200;
			System.out.println("2. Gold Ticket Selected");
			break;
		case 3:
			price = 300;
			System.out.println("3. Platinum Ticket Selected");
			break;
		default:
			System.out.println("Invalid Selection..!");
			return;
		}
		double total_price = price * quantity;
		double final_price = total_price - (total_price * student);
		System.out.println("Ticket Price = Rs. " + price);
		System.out.println("Quantity = " + quantity);
		System.out.println("Total Price = Rs. " + price + " x " + quantity + " = " + total_price);

		if (stud.equalsIgnoreCase("Yes")) {
			System.out.println("Student 10% Discount Applied ..!");
			System.out.println("Final Price Rs. " + final_price);
		} else {
			System.out.println("No Discount Applied ..!");
			System.out.println("Final Price Rs. " + total_price);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select the seat you want to book..!");

		System.out.println("\n1. Silver(Rs. 100).");
		System.out.println("2. Gold(Rs. 200).");
		System.out.println("3. Platinum(Rs. 300).");

		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();

		if (choice < 1 || choice > 3) {
			System.out.println("Invalid Selection..!");
			sc.close();
			return;
		}

		System.out.println("How many tickets..?");
		int quantity = sc.nextInt();

		System.out.println("Are you a student Yes/No : ");
		String stud = sc.next();

		Ticket t = new Ticket();
		t.ticket(choice, quantity, stud);

	}

}

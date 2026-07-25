package mix;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;
		do {
			System.out.println("=================MENU============");
			System.out.println("1. Electricity Bill");
			System.out.println("2. Armstrong Number");
			System.out.println("3. Student Grade");
			System.out.println("4. Shopping Bill");
			System.out.println("5. Calculator");
			System.out.println("6. Even/Odd");
			System.out.println("7. Prime Number");
			System.out.println("8. Reverse Number");
			System.out.println("9. Loan Eligibility");
			System.out.println("10. Highest of 4 Numbers");
			System.out.println("11. Area of Circle");
			System.out.println("12. Area of Rectangle");
			System.out.println("13. Area of Triangle");
			System.out.println("14. Add Two Numbers");
			System.out.println("15. Add Three Numbers");
			System.out.println("16. Add Double Numbers");
			System.out.println("17. Bank Account");
			System.out.println("18. Student Validation");
			System.out.println("19. Vehicle & Car");
			System.out.println("20. Employee & Manager");
			System.out.println("0. Exit");

			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 0:
				System.out.println("Thank You!");
				return;

			case 1:
				System.out.println("=========Electricity Bill==========");

				System.out.println("Enter the units consumed: ");
				int units = sc.nextInt();

				ElectricityBill eb = new ElectricityBill(units);

				eb.calculateElectricityBill(units);
				break;

			case 2:
				System.out.println("=================Armstrong Number===========");

				System.out.println("Enter number: ");
				int armnum = sc.nextInt();

				Armstrong_Number an = new Armstrong_Number(armnum);

				if (an.isArmstrong(armnum)) {
					System.out.println("Armstrong Number");
				} else {
					System.out.println("Not an Armstrong Number");
				}

				break;

			case 3:
				System.out.println("====================3. Student Grade===============");

				sc.nextLine();
				System.out.println("Enter Student Name: ");
				String sname = sc.nextLine();

				int m1;
				int m2;
				int m3;

				do {
					System.out.println("Enter the marks of 1st subject: ");
					m1 = sc.nextInt();

					if (m1 < 0 || m1 > 100) {
						System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
					}
				} while (m1 < 0 || m1 > 100);

				do {
					System.out.println("Enter the marks of 2nd subject: ");
					m2 = sc.nextInt();

					if (m2 < 0 || m2 > 100) {
						System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
					}
				} while (m2 < 0 || m2 > 100);

				do {
					System.out.println("Enter the marks of 3rd subject: ");
					m3 = sc.nextInt();

					if (m3 < 0 || m3 > 100) {
						System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
					}
				} while (m3 < 0 || m3 > 100);

				StudentGrade sg = new StudentGrade(sname, m1, m2, m3);

				sg.calculateGrade();
				break;

			case 4:
				System.out.println("====================4. Shopping Bill=================");
				sc.nextLine();
				System.out.println("Enter Product name:");
				String productName = sc.nextLine();

				System.out.println("Enter the quantity: ");
				int productQuantity = sc.nextInt();

				System.out.println("Enter the price of product: ");
				double productPrice = sc.nextDouble();

				Shopping_Bill sb = new Shopping_Bill(productName, productQuantity, productPrice);

				double totalbill = sb.bill();

				System.out.println("=======Bill=======");
				System.out.println("Product: " + sb.getPName());
				System.out.println("Quantity: " + sb.getPQuantity());
				System.out.println("Price: " + sb.getPPrice());
				System.out.println("Total Bill: " + totalbill);

				break;

			default:
				System.out.println("Invalid Choice!");
				break;
			}

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}

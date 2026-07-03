package June4;

import java.util.Scanner;

public class Recharge {

	int price = 0;
	double cgst = 0.09;
	double sgst = 0.09;

	public void recharge(int choice, int pack) {

		switch (choice) {
		case 1:
			switch (pack) {

			case 1:
				System.out.println("Data Packs");
				price = 19;
				break;
			case 2:
				price = 39;
				break;
			case 3:
				price = 49;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			break;

		case 2:
			switch (pack) {
			case 1:
				System.out.println("Talktime");
				price = 10;
				break;
			case 2:
				price = 30;
				break;
			case 3:
				price = 40;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			break;

		case 3:
			switch (pack) {
			case 1:
				System.out.println("Combo Pack");
				price = 199;
				break;
			case 2:
				price = 399;
				break;
			case 3:
				price = 599;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			break;
		default:
			System.out.println("Invalid Choice");
		}

		if (price > 0) {
			double final_amt = price + (price * cgst) + (price * sgst);
			System.out.println("Recharge Amount = ₹" + price);
			System.out.println(" SGST = " + "Rs. " + (price * sgst));
			System.out.println(" CGST = " + "Rs. " + (price * cgst));
			System.out.println("Total Amount = ₹ " + String.format("%.2f", final_amt));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select Recharge Type");

		System.out.println("1. Data Pack");
		System.out.println("2. Talktime");
		System.out.println("3. Combo Pack");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Data Packs");
			System.out.println("1. 1GB - Rs.19");
			System.out.println("2. 3GB - Rs.39");
			System.out.println("3. 7GB - Rs.49");
			break;
		case 2:
			System.out.println("Talktime");
			System.out.println("1. Rs.10");
			System.out.println("2. Rs.30");
			System.out.println("3. Rs.50");
			break;
		case 3:
			System.out.println("Combo Pack");
			System.out.println("1. 28 Days - ₹199");
			System.out.println("2. 56 Days - ₹399");
			System.out.println("3. 84 Days - ₹599");
			break;
		default:
			System.out.println("Invalid Choice");
		}

		System.out.println("Select Packs.!");
		int pack = sc.nextInt();

		Recharge r = new Recharge();
		r.recharge(choice, pack);

		sc.close();

	}
}

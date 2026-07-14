package methods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char cha;
		do {
			System.out.println("===== MENU =====");
			System.out.println("1. ATM ");
			System.out.println("2. Student Result ");
			System.out.println("3. Mobile Recharge ");
			System.out.println("4. Temperature Converter");
			System.out.println("21. Exit");
			int choose = sc.nextInt();
			switch (choose) {

			case 1:
				ATM a = new ATM();
				char ch;
				do {
					System.out.println("Select one the below: ");
					System.out.println("1. Check Balance.");
					System.out.println("2. Withdraw Cash");
					int choice = sc.nextInt();

					switch (choice) {

					case 1:
						a.checkBalance();
						break;
					case 2:
						System.out.println("Enter the amount in multiples of 100, 200 or 500 only.");
						int withdraw = sc.nextInt();
						if (withdraw <= 0 || withdraw % 100 != 0) {
							System.out.println("Enter the amount in multiples of 100, 200 or 500 only.");
						} else {
							double remainingAmt = a.withdrawAmount(withdraw);
							System.out.println("Your Balance: " + remainingAmt);
						}
						break;

					default:
						System.out.println("Invalid Choice.!");
						break;
					}

					System.out.println("Do you want to continue? y/n");
					ch = sc.next().charAt(0);
				} while (ch == 'y' || ch == 'Y');
				break;
			case 2:
				Student_Result sr = new Student_Result();
				char ch2;
				do {
					System.out.println("Enter your marks.!");
					System.out.println("1. DevOps");
					int devops = sc.nextInt();
					if (devops <= 0 || devops >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						devops = sc.nextInt();
					}
					System.out.println("2. Cloud");
					int cloud = sc.nextInt();
					if (cloud <= 0 || cloud >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						cloud = sc.nextInt();
					}
					System.out.println("3. Java");
					int javamarks = sc.nextInt();
					if (javamarks <= 0 || javamarks >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						javamarks = sc.nextInt();
					}
					System.out.println("4. DSA");
					int dsa = sc.nextInt();
					if (dsa <= 0 || dsa >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						dsa = sc.nextInt();
					}

					double percentage = sr.calculatePercentage(dsa, cloud, devops, javamarks);
					System.out.println("Percentage = " + percentage);

					System.out.println("Do you want to continue? y/n");
					ch2 = sc.next().charAt(0);
				} while (ch2 == 'y' || ch2 == 'Y');
				break;

//			case 3:
//				Mobile_Recharge mr = new Mobile_Recharge();
//				System.out.println("Select one of the below: ");
//				System.out.println("1. Data Plan");
//				System.out.println("2. Talktime");
//				System.out.println("3. Combo Packs");
//				int mRecharge = sc.nextInt();
//
//				char ch3;
//
//				do {
//					switch (mRecharge) {
//
//					case 1:
//						mr.dataPlan();
//						int plan = sc.nextInt();
//
//						if (plan == 1) {
//							mr.recharge(199);
//						} else if (plan == 2) {
//							mr.recharge(299);
//						} else {
//							System.out.println("Invalid Plan!");
//						}
//
//						break;
//
//					case 2:
//						mr.talkTime();
//						int plan = sc.nextInt();
//
//						if (plan == 1) {
//							mr.recharge(199);
//						} else if (plan == 2) {
//							mr.recharge(299);
//						} else {
//							System.out.println("Invalid Plan!");
//						}
//
//						break;
//
//					case 3:
//						mr.comboPack();
//						int plan = sc.nextInt();
//
//						if (plan == 1) {
//							mr.recharge(199);
//						} else if (plan == 2) {
//							mr.recharge(299);
//						} else {
//							System.out.println("Invalid Plan!");
//						}
//
//						break;
//
//					default:
//						System.out.println("Invalid Choice!");
//						break;
//					}
//
//					System.out.println("Do you want to continue? y/n");
//					ch3 = sc.next().charAt(0);
//				} while (ch3 == 'y' || ch3 == 'Y');
//
//			case 4:

			case 21:
				System.out.println("Thank You!");
				sc.close();
				return;

			default:
				System.out.println("Invalid Choice.!");
				break;
			}
			System.out.println("Return to Main Menu? y/n");
			cha = sc.next().charAt(0);
		} while (cha == 'y' || cha == 'Y');

	}

}

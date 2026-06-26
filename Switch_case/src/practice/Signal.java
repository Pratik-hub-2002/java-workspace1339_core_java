package practice;

import java.util.Scanner;

public class Signal {

	public void signal(int choice) {

		switch (choice) {

		case 1:
			System.out.println("Stop your vehicle.");
			break;
		case 2:
			System.out.println("Slow your vehicle.");
			break;
		case 3:
			System.out.println("You can go now.");
			break;
		default:
			System.out.println("Invalid Input");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select Traffic Signal Color:");

		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green");
		int choice = sc.nextInt();

		Signal s = new Signal();
		s.signal(choice);

	}
}

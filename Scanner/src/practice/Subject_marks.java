package practice;

import java.util.Scanner;

public class Subject_marks {

	public int marks(int devops, int cc, int iot, int cs, int java, int dsa) {

		return devops + cc + iot + cs + java + dsa;
	}

	public double percentage(int total_marks) {

		return total_marks / 500.0 * 100;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Subject_marks sm = new Subject_marks();

		do {
			int devops;
			while (true) {
				System.out.println("Enter the marks of DevOps = /100");
				devops = sc.nextInt();
				if (devops >= 0 && devops <= 100) {
					break;
				}
				System.out.println("Invalid marks entered!");
			}
			int cc;
			while (true) {
				System.out.println("Enter the marks of Cloud Computing = /100");
				cc = sc.nextInt();
				if (cc >= 0 && cc <= 100) {
					break;
				}
				System.out.println("Invalid marks entered!");
			}
			int iot;
			while (true) {
				System.out.println("Enter the marks of Iot = /100");
				iot = sc.nextInt();
				if (iot >= 0 && iot <= 100) {
					break;
				}
				System.out.println("Invalid marks entered!");
			}
			int cs;
			while (true) {
				System.out.println("Enter the marks of Cyber Security = /50");
				cs = sc.nextInt();
				if (cs >= 0 && cs <= 50) {
					break;
				}
				System.out.println("Invalid marks entered!");
			}
			int java;
			while (true) {
				System.out.println("Enter the marks of Java = /50");
				java = sc.nextInt();
				if (java >= 0 && java <= 50) {
					break;
				}
				System.out.println("Invalid marks entered!");
			}
			int dsa;
			while (true) {
				System.out.println("Enter the marks of Data Structure & Algorithms = /100");
				dsa = sc.nextInt();

				if (dsa >= 0 && dsa <= 100) {

					break;
				}
				System.out.println("Invalid marks entered!");
			}

			int total_marks = sm.marks(devops, cc, iot, cs, java, dsa);
			double percentage = sm.percentage(total_marks);
			System.out.println("Total marks = " + total_marks + " /500");
			System.out.println("Percentage = " + percentage + "%\n");

		} while (true);
	}
}

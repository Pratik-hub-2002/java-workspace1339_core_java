package practice;

import java.util.Scanner;

public class Marks {

	public String marks(float marks) {
		if (marks >= 35) {
			return "Student is Pass";
		} else {
			return "Student is Fail";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Marks m = new Marks();

		char ch;

		do {
			System.out.println("Enter your marks: ");
			float marks = sc.nextFloat();

			System.out.println(m.marks(marks));

			System.out.println("\nDo you want to continue? (Y/N)");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}

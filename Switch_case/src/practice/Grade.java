package practice;

import java.util.Scanner;

public class Grade {

	public void grade(char ch) {

		switch (ch) {

		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Grade = ");
		char ch = Character.toUpperCase(sc.next().charAt(0));

		Grade g = new Grade();
		g.grade(ch);

	}

}

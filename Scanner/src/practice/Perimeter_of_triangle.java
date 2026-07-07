package practice;

import java.util.Scanner;

public class Perimeter_of_triangle {

	public int triangle(int first_num, int second_num, int third_num) {

		return first_num + second_num + third_num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perimeter_of_triangle p = new Perimeter_of_triangle();

		char ch;
		do {
			System.out.println("Calculate Perimeter of triangle.");
			System.out.println("----------------------------------");
			System.out.println("Enter the 1st of triangle = ");
			int first_num = sc.nextInt();

			System.out.println("Enter the 2nd of triangle = ");
			int seond_num = sc.nextInt();

			System.out.println("Enter the 3rd of triangle = ");
			int third_num = sc.nextInt();

			int result = p.triangle(first_num, seond_num, third_num);
			System.out.println("Perimeter of triangle = " + result);

			System.out.println("do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
	}
}

package practice;

import java.util.Scanner;

public class Rectangle {

	public int rectangle(int length, int width) {

		return length * width;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();

		do {
			System.out.println("Enter Length of Rectangle = ");
			int length = sc.nextInt();

			System.out.println("Enter width of Rectangle = ");
			int width = sc.nextInt();

			if (length <= 0 || width <= 0) {
				System.out.println("Length or width cannot be 0 or less than 0!");
				continue;
			}
			int area = r.rectangle(length, width);
			System.out.println("Area of rectangle = " + area);
		} while (true);
	}
}

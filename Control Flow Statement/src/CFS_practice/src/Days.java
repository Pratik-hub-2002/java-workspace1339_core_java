package CFS_practice.src;

import java.util.*;

public class Days {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number = ");
		int day = sc.nextInt();

		if (day == 1) {
			System.out.println(day + " is Monday");
		} else if (day == 2) {
			System.out.println(day + " is Tuesday");
		} else if (day == 3) {
			System.out.println(day + " is Wednesday");
		} else if (day == 4) {
			System.out.println(day + " is Thursday");
		} else if (day == 5) {
			System.out.println(day + " is Friday");
		} else if (day == 6) {
			System.out.println(day + " is Saturday");
		} else if (day == 7) {
			System.out.println(day + " is Sunday");
		} else {
			System.out.println(day + "Not Defined");
		}
		sc.close();
	}

}

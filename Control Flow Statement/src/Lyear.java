import java.util.*;

public class Lyear {

	void checkYear(int year) {

		if (year % 4 == 0) {
			System.out.println(year + " This is leap year");

			if (year % 100 == 0) {

				System.out.println(year + " It's a century year");
			}

		} else {
			System.out.println(year + " Not a leap year");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter year = ");
		int year = sc.nextInt();

		Lyear l = new Lyear();
		l.checkYear(year);

	}
}

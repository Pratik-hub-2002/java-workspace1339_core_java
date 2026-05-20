import java.util.*;

public class Year {

	void checkLeap(int year) {
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter year to check leap or not = ");
		int year = sc.nextInt();

		Year y = new Year();
		y.checkLeap(year);

	}
}

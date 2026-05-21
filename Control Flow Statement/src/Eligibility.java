import java.util.*;

public class Eligibility {

	void checkAge(int age) {

		if (age >= 18) {

			System.out.println("Person is eligible to vote");

			if (age >= 25) {
				System.out.println("Person can contest in election");
			}
		} else {
			System.out.println("Not elegible");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = sc.nextInt();

		Eligibility e = new Eligibility();

		e.checkAge(age);
	}
}

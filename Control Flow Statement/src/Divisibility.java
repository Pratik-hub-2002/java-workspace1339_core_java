import java.util.*;

public class Divisibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number = ");
		int num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println("Number " + num + " is divisible by 10");
		} else {
			System.out.println("Number " + num + " is not divisible by 10");
		}
	}
}

import java.util.*;

public class EO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check even or odd = ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is Even Number");
		} else {
			System.out.println(num + " is Odd Number");
		}
	}
}

import java.util.*;

public class EO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		switch (num % 2) {

		case 1:
			System.out.println("It is an Even number");
			break;

		default:
			System.out.println("It is an Odd number");
		}
	}

}

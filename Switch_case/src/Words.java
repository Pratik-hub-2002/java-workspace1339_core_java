import java.util.*;

public class Words {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number between 1 to 5 : ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}

}

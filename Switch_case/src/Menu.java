import java.util.*;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Profile");
		System.out.println("4. Logout");

		System.out.println("Enter your choice = ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Successfully Login");
			break;
		case 2:
			System.out.println("Successfully Register");
			break;
		case 3:
			System.out.println("Profile");
			break;
		case 4:
			System.out.println("Logout");
			break;
		default:
			System.out.println("Invalid Input");

		}
	}

}

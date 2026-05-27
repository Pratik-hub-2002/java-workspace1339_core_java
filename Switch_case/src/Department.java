import java.util.*;

public class Department {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter department code = ");
		int department = sc.nextInt();

		switch (department) {

		case 1:
			System.out.println("Computer Science");
			break;
		case 2:
			System.out.println("Mechanical");
			break;
		case 3:
			System.out.println("Civil");
			break;
		case 4:
			System.out.println("Electrical");
			break;

		default:
			System.out.println("Not defined");
		}
	}

}

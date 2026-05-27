import java.util.*;

public class Languagename {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter language code = ");
		int code = sc.nextInt();

		switch (code) {

		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("Python");
			break;
		case 3:
			System.out.println("C++");
			break;
		case 4:
			System.out.println("JavaScript");
			break;

		default:
			System.out.println("Invalid Code");
		}
	}

}

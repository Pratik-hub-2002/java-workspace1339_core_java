package Practice;

public class Even_switch {

	public static void main(String[] args) {

		int num = 11111;

		switch (num % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("invalid Input");
		}
	}
}

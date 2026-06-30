package Practice;

public class Sum {

	static int sum = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println("i = " + i + ", Sum = " + sum);
		}
		System.out.println("Total = " + sum);
	}
}

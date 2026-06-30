package Practice;

public class Factorial {

	public static void main(String[] args) {

		long fact = 1;
//		int num=5;

		for (int i = 1; i <= 4; i++) {

			System.out.println(i + " X " + fact + " = " + (fact * i));
			fact = fact * i;
		}
		System.out.println("" + fact);
	}
}

package Practice;

public class Leap {

	public static void main(String[] args) {

		for (int i = 2000; i <= 2026; i++) {

			if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
				System.out.println(i + " Leap");
			} else {
				System.out.println(i + " Not");
			}
		}
	}
}
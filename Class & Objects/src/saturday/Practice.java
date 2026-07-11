package saturday;

public class Practice {

	public void name() {
		System.out.println("Pratik Raut");
	}

	public void add(int a, int b) {
		System.out.println("Addition of :" + a + " + " + b + " = " + (a + b));
	}

	public void evenOdd(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is a Even number.");
		} else {
			System.out.println(num + " is a Odd number.");
		}
	}

	public int square(int num) {
		return num * num;
	}

	public int largest_num(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}

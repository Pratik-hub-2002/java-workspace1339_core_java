import java.util.*;

public class OD5 {

	void checkOD(int num) {

		if (num % 2 == 0) {

			System.out.println(num + " is an even number");

			if (num > 50) {

				System.out.println(num + " is greater than 50");
			}
		} else {

			System.out.println(num + " is an odd number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numner ");
		int num = sc.nextInt();

		OD5 o = new OD5();
		o.checkOD(num);

	}
}

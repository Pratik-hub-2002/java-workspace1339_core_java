import java.util.*;

public class PN {

	void checkpn(int num) {

		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Zero is not positive nor zero");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number = ");
		int num = sc.nextInt();

		PN p = new PN();
		p.checkpn(num);
	}
}

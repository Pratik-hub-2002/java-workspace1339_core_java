package CFS_practice.src;
import java.util.*;

public class Div3and5 {

	void checkDiv(int num) {

		if (num % 3 == 0 && num % 5 == 0) {

			System.out.println("It is divisible by 3 & 5");

		} else {
			System.out.println("Not divisible by 3 & 5 ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		Div3and5 d = new Div3and5();
		d.checkDiv(num);

		sc.close();
	}

}

package offline;

import java.util.Scanner;

public class Arm {

	public void checkARm(int num) {
		int temp = num;
		int sum = 0;

		while (num != 0) {

			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;

		}

		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number: ");
		int num = sc.nextInt();

		Arm a = new Arm();
		a.checkARm(num);

		sc.close();
	}

}

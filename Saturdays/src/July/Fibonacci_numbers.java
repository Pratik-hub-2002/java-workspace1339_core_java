package July;

import java.util.Scanner;

public class Fibonacci_numbers {

	int a = 0, b = 1;

	public void fibonacci_num(int num) {

		for (int i = 1; i <= num; i++) {

			int c = a + b;
			a = b;
			b = c;

			System.out.println(a + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fibonacci_numbers fn = new Fibonacci_numbers();

		System.out.println("Enter number you want fibonacci series till = ");
		int num = sc.nextInt();

		fn.fibonacci_num(num);

	}

}

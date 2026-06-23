package Practice;

import java.util.*;

public class Swap {

	public void third(int first_num, int second_num) {

		int temp = first_num;
		first_num = second_num;
		second_num = temp;

		System.out.println("\nAfter Swapping");
		System.out.println("First number = " + first_num);
		System.out.println("Second number = " + second_num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number = ");
		int first_num = sc.nextInt();

		System.out.println("Enter second number = ");
		int second_num = sc.nextInt();

		Swap s = new Swap();
		s.third(first_num, second_num);

		sc.close();

	}

}

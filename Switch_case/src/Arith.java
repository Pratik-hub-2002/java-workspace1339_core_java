import java.util.*;

public class Arith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number = ");
		int f = sc.nextInt();

		System.out.println("Enter second number = ");
		int s = sc.nextInt();

		System.out.println("Select Operation (+,-,*,/): ");
		char op = sc.next().charAt(0);

		switch (op) {

		case '+':
			System.out.println("Addition =  " + (f + s));
			break;
		case '-':
			System.out.println("Substraction =  " + (f - s));
			break;
		case '*':
			System.out.println("Multiplication =  " + (f * s));
			break;
		case '/':
			System.out.println("Division =  " + (f / s));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}

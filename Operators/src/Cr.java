import java.util.Scanner;


public class Cr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number = ");
		int age = sc.nextInt();
		
		System.out.println("What first number is = "+ age);
		
//		System.out.println("Enter your second number = ");
//		int b = sc.nextInt();
//		
//		System.out.println("Your second number is = " + b );
		
		if (age >= 18 && age <= 120) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting as age under 18");
		}
	}

}

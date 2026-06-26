package june;

import java.util.Scanner;

public class Upp_Case {

	public void upp(char word) {

		if (word >= 'A' && word <= 'Z') {

			System.out.println(word + " is a Uppercase Letter");
		} else {

			System.out.println(word + " is a Lowercase Letter");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character = ");
		char word = sc.next().charAt(0);

		Upp_Case uc = new Upp_Case();
		uc.upp(word);

		sc.close();
	}

}

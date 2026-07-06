package practice;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a sentence : ");
			String sentence = sc.nextLine();

			System.out.println("You entered: " + sentence);
		} while (true);

	}

}

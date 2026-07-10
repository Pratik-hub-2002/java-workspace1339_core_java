package practice;

import java.util.Scanner;

public class Conca {

	public void conca(String sentence, String sentence2) {

		System.out.println("Concatenated sentence: " + sentence + " " + sentence2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conca c = new Conca();

		System.out.println("Enter any sentence: ");
		String sentence = sc.nextLine();

		System.out.println("Enter any sentence2: ");
		String sentence2 = sc.nextLine();

		c.conca(sentence, sentence2);

		sc.close();
	}

}

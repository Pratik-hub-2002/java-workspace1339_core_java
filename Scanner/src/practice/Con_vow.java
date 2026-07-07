package practice;

import java.util.Scanner;

public class Con_vow {

	public String vowels(char ch) {

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			ch = Character.toUpperCase(ch);
			if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') {
				return ch + " is a vowel.";
			} else {
				return ch + " is a consonant.";
			}
		} else if (ch >= '0' && ch <= '9') {
			return ch + " is a digit.";
		} else {
			return ch + " is a special character.";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Con_vow cv = new Con_vow();

		char c;
		do {
			System.out.println("Enter any character to check consonant or vowel");
			char ch = sc.next().charAt(0);

			String result = cv.vowels(ch);
			System.out.println(result);
			System.out.println("Do you want to continue? y/n");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
	}
}

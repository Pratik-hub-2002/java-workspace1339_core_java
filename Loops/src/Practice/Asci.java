package Practice;

import java.util.Scanner;

public class Asci {

	public void asci() {

		for (int ch = 48; ch <= 122; ch++) {

			if (ch >= 48 && ch <= 57) {
				System.out.println((char) ch + " --> " + ch + " Digit");
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println((char) ch + " --> " + ch + " & " + "Vowel" + " + Uppercase Letter");
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println((char) ch + " --> " + ch + " & " + "Vowel" + " + Lowercase Letter");
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println((char) ch + " --> " + ch + " & " + "Consonant" + " + Uppercase Letter");
			} else if (ch >= 'a' && ch <= 'z') {
				System.out.println((char) ch + " --> " + ch + " & " + "Consonant" + " + Lowercase Letter");
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		Asci a = new Asci();
		a.asci();

	}

}

package switch_case;

public class Vowels {

	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'z'; ch++) {

			switch (ch) {

			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println(ch + " = it is Vowel");
				break;

			default:
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

					System.out.println(ch + " = it is Consonant.");
				}
			}
		}
	}
}

package methods;

public class Palindrome_Checker {

	public boolean isPalindrome(int palin_num) {

		int temp = palin_num;
		int rev = 0, rem;

		while (palin_num != 0) {

			rem = palin_num % 10;
			rev = rev * 10 + rem;
			palin_num = palin_num / 10;
		}

		return temp == rev;

	}
}

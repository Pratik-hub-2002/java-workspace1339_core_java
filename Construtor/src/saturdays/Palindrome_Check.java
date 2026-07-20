package saturdays;

public class Palindrome_Check {

	int pnum;

	public Palindrome_Check(int pnum) {

		this.pnum = pnum;
	}

	public boolean check_Palindrome() {

		int num = pnum;
		int temp = pnum;
		int rem, rev = 0;

		while (pnum != 0) {

			rem = pnum % 10;
			rev = rev * 10 + rem;
			pnum = pnum / 10;
		}

		return temp == rev;
	}
}

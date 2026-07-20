package saturdays;

public class Number_Reverse {

	int rnum;

	public Number_Reverse(int rnum) {

		this.rnum = rnum;
	}

	public int makeReverse() {

		int rem, rev = 0;

		while (rnum != 0) {

			rem = rnum % 10;
			rev = rev * 10 + rem;
			rnum = rnum / 10;
		}

		return rev;
	}
}

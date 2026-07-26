package mix;

public class Reverse_Number {

	private int rnum;

	public Reverse_Number(int rnum) {

		this.rnum = rnum;
	}

	public void setRnum(int rnum) {

		this.rnum = rnum;
	}

	public int getRnum() {

		return rnum;
	}

	public int checkRevNum() {

		int num = rnum;
		int rem, rev = 0;

		while (rnum != 0) {

			rem = rnum % 10;
			rev = rev * 10 + rem;
			rnum = rnum / 10;
		}

		return rev;
	}

}

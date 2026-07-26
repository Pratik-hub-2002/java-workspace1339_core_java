package mix;

public class Even_Odd {

	private int cnum;

	public Even_Odd(int cnum) {

		this.cnum = cnum;

	}

	public void setNum(int cnum) {

		this.cnum = cnum;

	}

	public int getNum() {

		return cnum;

	}

	public String checkEvenOdd() {

		if (cnum % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}

package saturdays;

public class Even_or_Odd {
	int num;

	public Even_or_Odd(int num) {

		this.num = num;
	}

	public String check_even_odd(int num) {

		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}

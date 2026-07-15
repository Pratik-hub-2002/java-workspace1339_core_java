package methods;

public class Find_Maximum_Number {

	public int findMax(int first_number, int second_number, int third_number) {

		if (first_number > second_number && first_number > third_number) {
			return first_number;
		} else if (second_number > third_number) {
			return second_number;
		}
		return third_number;
	}
}

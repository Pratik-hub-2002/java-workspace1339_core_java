package saturdays;

public class Max_of_Three_Numbers {

	int first_num;
	int second_num;
	int third_num;

	public Max_of_Three_Numbers(int first_num, int second_num, int third_num) {

		this.first_num = first_num;
		this.second_num = second_num;
		this.third_num = third_num;
	}

	public int maxofThreeNumbers() {

		if (first_num > second_num && first_num > third_num) {
			return first_num;
		} else if (second_num > third_num) {
			return second_num;
		}
		return third_num;
	}
}

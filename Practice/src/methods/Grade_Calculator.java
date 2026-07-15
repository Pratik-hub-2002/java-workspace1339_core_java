package methods;

public class Grade_Calculator {

	public char getGrade(int marks) {
		if (marks >= 90 && marks <= 100) {
			return 'A';
		} else if (marks >= 75) {
			return 'B';
		} else if (marks >= 60) {
			return 'C';
		} else {
			return 'D';
		}
	}
}

package methods;

public class Student {
	int rollNo;
	String name;
	String course;
	String collegeName;
	double javaMarks;
	double pythonMarks;
	double sqlMarks;
	double total;
	double percentage;
	String grade;

	public double calculateTotal() {

		total = javaMarks + pythonMarks + sqlMarks;
		return total;
	}

	public double calculatePercentage() {

		percentage = total / 3;
		return percentage;
	}

	public String calculateGrade() {

		if (percentage >= 75) {
			grade = "A";
		} else if (percentage >= 60) {
			grade = "B";
		} else if (percentage >= 35) {
			grade = "C";
		} else {
			grade = "Fail";
		}

		return grade;
	}
}

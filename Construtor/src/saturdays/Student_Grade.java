package saturdays;

public class Student_Grade {

	int stud_marks;

	public Student_Grade(int stud_marks) {

		this.stud_marks = stud_marks;
	}

	public char calGrade(int stud_marks) {

		if (stud_marks >= 90 && stud_marks <= 100) {
			return 'A';
		} else if (stud_marks >= 85) {
			return 'B';
		} else if (stud_marks >= 75) {
			return 'C';
		} else if (stud_marks >= 65) {
			return 'D';
		} else if (stud_marks >= 45) {
			return 'E';
		} else {
			return 'F';
		}
	}

}

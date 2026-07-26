package mix;

public class Student_Validation {

	private String stud_name;
	private int stud_marks;

	public Student_Validation(String stud_name, int stud_marks) {

		this.stud_name = stud_name;
		setStud_marks(stud_marks);

	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getStud_marks() {
		return stud_marks;
	}

	public void setStud_marks(int stud_marks) {

		if (stud_marks >= 0 && stud_marks <= 100) {
			this.stud_marks = stud_marks;
		} else {
			System.out.println("Invalid Marks! Marks should be between 0 and 100.");
			this.stud_marks = 0;
		}
	}

}

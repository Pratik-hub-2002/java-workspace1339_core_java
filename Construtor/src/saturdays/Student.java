package saturdays;

public class Student {

	String name;
	int marks;

	public Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}

	public String result() {

		if (marks >= 40 && marks <= 100) {
			return "Pass";
		} else {
			return "Fail!";
		}
	}
}

package practice;

public class Student_Details {

	private String sname;
	private int sroll_no;
	private int marks;

	public Student_Details(String sname, int sroll_no, int marks) {

		this.sname = sname;
		this.marks = marks;
		this.sroll_no = sroll_no;
	}

	public void setName(String sname) {
		this.sname = sname;
	}

	public void setRollno(int sroll_no) {
		this.sroll_no = sroll_no;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return sname;
	}

	public int getMarks() {
		return marks;
	}

	public int getRollno() {
		return sroll_no;
	}

}

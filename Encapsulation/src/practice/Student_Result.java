package practice;

public class Student_Result {

	private String studentName;
	private int rollNo;
	private int sub1;
	private int sub2;
	private int sub3;

	public Student_Result(String studentName, int rollNo, int sub1, int sub2, int sub3) {

		this.studentName = studentName;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getSub1() {
		return sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int calculateTotal() {
		return sub1 + sub2 + sub3;
	}

	public double calculateAverage() {
		return calculateTotal() / 3.0;
	}
}

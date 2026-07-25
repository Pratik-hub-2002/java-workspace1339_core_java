package mix;

public class StudentGrade {

	private String sname;
	private int m1;
	private int m2;
	private int m3;

	public StudentGrade(String sname, int m1, int m2, int m3) {

		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void setName(String sname) {
		this.sname = sname;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String getName() {
		return sname;
	}

	public int getM1() {
		return m1;
	}

	public int getM2() {
		return m2;
	}

	public int getM3() {
		return m3;
	}

	public void calculateGrade() {

		if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {

			System.out.println("Invalid Marks!");
			return;
		}

		double average = (m1 + m2 + m3) / 3.0;

		System.out.println("Student Name : " + sname);
		System.out.println("Average : " + average);

		if (average > 75) {
			System.out.println("Grade A");
		} else if (average >= 60) {
			System.out.println("Grade B");
		} else if (average >= 40) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
	}

}

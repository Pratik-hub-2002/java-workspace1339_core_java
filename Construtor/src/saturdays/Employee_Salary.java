package saturdays;

public class Employee_Salary {

	String ename;
	double basic;

	public Employee_Salary(String ename, double basic) {

		this.basic = basic;
		this.ename = ename;
	}

	public double bonus() {
		return basic * 0.20;
	}

	public double salary() {

		return basic + bonus();
	}
}
package practice;

public class Employee_Salary_Validation {
	private int empId;
	private String empName;
	private double salary;

	public Employee_Salary_Validation(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary cannot be negative.");
		}
	}
}

package methods;

public class Employee {
	int empId;
	String empName;
	String department;
	String designation;
	String companyName;
	String city;
	String email;
	long mobileNo;
	double basicSalary;
	double hra;
	double da;
	double salary;
	double pf;
	double esic;
	double pt;
	double netSalary;

	public double calculateSalary() {

		hra = basicSalary * 0.20;
		da = basicSalary * 0.50;
		pf = basicSalary * 0.12;
		esic = basicSalary * 0.0075;

		double bonus;

		if (basicSalary > 50000) {
			bonus = basicSalary * 0.10;
		} else {
			bonus = basicSalary * 0.05;
		}

		salary = basicSalary + hra + da + bonus;

		pt = 0;

		if (salary >= 9000) {
			pt = 200;
		} else if (salary >= 7500) {
			pt = 175;
		}

		netSalary = salary - pf - esic - pt;

		System.out.println("Basic = " + basicSalary);
		System.out.println("HRA = " + hra);
		System.out.println("DA = " + da);
		System.out.println("Bonus = " + bonus);
		System.out.println("PF = " + pf);
		System.out.println("ESIC = " + esic);
		System.out.println("PT = " + pt);

		return netSalary;
	}

	public void displayEmployee() {

		System.out.println("\nEmployee Details");
		System.out.println("----------------------");
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Department : " + department);
		System.out.println("Designation : " + designation);
		System.out.println("Company Name : " + companyName);
		System.out.println("City : " + city);
		System.out.println("Email : " + email);
		System.out.println("Mobile No : " + mobileNo);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("Gross Salary : " + salary);
		System.out.println("PF = " + pf);
		System.out.println("ESIC = " + esic);
		System.out.println("PT = " + pt);

		System.out.println("Net Salary : " + netSalary);
	}
}

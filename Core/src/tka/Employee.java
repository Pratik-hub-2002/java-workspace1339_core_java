package tka;

public class Employee {

	int emp_id;
	String emp_name;
	String emp_dept;
	String city;
	double salary;

	void e1() {

		System.out.println("\n------------Employee's Information------------\n");
		System.out.println("Employee Id :- " + emp_id);
		System.out.println("Employee Name :- " + emp_name);
		System.out.println("Employee Department :- " + emp_dept);
		System.out.println("Employee City :- " + city);
		System.out.println("Employee Salary :- " + salary + "INR");
	}

}

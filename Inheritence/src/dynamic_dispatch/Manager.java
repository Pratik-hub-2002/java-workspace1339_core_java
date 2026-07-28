package dynamic_dispatch;

public class Manager extends Employee {

	public Manager(int empId, String name, String designation, double salary) {
		super(empId, name, designation, salary);
	}

	@Override
	public double calculateSalary() {

		double hra = getSalary() * 0.25;
		double da = getSalary() * 0.15;

		double total = getSalary() + hra + da;

		System.out.println("Basic Salary : ₹" + getSalary());
		System.out.println("HRA (25%)    : ₹" + hra);
		System.out.println("DA (15%)     : ₹" + da);

		return total;
	}
}

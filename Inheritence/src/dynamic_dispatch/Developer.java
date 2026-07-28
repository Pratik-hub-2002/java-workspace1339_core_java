package dynamic_dispatch;

public class Developer extends Employee {

	public Developer(int empId, String name, String designation, double salary) {
		super(empId, name, designation, salary);
	}

	@Override
	public double calculateSalary() {

		double hra = getSalary() * 0.20;
		double da = getSalary() * 0.10;

		double total = getSalary() + hra + da;

		System.out.println("Basic Salary : ₹" + getSalary());
		System.out.println("HRA (20%)    : ₹" + hra);
		System.out.println("DA (10%)     : ₹" + da);

		return total;
	}
}

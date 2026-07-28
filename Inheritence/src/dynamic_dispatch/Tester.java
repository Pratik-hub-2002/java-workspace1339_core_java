package dynamic_dispatch;

public class Tester extends Employee {

	public Tester(int empId, String name, String designation, double salary) {
		super(empId, name, designation, salary);
	}

	@Override
	public double calculateSalary() {

		double hra = getSalary() * 0.18;
		double da = getSalary() * 0.08;

		double total = getSalary() + hra + da;

	    System.out.println("Basic Salary : ₹" + getSalary());
	    System.out.println("HRA (18%)    : ₹" + hra);
	    System.out.println("DA (8%)     : ₹" + da);

	    return total;
	}
}

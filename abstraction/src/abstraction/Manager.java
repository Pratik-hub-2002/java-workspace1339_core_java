package abstraction;

public class Manager implements Employee {

	double basicSalary = 50000;

	@Override
	public double calculateSalary() {

		double hra = basicSalary * 0.30;

		return basicSalary + hra;
	}
}

package abstraction;

public class Tester implements Employee {

	double basicSalary = 40000;

	@Override
	public double calculateSalary() {

		double hra = basicSalary * 0.15;

		return basicSalary + hra;
	}
}
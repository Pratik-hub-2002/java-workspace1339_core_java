package abstraction;

public class Developer implements Employee {

	double basicSalary = 40000;

	@Override
	public double calculateSalary() {

		double hra = basicSalary * 0.20;

		return basicSalary + hra;
	}
}

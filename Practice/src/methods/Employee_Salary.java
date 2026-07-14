package methods;

public class Employee_Salary {

	public double calculateSalary(double basic) {

		double hra = basic * 0.2;
		double da = basic * 0.10;

		return basic + hra + da;
	}
}

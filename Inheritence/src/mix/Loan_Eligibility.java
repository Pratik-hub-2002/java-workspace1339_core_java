package mix;

//Salary > 25,000
//Age between 21–60
//If both true → Eligible
//Else → Not Eligible

public class Loan_Eligibility {

	private int lage;
	private double lsalary;

	public Loan_Eligibility(int lage, double lsalary) {

		this.lage = lage;
		this.lsalary = lsalary;
	}

	public void setAge(int lage) {

		this.lage = lage;
	}

	public void setSalary(double lsalary) {

		this.lsalary = lsalary;
	}

	public int getAge() {

		return lage;
	}

	public double getSalary() {
		return lsalary;
	}

	public boolean checkLoanElegibilty() {

		if (lage >= 21 && lage <= 60) {

			if (lsalary > 25000) {
				return true;
			}
		}
		return false;
	}
}

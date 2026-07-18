package saturdays;

public class Simple_Interest {

	double principal;
	double interest;
	double tenure;

	public Simple_Interest(double principal, double interest, double tenure) {

		this.principal = principal;
		this.interest = interest;
		this.tenure = tenure;
	}

	public double simple_interest() {

		return (principal * interest * tenure) / 100;
	}
}

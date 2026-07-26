package mix;

public class Calculator {

	private double result;

	public Calculator(double firstNumber) {
		this.result = firstNumber;
	}

	public double add(double num) {

		result = result + num;
		return result;
	}

	public double sub(double num) {

		result = result - num;
		return result;
	}

	public double multi(double num) {

		result = result * num;
		return result;
	}

	public double div(double num) {

		if (num != 0) {
			result = result / num;
		} else {
			System.out.println("Cannot divide by zero.");
		}
		return result;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}

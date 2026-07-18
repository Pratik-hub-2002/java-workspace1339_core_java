package saturdays;

public class Temperature_Converter {

	double temp;

	public Temperature_Converter(double temp) {
		this.temp = temp;
	}

	public double celsiusToFahrenheit() {

		return (temp * 9 / 5) + 32;
	}

	public double fahrenheitToCelsius() {

		return (temp - 32) * 5 / 9;
	}

}

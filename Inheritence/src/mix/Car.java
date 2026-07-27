package mix;

public class Car extends Vehicle {

	public Car() {

	}

	public void showSpeed() {
		System.out.println("Speed : 120 km/hr");
	}

	public static void main(String[] args) {

		Car c = new Car();

		c.start();
		c.showSpeed();
	}
}

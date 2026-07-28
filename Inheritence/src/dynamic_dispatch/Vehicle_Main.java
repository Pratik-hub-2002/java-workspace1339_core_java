package dynamic_dispatch;

public class Vehicle_Main {

	public static void main(String[] args) {

		Vehicle v;

		v = new Car();
		v.start();

		v = new Bike();
		v.start();

		v = new Bus();
		v.start();
	}

}

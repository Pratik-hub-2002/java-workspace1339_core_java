package dynamic_dispatch;

public class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car starts using Push Button");
	}
}

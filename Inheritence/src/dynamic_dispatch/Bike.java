package dynamic_dispatch;

public class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Bike starts using Self Start");
	}
}

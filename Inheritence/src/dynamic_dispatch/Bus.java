package dynamic_dispatch;

public class Bus extends Vehicle {

	@Override
	void start() {
		System.out.println("Bus starts using Air Brake");
	}
}

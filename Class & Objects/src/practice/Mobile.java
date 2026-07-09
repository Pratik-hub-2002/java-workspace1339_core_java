package practice;

public class Mobile {

	String brand;
	int ram;
	double price;

	public void showSpec() {
		System.err.println("--------Car Info--------");
		System.out.println("Mobile Brand: " + brand);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Price: " + price);
	}

}

package hybrid_inheritance;

public class Laptop extends Device {

	public void showLaptop() {

		System.out.println("This is Laptop Class");
	}

	public static void main(String[] args) {

		Laptop l = new Laptop();

		l.showDevice();
		l.showLaptop();
	}

}

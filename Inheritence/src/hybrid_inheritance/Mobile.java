package hybrid_inheritance;

public class Mobile extends Device {

	public void showMobile() {

		System.out.println("This is Mobile Class");
	}

	public static void main(String[] args) {

		Mobile m = new Mobile();

		m.showDevice();
		m.showMobile();
	}

}

package hybrid_inheritance;

public class Monitor extends Student {

	public void showMonitor() {
		System.out.println("This is Monitor");
	}

	public static void main(String[] args) {

		Monitor m = new Monitor();

		m.showCollege();
		m.showStudent();
		m.showMonitor();

	}
}

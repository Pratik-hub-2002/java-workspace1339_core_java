package multilevel_inheritance;

public class C extends B {

	public void showC() {
		System.out.println("This is from Class C");
	}

	public static void main(String[] args) {

		C c = new C();

		c.showA();
		c.showB();
		c.showC();
	}
}

package hierarchical_inheritance;

public class C extends A {

	public void m3() {
		System.out.println("This is method m3() from Class C");
	}

	public static void main(String[] args) {

		C c = new C();

		c.m1();
		c.m3();
	}

}

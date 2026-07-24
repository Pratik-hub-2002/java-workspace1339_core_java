package hierarchical_inheritance;

public class B extends A {

	public void m2() {
		System.out.println("This is method m2() from Class B");
	}

	public static void main(String[] args) {

		B b = new B();

		b.m1();
		b.m2();
	}
}

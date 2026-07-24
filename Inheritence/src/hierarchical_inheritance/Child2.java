package hierarchical_inheritance;

public class Child2 extends Parent {

	public void c2() {
		System.out.println("This is Child2 class.");
	}

	public static void main(String[] args) {

		Child2 c2 = new Child2();

		c2.p();
		c2.c2();
	}
}

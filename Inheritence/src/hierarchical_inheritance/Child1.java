package hierarchical_inheritance;

public class Child1 extends Parent {

	public void c1() {
		System.out.println("This is Child1 class.");
	}

	public static void main(String[] args) {

		Child1 c = new Child1();

		c.p();
		c.c1();
	}
}

package single_inheritence;

public class B extends A {

	public void showB() {
		System.out.println("This is method showB() from class B");
	}

	public static void main(String[] args) {

		B b = new B();
		b.showA();
		b.showB();
	}
}

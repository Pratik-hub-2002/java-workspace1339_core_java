package single_inheritence;

public class B1 extends A1 {

	public void showB1() {
		int b = a * 2;
		System.out.println("b= " + b);
	}

	public static void main(String[] args) {

		B1 b1 = new B1();

		b1.showA1();
		b1.showB1();

	}
}

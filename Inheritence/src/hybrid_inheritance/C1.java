package hybrid_inheritance;

public class C1 extends B1 {

	int c = 30;

	public void display() {

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	public static void main(String[] args) {

		C1 c1 = new C1();
		
		c1.display();
	}
}

package hybrid_inheritance;

public class D extends C {

	public void showD() {

		System.out.println("This is Class D");
	}

	public static void main(String[] args) {

		D d = new D();

		d.showA();
		d.showC();
		d.showD();
	}

}

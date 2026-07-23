package single_inheritence;

public class Child extends Parent {

	int y = 20;

	public static void main(String[] args) {

		Child c = new Child();

		System.out.println("X= " + c.x);
		System.out.println("Y= " + c.y);
	}

}

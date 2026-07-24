package hybrid_inheritance;

public class Tiger extends Cat {

	public void showTiger() {

		System.out.println("This is Tiger Class");

	}

	public static void main(String[] args) {

		Tiger t = new Tiger();

		t.showAnimal();
		t.showCat();
		t.showTiger();
	}

}

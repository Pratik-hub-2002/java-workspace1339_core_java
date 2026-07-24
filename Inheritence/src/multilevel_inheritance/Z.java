package multilevel_inheritance;

public class Z extends Y {

	int z = 30;

	public void display() {
		System.out.println("Value of x = " + x);
		System.out.println("Value of y = " + y);
		System.out.println("Value of z = " + z);
	}

	public static void main(String[] args) {

		Z z = new Z();

		z.display();
	}

}

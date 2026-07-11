package saturday;

public class MainClass {

	public static void main(String[] args) {

		Practice p = new Practice();

		p.name();
		p.add(50, 50);
		p.evenOdd(79);
		System.out.println("Square of: " + p.square(25));
		System.out.println("Largest number is: " + p.largest_num(101, 999));

	}

}

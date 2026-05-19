
public class Relation {

	int a = 30, b = 30;

	public static void main(String[] args) {

		Relation r = new Relation();

		System.out.println(r.a + " is greater than " + r.b + " = " + (r.a > r.b));
		System.out.println(r.a + " is less than " + r.b + " = " + (r.a < r.b));
		System.out.println(r.a + " is greater than or equals to  " + r.b + " = " + (r.a >= r.b));
		System.out.println(r.a + " is lesser than or equals to " + r.b + " = " + (r.a <= r.b));
		System.out.println(r.a + " is equals equals to  than " + r.b + " = " + (r.a == r.b));
		System.out.println(r.a + " is not equals than " + r.b + " = " + (r.a != r.b));
	}

}

package multilevel_inheritance;

public class Child extends Parent {
	int c = 3;

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println("This value is from GrandParent: " + child.a);
		System.out.println("This value is from Parent: " + child.b);
		System.out.println("This value is from Child: " + child.c);
	}
}

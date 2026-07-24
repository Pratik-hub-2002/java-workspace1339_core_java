package hierarchical_inheritance;

public class Teacher extends Person {

	String subject = "Java";

	public void display() {

		System.out.println("Name: " + name);
		System.out.println("Subject: " + subject);
	}

	public static void main(String[] args) {

		Teacher t = new Teacher();

		t.display();
	}

}

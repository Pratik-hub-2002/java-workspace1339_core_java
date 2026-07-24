package hierarchical_inheritance;

public class Student extends Person {

	String course = "MCA";

	public void display() {

		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
	}

	public static void main(String[] args) {

		Student s = new Student();

		s.display();
	}

}

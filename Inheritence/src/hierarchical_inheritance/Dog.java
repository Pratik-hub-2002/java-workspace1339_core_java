package hierarchical_inheritance;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog is barking.");
	}

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.eat();
		dog.bark();
	}
}

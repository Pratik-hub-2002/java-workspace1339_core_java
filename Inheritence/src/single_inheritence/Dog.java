package single_inheritence;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog is barking.");
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}

package hierarchical_inheritance;

public class Cat extends Animal {

	public void meow() {
		System.out.println("Cat is meowing.");
	}

	public static void main(String[] args) {

		Cat cat = new Cat();

		cat.eat();
		cat.meow();
	}
}

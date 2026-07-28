package dynamic_dispatch;

public class Main_Animal {

	public static void main(String[] args) {

		Animal animal;

		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

	}

}

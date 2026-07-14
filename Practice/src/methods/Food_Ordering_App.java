package methods;

public class Food_Ordering_App {

	public void placeOrder(int itemChoice, int quantity) {

		int price = 0;
		String item = "";

		if (itemChoice == 1) {
			item = "Pizza";
			price = 200;
		} else if (itemChoice == 2) {
			item = "Burger";
			price = 100;
		} else if (itemChoice == 3) {
			item = "Sandwich";
			price = 80;
		} else {
			System.out.println("Invalid Choice!");
			return;
		}

		int total = price * quantity;

		System.out.println("Item : " + item);
		System.out.println("Quantity : " + quantity);
		System.out.println("Bill Amount : ₹" + total);
	}
}
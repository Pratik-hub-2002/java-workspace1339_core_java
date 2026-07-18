package saturdays;

public class Product_Discount {

	double price;

	public Product_Discount(double price) {

		this.price = price;
	}

	public double discountAmount() {
		if (price > 1000) {
			return price * 0.1;
		}

		return 0;
	}

	public double discount() {

		return price - discountAmount();
	}

}

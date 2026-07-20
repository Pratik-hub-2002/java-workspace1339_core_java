package saturdays;

public class Shopping_Cart {

	int quantity;
	double pprice;

	public Shopping_Cart(int quantity, double pprice) {

		this.quantity = quantity;
		this.pprice = pprice;
	}

	public double calBill() {

		double total = pprice * quantity;

		if (total > 5000) {

			double discount = total * 0.1;
			return total - discount;
		}
		return total;
	}

	public double discountAmount() {

		double total = quantity * pprice;

		if (total > 5000) {
			return total * 0.10;
		}

		return 0;
	}
}

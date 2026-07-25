package mix;

public class Shopping_Bill {

	private String productName;
	private int productQuantity;
	private double productPrice;

	public Shopping_Bill(String productName, int productQauntity, double productPrice) {

		this.productName = productName;
		this.productQuantity = productQauntity;
		this.productPrice = productPrice;
	}

	public void setPName(String productName) {
		this.productName = productName;
	}

	public void setPQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public void setPPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getPName() {
		return productName;
	}

	public int getPQuantity() {
		return productQuantity;
	}

	public double getPPrice() {
		return productPrice;
	}

	double bill = 0;

	public double bill() {

		bill = productQuantity * productPrice;

		if (bill > 5000) {
			double discount = bill * 0.10;
			bill = bill - discount;
		}
		return bill;
	}
}

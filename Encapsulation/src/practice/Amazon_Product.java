package practice;

public class Amazon_Product {

	private int apid;
	private String apname;
	private int apquantity;
	private double apprice;

	public Amazon_Product(int apid, String apname, int apquantity, double apprice) {

		this.apid = apid;
		this.apname = apname;
		this.apquantity = apquantity;
		this.apprice = apprice;
	}

	public int getApid() {
		return apid;
	}

	public String getApname() {
		return apname;
	}

	public int getApquantity() {
		return apquantity;
	}

	public double getApprice() {
		return apprice;
	}

	public void setApid(int apid) {
		this.apid = apid;
	}

	public void setApname(String apname) {
		this.apname = apname;
	}

	public void setApquantity(int apquantity) {
		this.apquantity = apquantity;
	}

	public void setApprice(double apprice) {
		this.apprice = apprice;
	}
	
	public double calculateBill(int quantity) {
		return quantity * apprice;
	}

	public void buyProduct(int quantity) {

		if (quantity <= apquantity) {

			apquantity -= quantity;
			System.out.println("Product Purchased Successfully.");
			System.out.println("Total Amount : Rs. " + calculateBill(quantity));

		} else {

			System.out.println("Out of Stock.");
		}
	}
}
package practice;

public class Electricity_Bill {

	private int cid;
	private String cname;
	private double units;
	private double price;

	public Electricity_Bill(int cid, String cname, double units, double price) {

		this.cid = cid;
		this.cname = cname;
		this.units = units;
		this.price = price;
	}

	public void setId(int cid) {
		this.cid = cid;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	public void setUnits(double units) {
		this.units = units;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return cid;
	}

	public String getName() {
		return cname;
	}

	public double getPrice() {
		return price;
	}

	public double getUnits() {
		return units;
	}

	public double totalBill() {
		return units * price;
	}
}

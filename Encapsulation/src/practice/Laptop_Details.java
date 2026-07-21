package practice;

public class Laptop_Details {

	private String brand;
	private String model;
	private int RAM;
	private double price;

	public Laptop_Details(String brand, String model, int RAM, double price) {

		this.brand = brand;
		this.model = model;
		this.RAM = RAM;
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int RAM) {
		this.RAM = RAM;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
}

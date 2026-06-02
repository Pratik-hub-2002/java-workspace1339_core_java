package tka;

public class Vehicle {

	String Vehicle_No;
	String Brand;
	String Model;
	String Color;
	double Price;

	void v1() {
		System.out.println("\n------------Vehicle's Information------------\n");
		System.out.println("Vehicle Brand Name : " + Brand);
		System.out.println("Vehicle Model Name : " + Model);
		System.out.println("Vehicle Color      : " + Color);
		System.out.println("Vehicle Number     : " + Vehicle_No);
		System.out.println("Vehicle Pricle     : " + Price + "INR");
	}

}

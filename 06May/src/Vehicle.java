public class Vehicle {

	String vehicle_name = "Chetak", company = "Bajaj", color = "Broklyn Black",
			fuel_type = "EV", owner_name = "Pratik Raut";
	long registration_no = 202401109008l;
	int model_year = 2023, seating_capacity = 2, speed = 69;
	char transmission = 'A';

	public static void main(String[] args) {

		Vehicle vh = new Vehicle();
		
		System.out.println("========Vehicle Detail's=========");
		System.out.println("\nEnter vehicle name");
		System.out.println("Vehicle name is " + vh.vehicle_name);

		System.out.println("\nEnter company name");
		System.out.println("Company name is " + vh.company);

		System.out.println("\nEnter vehicle color");
		System.out.println("Vehicle color is " + vh.color);

		System.out.println("\nEnter fuel type");
		System.out.println("Fuel type is " + vh.fuel_type);

		System.out.println("\nEnter owner name");
		System.out.println("Owner name is " + vh.owner_name);

		System.out.println("\nEnter registration number");
		System.out.println("Registration number is " + vh.registration_no);

		System.out.println("\nEnter model year");
		System.out.println("Model year is " + vh.model_year);

		System.out.println("\nEnter seating capacity");
		System.out.println("Seating capacity is " + vh.seating_capacity);

		System.out.println("\nEnter vehicle speed");
		System.out.println("Vehicle speed is " + vh.speed);

		System.out.println("\nEnter transmission type");
		System.out.println("Transmission type is " + vh.transmission);
	}

}
package tka;

public class Hospital {

	int patient_id;
	String name;
	int age;
	String disease;
	String doctor;

	void h1() {

		System.out.println("\n-----------Hospital Patient's Information----------\n");
		System.out.println("Hospital's Name :- " + name);
		System.out.println("Patient's ID :- " + patient_id);
		System.out.println("Patient's Age :- " + age);
		System.out.println("Patient's Admitted for Disease :- " + disease);
		System.out.println("Patient's Doctor Name :- " + doctor);
	}

}

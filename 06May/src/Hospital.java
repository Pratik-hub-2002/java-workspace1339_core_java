
public class Hospital {

	static String first_name = "Kartik", last_name = "Patil", blood= "A+", address= "Waluj", admission_date= "06/05/2026", discharge_date= "10/05/2026";
	static int reg_no = 1325832;
	static long mobile_no = 9370787194l;
	static double bill_amt = 1210265.89;
	static char sex = 'M';
	
	
	
	public static void main(String[] args) {
		System.out.println("========Patient's Info==========");
		System.out.println("\nEnter patient's first name ");
		System.out.println("Patient's first name is " + first_name);
		System.out.println("\nEnter patient's last name ");
		System.out.println("Patient's last name is "+ last_name);
		System.out.println("\nEnter patient's blood group ");
		System.out.println("Patient's blood is "+blood);
		System.out.println("\nEnter patient's address ");
		System.out.println("Patient's address is " +address);
		System.out.println("\nPatient's registration number is "+reg_no);
		System.out.println("\nEnter patient's mob_no");
		System.out.println("Patient's mob no is "+mobile_no);
		System.out.println("\nEnter patient's gender");
		System.out.println("Patient's gender is "+sex);
		System.out.println("\nEnter patient's admission data ");
		System.out.println("Patient's admission date is "+admission_date);
		System.out.println("\nEnter patient's discharge date");
		System.out.println("Patient's discharge date is "+discharge_date);		
		System.out.println("\nPatient's total bill amount is "+bill_amt);
	}

}

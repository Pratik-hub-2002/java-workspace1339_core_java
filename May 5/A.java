import java.util.Arrays;

public class A {

	static String first_name = "Pratik",last_name = "Raut", address = "Chhatrapati Sambhajinagar", college = "JNEC";
	static long mobile_no = 9370787194l;
	static float ssc = 75.20f,hsc = 70.91f, pg_cgpa = 7.44f;
	static String pg ="MCA";
	static int pincode = 431133;
	static byte age = 24;
	static String hobbies[] = {"Watching crime thriller shows.", "Working anytime", "Managing severe tasks"};
	static boolean valid_info= true;
	static char grade = 'A';
	static double height = 5.8;
	static String email ="praut3022@gmail.com";
	
	
	
	
	
	public static void main(String[] args) {
		
	String first_name = "Kartik",last_name = "Patil", address = "Chhatrapati Sambhajinagar", college = "JNEC";
	long mobile_no = 9346166549l;
	float ssc = 61.60f,hsc = 60.15f, pg_cgpa = 6.56f;
	String pg ="MCA";
	int pincode = 431009;
	byte age = 25;
	String hobbies[] = {"Badmiton", "Working horrors shows", "Playing Games"};
	boolean valid_info= true;
	char grade = 'b';
	double height = 5.9;
	String email ="kartikpatil65@gmail.com";
		
		
		//Global Variable
		System.out.println("\n============Global Variable=================");
		System.out.println("============My Personal Info=============\n");
		System.out.println("My name is " + first_name +" "+ last_name);
		System.out.println("My mobile no is " + mobile_no);
		System.out.println("My email id " + email);
		System.out.println("My age is " + age);
		System.out.println("My height is " + height);
		System.out.println("I live in a historial city named after Great King " + address +" " + pincode );
		
		System.out.println("\n============My Eduacational Info=============\n");
		System.out.println("College name is " + college);
		System.out.println("My Educational score SSC = " + ssc +"\nHSC = " + hsc + "\nPG CGPA = " + pg_cgpa);
		System.out.println("Grade " + grade);
		
		System.out.println("My hobbies are " + Arrays.toString(hobbies));
		System.out.println("If all above info is correct then " + valid_info);
		
		
		//Local Variable
		System.out.println("\n============Local Variable=================");
		System.out.println("============My Friend's Info===============\n");
		System.out.println("Friend's name is " + first_name + " " + last_name);
		System.out.println("His phone number is " + mobile_no);
		
		System.out.println("His email id " + email);
		System.out.println("His height is " + height);
		System.out.println("He lives in a historial city named after Great King " + address +" " + pincode);
		
		System.out.println("\n=============Educational Qualification==========\n");
		System.out.println("College name is " + college);
		System.out.println("His Educational score SSC = " + ssc +"\nHSC = " + hsc + "\nPG CGPA = " + pg_cgpa);
		System.out.println("Grade " + grade);
		
		System.out.println("His hobbies are " + Arrays.toString(hobbies));
		System.out.println("If all above info is correct then " + valid_info);
		
	}
}

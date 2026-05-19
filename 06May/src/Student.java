import javax.transaction.xa.Xid;

public class Student {
	
	static String f_name = "Pratik", l_name = "Raut", qualitfiaction = "MCA", city = "Chhatrapati Sambhajinagar", specialization = "Cloud";
	static long mob_no = 9370787194l, aadhar_no = 911203918476l ;
	static int roll_no = 9008, pg_graduation_year = 2026;
	static char gender= 'M';
	
	
	public static void main(String[] args) {
		System.out.println("========Student's Info=========");
		System.out.println("\nEnter your first name");
		System.out.println("My first name is " + f_name);
		System.out.println("\nEnter your last name");
		System.out.println("My last name is " + l_name);
		System.out.println("\nEnter your qualifiaction ");
		System.out.println("My qualification is "+ qualitfiaction);
		System.out.println("\nEnter your gender ");
		System.out.println("My gender is "+ gender);
		System.out.println("\nEnter your specialization");
		System.out.println("My specialization is in "+ specialization);
		System.out.println("\nEnter your roll no");
		System.out.println("My roll no is "+ roll_no);
		System.out.println("\nEnter your mob no");
		System.out.println("My mobile is " +mob_no);
		System.out.println("\nEnter your PG completion year ");
		System.out.println("My PG completion is " + pg_graduation_year);
		System.out.println("\nEnter your aadhar no");
		System.out.println("My aadhar no is " + aadhar_no);
		System.out.println("\nEnter your city");
		System.out.println("I live in a city "+city);
	}

}

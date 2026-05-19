public class Classroom {

	String class_name = "MCA SY", teacher_name = "Vinod Sir", subject = "Java",
			college_name = "JNEC College", room_no = "FF39", classroom_location = "First Floor";
	int  total_students = 60, benches = 30;
	double attendance = 92.5;
	char section = 'A';

	public static void main(String[] args) {

		Classroom cr= new Classroom();
		
		System.out.println("========= Classroom Info =========");

		System.out.println("\nEnter class name");
		System.out.println("Class name is " + cr.class_name);

		System.out.println("\nEnter teacher name");
		System.out.println("Teacher name is " + cr.teacher_name);

		System.out.println("\nEnter subject name");
		System.out.println("Subject name is " + cr.subject);

		System.out.println("\nEnter college name");
		System.out.println("College name is " + cr.college_name);

		System.out.println("\nEnter classroom location");
		System.out.println("Classroom location is " + cr.classroom_location);

		System.out.println("\nEnter room number");
		System.out.println("Room number is " + cr.room_no);

		System.out.println("\nEnter total students");
		System.out.println("Total students are " + cr.total_students);

		System.out.println("\nEnter total benches");
		System.out.println("Total benches are " + cr.benches);

		System.out.println("\nEnter attendance percentage");
		System.out.println("Attendance percentage is " + cr.attendance);

		System.out.println("\nEnter section");
		System.out.println("Section is " + cr.section);
	}

}
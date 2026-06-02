package tka;

public class MainClass {

	public static void main(String[] args) {
//  	1st
		Vehicle v = new Vehicle();

		v.Brand = "Mahindra";
		v.Model = "Scorpio";
		v.Color = "Black";
		v.Vehicle_No = "MH18IJ7890";
		v.Price = 1800000;
		v.v1();

//		2nd
		Library l = new Library();

		l.book_ID = 102;
		l.book_name = "Unexplained relationship between mother and a daughter";
		l.author = "Miss. Shabrin Khan";
		l.category = "Biography";
		l.price = 350;
		l.l1();

		// 3rd

		Employee emp = new Employee();

		emp.emp_id = 34996;
		emp.emp_name = "Pratik Raut";
		emp.emp_dept = "Production";
		emp.salary = 315000;
		emp.city = "Chh. Sambhajinagar";
		emp.e1();

		// 4th
		Student s = new Student();

		s.roll_no = 202409008;
		s.name = "Kartik Patil";
		s.age = 26;
		s.course = "MCA";
		s.percentage = 65.70;
		s.s1();

		// 5th

		Hospital h = new Hospital();

		h.patient_id = 33946;
		h.name = "SMBT";
		h.disease = "Cardiac Arrest";
		h.age = 38;
		h.doctor = "Dr. Verma ";
		h.h1();

	}

}

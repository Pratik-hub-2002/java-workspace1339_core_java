package methods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;

		do {

			System.out.println("\n===== MENU =====");
			System.out.println("1. Library");
			System.out.println("2. Student");
			System.out.println("3. Hospital");
			System.out.println("4. Vehicle");
			System.out.println("5. Employee");
			System.out.println("Enter Choice:");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				Library l = new Library();
				System.out.println("Enter Book ID:");
				l.bookId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Book Name:");
				l.bookName = sc.nextLine();

				System.out.println("Enter Author Name:");
				l.author = sc.nextLine();

				System.out.println("Enter Student Name:");
				l.studentName = sc.nextLine();

				System.out.println("Enter Total Books:");
				l.totalBooks = sc.nextInt();

				System.out.println("Enter Issued Books:");
				l.issuedBooks = sc.nextInt();

				l.availableBooks = l.totalBooks - l.issuedBooks;

				System.out.println("\n1. Issue Book");
				System.out.println("2. Return Book");
				System.out.println("Enter Choice:");

				int bookchoice = sc.nextInt();

				switch (bookchoice) {

				case 1:
					l.issueBook();
					break;

				case 2:
					l.returnBook();
					break;

				default:
					System.out.println("Invalid Choice");
				}

				System.out.println("\nLibrary Details");
				System.out.println("Book ID : " + l.bookId);
				System.out.println("Book Name : " + l.bookName);
				System.out.println("Author : " + l.author);
				System.out.println("Student Name : " + l.studentName);
				System.out.println("Total Books : " + l.totalBooks);
				System.out.println("Issued Books : " + l.issuedBooks);
				System.out.println("Available Books : " + l.availableBooks);
				break;

			case 2:
				Student s = new Student();
				System.out.println("Enter Roll Number:");
				s.rollNo = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Student Name:");
				s.name = sc.nextLine();

				System.out.println("Enter Course:");
				s.course = sc.nextLine();

				System.out.println("Enter College Name:");
				s.collegeName = sc.nextLine();

				System.out.println("Enter Java Marks:");
				s.javaMarks = sc.nextDouble();

				System.out.println("Enter Python Marks:");
				s.pythonMarks = sc.nextDouble();

				System.out.println("Enter SQL Marks:");
				s.sqlMarks = sc.nextDouble();

				s.calculateTotal();
				s.calculatePercentage();
				s.calculateGrade();

				System.out.println("\nStudent Result");
				System.out.println("Roll No : " + s.rollNo);
				System.out.println("Name : " + s.name);
				System.out.println("Course : " + s.course);
				System.out.println("College : " + s.collegeName);
				System.out.println("Total : " + s.total);
				System.out.println("Percentage : " + s.percentage);
				System.out.println("Grade : " + s.grade);
				break;

			case 3:
				Hospital h = new Hospital();
				System.out.println("Enter Patient ID:");
				h.patientId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Patient Name:");
				h.patientName = sc.nextLine();

				System.out.println("Enter Disease:");
				h.disease = sc.nextLine();

				System.out.println("Enter Days Admitted:");
				h.daysAdmitted = sc.nextInt();

				System.out.println("Enter Room Charge Per Day:");
				h.roomCharge = sc.nextDouble();

				double bill = h.calculateBill();

				System.out.println("\nPatient Details");
				System.out.println("Patient ID : " + h.patientId);
				System.out.println("Patient Name : " + h.patientName);
				System.out.println("Disease : " + h.disease);
				System.out.println("Days Admitted : " + h.daysAdmitted);
				System.out.println("Room Charge : " + h.roomCharge);
				System.out.println("Total Bill : " + bill);
				break;

			case 4:
				Vehicle v = new Vehicle();
				System.out.println("Enter Vehicle ID:");
				v.vehicleId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Vehicle Name:");
				v.vehicleName = sc.nextLine();

				System.out.println("Enter Company Name:");
				v.companyName = sc.nextLine();

				System.out.println("Enter Vehicle Price:");
				v.vehiclePrice = sc.nextDouble();

				double finalPrice = v.calculateFinalPrice();

				System.out.println("\nVehicle Details");
				System.out.println("Vehicle ID : " + v.vehicleId);
				System.out.println("Vehicle Name : " + v.vehicleName);
				System.out.println("Company Name : " + v.companyName);
				System.out.println("Vehicle Price : " + v.vehiclePrice);
				System.out.println("Discount : " + v.discount);
				System.out.println("Final Price : " + finalPrice);
				break;

			case 5:
				Employee e = new Employee();
				System.out.println("Enter Employee ID:");
				e.empId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Employee Name:");
				e.empName = sc.nextLine();

				System.out.println("Enter Department:");
				e.department = sc.nextLine();

				System.out.println("Enter Designation:");
				e.designation = sc.nextLine();

				System.out.println("Enter Company Name:");
				e.companyName = sc.nextLine();

				System.out.println("Enter City:");
				e.city = sc.nextLine();

				System.out.println("Enter Email:");
				e.email = sc.nextLine();

				System.out.println("Enter Mobile Number:");
				e.mobileNo = sc.nextLong();

				System.out.println("Enter Basic Salary:");
				e.basicSalary = sc.nextDouble();
				e.calculateSalary();
				e.displayEmployee();
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("\nDo you want to continue? (Y/N)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		System.out.println("Thank You...");
		sc.close();
	}
}

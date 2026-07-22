package practice;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;

		do {
			System.out.println("============= MENU =============");
			System.out.println("1. Person");
			System.out.println("2. Bank Account");
			System.out.println("3. Student Details");
			System.out.println("4. Employee Information");
			System.out.println("5. Laptop Details");
			System.out.println("6. Employee Salary Validation");
			System.out.println("7. Instagram Account");
			System.out.println("8. Product Details");
			System.out.println("9. Student Result");
			System.out.println("10. Electricity Bill");
			System.out.println("11. ATM Machine");
			System.out.println("12. Hospital Patient");
			System.out.println("13. Library Management");
			System.out.println("14 Login System");
			System.out.println("15 Amazon Product");
			System.out.println("16 Employee Bonus System");
			System.out.println("17 Hotel Room Booking");
			System.out.println("18 Flight Reservation System");
			System.out.println("19. Exit");
			System.out.println("================================");
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.err.println("===========Person=============");

				sc.nextLine();
				System.out.println("Enter your name: ");
				String name = sc.nextLine();

				System.out.println("Enter age: ");
				int age = sc.nextInt();

				Person p1 = new Person(name, age);

				System.out.println("Name: " + p1.getName());
				System.out.println("Age: " + p1.getAge());

				break;

			case 2:
				System.err.println("===========Bank Account=============");

				System.out.print("Enter Initial Balance : ");
				double balance = sc.nextDouble();

				Bank_Account account = new Bank_Account(balance);

				System.out.println("Enter deposit amount: ");
				double deposit = sc.nextDouble();
				account.deposit(deposit);

				System.out.println("Enter withdraw amount: ");
				int withdraw = sc.nextInt();
				account.withdraw(withdraw);

				System.out.println("Current Balance: Rs. " + account.getBalance());

				break;

			case 3:
				System.out.println("================Student Details=================");
				sc.nextLine();
				System.out.println("Enter student's name: ");
				String sname = sc.nextLine();

				System.out.println("Enter student's roll no: ");
				int sroll_no = sc.nextInt();

				System.out.println("Enter student's marks: ");
				int marks = sc.nextInt();

				Student_Details sd = new Student_Details(sname, sroll_no, marks);

				System.out.println("=============Student's Info============");
				System.out.println("Name: " + sd.getName());
				System.out.println("Roll_no: " + sd.getRollno());
				System.out.println("Marks: " + sd.getMarks());

				break;

			case 4:
				System.out.println("=========== Employee Information ===========");
				sc.nextLine();
				System.out.print("Enter Employee ID : ");
				int eid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Employee Name : ");
				String ename = sc.nextLine();

				System.out.print("Enter Department : ");
				String dname = sc.nextLine();

				System.out.print("Enter Salary : ");
				double esalary = sc.nextDouble();

				Employee_Information ei = new Employee_Information(eid, ename, dname, esalary);

				System.out.println("\n=========== Employee Details ===========");

				System.out.println("Employee ID : " + ei.getEid());
				System.out.println("Employee Name : " + ei.getEname());
				System.out.println("Department : " + ei.getDname());
				System.out.println("Salary : " + ei.getEsalary());

				System.out.println("============================================");
				break;

			case 5:
				System.out.println("=========== Laptop Details ===========");

				sc.nextLine();

				System.out.print("Enter Brand : ");
				String brand = sc.nextLine();

				System.out.print("Enter Model : ");
				String model = sc.nextLine();

				System.out.print("Enter RAM (GB) : ");
				int ram = sc.nextInt();

				System.out.print("Enter Price : ");
				double price = sc.nextDouble();

				Laptop_Details ld = new Laptop_Details(brand, model, ram, price);

				System.out.println("\n=========== Laptop Information ===========");

				System.out.println("Brand : " + ld.getBrand());
				System.out.println("Model : " + ld.getModel());
				System.out.println("RAM : " + ld.getRAM() + " GB");
				System.out.println("Price : Rs. " + ld.getPrice());

				System.out.println("==========================================");
				break;

			case 6:
				System.out.println("=========== Employee Salary Validation ===========");

				sc.nextLine();

				System.out.print("Enter Employee ID : ");
				int empId = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Employee Name : ");
				String empName = sc.nextLine();

				System.out.print("Enter Salary : ");
				double salary = sc.nextDouble();

				Employee_Salary_Validation esv = new Employee_Salary_Validation(empId, empName, salary);

				System.out.println("\n=========== Employee Details ===========");

				System.out.println("Employee ID : " + esv.getEmpId());
				System.out.println("Employee Name : " + esv.getEmpName());
				System.out.println("Salary : Rs. " + esv.getSalary());

				System.out.println("========================================");
				break;

			case 7:
				System.out.println("=========== Instagram Account ===========");

				sc.nextLine();

				System.out.print("Enter Username : ");
				String username = sc.nextLine();

				System.out.print("Enter Password : ");
				String password = sc.nextLine();

				Instagram_Account ia = new Instagram_Account(username, password);

				System.out.println("\n=========== Account Details ===========");

				System.out.println("Username : " + ia.getUsername());
				System.out.println("Password : " + ia.getPassword());

				System.out.println("========================================");
				break;

			case 8:
				System.out.println("=========== Product Details ===========");

				System.out.print("Enter Product ID : ");
				int pid = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Product Name : ");
				String pname = sc.nextLine();

				System.out.print("Enter Price : ");
				double pprice = sc.nextDouble();

				System.out.print("Enter Quantity : ");
				int quantity = sc.nextInt();

				Product_Details pd = new Product_Details(pid, pname, pprice, quantity);

				System.out.println("\n=========== Product Information ===========");

				System.out.println("Product ID : " + pd.getPid());
				System.out.println("Product Name : " + pd.getPname());
				System.out.println("Price : Rs. " + pd.getPrice());
				System.out.println("Quantity : " + pd.getQuantity());
				System.out.println("Total Price : Rs. " + pd.calculateTotal());

				System.out.println("===========================================");
				break;

			case 9:
				System.out.println("=========== Student Result ===========");

				sc.nextLine();

				System.out.print("Enter Student Name : ");
				String studentName = sc.nextLine();

				System.out.print("Enter Roll Number : ");
				int rollNo = sc.nextInt();

				System.out.print("Enter Subject 1 Marks : ");
				int sub1 = sc.nextInt();

				System.out.print("Enter Subject 2 Marks : ");
				int sub2 = sc.nextInt();

				System.out.print("Enter Subject 3 Marks : ");
				int sub3 = sc.nextInt();

				Student_Result sr = new Student_Result(studentName, rollNo, sub1, sub2, sub3);

				System.out.println("\n=========== Result ===========");

				System.out.println("Student Name : " + sr.getStudentName());
				System.out.println("Roll Number : " + sr.getRollNo());
				System.out.println("Subject 1 Marks : " + sr.getSub1());
				System.out.println("Subject 2 Marks : " + sr.getSub2());
				System.out.println("Subject 3 Marks : " + sr.getSub3());
				System.out.println("Total Marks : " + sr.calculateTotal());
				System.out.println("Average Marks : " + sr.calculateAverage());

				System.out.println("================================");
				break;

			case 10:
				System.out.println("=========== Electricity Bill ===========");

				System.out.print("Enter Customer ID : ");
				int cid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Customer Name : ");
				String cname = sc.nextLine();
				System.out.print("Enter Units Consumed : ");
				double units = sc.nextDouble();
				System.out.print("Enter Rate Per Unit : ");
				double uprice = sc.nextDouble();

				Electricity_Bill eb = new Electricity_Bill(cid, cname, units, uprice);

				System.out.println("\n=========== Bill Details ===========");

				System.out.println("Customer ID : " + eb.getId());
				System.out.println("Customer Name : " + eb.getName());
				System.out.println("Units Consumed : " + eb.getUnits());
				System.out.println("Rate Per Unit : Rs." + eb.getPrice());
				System.out.printf("Total Bill : Rs. %.2f%n", eb.totalBill());

				System.out.println("=====================================");
				break;

			case 11:
				System.out.println("=========== ATM Machine ===========");

				System.out.print("Enter Account Number : ");
				int custAccountNum = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Account Holder Name : ");
				String bankcustName = sc.nextLine();
				System.out.print("Enter Initial Balance : ");
				double iniBalAmt = sc.nextDouble();

				ATM_Machine am = new ATM_Machine(custAccountNum, bankcustName, iniBalAmt);

				System.out.print("Enter Deposit Amount : ");
				double depositAmt = sc.nextDouble();
				am.deposit(depositAmt);

				System.out.print("Enter Withdraw Amount : ");
				double withdrawAmt = sc.nextDouble();
				am.withdraw(withdrawAmt);

				System.out.println("\n=========== Account Details ===========");

				System.out.println("Account Number : " + am.getCustAccountNum());
				System.out.println("Account Holder : " + am.getBankcustName());
				System.out.println("Current Balance : " + am.getIniBalAmt());

				System.out.println("=======================================");
				break;

			case 12:
				System.out.println("=========== Hospital Patient ===========");

				System.out.print("Enter Patient ID : ");
				int hpid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Patient Name : ");
				String hpname = sc.nextLine();
				sc.nextLine();

				System.out.print("Enter Age : ");
				int hpage = sc.nextInt();

				System.out.print("Enter Disease : ");
				String hpdisease = sc.nextLine();

				System.out.print("Enter Doctor Fees : ");
				double hpfees = sc.nextDouble();

				Hospital_Patient hp = new Hospital_Patient(hpid, hpname, hpage, hpdisease, hpfees);

				System.out.println("\n=========== Patient Details ===========");

				System.out.println("Patient ID : " + hp.getHpid());
				System.out.println("Patient Name : " + hp.getHpname());
				System.out.println("Age : " + hp.getHpage());
				System.out.println("Disease : " + hp.getHpdisease());
				System.out.println("Doctor Fees : " + hp.getHpfees());

				System.out.println("========================================");
				break;

			case 13:

				System.out.println("=========== Library Management ===========");

				System.out.print("Enter Book ID : ");
				int bid = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Book Name : ");
				String bname = sc.nextLine();

				System.out.print("Enter Author Name : ");
				String bauthor = sc.nextLine();

				Library_Management lm = new Library_Management(bid, bname, bauthor);

				lm.issueBook();
				lm.returnBook();

				System.out.println("\n=========== Library Details ===========");

				System.out.println("Book ID : " + lm.getBid());
				System.out.println("Book Name : " + lm.getBname());
				System.out.println("Author Name : " + lm.getBauthor());
				System.out.println("Book Status : " + (lm.getIsIssued() ? "Issued" : "Available"));

				System.out.println("==========================================");

				break;

			case 14:
				System.out.println("=========== Login System ===========");

				sc.nextLine();
				System.out.print("Enter Email : ");
				String lemail = sc.nextLine();
				System.out.print("Enter Password : ");
				String lpassword = sc.nextLine();

				Login_System ls = new Login_System(lemail, lpassword);

				boolean status = ls.checkLogin();

				System.out.println("\n=========== Login Details ===========");

				System.out.println("Email : " + ls.getEmail());
				System.out.println("Password : " + ls.getPassword());
				if (status) {
					System.out.println("Login Status : Login Successful");
				} else {
					System.out.println("Login Status : Login Failed");
				}

				System.out.println("====================================");
				break;

			case 15:

				System.out.println("=========== Amazon Product ===========");

				System.out.print("Enter Product ID : ");
				int apid = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Product Name : ");
				String apname = sc.nextLine();

				System.out.print("Enter Stock Quantity : ");
				int apquantity = sc.nextInt();

				System.out.print("Enter Price : ");
				double apprice = sc.nextDouble();

				System.out.print("Enter Quantity to Buy : ");
				int buyquantity = sc.nextInt();

				Amazon_Product ap = new Amazon_Product(apid, apname, apquantity, apprice);

				ap.buyProduct(buyquantity);

				System.out.println("\n=========== Product Details ===========");

				System.out.println("Product ID : " + ap.getApid());
				System.out.println("Product Name : " + ap.getApname());
				System.out.println("Price : Rs. " + ap.getApprice());
				System.out.println("Purchased Quantity : " + buyquantity);
				System.out.println("Total Amount : Rs. " + ap.calculateBill(buyquantity));
				System.out.println("Remaining Stock : " + ap.getApquantity());

				System.out.println("=======================================");

				break;

			case 16:
				System.out.println("=========== Employee Bonus ===========");

				System.out.print("Enter Employee ID : ");
				int emid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Employee Name : ");
				String emname = sc.nextLine();
				System.out.print("Enter Salary : ");
				double emsalary = sc.nextDouble();
				System.out.print("Enter Bonus Percentage : ");
				double embounus = sc.nextDouble();

				Employee_Bonus emb = new Employee_Bonus(emid, emname, emsalary, embounus);

				System.out.println("\n=========== Employee Details ===========");

				System.out.println("Employee ID : " + emb.getEmid());
				System.out.println("Employee Name : " + emb.getEmname());
				System.out.println("Salary : " + emb.getEmsalary());
				System.out.println("Salary : Rs. " + emb.getEmsalary());
				System.out.println("Bonus Percentage : " + emb.getEmbounus() + "%");
				System.out.println("Bonus Amount : Rs. " + emb.calculateBonus());
				System.out.println("Total Salary : Rs. " + emb.totalSalary());

				System.out.println("=======================================");
				break;

			case 17:

				System.out.println("=========== Hotel Room Booking ===========");

				System.out.print("Enter Room Number : ");
				int room_no = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Customer Name : ");
				String hcname = sc.nextLine();

				Hotel_Room_Booking hrb = new Hotel_Room_Booking(room_no, hcname);

				System.out.println("\n1. Book Room");
				System.out.println("2. Cancel Room");
				System.out.print("Enter Your Choice : ");
				int option = sc.nextInt();

				if (option == 1) {
					hrb.bookRoom();
				} else if (option == 2) {
					hrb.cancelRoom();
				} else {
					System.out.println("Invalid Choice.");
				}

				System.out.println("\n=========== Booking Details ===========");

				System.out.println("Room Number : " + hrb.getRoom_no());
				System.out.println("Customer Name : " + hrb.getHcname());
				System.out.println("Booking Status : " + (hrb.getBookingStatus() ? "Booked" : "Available"));

				System.out.println("=========================================");

				break;

			case 18:
				System.out.println("=========== Flight Reservation ===========");

				System.out.print("Enter Flight Number : ");
				int flight_num = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Passenger Name : ");
				String fpname = sc.nextLine();
				System.out.print("Enter Seat Number : ");
				String fseat_num = sc.nextLine();

				Flight_Reservation fr = new Flight_Reservation(flight_num, fpname, fseat_num);
				System.out.println("\n1. Reserve Seat");
				System.out.println("2. Cancel Reservation");
				System.out.print("Enter Your Choice : ");
				int foption = sc.nextInt();

				if (foption == 1) {
					fr.reserveSeat();
				} else if (foption == 2) {
					fr.cancelReservation();
				} else {
					System.out.println("Invalid Choice.");
				}

				System.out.println("\n=========== Reservation Details ===========");

				System.out.println("Flight Number : " + fr.getFlight_num());
				System.out.println("Passenger Name : " + fr.getFpname());
				System.out.println("Seat Number : " + fr.getFseat_num());
				System.out.println("Reservation Status : " + (fr.getReservationStatus() ? "Reserved" : "Available"));

				System.out.println("===========================================");

				break;

			case 19:
				System.out.println("Thank You !");
				return;

			default:
				System.out.println("Invalid Choice!");
				break;
			}

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}

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
			System.out.println("10. ");
			System.out.println("11. ");
			System.out.println("12. ");
			System.out.println("13. ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("23. Exit");
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

			case 23:
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

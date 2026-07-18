package saturdays;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bank_account ba = null;

		char ch;
		do {

			System.out.println("========Menu========");
			System.out.println("1. Student");
			System.out.println("2. Rectangle Area");
			System.out.println("3. Employee Salary");
			System.out.println("4. Circle Operations");
			System.out.println("5. Simple Interest");
			System.out.println("6. Even or Odd");
			System.out.println("7. Temperature Converte");
			System.out.println("8. Bank Account");
			System.out.println("9. Product Discount");
			System.out.println("10. Student Grade");
			System.out.println("11. Number Reverse");
			System.out.println("12. Palindrome Check");
			System.out.println("13. Power Calculation");
			System.out.println("14. Max of Three Numbers");
			System.out.println("15. ATM Machine Simulation");
			System.out.println("16. Shopping Cart");
			System.out.println("17. Electricity Bill");
			System.out.println("18. Fibonacci Series");
			System.out.println("19. Prime Number Check");
			System.out.println("20. Library System");
			System.out.println("21. Exit");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();
				System.out.println("Enter your name: ");
				String name = sc.nextLine();

				System.out.println("Enter your marks: ");
				int marks = sc.nextInt();

				Student s = new Student(name, marks);

				System.out.println("Name : " + name);
				System.out.println("Marks : " + marks);
				System.out.println("Result : " + s.result());

				break;

			case 2:
				System.out.println("Enter lenght: ");
				int length = sc.nextInt();

				System.out.println("Enter width: ");
				int width = sc.nextInt();

				Rectangle_Area ra = new Rectangle_Area(length, width);

				System.out.println("Length: " + length);
				System.out.println("Width: " + width);
				System.out.println("Area of Rectangle: " + ra.calAreaofRect(length, width));
				break;

			case 3:
				sc.nextLine();
				System.out.println("Enter the name of the employee: ");
				String ename = sc.nextLine();

				System.out.println("Enter the Basic salary: ");
				double basic = sc.nextDouble();

				Employee_Salary es = new Employee_Salary(ename, basic);
				double final_salary = es.salary();

				System.out.println("Name: " + ename);
				System.out.println("Basic: " + basic);
				System.out.println("Bonus: " + es.bonus());
				System.out.println("NetSalary: " + final_salary);
				break;

			case 4:
				System.out.println("Enter the radius: ");
				double radius = sc.nextDouble();

				Circle_Operations co = new Circle_Operations(radius);

				double area = co.area();
				double circumference = co.circumference();

				System.out.println("Area of Circle: " + area);
				System.out.println("Circumference of Circle: " + circumference);
				break;

			case 5:
				System.err.println("Simple Interest");
				System.out.println("Enter the principal amount: ");
				double principal = sc.nextDouble();

				System.out.println("Enter the rate of interest: ");
				double interest = sc.nextDouble();

				System.err.println("Select tenure..");
				System.out.println("1. Years");
				System.out.println("2. Months");
				System.out.print("Enter your choice: ");
				int choose = sc.nextInt();

				System.out.print("Enter the tenure: ");
				double tenure = sc.nextDouble();

				if (choose == 2) {
					tenure = tenure / 12;
				}

				Simple_Interest si = new Simple_Interest(principal, interest, tenure);
				double simpleInterest = si.simple_interest();

				System.out.println("Simple Interest : " + simpleInterest);
				System.out.println("Total Payback amount: " + (principal + simpleInterest));
				break;

			case 6:
				System.err.println("==========Even or Odd=========");
				System.out.println("Enter any number: ");
				int num = sc.nextInt();

				Even_or_Odd eo = new Even_or_Odd(num);

				System.out.println("Result: " + eo.check_even_odd(num));

				break;

			case 7:
				System.err.println("======Temperature Converter=========");

				System.out.println("1. Celsius to Fahrenheit");
				System.out.println("2. Fahrenheit to Celsius");
				int type = sc.nextInt();

				System.out.println("Enter the temperature: ");
				double temp = sc.nextDouble();

				Temperature_Converter tc = new Temperature_Converter(temp);

				if (type == 1) {
					System.out.println("Temperature: " + tc.celsiusToFahrenheit() + " °F");
				} else if (type == 2) {
					System.out.println("Temperature: " + tc.fahrenheitToCelsius() + " °C");
				} else {
					System.out.println("Invalid Choice");
				}

				break;

			case 8:
				System.out.println("==============Bank Account=========");

				if (ba == null) {
					System.out.print("Enter Account Number: ");
					long anumber = sc.nextLong();

					ba = new Bank_account(anumber);
				}

				System.err.println("Select ATM operation: ");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Show Balance");
				int atm_op = sc.nextInt();

				switch (atm_op) {
				case 1:
					System.out.println("Enter the deposit amount: ");
					System.out.println("Multiples of 100,200 or 500");
					double deposit = sc.nextDouble();

					if (deposit % 100 == 0) {
						System.out.println("Updated Balance : " + ba.deposit(deposit));
					} else {
						System.out.println("Invalid Amount!");
					}

					break;
				case 2:
					System.out.println("Enter the withdrawl amount: ");
					System.out.println("Multiples of 100,200 or 500");
					int withdraw = sc.nextInt();

					if (withdraw % 100 == 0) {
						System.out.println("Updated Balance : " + ba.withdraw(withdraw));
					} else {
						System.out.println("Invalid Amount!");
					}

					break;
				case 3:
					System.out.println("Current Balance: " + ba.showbalance());

					break;
				default:
					System.out.println("Invalid Choice!");
					break;

				}
				break;

			case 9:
				System.err.println("===============Product Discount===========");

				System.out.println("Enter the amount: ");
				double price = sc.nextDouble();

				Product_Discount pd = new Product_Discount(price);

				double final_price = pd.discount();
				System.out.println("Original Price : Rs. " + price);
				System.out.println("Discount Amount: Rs. " + pd.discountAmount());
				System.out.println("Final Price    : Rs. " + pd.discount());
				break;

			case 10:
				System.err.println("===========Student Grade=============");
				System.out.println("Enter your marks: ");
				int stud_marks = sc.nextInt();

				Student_Grade sg = new Student_Grade(stud_marks);
				System.out.println("Grade: " + sg.calGrade(stud_marks));
				break;

			case 11:
				System.err.println("Number Reverse");

			case 21:
				System.out.println("Thank You!");
				sc.close();
				return;

			default:
				System.out.println("Inavlid Choice!");
				break;

			}
			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}

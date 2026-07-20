package saturdays;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bank_account ba = null;

		char ch;
		do {

			System.err.println("========Menu========");
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
				System.err.println("=========Student Info===========");
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
				System.err.println("===============Rectangle Area============");
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
				System.err.println("============Employee Salary=============");
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
				System.err.println("===============Circle Operations================");
				System.out.println("Enter the radius: ");
				double radius = sc.nextDouble();

				Circle_Operations co = new Circle_Operations(radius);

				double area = co.area();
				double circumference = co.circumference();

				System.out.println("Area of Circle: " + area);
				System.out.println("Circumference of Circle: " + circumference);
				break;

			case 5:
				System.err.println("============Simple Interest=============");
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
				System.err.println("==============Number Reverse================");

				System.out.println("Enter any number: ");
				int rnum = sc.nextInt();

				Number_Reverse nr = new Number_Reverse(rnum);

				System.out.println("Reverse Number : " + nr.makeReverse());

				break;

			case 12:
				System.err.println("=================Palindrome Check===============");

				System.out.println("Enter any number: ");
				int pnum = sc.nextInt();

				Palindrome_Check pc = new Palindrome_Check(pnum);

				if (pc.check_Palindrome()) {
					System.out.println(pnum + " is a Palindrome Number");
				} else {
					System.out.println(pnum + " is Not a Palindrome Number");
				}

				break;

			case 13:
				System.err.println("==============Power Calculation==============");

				System.out.println("Enter base value: ");
				int base = sc.nextInt();

				System.out.println("Enter exponent value: ");
				int exponent = sc.nextInt();

				Power_Calculation powerc = new Power_Calculation(base, exponent);

				System.out.println(base + "^" + exponent + " = " + powerc.calculate_power());

				break;

			case 14:
				System.err.println("=================Max of Three Numbers============");

				System.out.println("Enter first number:");
				int first_num = sc.nextInt();

				System.out.println("Enter second number:");
				int second_num = sc.nextInt();

				System.out.println("Enter third number:");
				int third_num = sc.nextInt();

				Max_of_Three_Numbers mtn = new Max_of_Three_Numbers(first_num, second_num, third_num);

				System.out.println(first_num + ", " + second_num + ", " + third_num + " = " + mtn.maxofThreeNumbers()
						+ " is largest number");

				break;

			case 15:
				System.err.println("=================ATM Machine Simulation=================");

				System.out.println("Enter account number: ");
				long account_number = sc.nextLong();

				ATM_simulation as = new ATM_simulation(account_number);

				System.out.println("==============Select Operation=============");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Check Balance");
				System.out.print("Enter your choice: ");
				int atmChoice = sc.nextInt();

				switch (atmChoice) {

				case 1:
					System.err.println("==============Deposit=============");
					System.out.print("Enter Deposit Amount: ");
					double deposit = sc.nextDouble();

					System.out.println("Updated Balance: " + as.deposit(deposit));

					break;

				case 2:
					System.out.print("Enter Withdrawal Amount: ");
					double withdraw = sc.nextDouble();

					System.out.println("Updated Balance: %.2f%n" + as.withdraw(withdraw));

					break;

				case 3:
					System.out.println("Current Balance: %.2f%n" + as.balance);

					break;

				default:

					System.out.println("Invalid Choice!");
				}

				System.err.println("Account Number : " + as.accountNumber);
				System.err.println("Current Balance: " + as.check_balance());

				break;

			case 16:
				System.err.println("==================Shopping Cart===================");

				System.out.println("Enter the quantity: Oty. ");
				int quantity = sc.nextInt();

				System.out.println("Enter the price: Rs. ");
				double pprice = sc.nextDouble();

				Shopping_Cart scart = new Shopping_Cart(quantity, pprice);

				System.out.println("Quantity : " + quantity);
				System.out.println("Price per Item : Rs. " + pprice);
				System.out.println("Total Price : Rs. " + (quantity * pprice));
				System.out.println("Discount : Rs. " + scart.discountAmount());
				System.out.println("Final Bill : Rs. " + scart.calBill());

				break;

			case 17:
				System.err.println("====================Electricity Bill===================");
				System.out.print("Enter Units Consumed: ");
				int units = sc.nextInt();

				Electricity_Bill eb = new Electricity_Bill(units);

				System.out.println("Units Consumed : " + units);
				System.out.println("Total Bill     : Rs. " + eb.calculateBill());

				break;

			case 18:
				System.err.println("=====================Fibonacci Series======================");
				System.out.print("Enter number of terms: ");
				int terms = sc.nextInt();

				Fibonacci_Series fs = new Fibonacci_Series(terms);

				System.err.println("Fibonacci Series: ");
				fs.fibonacciSeries();

				break;

			case 19:
				System.err.println("=================Prime Number Check======================");

				System.out.println("Enter number to check prime or not: ");
				int cprime = sc.nextInt();

				Check_prime cp = new Check_prime(cprime);
				cp.checkPrime();

				break;

			case 20:
				System.err.println("=========================Library System===================");
				sc.nextLine();

				System.out.print("Enter Book Name: ");
				String bookName = sc.nextLine();

				System.out.println("Book Status");
				System.out.println("1. Issue Book");
				System.out.println("2. Return Book");
				System.out.print("Enter your choice: ");
				int libraryChoice = sc.nextInt();

				Library_System ls = new Library_System(bookName, false);

				switch (libraryChoice) {

				case 1:
					ls.issueBook();
					break;

				case 2:
					ls.returnBook();
					break;

				default:
					System.out.println("Invalid Choice!");
				}

				break;

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

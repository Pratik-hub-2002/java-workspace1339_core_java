package methods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char cha;
		do {
			System.out.println("===== MENU =====");
			System.out.println("1. ATM ");
			System.out.println("2. Student Result ");
			System.out.println("3. Mobile Recharge ");
			System.out.println("4. Temperature Converter");
			System.out.println("5. Login System");
			System.out.println("6. E-commerce Discount");
			System.out.println("7. Employee Salary");
			System.out.println("8. Bank Interest");
			System.out.println("9. Food Ordering App");
			System.out.println("10. Electricity Bill");
			System.out.println("11. Online Voting System");
			System.out.println("12. Ride Booking App");
			System.out.println("13. Password Strength Checker");
			System.out.println("14. Library System");
			System.out.println("15. Shopping Cart Total");
			System.out.println("16. Find Maximum Number");
			System.out.println("17. Prime Number Checker");
			System.out.println("18. Palindrome Checker");
			System.out.println("19. Even/Odd Counter");
			System.out.println("20. Grade Calculator");
			System.out.println("21. Exit");

			int choose = sc.nextInt();
			switch (choose) {

			case 1:
				ATM a = new ATM();
				char ch;
				do {
					System.out.println("Select one the below: ");
					System.out.println("1. Check Balance.");
					System.out.println("2. Withdraw Cash");
					int choice = sc.nextInt();

					switch (choice) {

					case 1:
						a.checkBalance();
						break;
					case 2:
						System.out.println("Enter the amount in multiples of 100, 200 or 500 only.");
						int withdraw = sc.nextInt();
						if (withdraw <= 0 || withdraw % 100 != 0) {
							System.out.println("Enter the amount in multiples of 100, 200 or 500 only.");
						} else {
							double remainingAmt = a.withdrawAmount(withdraw);
							System.out.println("Your Balance: " + remainingAmt);
						}
						break;

					default:
						System.out.println("Invalid Choice.!");
						break;
					}

					System.out.println("Do you want to continue? y/n");
					ch = sc.next().charAt(0);
				} while (ch == 'y' || ch == 'Y');
				break;
			case 2:
				Student_Result sr = new Student_Result();
				char ch2;
				do {
					System.out.println("Enter your marks.!");
					System.out.println("1. DevOps");
					int devops = sc.nextInt();
					if (devops <= 0 || devops >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						devops = sc.nextInt();
					}
					System.out.println("2. Cloud");
					int cloud = sc.nextInt();
					if (cloud <= 0 || cloud >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						cloud = sc.nextInt();
					}
					System.out.println("3. Java");
					int javamarks = sc.nextInt();
					if (javamarks <= 0 || javamarks >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						javamarks = sc.nextInt();
					}
					System.out.println("4. DSA");
					int dsa = sc.nextInt();
					if (dsa <= 0 || dsa >= 100) {
						System.out.println("Enter marks between 0 and 100:");
						dsa = sc.nextInt();
					}

					double percentage = sr.calculatePercentage(dsa, cloud, devops, javamarks);
					System.out.println("Percentage = " + percentage);

					System.out.println("Do you want to continue? y/n");
					ch2 = sc.next().charAt(0);
				} while (ch2 == 'y' || ch2 == 'Y');
				break;

			case 3:
				Mobile_Recharge mr = new Mobile_Recharge();

				System.out.println("Enter Wallet Balance:");
				double balance = sc.nextDouble();
				char ch3;

				do {

					System.out.println("Select one of the below:");
					System.out.println("1. Data Plan");
					System.out.println("2. Talktime");
					System.out.println("3. Combo Packs");

					int mRecharge = sc.nextInt();

					switch (mRecharge) {

					case 1:
						mr.dataPlan();

						System.out.println("Select Plan:");
						System.out.println("1. ₹199");
						System.out.println("2. ₹299");

						int dataPlan = sc.nextInt();

						if (dataPlan == 1) {
							balance = mr.recharge(balance, 199);
						} else if (dataPlan == 2) {
							balance = mr.recharge(balance, 299);
						}
						break;

					case 2:
						mr.talkTime();

						System.out.println("Select Plan:");
						System.out.println("1. ₹100");
						System.out.println("2. ₹500");

						int talkPlan = sc.nextInt();

						if (talkPlan == 1) {
							balance = mr.recharge(balance, 100);
						} else if (talkPlan == 2) {
							balance = mr.recharge(balance, 500);
						}
						break;

					case 3:
						mr.comboPack();

						System.out.println("Select Plan:");
						System.out.println("1. ₹399");
						System.out.println("2. ₹599");

						int comboPlan = sc.nextInt();

						if (comboPlan == 1) {
							balance = mr.recharge(balance, 399);
						} else if (comboPlan == 2) {
							balance = mr.recharge(balance, 599);
						}
						break;

					default:
						System.out.println("Invalid Choice!");
						break;
					}

					System.out.println("Do you want to continue? y/n");
					ch3 = sc.next().charAt(0);

				} while (ch3 == 'y' || ch3 == 'Y');

				break;

			case 4:
				Temperature_Converter tc = new Temperature_Converter();
				System.out.println("Enter Temperature in Celsius:");
				double celsius = sc.nextDouble();

				double fahrenheit = tc.celsiusToFahrenheit(celsius);

				System.out.println("Temperature in Fahrenheit = " + fahrenheit);
				break;

			case 5:
				Login_System ls = new Login_System();

				sc.nextLine();

				System.out.println("Enter User Name: ");
				String uname = sc.nextLine();

				System.out.println("Enter Password");
				String password = sc.nextLine();

				boolean result = ls.login(uname, password);

				if (result) {
					System.out.println("Login Successful !");
				} else {
					System.out.println("Invalid Credentils");
				}

				break;

			case 6:
				E_commerce_Discount ecr = new E_commerce_Discount();

				System.out.println("Enter the price: ");
				double price = sc.nextDouble();

				double final_price = ecr.calculateDiscount(price);

				System.out.println("Original Price = ₹" + price);
				System.out.println("Price After Discount = ₹" + final_price);
				break;

			case 7:
				Employee_Salary es = new Employee_Salary();

				System.out.println("Enter the Basic: ");
				double basic = sc.nextDouble();

				double salary = es.calculateSalary(basic);

				System.out.println("Salary: " + salary);

				break;

			case 8:
				Bank_Interest bi = new Bank_Interest();

				System.out.println("Enter the principal amount:");
				double principal = sc.nextDouble();

				System.out.println("Enter the rate of interest:");
				double rate = sc.nextDouble();

				System.out.println("Enter the tenure:");
				double tenture = sc.nextDouble();

				double simpleInterest = bi.calculateInterest(principal, rate, tenture);

				System.out.println("Simple Interest = ₹" + simpleInterest);
				break;

			case 9:
				Food_Ordering_App foa = new Food_Ordering_App();

				sc.nextLine();

				System.out.println("========= Menu =========");
				System.out.println("1. Pizza - ₹200");
				System.out.println("2. Burger - ₹100");
				System.out.println("3. Sandwich - ₹80");

				System.out.println("Select Item:");
				int itemChoice = sc.nextInt();

				System.out.println("Enter the quantity: ");
				int quantity = sc.nextInt();

				foa.placeOrder(itemChoice, quantity);

				break;

			case 10:
				Electricity_Bill eb = new Electricity_Bill();

				System.out.println("Enter the units: ");
				int units = sc.nextInt();

				double bill = eb.calculateBill(units);

				System.out.println("Total Electricity Bill = ₹" + bill);

				break;

			case 11:
				Online_Voting_System ovs = new Online_Voting_System();

				System.out.println("Enter your age: ");
				int age = sc.nextInt();

				boolean eligible = ovs.vote(age);

				if (eligible) {
					System.out.println("Can Vote!");
				} else {
					System.out.println("Cannot Vote!");
				}

				break;

			case 12:
				Ride_Booking_App rba = new Ride_Booking_App();

				System.out.println("Enter the distance travelled in km: ");
				double distance = sc.nextDouble();

				double fare = rba.calculateFare(distance);

				System.out.println("Total Fare = ₹" + fare);
				break;

			case 13:
				Password_Strength_Checker psc = new Password_Strength_Checker();

				sc.nextLine();

				System.out.println("Password length should be of 8 characters in @");
				System.out.println("Enter Password: ");
				String check_password = sc.nextLine();

				String pass_result = psc.checkPassword(check_password);

				System.out.println(pass_result);

				break;

			case 14:
				Library_System lss = new Library_System();

				sc.nextLine();

				System.out.println("Enter the name of the book: ");
				String bookName = sc.nextLine();

				System.out.println("Is Book Available? true/false");
				boolean isAvailable = sc.nextBoolean();

				lss.issueBook(bookName, isAvailable);

				break;

			case 15:
				Shopping_Cart_Total sct = new Shopping_Cart_Total();

				sc.nextLine();

				System.out.println("Enter Grocery Item 1:");
				String item1 = sc.nextLine();
				System.out.println("Enter Price:");
				double price1 = sc.nextDouble();

				sc.nextLine();

				System.out.println("Enter Grocery Item 2:");
				String item2 = sc.nextLine();
				System.out.println("Enter Price:");
				double price2 = sc.nextDouble();

				sc.nextLine();

				System.out.println("Enter Grocery Item 3:");
				String item3 = sc.nextLine();
				System.out.println("Enter Price:");
				double price3 = sc.nextDouble();

				double final_amt = sct.calculateTotal(price1, price2, price3);

				System.out.println("\n===== SHOPPING CART =====");
				System.out.println(item1 + " = ₹" + price1);
				System.out.println(item2 + " = ₹" + price2);
				System.out.println(item3 + " = ₹" + price3);
				System.out.println("-------------------------");
				System.out.println("Gross Amount = ₹" + final_amt);

				break;

			case 16:
				Find_Maximum_Number fmn = new Find_Maximum_Number();

				System.out.println("Enter the first number: ");
				int first_number = sc.nextInt();

				System.out.println("Enter the second number: ");
				int second_number = sc.nextInt();

				System.out.println("Enter the third number: ");
				int third_number = sc.nextInt();

				int max = fmn.findMax(first_number, second_number, third_number);
				System.out.println("Maximum number: " + max);

				break;

			case 17:
				Prime_Number_Checker pnc = new Prime_Number_Checker();

				System.out.println("Enter any number: ");
				int prime_num = sc.nextInt();

				boolean prime_result = pnc.isPrime(prime_num);

				System.out.println(prime_result);

				break;

			case 18:
				Palindrome_Checker pc = new Palindrome_Checker();

				System.out.println("Enter any number: ");
				int palin_num = sc.nextInt();

				boolean pali_result = pc.isPalindrome(palin_num);

				if (pali_result) {
					System.out.println(palin_num + " is a palindrone number.");
				} else {
					System.out.println(palin_num + " is not a palindrone number.");
				}

				break;

			case 19:
				Even_Odd_Counter evo = new Even_Odd_Counter();

				System.out.println("How many numbers do you want to enter?");
				int size = sc.nextInt();

				int arr[] = new int[size];

				System.out.println("Enter " + size + " numbers:");

				for (int i = 0; i < arr.length; i++) {

					arr[i] = sc.nextInt();
				}

				evo.countEvenOdd(arr);

				break;

			case 20:
				Grade_Calculator gc = new Grade_Calculator();

				System.out.println("Enter your marks: ");
				int marks = sc.nextInt();

				if (marks < 0 || marks > 100) {
					System.out.println("Invalid Marks");
				} else {
					char grade = gc.getGrade(marks);
					System.out.println(grade);
				}

				break;

			case 21:
				System.out.println("Thank You!");
				sc.close();
				return;

			default:
				System.out.println("Invalid Choice.!");
				break;
			}
			System.out.println("Return to Main Menu? y/n");
			cha = sc.next().charAt(0);
		} while (cha == 'y' || cha == 'Y');

	}

}

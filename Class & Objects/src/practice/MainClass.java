package practice;

import java.util.Scanner;
import june4.ATM;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch;
		do {
			System.err.println("Select your choice");
			System.out.println("1. Student Details");
			System.out.println("2. Employee Details");
			System.out.println("3. Car Details");
			System.out.println("4. Mobile Details");
			System.out.println("5. Calculate Area of Rectangle");
			System.out.println("6. Calculate Area of Circle");
			System.out.println("7. Bank Details");
			System.out.println("8. Book Details");
			System.out.println("9. Laptop Details");
			System.out.println("10. ATM");
			System.out.println("11. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Student s = new Student();
				Student s1 = new Student();
				sc.nextLine();
				System.out.println("Enter the name of a student: ");
				s.name = sc.nextLine();
				System.out.println("Enter the rollno of a student: ");
				s.rollNO = sc.nextInt();
				System.out.println("Enter the marks of a student: ");
				s.marks = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the name of a student: ");
				s1.name = sc.nextLine();
				System.out.println("Enter the rollno of a student: ");
				s1.rollNO = sc.nextInt();
				System.out.println("Enter the marks of a student: ");
				s1.marks = sc.nextInt();

				s.student_info();
				s1.student_info();
				break;

			case 2:
				Employee e = new Employee();
				sc.nextLine();
				System.out.println("Enter the name of the employee: ");
				e.name = sc.nextLine();
				System.out.println("Enter the salary of the employee: ");
				e.salary = sc.nextDouble();

				e.showDetails();
				break;

			case 3:
				Car maserati = new Car();
				Car bentley = new Car();
				sc.nextLine();
				System.out.println("Enter the car brand: ");
				maserati.brand = sc.nextLine();
				System.out.println("Enter model year: ");
				maserati.model = sc.nextInt();
				System.out.println("Enter the price of car: ");
				maserati.price = sc.nextDouble();

				sc.nextLine();
				System.out.println("Enter the car brand: ");
				bentley.brand = sc.next();
				System.out.println("Enter model year: ");
				bentley.model = sc.nextInt();
				System.out.println("Enter the price of car: ");
				bentley.price = sc.nextDouble();

				maserati.showCar();
				bentley.showCar();
				break;

			case 4:
				Mobile m = new Mobile();
				sc.nextLine();
				System.out.println("Enter the mobile brand: ");
				m.brand = sc.next();
				System.out.println("Enter ram: ");
				m.ram = sc.nextInt();
				System.out.println("Enter the price of mobile: ");
				m.price = sc.nextDouble();
				m.showSpec();
				break;

			case 5:
				Rectangle r = new Rectangle();
				System.out.println("Enter length of Rectangle: ");
				r.length = sc.nextDouble();
				System.out.println("Enter width of Rectangle: ");
				r.width = sc.nextDouble();
				r.calculateArea();
				break;

			case 6:
				Circle c = new Circle();
				System.out.println("Enter the radius of the circle: ");
				c.radius = sc.nextDouble();
				c.calculateArea();
				break;

			case 7:
				Bank_account ba = new Bank_account();
				System.out.println("Enter your account number: ");
				ba.account_num = sc.nextLong();
				ba.displayBalance();
				break;

			case 8:
				Book b = new Book();
				System.out.println("Enter the title of the book: ");
				b.title = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the author name: ");
				b.author = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the price of the book: ");
				b.price = sc.nextDouble();
				b.showBook();
				break;

			case 9:
				Laptop l = new Laptop();
				System.out.println("Enter the brand name: ");
				l.brand = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the processor name ");
				l.processor = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the price: ");
				l.price = sc.nextDouble();
				l.showDetails();
				break;

			case 10:
				ATM atm = new ATM();
				char choose = 'y';
				while (choose == 'y' || choose == 'Y') {

					System.out.println("Select one from the menu = ");

					System.out.println("1. Check Balance");
					System.out.println("2. Withdraw");
					System.out.println("3. Deposit");
					System.out.println("4. Exit");
					int choices = sc.nextInt();
					atm.atm(choices, sc);
					if (choices == 4) {
						break;
					}

					System.out.println("\nDo you want to continue? (Y/N)");
					choose = sc.next().charAt(0);
				}
				break;
			case 11:
				System.out.println("Thank You!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("\nDo you want to continue? (Y/N)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}

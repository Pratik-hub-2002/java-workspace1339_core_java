package saturdays;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;
		do {

			System.out.println("========Menu========");
			System.out.println("1. Student");
			System.out.println("2. Rectangle Area");
			System.out.println("3. Employee Salary");
			System.out.println("4. Circle Operations");
			System.out.println("5. Simple Interest");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
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

				System.out.println("Enter the tenture in months: ");
				double tenure = sc.nextDouble();

				Simple_Interest si = new Simple_Interest(principal, interest, tenure);
				double simpleInterest = si.simple_interest();

				System.out.println("Simple Interest : " + simpleInterest);
				System.out.println("Total Payback amount: " + (principal + simpleInterest));

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

package abstraction;

public class Main {

	public static void main(String[] args) {

//		// 1
//		Animal a;
//		a = new Dog();
//		a.sound();
//
//		a = new Cat();
//		a.sound();
//
//		a = new Cow();
//		a.sound();
//
//		// 2
//		Shape s;
//
//		s = new Circle();
//		s.draw();
//
//		s = new Triangle();
//		s.draw();
//
//		s = new Rectangle();
//		s.draw();

//		// 3
//		Employee emp;
//
//		emp = new Manager();
//		System.out.println("Manager Salary : ₹" + emp.calculateSalary());
//
//		emp = new Developer();
//		System.out.println("Developer Salary : ₹" + emp.calculateSalary());
//
//		emp = new Tester();
//		System.out.println("Tester Salary : ₹" + emp.calculateSalary());
//
//		// 4
//
//		Payment pay;
//
//		pay = new UPI();
//		pay.pay(2500);
//
//		pay = new Card();
//		pay.pay(5400);
//
//		pay = new NetBanking();
//		pay.pay(8000);

//		// 5
//		SocialMedia sm;
//
//		sm = new Facebook();
//		sm.login("ram", "12345");
//
//		sm = new Insta();
//		sm.login("admin", "9876");
//
//		sm = new Twitter();
//		sm.login("elon", "twitter");

		// 6

		Gmail gmail = new Google();
		gmail.sendMail("abc@gmail.com", "Java Interface");

		GDrive drive = new Google(	);
		drive.uploadFile("Resume.pdf");

		GMap map = new Google();
		map.getDirection("Pune", "Mumbai");
	}
}

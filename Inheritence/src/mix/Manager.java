package mix;

public class Manager extends Employee {

	private double bonus;

	public Manager() {

	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public double calculateTotalSalary() {
		return getSalary() + bonus;
	}

	public static void main(String[] args) {

		Manager m = new Manager();

		String name = "Pratik";
		double salary = 50000;
		double bonus = 10000;

		m.setName(name);
		m.setSalary(salary);
		m.setBonus(bonus);

		System.out.println("\n===== Employee Details =====");
		System.out.println("Name : " + m.getName());
		System.out.println("Salary : ₹" + m.getSalary());
		System.out.println("Bonus : ₹" + m.getBonus());
		System.out.println("Total Salary : ₹" + m.calculateTotalSalary());
	}
}
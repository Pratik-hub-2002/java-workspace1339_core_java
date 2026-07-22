package practice;

public class Employee_Bonus {

	private int emid;
	private String emname;
	private double emsalary;
	private double embounus;

	public Employee_Bonus(int emid, String emname, double emsalary, double embounus) {

		this.emid = emid;
		this.emname = emname;
		this.emsalary = emsalary;
		this.embounus = embounus;
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public double getEmsalary() {
		return emsalary;
	}

	public void setEmsalary(double emsalary) {
		this.emsalary = emsalary;
	}

	public double getEmbounus() {
		return embounus;
	}

	public void setEmbounus(double embounus) {
		this.embounus = embounus;
	}

	public double calculateBonus() {
		return (emsalary * embounus) / 100;
	}

	public double totalSalary() {
		return emsalary + calculateBonus();
	}

}

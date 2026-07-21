package practice;

public class Employee_Information {

	private int eid;
	private String ename;
	private String dname;
	private double esalary;

	public Employee_Information(int eid, String ename, String dname, double esalary) {

		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
		this.esalary = esalary;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}
}

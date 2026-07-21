package practice;

public class Hospital_Patient {

	private int hpid;
	private String hpname;
	private int hpage;
	private String hpdisease;
	private double hpfees;

	public Hospital_Patient(int hpid, String hpname, int hpage, String hpdisease, double hpfees) {

		this.hpid = hpid;
		this.hpname = hpname;
		this.hpage = hpage;
		this.hpdisease = hpdisease;
		this.hpfees = hpfees;
	}

	public int getHpid() {
		return hpid;
	}

	public void setHpid(int hpid) {
		this.hpid = hpid;
	}

	public String getHpname() {
		return hpname;
	}

	public void setHpname(String hpname) {
		this.hpname = hpname;
	}

	public int getHpage() {
		return hpage;
	}

	public void setHpage(int hpage) {
		this.hpage = hpage;
	}

	public String getHpdisease() {
		return hpdisease;
	}

	public void setHpdisease(String hpdisease) {
		this.hpdisease = hpdisease;
	}

	public double getHpfees() {
		return hpfees;
	}

	public void setHpfees(double hpfees) {
		this.hpfees = hpfees;
	}
}

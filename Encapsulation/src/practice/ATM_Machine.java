package practice;

public class ATM_Machine {

	private int custAccountNum;
	private String bankcustName;
	private double iniBalAmt;

	public ATM_Machine(int custAccountNum, String bankcustName, double iniBalAmt) {

		this.custAccountNum = custAccountNum;
		this.bankcustName = bankcustName;
		this.iniBalAmt = iniBalAmt;
	}

	public int getCustAccountNum() {
		return custAccountNum;
	}

	public void setCustAccountNum(int custAccountNum) {
		this.custAccountNum = custAccountNum;
	}

	public String getBankcustName() {
		return bankcustName;
	}

	public void setBankcustName(String bankcustName) {
		this.bankcustName = bankcustName;
	}

	public double getIniBalAmt() {
		return iniBalAmt;
	}

	public void setIniBalAmt(double iniBalAmt) {
		this.iniBalAmt = iniBalAmt;
	}

	public void deposit(double amount) {

		if (amount > 0) {
			setIniBalAmt(getIniBalAmt() + amount);
			System.out.println("Rs. " + amount + " Deposited Successfully.");
		} else {
			System.out.println("Invalid Deposit Amount.");
		}
	}

	public void withdraw(double amount) {

		if (amount <= getIniBalAmt()) {
			setIniBalAmt(getIniBalAmt() - amount);
			System.out.println("Rs. " + amount + " Withdrawn Successfully.");
		} else {
			System.out.println("Insufficient Balance.");
		}
	}
}
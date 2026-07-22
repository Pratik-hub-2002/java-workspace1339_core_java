package practice;

public class Library_Management {

	private int bid;
	private String bname;
	private String bauthor;
	private boolean isIssued;

	public Library_Management(int bid, String bname, String bauthor) {

		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.isIssued = false;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public boolean getIsIssued() {
		return isIssued;
	}

	public void issueBook() {

		if (!isIssued) {
			isIssued = true;
			System.out.println("Book Issued Successfully.");
		} else {
			System.out.println("Book is Already Issued.");
		}
	}

	public void returnBook() {

		if (isIssued) {
			isIssued = false;
			System.out.println("Book Returned Successfully.");
		} else {
			System.out.println("Book is Already Available.");
		}
	}
}
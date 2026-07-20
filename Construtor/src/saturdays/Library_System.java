package saturdays;

public class Library_System {

	String bookName;
	boolean isIssued;

	public Library_System(String bookName, boolean isIssued) {

		this.bookName = bookName;
		this.isIssued = isIssued;
	}

	public void issueBook() {

		if (isIssued) {
			System.out.println("Book is already issued.");
		} else {
			isIssued = true;
			System.out.println("Book issued successfully.");
		}
	}

	public void returnBook() {

		if (!isIssued) {
			System.out.println("Book is already available in library.");
		} else {
			isIssued = false;
			System.out.println("Book returned successfully.");
		}
	}
}

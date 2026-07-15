package methods;

public class Library_System {

	public void issueBook(String bookName, boolean isAvailable) {

		if (isAvailable) {
			System.out.println(bookName + ": Issued Successfully");
		} else {
			System.out.println(bookName + ": Not Available");
		}
	}
}

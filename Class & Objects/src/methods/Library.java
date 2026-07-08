package methods;

public class Library {

	int bookId;
	String bookName;
	String author;
	String studentName;
	int totalBooks;
	int issuedBooks;
	int availableBooks;

	public void issueBook() {

		if (availableBooks > 0) {
			issuedBooks++;
			availableBooks--;

			System.out.println("Book Issued Successfully");
			System.out.println("Issued Books : " + issuedBooks);
			System.out.println("Available Books : " + availableBooks);
		} else {
			System.out.println("No Books Available");
		}
	}

	public void returnBook() {

		if (issuedBooks > 0) {
			issuedBooks--;
			availableBooks++;

			System.out.println("Book Returned Successfully");
			System.out.println("Issued Books : " + issuedBooks);
			System.out.println("Available Books : " + availableBooks);
		} else {
			System.out.println("No Issued Books Found");
		}
	}
}

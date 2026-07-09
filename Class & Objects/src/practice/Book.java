package practice;

public class Book {

	String title;
	String author;
	double price;

	public void showBook() {
		System.err.println("--------------Book Details----------");
		System.out.println("Title of Book: " + title);
		System.out.println("Author Name: " + author);
		System.out.println("Book Price: " + price);
	}
}

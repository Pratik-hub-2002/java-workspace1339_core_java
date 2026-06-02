package tka;

public class Library {

	int book_ID;
	String book_name;
	String author;
	String category;
	int price;

	void l1() {

		System.out.println("\n------------Library's Book Information------------\n");
		System.out.println("Book Id :- " + book_ID);
		System.out.println("Book Name :- " + book_name);
		System.out.println("Book Author Name :- " + author);
		System.out.println("Book Category :- " + category);
		System.out.println("Book Price :- Rs. " + price);
	}
}

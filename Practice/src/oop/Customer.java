package oop;

public class Customer extends User implements Booking {

	private String movieName;
	private String seatNo;
	private double ticketPrice;

	public Customer(String uname, long mob_no, String movieName, String seatNo, double ticketPrice) {
		super(uname, mob_no);
		this.movieName = movieName;
		this.seatNo = seatNo;
		this.ticketPrice = ticketPrice;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setMovieName(String MovieName) {
		this.movieName = movieName;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public String getMovieName() {
		return movieName;
	}

	@Override
	public void role() {
		System.out.println("Role : Customer");
	}

	@Override
	public void bookTicket() {

		System.out.println("Online Ticket Booked");
		System.out.println("Movie Name: " + movieName);
		System.out.println("Seat No: " + seatNo);
		System.out.println("Price: " + ticketPrice);
	}
}

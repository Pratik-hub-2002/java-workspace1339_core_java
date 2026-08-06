package oop;

public class Admin extends User implements Booking {

	Admin(String uname, long mob_no) {
		super(uname, mob_no);
	}

	@Override
	public void role() {
		System.out.println("Role: Admin");
	}

	@Override
	public void bookTicket() {
		System.out.println("Offline Ticket Booked by Admin.");
	}
}

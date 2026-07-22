package practice;

public class Hotel_Room_Booking {

	private int room_no;
	private String hcname;
	private boolean isBooked;

	public Hotel_Room_Booking(int room_no, String hcname) {

		this.room_no = room_no;
		this.hcname = hcname;
		this.isBooked = false;
	}

	public int getRoom_no() {
		return room_no;
	}

	public String getHcname() {
		return hcname;
	}

	public boolean getBookingStatus() {
		return isBooked;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public void setHcname(String hcname) {
		this.hcname = hcname;
	}

	public void bookRoom() {

		if (!isBooked) {
			isBooked = true;
			System.out.println("Room Booked Successfully.");
		} else {
			System.out.println("Room is Already Booked.");
		}
	}

	public void cancelRoom() {

		if (isBooked) {
			isBooked = false;
			System.out.println("Room Booking Cancelled Successfully.");
		} else {
			System.out.println("Room is Already Available.");
		}
	}
}
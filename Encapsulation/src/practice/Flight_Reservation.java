package practice;

public class Flight_Reservation {

	private int flight_num;
	private String fpname;
	private String fseat_num;
	private boolean isReserved;

	public Flight_Reservation(int flight_num, String fpname, String fseat_num) {

		this.flight_num = flight_num;
		this.fpname = fpname;
		this.fseat_num = fseat_num;
		this.isReserved = false;
	}

	public int getFlight_num() {
		return flight_num;
	}

	public void setFlight_num(int flight_num) {
		this.flight_num = flight_num;
	}

	public String getFpname() {
		return fpname;
	}

	public void setFpname(String fpname) {
		this.fpname = fpname;
	}

	public String getFseat_num() {
		return fseat_num;
	}

	public void setFseat_num(String fseat_num) {
		this.fseat_num = fseat_num;
	}

	public boolean getReservationStatus() {
		return isReserved;
	}

	public void reserveSeat() {

		if (!isReserved) {
			isReserved = true;
			System.out.println("Seat Reserved Successfully.");
		} else {
			System.out.println("Seat is Already Reserved.");
		}
	}

	public void cancelReservation() {

		if (isReserved) {
			isReserved = false;
			System.out.println("Reservation Cancelled Successfully.");
		} else {
			System.out.println("Seat is Already Available.");
		}
	}

}

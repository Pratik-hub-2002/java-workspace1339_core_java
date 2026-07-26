package mix;

public class Highest_of_4 {

	private double fnum;
	private double snum;
	private double tnum;
	private double fonum;

	public Highest_of_4(double fnum, double snum, double tnum, double fonum) {

		this.fnum = fnum;
		this.snum = snum;
		this.tnum = tnum;
		this.fonum = fonum;
	}

	public double getFnum() {
		return fnum;
	}

	public void setFnum(double fnum) {
		this.fnum = fnum;
	}

	public double getSnum() {
		return snum;
	}

	public void setSnum(double snum) {
		this.snum = snum;
	}

	public double getTnum() {
		return tnum;
	}

	public void setTnum(double tnum) {
		this.tnum = tnum;
	}

	public double getFonum() {
		return fonum;
	}

	public void setFonum(double fonum) {
		this.fonum = fonum;
	}

	public void checkHighest() {

		if (fnum > snum) {

			if (fnum > tnum) {

				if (fnum > fonum) {
					System.out.println("Highest Number : " + fnum);
				} else {
					System.out.println("Highest Number : " + fonum);
				}
			} else {

				if (tnum > fonum) {
					System.out.println("Highest Number : " + tnum);
				} else {
					System.out.println("Highest Number : " + fonum);
				}
			}

		} else {

			if (snum > tnum) {

				if (snum > fonum) {
					System.out.println("Highest Number : " + snum);
				} else {
					System.out.println("Highest Number : " + fonum);
				}
			} else {
				if (tnum > fonum) {
					System.out.println("Highest Number : " + tnum);
				} else {
					System.out.println("Highest Number : " + fonum);
				}
			}
		}
	}

}

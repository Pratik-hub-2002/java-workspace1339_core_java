package june;

import java.util.Scanner;

public class Shpp_Disc {

	public double bill(double bill_amt, String member) {

		if (bill_amt > 1000) {

			if (member.equalsIgnoreCase("Yes")) {
				return bill_amt - (bill_amt * 20 / 100);

			} else {
				return bill_amt - (bill_amt * 10 / 100);
			}
		}
		return bill_amt;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bill Amount");
		double bill_amt = sc.nextDouble();

		String member = "No";

		if (bill_amt > 1000) {
			System.out.println("If Member Yes/No");
			member = sc.next();
		}
		Shpp_Disc sh = new Shpp_Disc();
		double final_bill = sh.bill(bill_amt, member);

		System.out.println("Final Bill Amount = ₹" + final_bill);

		sc.close();

	}

}

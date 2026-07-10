package practice;

import java.util.Scanner;

public class Time {
	int minutes;
	int seconds;

	public void time(int sec) {

		minutes = sec / 60;
		seconds = sec % 60;

		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Time t = new Time();

		char ch;

		do {
			System.out.println("Enter seconds: ");
			int sec = sc.nextInt();

			t.time(sec);

			System.out.println("Do you want to continue? y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}

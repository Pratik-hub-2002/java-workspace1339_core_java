import java.util.*;

public class TrafficSignal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Signal Color");
		String signal = sc.next();

		switch (signal) {

		case "Red":
			System.out.println("STOP");
			break;

		case "Yellow":
			System.out.println("READY");
			break;

		case "Green":
			System.out.println("GO");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}

}

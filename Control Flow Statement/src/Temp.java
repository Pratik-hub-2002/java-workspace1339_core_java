import java.util.*;

public class Temp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature = ");
		int temp=sc.nextInt();
		
		if(temp > 30) {
			System.out.println("Hot Day");
		}else {
			System.out.println("Normal Day");
		}

	}
	}

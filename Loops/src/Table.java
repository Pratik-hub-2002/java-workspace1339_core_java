import java.util.*;

public class Table {

	void printTable(int num){

	for (int i = 1; i <= 10; i++) {

		System.out.println(num + " x " + i + " = " + (i * num));
	}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number you want the table of = ");
		int num = sc.nextInt();
		
		Table p = new Table();
		
		p.printTable(num);
		
	}
}

package july.week1;

public class Patterns_practice {

	public static void main(String[] args) {

//		Print a square pattern of * (size n) using nested loops.
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		Print a right-angle triangle of * using nested loops.
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//// Print numbers from 1 to 5 in each row (5 rows) using nested loops.
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		Print a pattern where even rows print * and odd rows print #.

//		for (int i = 5; i >= 1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//
//				if (i % 2 == 0) {
//					System.out.print("*");
//				} else {
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//		}

//		Print a pattern of numbers where:
//			1
//			22
//			333
//			4444
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

//			Print a multiplication table from 1 to 5 using nested loops.
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 10; j++) {
//				System.out.println(i + " x " + j + " = " + (j * i));
//			}
//			System.out.println();
//		}

//			Print only even numbers between 1 to 50 using nested loops and if-else.
//		for (int i = 1; i <= 50; i++) {
//			for (int j = i; j <= i; j++) {
//				if (i % 2 == 0) {
//					System.out.println(j);
//				}
//			}
//		}

//			Print a pattern where:
//		(Use if-else to decide 1 or 0)
//			1 0 1
//			0 1 0
//			1 0 1
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				if ((i + j) % 2 == 0) {
//					System.out.print("1 ");
//				} else {
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}

//			Print a pyramid pattern:
//			    *
//			   ***
//			  *****
//			 *******
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//			Print a pattern where prime numbers are printed in a matrix (e.g., 5x5), and non-prime numbers are replaced with X.
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

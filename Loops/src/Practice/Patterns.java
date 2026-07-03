package Practice;

public class Patterns {

	public static void main(String[] args) {

//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	for (int i = 1; i <= 4; i++) {
//
//		for (int j = 1; j <= i; j++) {
//			System.out.print("*");   
//			*
//			**
//			***
//			****
//		}
//		System.out.println();
//	}
//
//		for (int i = 4; i >= 1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		****
//		***
//		**
//		*

//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= 4 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (char i = 'A'; i <= 'Z'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

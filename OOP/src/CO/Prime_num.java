package CO;

import java.util.*;

public class Prime_num {

	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num =sc.nextInt();
		
		boolean isPrime = true;

		if (num <=1) {
				isPrime = false;
			}else {
				for(int i = 2;i<num;i++) {
					if(num % i ==0) {
						isPrime = false;
						break;
					}
				}
				
			}
		
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		}
}


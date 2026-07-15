package methods;

public class Even_Odd_Counter {

	public void countEvenOdd(int[] arr) {

		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
	}
}
